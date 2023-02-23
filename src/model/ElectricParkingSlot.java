package model;

public class ElectricParkingSlot extends ParkingSlot {
    private ElectricCharger electriCharger;
    //create ElectricCharger interface
    //multiple impl -> TataFastCharger, TataSlowCharger etc.

    public ElectricCharger getElectriCharger() {
        return electriCharger;
    }

    public void setElectriCharger(ElectricCharger electriCharger) {
        this.electriCharger = electriCharger;
    }
}
