package Result;

import java.util.Date;

public class Invoice {
    Date date;

    double totalPrice;
    double pricePerGallon;
    double totalGallonsFilled;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getPricePerGallon() {
        return pricePerGallon;
    }

    public void setPricePerGallon(double pricePerGallon) {
        this.pricePerGallon = pricePerGallon;
    }

    public double getTotalGallonsFilled() {
        return totalGallonsFilled;
    }

    public void setTotalGallonsFilled(double totalGallonsFilled) {
        this.totalGallonsFilled = totalGallonsFilled;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "date=" + date +
                ", totalPrice=" + totalPrice +
                ", pricePerGallon=" + pricePerGallon +
                ", totalGallonsFilled=" + totalGallonsFilled +
                '}';
    }
}