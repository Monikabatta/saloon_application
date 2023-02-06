package entity;

public class SalonService {
	long serviceId;
	String seviceName;
	String servicePrice;
	String serviceDuration;
	int discount;
	public SalonService() {
		super();
	}
	public SalonService(long serviceId, String seviceName, String servicePrice, String serviceDuration, int discount) {
		super();
		this.serviceId = serviceId;
		this.seviceName = seviceName;
		this.servicePrice = servicePrice;
		this.serviceDuration = serviceDuration;
		this.discount = discount;
	}
	public long getServiceId() {
		return serviceId;
	}
	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}
	public String getSeviceName() {
		return seviceName;
	}
	public void setSeviceName(String seviceName) {
		this.seviceName = seviceName;
	}
	public String getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}
	public String getServiceDuration() {
		return serviceDuration;
	}
	public void setServiceDuration(String serviceDuration) {
		this.serviceDuration = serviceDuration;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "SalonService [serviceId=" + serviceId + ", seviceName=" + seviceName + ", servicePrice=" + servicePrice
				+ ", serviceDuration=" + serviceDuration + ", discount=" + discount + "]";
	}
	
	
	

}
