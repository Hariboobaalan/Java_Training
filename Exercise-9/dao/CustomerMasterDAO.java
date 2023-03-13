package dao;

import java.util.Collection;

import dto.CustomerMasterDTO;

public abstract class CustomerMasterDAO {
	public abstract CustomerMasterDTO findByCustomerId(int customerId);
	public abstract CustomerMasterDTO findByCustomerName(String customerName);
	public abstract Collection<CustomerMasterDTO> findAll();
	public abstract int update(CustomerMasterDTO customerdto);
	public abstract void deleteCustomer(CustomerMasterDTO customerdto);
}
