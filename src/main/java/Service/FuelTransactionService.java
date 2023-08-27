package Service;

import Entity.FuelTransaction;
import Repository.FuelTransactionRepository;
import Config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class FuelTransactionService {
    @Autowired
    private FuelTransactionRepository FuelTransactionRepository;

    public FuelTransaction createFuelTransaction(double gallonCapacity, double noOfGallonsInVehicle) {
        double totalGallonsToBeFilled = gallonCapacity - noOfGallonsInVehicle;
        double totalPrice = totalGallonsToBeFilled * Config.GAS_PRICE_PER_GALLON;

        FuelTransaction transaction = new FuelTransaction();
        transaction.setDate(new Date());
        transaction.setPricePerGallon(Config.GAS_PRICE_PER_GALLON);
        transaction.setTotalGallonsFilled(totalGallonsToBeFilled);
        transaction.setTotalPrice(totalPrice);

        return FuelTransactionRepository.save(transaction);
    }
}