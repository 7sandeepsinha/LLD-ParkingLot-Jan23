package model;

import model.enums.Status;
import model.enums.VehicleType;

import java.util.List;

public class ParkingSlot extends BaseModel {
    private Status parkingSpotStatus;
    private ParkingFloor parkingFloor;
    private List<VehicleType> supportedVehicleType;
    private int number;

    public Status getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(Status parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<VehicleType> getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(List<VehicleType> supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
