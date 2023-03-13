package dao;

import java.util.Collection;

import dto.ItemMasterDTO;

public abstract class ItemMasterDAO {
	public abstract ItemMasterDTO findItemByID(int itemId);

	public abstract ItemMasterDTO findItemByName(String itemName);

	public abstract Collection<ItemMasterDTO> findAll();
	public abstract int updateItem(ItemMasterDTO itemMasterdto);

	public abstract int deleteItemByID(int itemId);

	public abstract int deleteItemByName(String itemName);
}