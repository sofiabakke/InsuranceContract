package com.example.InsuranceContract;

import org.jvnet.hk2.annotations.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@Service
@Path("/insurance")
public class InsuranceContractResource extends Application {
    private Brevtjeneste brevtjeneste = new Brevtjeneste();
    private Fagsystem fagsystem = new Fagsystem();


    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String createContract(@QueryParam("contractName") String contractName, @QueryParam("customerName") String customerName) {
        String result;
        String customerID = fagsystem.createCustomer(customerName);
        String contractID = fagsystem.createContract(contractName, customerID);
        int sendingStatus = brevtjeneste.sendContract(contractID, customerID);
        if (sendingStatus == 200) {
            String contractStatus = fagsystem.updateStatus(contractID);
            result = "Contract " + contractID + " " + contractStatus;
        } else {
            result = "Not OK";
        }
        return result;
    }
}
