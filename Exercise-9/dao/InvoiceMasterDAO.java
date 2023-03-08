package dao;

import java.util.Collection;

import dto.InvoiceMasterDTO;

public abstract class InvoiceMasterDAO {
	public abstract InvoiceMasterDTO findByInvoiceNo(int invoiceNumber);
	public abstract int update(InvoiceMasterDTO invoicedto);
	public abstract Collection<InvoiceMasterDTO> findAll();
	public abstract void delete(InvoiceMasterDTO invoicedto);
}