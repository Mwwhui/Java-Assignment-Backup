/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment.sales_manager;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author wongw
 */
public class CreateSalesReport {
    private List<SalesEntry> salesEntries;
    private List<Item> inventory;
    private List<SalesManager> salesManagers;

    public CreateSalesReport(List<SalesEntry> salesEntries, List<Item> inventory, List<SalesManager> salesManagers) {
        this.salesEntries = salesEntries;
        this.inventory = inventory;
        this.salesManagers = salesManagers;
    }
    
    public static String getItemName(String itemID, List<Item> inventory) {
        for (Item item : inventory) {
            if (item.getItemID().equals(itemID)) {
                return item.getItemName();
            }
        }
        return "Item Not Found";
    }

    public String getSalesManagerName(String username) {
        for (SalesManager manager : salesManagers) {
            if (manager.getUsername().equals(username)) { 
                return manager.getUsername(); 
            }
        }
        return "Sales Manager Not Found";
    }
    
   public List<SalesEntry> filterDateRange(List<SalesEntry> salesEntries, Date startDate, Date endDate) throws ParseException {
        List<SalesEntry> filteredSales = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        for (SalesEntry entry : salesEntries) {
            try {
                Date saleDate = formatter.parse(entry.getSalesDate()); // Assuming getSalesDate() returns a String
                if (!saleDate.before(startDate) && !saleDate.after(endDate)) {
                    filteredSales.add(entry);
                }
            } catch (ParseException e) {
                e.printStackTrace(); // Handle invalid date formats
                System.err.println("Invalid date format for sales entry: " + entry.getSalesID());
            }
        }

        return filteredSales;
    }
    
    public double calculateTotalSalesAmount(List<SalesEntry> filteredSales) {
        double totalAmount = 0;
        for (SalesEntry entry : filteredSales) {
            totalAmount += entry.getAmount(); // Assuming getAmount() returns the sales amount
        }
        return totalAmount;
    }
    
    
    public static String calculateTopSellingItem(List<SalesEntry> salesEntries, List<Item> inventory) {
        String topSellingItemID = null;
        int maxCount = 0;

        // Count occurrences of each item ID
        for (int i = 0; i < salesEntries.size(); i++) {
            String currentItemID = salesEntries.get(i).getItemID();
            int count = 0;

            for (int j = 0; j < salesEntries.size(); j++) {
                if (salesEntries.get(j).getItemID().trim().equalsIgnoreCase(currentItemID.trim())) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                topSellingItemID = currentItemID;
            }
        }

        // Debug statement
        System.out.println("Top Selling Item ID: " + topSellingItemID);

        // Get the item name
        for (Item item : inventory) {
            if (item.getItemID().trim().equalsIgnoreCase(topSellingItemID.trim())) {
                return item.getItemName();
            }
        }

        return "No items sold";
    }
    
    public String calculateTopSalesManager() {
        String topSalesManagerName = null;
        int maxCount = 0;

        // Iterate through sales entries to find the top sales manager
        for (int i = 0; i < salesEntries.size(); i++) {
            String currentManagerName = salesEntries.get(i).getSalesManagerName(); 
            int count = 0;

            // Count the number of sales for this manager
            for (int j = 0; j < salesEntries.size(); j++) {
                if (salesEntries.get(j).getSalesManagerName().equals(currentManagerName)) {
                    count++;
                }
            }

            // Update the top sales manager if this manager has more transactions
            if (count > maxCount) {
                maxCount = count;
                topSalesManagerName = currentManagerName;
            }
        }

        // Use getSalesManagerName to fetch the username based on the manager ID
        return topSalesManagerName != null ? getSalesManagerName(topSalesManagerName) : "No Sales Manager Found";
    }
}


