package entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
	long appointmentId;
	String location;
	String visitType;
	LocalDate preferredDate;
	LocalTime preferredTime;
	String serviceName;
	Customer customer;
	Payment payment;
	public Appointment() {
		super();
	}
	public Appointment(long appointmentId, String location, String visitType, LocalDate preferredDate,
			LocalTime preferredTime, String serviceName, Customer customer, Payment payment) {
		super();
		this.appointmentId = appointmentId;
		this.location = location;
		this.visitType = visitType;
		this.preferredDate = preferredDate;
		this.preferredTime = preferredTime;
		this.serviceName = serviceName;
		this.customer = customer;
		this.payment = payment;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getVisitType() {
		return visitType;
	}
	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}
	public LocalDate getPreferredDate() {
		return preferredDate;
	}
	public void setPreferredDate(LocalDate preferredDate) {
		this.preferredDate = preferredDate;
	}
	public LocalTime getPreferredTime() {
		return preferredTime;
	}
	public void setPreferredTime(LocalTime preferredTime) {
		this.preferredTime = preferredTime;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", location=" + location + ", visitType=" + visitType
				+ ", preferredDate=" + preferredDate + ", preferredTime=" + preferredTime + ", serviceName="
				+ serviceName + ", payment=" + payment + "]";
	}
	
	

}
