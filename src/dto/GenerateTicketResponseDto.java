package dto;

import java.util.Date;

public class GenerateTicketResponseDto {
    private ResponseStatus responseStatus;
    private String vehicleNumber;
    private String parkingSlot;
    private int parkingFloor;
    private Date entryTime;
    private String operatorName;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(String parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public int getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(int parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
