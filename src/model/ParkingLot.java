package model;

import model.enums.Status;
import model.enums.VehicleType;

import java.util.List;
import java.util.Map;

public class ParkingLot extends BaseModel {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private Status status;
    private String name;
    private String address;
    private Map<VehicleType, Integer> baseRateMap;

}
