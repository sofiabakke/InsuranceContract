package com.example.InsuranceContract;

public class Contract {
    private String id;
    private String name;
    private String customerId;
    private String status;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
