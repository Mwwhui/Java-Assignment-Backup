/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment.sales_manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudHelper {
    
    private String filePath;

    public CrudHelper(String filePath) {
        this.filePath = filePath;
    }

    public CrudHelper() {
    }
    
    
    // Read File method
    public List<String> readFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error in reading the file: " + e.getMessage());
        }
        return lines;
    }
    
    
    // Search in File method (case-sensitive)
    public List<String> fileSearch(String keyword, String filePath) {
       List<String> match = new ArrayList<>();
       try {
           File file = new File(filePath);
           if (!file.exists()) {
               System.err.println("File does not exist: " + filePath);
               return match;
           }

           try (Scanner scanner = new Scanner(file)) {
               while (scanner.hasNextLine()) {
                   String line = scanner.nextLine();
                   if (line.contains(keyword)) {
                       match.add(line); // Add matching line to the list
                   }
               }
           }
       } catch (FileNotFoundException err) {
           System.err.println("Error: No File Found - " + err.getMessage());
       } catch (Exception e) {
           System.err.println("Unexpected error: " + e.getMessage());
           e.printStackTrace();
       }
       return match;
   }

    // Add in File method
    public void fileAdd(String newRow, String filePath){
        try(PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))){
            writer.println(newRow);
            System.out.println("File updated successfully!");
            
        } catch (IOException e){
            System.err.println("Error writing to the file");
            }
}

 

    

    public void updateFile(String filePath, List<?> dataList) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Object data : dataList) {
                if (data instanceof SalesEntry) {
                    writer.write(((SalesEntry) data).toCSV());
                } else if (data instanceof Item) {
                    writer.write(((Item) data).toCSV());
                    System.out.println("Writing Item: " + ((Item) data).toCSV());
                }
                writer.newLine(); // Add a new line after each entry   

            }
        }
    }
    


    public <T> List<T> deleteFromList(List<T> list, String primaryKey, String fileType) {
        list.removeIf(obj -> {
            if (fileType.equals("Sales") && obj instanceof SalesEntry) {
                return ((SalesEntry) obj).getSalesID().equals(primaryKey);
            } else if (fileType.equals("Inventory") && obj instanceof Item) {
                return ((Item) obj).getItemID().equals(primaryKey);
            }
            return false;
        });
        return list;
    }
    


    // Save the updated inventory to the file
    public void updateInventory(List<Item> inventoryList, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Item item : inventoryList) {
                writer.write(String.join("\t",
                        item.getItemID(),
                        item.getItemName(),
                        String.valueOf(item.getItemPrice()),
                        item.getSupplierCode(),
                        item.getDescription(),
                        String.valueOf(item.getStockLevel()),
                        String.valueOf(item.getRestockLevel())));
                writer.newLine();
            }
        }
    }

    // Load inventory items from the file into a List of Item objects
    public List<Item> loadInventory(String filePath) throws IOException {
        List<Item> inventoryList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.trim().split("\t");
                if (data.length >= 7) { // Assuming file has itemID, itemName, stockLevel, restockLevel
                    Item item = new Item();
                    item.setItemID(data[0]);
                    item.setItemName(data[1]);
                    item.setItemPrice(Double.parseDouble(data[2]));
                    item.setSupplierCode(data[3]);
                    item.setDescription(data[4]);
                    item.setStockLevel(Integer.parseInt(data[5]));
                    item.setRestockLevel(Integer.parseInt(data[6]));
                    inventoryList.add(item);
                }
            }
        }
        return inventoryList;
    }
    
    public List<SalesManager> loadSalesManagers(String filePath) throws IOException {
        List<SalesManager> salesManagers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) { // Load 4 fields of name,email,username,password
                    String name = parts[0];
                    String email = parts[1];
                    String username = parts[2];
                    String password = parts[3];

                    SalesManager manager = new SalesManager(null,name,email,username,password);
                    salesManagers.add(manager);
                }
            }
        }
        return salesManagers;
    }
    
    String generateNewSalesID(String salesFilePath) throws IOException {
        String newSalesID = "SD001";
        try (BufferedReader reader = new BufferedReader(new FileReader(salesFilePath))) {
            String lastLine = null, line;
            while ((line = reader.readLine()) != null) {
                lastLine = line;
            }
            if (lastLine != null && !lastLine.isEmpty()) {
                String[] lastData = lastLine.split(",");
                int salesID = Integer.parseInt(lastData[0].substring(2));
                newSalesID = String.format("SD%03d", salesID + 1);
            }
        }
        return newSalesID;
    }
    
    public List<SalesEntry> loadSales(String filePath) {
        List<SalesEntry> salesEntries = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 6) { // Adjust based on your Sales.txt structure
                    String salesID = parts[0].trim();
                    String salesDate = parts[1].trim();
                    int quantitySold = Integer.parseInt(parts[2].trim());
                    double amount = Double.parseDouble(parts[3].trim());
                    String salesManagerID = parts[4].trim();
                    String itemID = parts[5].trim();
                    salesEntries.add(new SalesEntry(salesID, salesDate, quantitySold, amount, salesManagerID, itemID));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return salesEntries;
    }

}

    

