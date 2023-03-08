package dto;

import java.io.Serializable;
import java.util.Objects;

public class ItemMasterDTO implements Serializable, Comparable<ItemMasterDTO> {
	private int itemid;
	private String itemname;
	private int itemprice;
	private String unit;

	public ItemMasterDTO() {

	}

	@Override
	public String toString() {
		return "ItemMasterDTO [itemno=" + itemid + ", itemname=" + itemname + ", itemprice=" + itemprice + ", unit="
				+ unit + "]";
	}

	public ItemMasterDTO(int itemno, String itemname, int itemprice, String unit) {
		this.itemid = itemno;
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.unit = unit;
	}

	public int getItemno() {
		return itemid;
	}

	public void setItemno(int itemno) {
		this.itemid = itemno;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getItemprice() {
		return itemprice;
	}

	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public int compareTo(ItemMasterDTO o) {
		return itemname.compareTo(o.itemname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemname, itemid, itemprice, unit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemMasterDTO other = (ItemMasterDTO) obj;
		return Objects.equals(itemname, other.itemname) && itemid == other.itemid && itemprice == other.itemprice
				&& Objects.equals(unit, other.unit);
	}

}
