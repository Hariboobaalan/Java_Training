package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import database.DBUtility;
import dto.InvoiceMasterDTO;

/**
 * @author hariboobaalan
 *
 */
public class InvoiceMasterDAOImpl extends InvoiceMasterDAO implements Cloneable {
	
	private static InvoiceMasterDAOImpl invoiceMasterdao;

	/**
	 * > If the object is null, create a new object and return it. If the object is not null, create a
	 * clone of the object and return it
	 * 
	 * @return A clone of the object.
	 */
	public static InvoiceMasterDAOImpl getInvoiceMasterDAOImplObject() {
		if (invoiceMasterdao == null) {
			invoiceMasterdao = new InvoiceMasterDAOImpl();
			return invoiceMasterdao;
		} else {
			return invoiceMasterdao.createClone();
		}
	}

	private InvoiceMasterDAOImpl createClone() {
		if (invoiceMasterdao != null) {
			try {
				return (InvoiceMasterDAOImpl) super.clone();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}

	private InvoiceMasterDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	
	// This method is used to find the invoice by invoice number.
	public InvoiceMasterDTO findByInvoiceNo(int number) {
		try {
		Connection connection=DBUtility.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from invoice_master where invoiceno=?");
		preparedStatement.setInt(1, number);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			InvoiceMasterDTO invoicedto=new InvoiceMasterDTO();
			invoicedto.setInvoiceno(resultSet.getInt("invoiceno"));
			invoicedto.setDate(resultSet.getString("date"));
			invoicedto.setCustomerid(resultSet.getInt("cid"));
			invoicedto.setInvoiceno(number);
			return invoicedto;
		}
		else {
			return null;
		}
		}catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}
	
	// This method is used to return a collection all the invoices in database.
	public Collection<InvoiceMasterDTO> findAll(){
		
		try {
			Connection connection=DBUtility.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from invoice_master");
			List<InvoiceMasterDTO> invoiceMaster=new ArrayList<InvoiceMasterDTO>();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				InvoiceMasterDTO invoicemasterdto=new InvoiceMasterDTO();
				invoicemasterdto.setInvoiceno(resultSet.getInt("invoiceno"));
				invoicemasterdto.setDate(resultSet.getString("date"));
				invoicemasterdto.setCustomerid(resultSet.getInt("cid"));
				invoiceMaster.add(invoicemasterdto);
				
			}
			return invoiceMaster;
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	
	// This method is used to update the invoice details.
	public int update(InvoiceMasterDTO invoicedto) {
		try {
			Connection connection=DBUtility.getConnection();
			int invoiceno=invoicedto.getInvoiceno();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from invoice_master where invoiceno=?");
			preparedStatement.setInt(1, invoiceno);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				preparedStatement=connection.prepareStatement("update invoice_master set date=?,cid=? where invoiceno=?");
				preparedStatement.setString(1, invoicedto.getDate());
				preparedStatement.setInt(2, invoicedto.getCustomerid());
				preparedStatement.setInt(3, invoicedto.getInvoiceno());
				int n=preparedStatement.executeUpdate();
				DBUtility.closeConnection(null);
				return n;
			}
			else {
				return 0;
			}
		
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
		
	}
	
	// This method is used to delete the invoice details from the database.
	public void delete(InvoiceMasterDTO imdto) {
		try {
			Connection connection=DBUtility.getConnection();
			int invoiceno = imdto.getInvoiceno();
			PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM invoice_master WHERE invoiceno = ?");
			preparedStatement.setInt(1, invoiceno);
			int n = preparedStatement.executeUpdate();
			if (n == 1) {
				System.out.println("Invoice deleted");
			} else {
				System.out.println("InvoiceNo does not exist");
			}
			DBUtility.closeConnection(null);
		
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
		
		}
	}
	
}