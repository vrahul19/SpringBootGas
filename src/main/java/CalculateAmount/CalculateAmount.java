package CalculateAmount;

import Config.Config;
import Result.Invoice;

import java.util.Date;

public class CalculateAmount {
    public Invoice getInvoice (double gallonCapacity, double no0fGallonsInVehicle) {
        double totalGallonsToBeFilled = gallonCapacity - no0fGallonsInVehicle;
        double totalPrice = totalGallonsToBeFilled * Config.GAS_PRICE_PER_GALLON;
        Invoice invoice = new Invoice();
        invoice.setDate(new Date());
        invoice.setPricePerGallon(Config.GAS_PRICE_PER_GALLON);
        invoice.setTotalGallonsFilled(totalGallonsToBeFilled);
        invoice.setTotalPrice(totalPrice);

        return invoice;
    }
}