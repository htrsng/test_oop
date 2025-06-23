package com.example.servingwebcontent.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private List<Invoice> purchaseHistory;

    // Constructor rỗng (bắt buộc cho Spring/Thymeleaf)
    public Customer() {
        this.id = "";
        this.name = "";
        this.email = "";
        this.phoneNumber = "";
        this.purchaseHistory = new ArrayList<>();
    }

    // Constructor đầy đủ
    public Customer(String id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.purchaseHistory = new ArrayList<>();
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public List<Invoice> getPurchaseHistory() { return purchaseHistory; }

    // Methods
    public void addPurchase(Invoice invoice) { purchaseHistory.add(invoice); }
    public void deletePurchase(String invoiceId) { purchaseHistory.removeIf(invoice -> invoice.getInvoiceId().equals(invoiceId)); }
    public String getCustomerInfo() { return "ID: " + id + ", Name: " + name + ", Email: " + email + ", Phone: " + phoneNumber; }
}