package de.neuefische.model;

public enum OrderStatus {
    RECEIVED("Received"),
    IN_PROGRESS("In Progress"),
    IN_DELIVERY("In Delivery"),
    COMPLETED("Completed"),
    CANCELED("Canceled");

    private String status;

    OrderStatus(String s) {
        this.status = s;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "status='" + status + '\'' +
                '}';
    }
}
