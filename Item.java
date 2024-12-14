/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment.sales_manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Item {
    private String itemID;
    private String itemName;
    private double itemPrice;
    private String supplierCode;
    private String description;
    private int stockLevel;
    private int restockLevel;
    ArrayList<Item> inventoryList = new ArrayList<Item>();
    
    Item(){};
    

    public String getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public int getRestockLevel() {
        return restockLevel;
    }

    public void setRestockLevel(int restockLevel) {
        this.restockLevel = restockLevel;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    
    public static List<String> getAllItemIDs(String filePath) {
        List<String> itemIDs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\s+"); // Split the line into fields
                if (data.length >= 1) { 
                    itemIDs.add(data[0]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading Inventory.txt: " + e.getMessage());
        }
        return itemIDs;
    }
    
    // Validate if stock level is sufficient
    public boolean isStockSufficient(int quantitySold) {
        return quantitySold <= stockLevel;
    }

    // Decrease stock level
    public void decreaseStock(int quantitySold) {
        this.stockLevel -= quantitySold;
    }

    
    public String toCSV() {
        return String.join("\t", itemID, itemName, String.valueOf(itemPrice), supplierCode, description, String.valueOf(stockLevel), String.valueOf(restockLevel));
    }
}

