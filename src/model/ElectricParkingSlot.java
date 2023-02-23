package model;

public class ElectricParkingSlot extends ParkingSlot {
    private ElectricCharger electricCharger;

    public ElectricCharger getElectricCharger() {
        return electricCharger;
    }

    public void setElectricCharger(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }
}
