package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import database.DBUtility;
import dto.InvoiceTransactionDTO;

public class InvoiceTransactionDAOImpl extends InvoiceTransactionDAO implements Cloneable {
	private static InvoiceTransactionDAOImpl invoiceTransactiondao;

	/**
	 * If the object is null, create a new object and return it. If the object is not null, create a clone
	 * of the object and return it
	 * 
	 * @return A clone of the object.
	 */
	public static InvoiceTransactionDAOImpl getInvoiceTransactionDAOImplObject() {
		if (invoiceTransactiondao == null) {
			invoiceTransactiondao = new InvoiceTransactionDAOImpl();
			return invoiceTransactiondao;
		} else {
			return invoiceTransactiondao.createClone();
		}
	}

	private InvoiceTransactionDAOImpl createClone() {
		if (invoiceTransactiondao != null) {
			try {
				return (InvoiceTransactionDAOImpl) super.clone();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}
	

	@Override
	// This method is used to find the invoice details by invoice number.
	public InvoiceTransactionDTO findByInvoiceNumber(int invoiceNo) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from invoice_transaction where invoiceno=?");
			preparedStatement.setInt(1, invoiceNo);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				InvoiceTransactionDTO itemdto = new InvoiceTransactionDTO();
				itemdto.setInvoiceNumber(resultSet.getInt("invoiceno"));
				itemdto.setItemNumber(resultSet.getInt("itemno"));
				itemdto.setItemQuantity(resultSet.getInt("quantity"));
				return itemdto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	@Override
	// This method is used to find all the invoice details.
	public Collection<InvoiceTransactionDTO> findAll() {
		try {
			Connection connection = DBUtility.getConnection();
			Statement preparedStatement = connection.createStatement();
			ResultSet resultSet = preparedStatement.executeQuery("select * from invoice_transaction");
			List<InvoiceTransactionDTO> invoiceList = new ArrayList<InvoiceTransactionDTO>();
			while(resultSet.next()) {
				InvoiceTransactionDTO dto = new InvoiceTransactionDTO();
				dto.setInvoiceNumber(resultSet.getInt("invoiceno"));
				dto.setItemNumber(resultSet.getInt("itemno"));
				dto.setItemQuantity(resultSet.getInt("quantity"));
				invoiceList.add(dto);
			}
			return invoiceList;
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	@Override
	// This method is used to update the invoice details.
	public int updateInvoice(InvoiceTransactionDTO invoiceTransactiondto) {
		try {
			Connection connection = DBUtility.getConnection();
			int invoiceno = invoiceTransactiondto.getInvoiceNumber();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from invoice_transaction where invoiceno=?");
			preparedStatement.setInt(1, invoiceno);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				preparedStatement = connection.prepareStatement("update invoice_transaction set itemno=?, quantity=? where invoiceno=?");
				preparedStatement.setInt(1, invoiceTransactiondto.getItemNumber());
				preparedStatement.setInt(2, invoiceTransactiondto.getItemQuantity());
				preparedStatement.setInt(3, invoiceTransactiondto.getInvoiceNumber());
				int n = preparedStatement.executeUpdate();
				DBUtility.closeConnection(null);
				if(n==1) {
					System.out.println("Invoice data Updated");
				}else {
					System.out.println("Invoice Not Found!");
				}
				return n;
			} else {
				return 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	@Override
	// This method is used to delete the invoice details by invoice number.
	public int deleteByInvoiceNumber(int invoiceNo) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from invoice_transaction where invoiceno=?");
			preparedStatement.setInt(1, invoiceNo);
			int n = preparedStatement.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
			
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

}