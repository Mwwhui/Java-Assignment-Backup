/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment.sales_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import oopassignment.Users;
import oopassignment.sales_manager.CrudHelper;
import oopassignment.sales_manager.Item;


public class SalesManager extends Users {
    
    private CrudHelper crudHelper;
    private List<Item> inventory = new ArrayList<>(); 


    public SalesManager(CrudHelper crudHelper,String name,String email, String username, String password) {
        super(name, email,username, password);
        this.crudHelper = crudHelper;
    }
    
    //Overload constructor with only name
    public SalesManager(String name){
        super(name,null,null,null);
    }
    
    public SalesManager() {
        super(null, null, null, null); // Call the no-argument constructor of Users
        this.crudHelper = new CrudHelper(); //if initialize the CrudHelper
    }


    public void viewInventory(String filePath){

    }


    
  // Add sales entry using SalesEntry object
    public void addSalesEntry(CrudHelper helper, String newRow, String salesFilePath) throws IOException {
        helper.fileAdd(newRow, salesFilePath);
        System.out.println("Sales entry added by Manager: " + name);
    }

    // Overloaded method: Add sales entry using raw data
    public void addSalesEntry(CrudHelper helper, String salesID, String salesDate, int quantitySold, double amount,String name,String itemID, String salesFilePath) throws IOException {

        String newRow = String.join(",", salesID, salesDate, String.valueOf(quantitySold), String.valueOf(amount), name, itemID);

        helper.fileAdd(newRow, salesFilePath);

        System.out.println("Sales entry added by Manager: " + name);
    }

    

    
    public void deleteSalesEntry(){
        
    }
    
    public void createSalesReport(){
        
    }
    
    public int viewStockLevel(){
        
        return 0;
        
    }
    
    public void createPurchaseRequisition(){
        
    }
    
    public void viewPurchaseOrder(){
        
    }
}


