/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopassignment.sales_manager;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import oopassignment.Users;

/**
 *
 * @author wongw
 */
public class AddSalesEntry extends javax.swing.JFrame {

    /**
     * Creates new form AddSalesEntry
     */
    public AddSalesEntry() {
        initComponents();
        populateItemIDBox();
        populateSalesManagerBox();
        setupListeners();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantitySoldTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        salesManagerBox = new javax.swing.JComboBox<>();
        itemIDBox = new javax.swing.JComboBox<>();
        amountTextField = new javax.swing.JLabel();
        backToMenuBtn = new javax.swing.JButton();
        salesDateChoose = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Add Sales Entry");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Quantity Sold :");

        quantitySoldTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitySoldTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Amount :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Item ID :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Sales Date :");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Sales Manager Name:");

        salesManagerBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose an ID", "Item 1", "Item 2", "Item 3", "Item 4" }));
        salesManagerBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesManagerBoxActionPerformed(evt);
            }
        });

        itemIDBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose an ID", "Item 1", "Item 2", "Item 3", "Item 4" }));
        itemIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIDBoxActionPerformed(evt);
            }
        });

        amountTextField.setText("0.00");

        backToMenuBtn.setText("Back");
        backToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(quantitySoldTextField)
                                    .addComponent(itemIDBox, 0, 163, Short.MAX_VALUE)
                                    .addComponent(salesDateChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(92, 92, 92)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(salesManagerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(addButton)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(backToMenuBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addComponent(backToMenuBtn))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(salesManagerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelButton)
                            .addComponent(addButton))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salesDateChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(itemIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(quantitySoldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(amountTextField))
                        .addGap(145, 145, 145))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void itemIDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIDBoxActionPerformed

        String selectedItemID = (String) itemIDBox.getSelectedItem();
        if (selectedItemID != null) {
            System.out.println("Selected ItemID: " + selectedItemID);
        }

        
    }//GEN-LAST:event_itemIDBoxActionPerformed
    private void populateItemIDBox() {
        String filePath = "InventoryManager/ItemEntry.txt"; // Path to Inventory.txt

        // Clear existing items in the dropdown
        itemIDBox.removeAllItems();

        // Retrieve all ItemIDs from the file using the Item class
        List<String> itemIDs = Item.getAllItemIDs(filePath);
        

        // Populate the dropdown
        for (String itemID : itemIDs) {
            itemIDBox.addItem(itemID); // Add each ItemID to the combo box
        }
    }
    
    
    private void populateSalesManagerBox() {
        
        String filePath = "SalesManager/SalesManager.txt"; 

        // Clear existing items in the dropdown
        salesManagerBox.removeAllItems();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); 
                if (data.length >= 3 ) {
                    String name = data[0]; 
                    salesManagerBox.addItem(name); 
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading sales managers: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private void setupListeners() {
        // Listener for ItemID selection
        itemIDBox.addActionListener(e -> {
            updateItemPrice();
            updateAmount();
        });

        // Listener for QuantitySold input
        quantitySoldTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                updateAmount();
            }
        });
    }
    
    private double itemPrice = 0.0; // Store the selected item's price

    private void updateItemPrice() {
        String selectedItemID = (String) itemIDBox.getSelectedItem();
        System.out.println(selectedItemID);
        if (selectedItemID != null && !selectedItemID.isEmpty()) {
            try {
                CrudHelper helper = new CrudHelper();
                List<Item> inventoryList = helper.loadInventory("InventoryManager/ItemEntry.txt");
                System.out.println(inventoryList);
                

                for (Item item : inventoryList) {
                    if (item.getItemID().equals(selectedItemID)) {
                        itemPrice = item.getItemPrice(); 
                        System.out.println(itemPrice);
                        break;
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error loading item price: " + e.getMessage(),
                                              "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void updateAmount() {
        try {
            String quantityText = quantitySoldTextField.getText().trim();
            int quantitySold = Integer.parseInt(quantityText);
            double amount = quantitySold * itemPrice;
            amountTextField.setText(String.format("%.2f", amount)); // Format to 2 decimal places
        } catch (NumberFormatException e) {
            // Clear amount if input is invalid
            amountTextField.setText("");
        }
    } 

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String salesFilePath = "SalesManager/Sales.txt";
        String inventoryFilePath = "InventoryManager/ItemEntry.txt";

        try {
            CrudHelper helper = new CrudHelper();

            // Load inventory
            List<Item> inventory = helper.loadInventory(inventoryFilePath);
            System.out.println("Loaded Inventory:");
            inventory.forEach(item -> System.out.println("Item ID: " + item.getItemID()));

            // Get selected item
            String selectedItemID = (String) itemIDBox.getSelectedItem();
            System.out.println("Selected Item ID: " + selectedItemID);

            Item selectedItem = inventory.stream()
                .filter(item -> item.getItemID().trim().equalsIgnoreCase(selectedItemID.trim()))
                .findFirst()
                .orElse(null);

            if (selectedItem == null) {
                JOptionPane.showMessageDialog(null, "Item not found in inventory!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Get quantity sold
            int quantitySold = Integer.parseInt(quantitySoldTextField.getText().trim());

            // Validate stock
            if (!selectedItem.isStockSufficient(quantitySold)) {
                JOptionPane.showMessageDialog(null, "Quantity sold exceeds stock level!", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Decrease stock level
            selectedItem.decreaseStock(quantitySold);

            // Save updated inventory
            helper.updateInventory(inventory, inventoryFilePath);

            // Generate new sales ID
            String newSalesID = helper.generateNewSalesID(salesFilePath);
            String salesDate = new SimpleDateFormat("dd/MM/yyyy").format(salesDateChoose.getDate());
            double amount = Double.parseDouble(amountTextField.getText());
            String name = (String) salesManagerBox.getSelectedItem();
            
            // Create SalesManager object
            SalesManager salesManager = new SalesManager("Manager Name: ");
            salesManager.addSalesEntry(helper, newSalesID, salesDate, quantitySold, amount, name, selectedItemID, salesFilePath);

            // Display success message
            JOptionPane.showMessageDialog(null, "Sales added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        // Reset all text fields to blank
        quantitySoldTextField.setText("");
        quantitySoldTextField.setText("");

        // Reset date chooser (assuming salesDateChoose is a JDateChooser)
        salesDateChoose.setDate(null);

        // Reset combo boxes to default or blank
        salesManagerBox.setSelectedIndex(0); // Assuming index 0 is the default
        itemIDBox.setSelectedIndex(0); // Assuming index 0 is the default

        // Optionally, reset other UI components if necessary
        JOptionPane.showMessageDialog(null, "All fields have been reset.", "Reset", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void quantitySoldTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitySoldTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantitySoldTextFieldActionPerformed

    private void salesManagerBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesManagerBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salesManagerBoxActionPerformed

    private void backToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuBtnActionPerformed
        SalesEntryChoice choiceFrame = new SalesEntryChoice();

        choiceFrame.setVisible(true);

        this.dispose(); 
    }//GEN-LAST:event_backToMenuBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddSalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSalesEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel amountTextField;
    private javax.swing.JButton backToMenuBtn;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> itemIDBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField quantitySoldTextField;
    private com.toedter.calendar.JDateChooser salesDateChoose;
    private javax.swing.JComboBox<String> salesManagerBox;
    // End of variables declaration//GEN-END:variables
}
