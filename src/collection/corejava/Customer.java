package collection.corejava;

public class Customer {

	private String customerName;
	private String[] customerAddress;
	private double phoneNumber;

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String[] getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String[] customerAddress) {
		this.customerAddress = customerAddress;
	}

}
