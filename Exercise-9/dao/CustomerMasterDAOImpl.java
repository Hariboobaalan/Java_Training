package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import database.DBUtility;
import dto.CustomerMasterDTO;
public class CustomerMasterDAOImpl extends CustomerMasterDAO implements Cloneable{

	private static CustomerMasterDAOImpl customerMasterdao;

	/**
	 * If the object is null, create a new object and return it. If the object is not null, create a clone
	 * of the object and return it
	 * 
	 * @return A clone of the object.
	 */
	public static CustomerMasterDAOImpl getCustomerMasterDAOImplObject() {
		if (customerMasterdao == null) {
			customerMasterdao = new CustomerMasterDAOImpl();
			return customerMasterdao;
		} else {
			return customerMasterdao.createClone();
		}
	}

	private CustomerMasterDAOImpl createClone() {
		if (customerMasterdao != null) {
			try {
				return (CustomerMasterDAOImpl) super.clone();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}

	private CustomerMasterDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	// This method is used to find the customer using their customer ID
	public CustomerMasterDTO findByCustomerId(int number) {
		try {
		Connection connection=DBUtility.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from customer_master where cid=?");
		preparedStatement.setInt(1, number);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			CustomerMasterDTO  customerdto= new CustomerMasterDTO();
			customerdto.setCustomerId(resultSet.getInt("cid"));
			customerdto.setCustomerName(resultSet.getString("name"));
			customerdto.setCustomerAddress(resultSet.getString("address"));
			customerdto.setCustomerId(number);
			return customerdto;
		}
		else {
			return null;
		}
		}catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}
	
	//This method is used to find the customer by their name
	public CustomerMasterDTO findByCustomerName(String name) {
		try {
			Connection connection=DBUtility.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from customer_master where name=?");
			preparedStatement.setString(1, name);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				CustomerMasterDTO  customerdto= new CustomerMasterDTO();
				customerdto.setCustomerId(resultSet.getInt("cid"));
				customerdto.setCustomerName(resultSet.getString("name"));
				customerdto.setCustomerAddress(resultSet.getString("address"));
				customerdto.setCustomerName(name);
				return customerdto;
			}
			else {
				return null;
			}
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	
	// This method returns a List of all customers
	public Collection<CustomerMasterDTO> findAll(){
		
		try {
			Connection connection=DBUtility.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from customer_master");
			List<CustomerMasterDTO > customerMaster=new ArrayList<CustomerMasterDTO>();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				CustomerMasterDTO customerMasterdto=new CustomerMasterDTO ();
				customerMasterdto.setCustomerId(resultSet.getInt("cid"));
				customerMasterdto.setCustomerName(resultSet.getString("name"));
				customerMasterdto.setCustomerAddress(resultSet.getString("address"));
				customerMaster.add(customerMasterdto);
				
			}
			return customerMaster;
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	
	// This method is used to update the details of the specified customer
	public int update(CustomerMasterDTO customerdto) {
		try {
			Connection connection=DBUtility.getConnection();
			int customerid=customerdto.getCustomerId();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from customer_master where cid=?");
			preparedStatement.setInt(1, customerid);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				preparedStatement=connection.prepareStatement("update customer_master set name=?, address=? where cid=?");
				preparedStatement.setString(1, customerdto.getCustomerName());
				preparedStatement.setString(2,customerdto.getCustomerAddress());
				preparedStatement.setInt(3, customerdto.getCustomerId());
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
	
	// This method is used to delete a customer account from the database
	public void deleteCustomer(CustomerMasterDTO customerdto) {
		try {
			Connection connection=DBUtility.getConnection();
			int customerId = customerdto.getCustomerId();
			PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM customer_master WHERE cid = ?");
			preparedStatement.setInt(1, customerId);
			int n = preparedStatement.executeUpdate();
			if (n == 1) {
			    System.out.println("CustomerID  deleted");
			} else {
			    System.out.println("CustomerID does not exist");
			}
			DBUtility.closeConnection(null);
		
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
		
		}
	}
    public static void main(String[] args) {
		
   	// CustomerMasterDAOImpl customerMaster=new CustomerMasterDAOImpl();
    // 	System.out.println(customerMaster.findByCustomerId(1));
    // 	System.out.println(customerMaster.findByCustomerName("abc"));
   	// System.out.println(customerMaster.findAll());
    // 	System.out.println();
     	
    // 	CustomerMasterDTO customerMasterDTO = customerMaster.findByCustomerId(3);
    // 	customerMasterDTO.setCustomerName("superman");
	// 	int n=customerMaster.update(customerMasterDTO);
	// 	System.out.println(n);
		
		
	// 	customerMaster.deleteCustomer(customerMasterDTO);	
	}
	
}