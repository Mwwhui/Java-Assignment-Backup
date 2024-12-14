/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopassignment.sales_manager;
import java.util.*;
import java.io.*;


public class mainSalesManager {


    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(() -> {
            ViewInventory viewInventory = new ViewInventory();
            javax.swing.JFrame frame = new javax.swing.JFrame("View Inventory");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(viewInventory); // Add the JPanel to the frame
            frame.setSize(800, 600); // Set the frame size
            frame.setVisible(true); // Make the frame visible
        });
        
        new ViewInventory();
    }
    
}
