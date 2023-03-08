package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import database.DBUtility;
import dto.ItemMasterDTO;

public class ItemMasterDAOImpl extends ItemMasterDAO implements Cloneable{
	
	private static ItemMasterDAOImpl itemMasterdao;

	/**
	 * If the object is null, create a new object and return it. If the object is not null, create a clone
	 * of the object and return it
	 * 
	 * @return A clone of the object.
	 */
	public static ItemMasterDAOImpl getUserDAOImplObject() {
		if (itemMasterdao == null) {
			itemMasterdao = new ItemMasterDAOImpl();
			return itemMasterdao;
		} else {
			return itemMasterdao.createClone();
		}
	}

	private ItemMasterDAOImpl createClone() {
		if (itemMasterdao != null) {
			try {
				return (ItemMasterDAOImpl) super.clone();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}

	private ItemMasterDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	// Find the item by its id.
	public ItemMasterDTO findItemByID(int itemId) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from item_master where itemno=?");
			preparedStatement.setInt(1, itemId);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				ItemMasterDTO itemdto = new ItemMasterDTO();
				itemdto.setItemname(resultSet.getString("itemname"));
				itemdto.setItemprice(resultSet.getInt("price"));
				itemdto.setUnit(resultSet.getString("unit"));
				itemdto.setItemno(itemId);
				return itemdto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	// Function for Returning a collection of all the items in the database.
	public Collection<ItemMasterDTO> findAll() {
		try {
			Connection connection = DBUtility.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from item_master");
			List<ItemMasterDTO> itemsList = new ArrayList<ItemMasterDTO>();
			while(resultSet.next()) {
				ItemMasterDTO dto = new ItemMasterDTO();
				dto.setItemname(resultSet.getString("itemname"));
				dto.setItemno(resultSet.getInt("itemno"));
				dto.setItemprice(resultSet.getInt("price"));
				dto.setUnit(resultSet.getString("unit"));
				itemsList.add(dto);
			}
			return itemsList;
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	// Updating the item in the database.
	public int updateItem(ItemMasterDTO itemdto) {
		try {
			Connection connection = DBUtility.getConnection();
			int itemno = itemdto.getItemno();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from item_master where itemno=?");
			preparedStatement.setInt(1, itemno);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				preparedStatement = connection.prepareStatement("update item_master set itemname=?, price=?, unit=? where itemno=?");
				preparedStatement.setString(1, itemdto.getItemname());
				preparedStatement.setInt(2, itemdto.getItemprice());
				preparedStatement.setString(3, itemdto.getUnit());
				preparedStatement.setInt(4, itemdto.getItemno());
				int n = preparedStatement.executeUpdate();
				DBUtility.closeConnection(null);
				if(n==1) {
					System.out.println("Item data Updated");
				}else {
					System.out.println("Item Not Found!");
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


	// Find the item by item name and return it 
	public ItemMasterDTO findItemByName(String itemname) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from item_master where itemname=?");
			preparedStatement.setString(1, itemname);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				ItemMasterDTO itemdto = new ItemMasterDTO();
				itemdto.setItemname(resultSet.getString("itemname"));
				itemdto.setItemprice(resultSet.getInt("price"));
				itemdto.setUnit(resultSet.getString("unit"));
				itemdto.setItemno(resultSet.getInt("itemno"));
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
	// This function is used to delete an item (by using itemid) from the database.
	public int deleteItemByID(int itemId) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from item_master where itemno=?");
			preparedStatement.setInt(1, itemId);
			int n = preparedStatement.executeUpdate();
			DBUtility.closeConnection(null);
			if(n==1) {
				System.out.println("Item Deleted");
			} else {
				System.out.println("Item not Found!");
			}
			return n;
			
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	@Override
	// This function is used to delete an item (by using itemname) from the database.
	public int deleteItemByName(String itemName) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from item_master where itemname=?");
			preparedStatement.setString(1, itemName);
			int n = preparedStatement.executeUpdate();
			DBUtility.closeConnection(null);
			if(n==1) {
				System.out.println("Item data Deleted");
			}else {
				System.out.println("Item Not Deleted!");
			}
			return n;
			
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}
	
	public static void main(String[] args) {
		ItemMasterDAOImpl itemMaster = new ItemMasterDAOImpl();
		
//		System.out.println(itemMaster.findByID(1));

//		System.out.println(itemMaster.findByName("hi"));

//		
		ItemMasterDTO item = itemMaster.findItemByID(123);
		System.out.println(item.getItemname());
		item=itemMaster.findItemByName("JBL");
		System.out.println(item.getItemno()+" "+item.getItemprice());
		item.setItemname("RealME");
		item.setItemprice(50);
		int n = itemMaster.updateItem(item);
		
//		System.out.println(itemMaster.findAll());

	}
}