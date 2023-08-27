package Controller;

import Entity.FuelTransaction;
import Request.FuelTransactionRequest;
import Service.FuelTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuelTransactionController {
    @Autowired
    private FuelTransactionService fuelTransactionService;


    @PostMapping("/calculate-invoice")
    public FuelTransaction getInvoice(@RequestBody FuelTransactionRequest request) {
        return fuelTransactionService.createFuelTransaction(request.getGallonCapacity(), request.getNoOfGallonsInVehicle());
    }
}