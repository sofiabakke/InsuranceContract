package com.example.InsuranceContract;

public class Fagsystem {
    Contract contract = new Contract();
    public String createCustomer(String customerName) {
        Customer newCustomer = new Customer();
        newCustomer.setId("12345");
        newCustomer.setName(customerName);
        return newCustomer.getId();
    }

    public String createContract(String contractName, String customerId) {
        Contract contract = new Contract();
        contract.setId("98765");
        contract.setName(contractName);
        contract.setCustomerId(customerId);
        contract.setStatus("Created");
        this.contract = contract;
        return contract.getId();
    }

    public String updateStatus(String contractId) {
        String response;
        if (contract.getName().equals("Ingen")){
            response = "not sent. Invalid name";
        }
        else {
            response = "Sent";
        }
        this.contract.setStatus(response);
        return response;
    }
}
