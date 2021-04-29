/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.Details;

import javax.persistence.ManyToOne;

/**
 *
 * @author tanis
 */
public class vehicle{
    private int vehicleNumber;
    private String vehicleModel;
    private String vehicleType;
    private String vehicleSeater;
    private String location;
    private String fee;
    private String time1;
    private String condition1;
    private String description;
     @ManyToOne
    private Lender ld;

    public vehicle(int vehicleNumber, String vehicleModel, String vehicleType, String vehicleSeater, String location, String fee, String time1, String condition1, String description, Lender ld) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleModel = vehicleModel;
        this.vehicleType = vehicleType;
        this.vehicleSeater = vehicleSeater;
        this.location = location;
        this.fee = fee;
        this.time1 = time1;
        this.condition1 = condition1;
        this.description = description;
        this.ld = ld;
    }

   

    public vehicle() {
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleSeater() {
        return vehicleSeater;
    }

    public void setVehicleSeater(String vehicleSeater) {
        this.vehicleSeater = vehicleSeater;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getCondition1() {
        return condition1;
    }

    public void setCondition1(String condition1) {
        this.condition1 = condition1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Lender getLd() {
        return ld;
    }

    public void setLd(Lender ld) {
        this.ld = ld;
    }
}

   