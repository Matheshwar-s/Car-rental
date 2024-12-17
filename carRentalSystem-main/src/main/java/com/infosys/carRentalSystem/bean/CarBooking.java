
package com.infosys.carRentalSystem.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CarBooking {
    @Id
    private Long bookingId;
    private String username;
    private String carNumber;
    private String variantId;
    private String fromDate;
    private String toDate;
    private Double totalPayment;
    private Double advancePayment;
    private Double pendingPayment;
    private Boolean status;

    public CarBooking() {
        super();
    }

    public CarBooking(Long bookingId) {
        super();
        this.bookingId = bookingId;
        this.status = Boolean.TRUE;
    }

    public CarBooking(Long bookingId, String username, String carNumber, String variantId, String fromDate, String toDate, Double totalPayment, Double advancePayment, Double pendingPayment, Boolean status) {
        this.bookingId = bookingId;
        this.username = username;
        this.carNumber = carNumber;
        this.variantId = variantId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.totalPayment = totalPayment;
        this.advancePayment = advancePayment;
        this.pendingPayment = pendingPayment;
        this.status = status;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getVariantId() {
        return variantId;
    }

    public void setVariantId(String variantId) {
        this.variantId = variantId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public Double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Double getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(Double advancePayment) {
        this.advancePayment = advancePayment;
    }

    public Double getPendingPayment() {
        return pendingPayment;
    }

    public void setPendingPayment(Double pendingPayment) {
        this.pendingPayment = pendingPayment;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean string) {
        this.status = string;
    }

    @Override
    public String toString() {
        return "CarBooking{" +
                "bookingId=" + bookingId +
                ", username='" + username + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", variantId='" + variantId + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", totalPayment=" + totalPayment +
                ", advancePayment=" + advancePayment +
                ", pendingPayment=" + pendingPayment +
                ", status=" + status +
                '}';
    }

	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}
}
