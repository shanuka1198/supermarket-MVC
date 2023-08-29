/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.mvc.model;

/**
 *
 * @author HP
 */
public class OrderModel {
    private String oderId;
    private String OderDate;
    private String customerId;
    
    public OrderModel(){
        
    }

    public OrderModel(String oderId, String OderDate, String customerId) {
        this.oderId = oderId;
        this.OderDate = OderDate;
        this.customerId = customerId;
    }

    /**
     * @return the oderId
     */
    public String getOderId() {
        return oderId;
    }

    /**
     * @param oderId the oderId to set
     */
    public void setOderId(String oderId) {
        this.oderId = oderId;
    }

    /**
     * @return the OderDate
     */
    public String getOderDate() {
        return OderDate;
    }

    /**
     * @param OderDate the OderDate to set
     */
    public void setOderDate(String OderDate) {
        this.OderDate = OderDate;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "OderModel{" + "oderId=" + oderId + ", OderDate=" + OderDate + ", customerId=" + customerId + '}';
    }

    
    }
    

