/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment.sales_manager;

import java.time.LocalDate;

public class SalesEntry {
    
    private String salesID;
    private String salesDate;
    private int quantitySold;
    private double amount;
    private String salesManagerName;
    private String itemID;

    public SalesEntry(String salesID, String salesDate, int quantitySold, double amount, String salesManagerName, String itemID) {
        this.salesID = salesID;
        this.salesDate = salesDate;
        this.quantitySold = quantitySold;
        this.amount = amount;
        this.salesManagerName = salesManagerName;
        this.itemID = itemID;
    }

    public String getSalesID() {
        return salesID;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public double getAmount() {
        return amount;
    }

    public String getSalesManagerName() {
        return salesManagerName;
    }

    public String getItemID() {
        return itemID;
    }

    public void setSalesID(String salesID) {
        this.salesID = salesID;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setSalesManagerName(String salesManagerName) {
        this.salesManagerName = salesManagerName;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }


    public String toCSV(){
        return salesID + "," + salesDate + "," + quantitySold + "," +
        amount + "," + salesManagerName + "," + itemID;
    }
    
}
 