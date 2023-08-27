package Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fuel_transaction1")
public class FuelTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private Date date;
    @Column(name = "total_price")
    private double totalPrice;
    @Column(name = "price_per_gallon")
    private double pricePerGallon;
    @Column(name = "total_gallons_filled")
    private double totalGallonsFilled;

    @Column(name = "gallon_capacity") // New field for gallon capacity
    private double gallonCapacity;

    public double getGallonCapacity() {
        return gallonCapacity;
    }

    public void setGallonCapacity(double gallonCapacity) {
        this.gallonCapacity = gallonCapacity;
  }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}