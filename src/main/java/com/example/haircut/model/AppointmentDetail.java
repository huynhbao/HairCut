package com.example.haircut.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "AppointmentDetail")
public class AppointmentDetail {

    private String detailID;
    private String apptID;
    private String empEmail;
    private String serviceID;
    private double price;

    public AppointmentDetail() {
    }

    public AppointmentDetail(String detailID, String apptID, String empEmail, String serviceID, double price) {
        this.detailID = detailID;
        this.apptID = apptID;
        this.empEmail = empEmail;
        this.serviceID = serviceID;
        this.price = price;
    }

    public String getDetailID() {
        return detailID;
    }

    public void setDetailID(String detailID) {
        this.detailID = detailID;
    }

    public String getApptID() {
        return apptID;
    }

    public void setApptID(String apptID) {
        this.apptID = apptID;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}