package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import database.DBUtility;
import dto.UserDTO;

public class UserDAOImpl extends UserDAO implements Cloneable {
	private static UserDAOImpl userdao;

	/**
	 * If the userdao object is null, create a new one and return it. If it's not null, create a clone of
	 * it and return that
	 * 
	 * @return A clone of the object.
	 */
	public static UserDAOImpl getUserDAOImplObject() {
		if (userdao == null) {
			userdao = new UserDAOImpl();
			return userdao;
		} else {
			return userdao.createClone();
		}
	}

	private UserDAOImpl createClone() {
		if (userdao != null) {
			try {
				return (UserDAOImpl) super.clone();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}

	private UserDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	// Finding a user by their ID.
	public UserDTO findByID(int uid) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from users where uid=?");
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setUid(uid);
				dto.setUname(rs.getString("uname"));
				dto.setUpass(rs.getString("upass"));
				dto.setFlag(rs.getInt("flag"));
				dto.setAge(rs.getInt("age"));
				return dto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	@Override
	// Finding a user by their name.
	public UserDTO findByName(String uname) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from users where uname=?");
			ps.setString(1, uname);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setUid(rs.getInt(1));
				dto.setUname(rs.getString("uname"));
				dto.setUpass(rs.getString("upass"));
				dto.setFlag(rs.getInt("flag"));
				dto.setAge(rs.getInt("age"));
				return dto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	@Override
	// Function for Returning a collection of all the users in the database.
	public Collection<UserDTO> findAll() {
		try {
			Connection con = DBUtility.getConnection();
			Statement ps = con.createStatement();

			ResultSet rs = ps.executeQuery("select * from users");
			List<UserDTO> users = new ArrayList<UserDTO>();
			while (rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setUid(rs.getInt("uid"));
				dto.setUname(rs.getString("uname"));
				dto.setUpass(rs.getString("upass"));
				dto.setFlag(rs.getInt("flag"));
				dto.setAge(rs.getInt("age"));
				users.add(dto);
			}
			return users;
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	@Override
	// Updating the user data.
	public int updateUser(UserDTO userdto) {
		try {
			Connection con = DBUtility.getConnection();
			int uid = userdto.getUid();
			PreparedStatement ps = con.prepareStatement("select * from users where uid=?");
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ps = con.prepareStatement("update users set uname=?,upass=?,age=?,flag=? where uid=?");
				ps.setString(1, userdto.getUname());
				ps.setString(2, userdto.getUpass());
				ps.setInt(3, userdto.getAge());
				ps.setInt(4, userdto.getFlag());
				ps.setInt(5, userdto.getUid());
				int n = ps.executeUpdate();
				DBUtility.closeConnection(null);
				if(n==1) {
					System.out.println("User data Updated");
				}else {
					System.out.println("User Not Found!");
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
	// Deleting a user from the database by their ID.
	public int deleteUserByID(int uid) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from users where uid=?");
			ps.setInt(1, uid);
			int n = ps.executeUpdate();
			DBUtility.closeConnection(null);
			if(n==1) {
				System.out.println("User Deleted");
			} else {
				System.out.println("User not Found!");
			}
			return n;
			
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	@Override
	// Deleting a user from the database by their name.
	public int deleteUserByName(String uname) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from users where uname=?");
			ps.setString(1, uname);
			int n = ps.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
			
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	public static void main(String[] args) {
		UserDAO user = new UserDAOImpl();
		
//		System.out.println(user.findByID(1));

//		System.out.println(user.findByName("hi"));

//		UserDTO u = user.findByID(1);
//		u.setUname("ramu");
//		u.setUpass("secret");
//		int n = user.updateUser(u);
		
		System.out.println(user.findAll());

	}
}