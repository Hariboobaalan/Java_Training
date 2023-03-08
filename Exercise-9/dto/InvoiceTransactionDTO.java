package dto;

import java.io.Serializable;
import java.util.Objects;

public class InvoiceTransactionDTO implements Serializable, Comparable<InvoiceTransactionDTO>{

	private int invoiceNumber;
	private int itemNumber;
	private int itemQuantity;
	
	public InvoiceTransactionDTO(){
		
	}
	
	InvoiceTransactionDTO(int invoiceNumber, int itemNumber, int itemQuantity) {
		this.invoiceNumber=invoiceNumber;
		this.itemNumber=itemNumber;
		this.itemQuantity=itemQuantity;
	}
	
	
	
	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	@Override
	public String toString() {
		return "InvoiceTransactionDTO [invoiceNumber=" + invoiceNumber + ", itemNumber=" + itemNumber
				+ ", itemQuantity=" + itemQuantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(invoiceNumber, itemNumber, itemQuantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceTransactionDTO other = (InvoiceTransactionDTO) obj;
		return invoiceNumber == other.invoiceNumber && itemNumber == other.itemNumber
				&& itemQuantity == other.itemQuantity;
	}

	@Override
	public int compareTo(InvoiceTransactionDTO o) {
		return new Integer(o.getInvoiceNumber()).compareTo(this.getInvoiceNumber());
	}

}