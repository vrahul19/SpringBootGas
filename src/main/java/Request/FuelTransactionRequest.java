package Request;

public class FuelTransactionRequest {
    private double gallonCapacity;
    private double noOfGallonsInVehicle;

    public double getGallonCapacity() {
        return gallonCapacity;
    }

    public void setGallonCapacity(double gallonCapacity) {
        this.gallonCapacity = gallonCapacity;
    }

    public double getNoOfGallonsInVehicle() {
        return noOfGallonsInVehicle;
    }

    public void setNoOfGallonsInVehicle(double noOfGallonsInVehicle) {
        this.noOfGallonsInVehicle = noOfGallonsInVehicle;
    }
}