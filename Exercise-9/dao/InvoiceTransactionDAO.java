package dao;

import java.util.Collection;

import dto.InvoiceTransactionDTO;


public abstract class InvoiceTransactionDAO {
	public abstract InvoiceTransactionDTO findByInvoiceNumber(int invoiceNo);


	public abstract Collection<InvoiceTransactionDTO> findAll();

	public abstract int updateInvoice(InvoiceTransactionDTO invoiceTransactiondto);


	public abstract int deleteByInvoiceNumber(int invoiceNo);
}
