/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment.sales_manager;
import java.time.LocalDate;


public class purchaseRequisition {
    private String requisitionID;
    private Item itemID;
    private int quantity;
    private LocalDate requestDate;

    public String getRequisitionID() {
        return requisitionID;
    }

    public Item getItemID() {
        return itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequisitionID(String requisitionID) {
        this.requisitionID = requisitionID;
    }

    public void setItemID(Item itemID) {
        this.itemID = itemID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

}
    