package dto;

import java.io.Serializable;
import java.util.Objects;

public class CustomerMasterDTO implements Serializable, Comparable<CustomerMasterDTO>{
	private int customerId;
	private String customerName;
	private String customerAddress;
	
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public CustomerMasterDTO() {
	}

	public CustomerMasterDTO(int customerId, String customerName, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	@Override
	public String toString() {
		return "CustomerMasterDTO [customerId=" + customerId + ", customerName=" + customerName + ", address=" + customerAddress
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerAddress, customerId, customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerMasterDTO other = (CustomerMasterDTO) obj;
		return Objects.equals(customerAddress, other.customerAddress) && customerId == other.customerId
				&& Objects.equals(customerName, other.customerName);
	}

	@Override
	public int compareTo(CustomerMasterDTO o) {
		return new Integer(this.getCustomerId()).compareTo(o.getCustomerId());
	}
	
	
	
}
