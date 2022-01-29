package com.gqt.crs.entity;

/**
 * @author Dhanu
 */
public class admin {
	private int admin_id;
	private int admin_password;
	/**
	 * @param admin_id
	 * @param admin_password
	 */
	public admin(int admin_id, int admin_password) {
		super();
		this.admin_id = admin_id;
		this.admin_password = admin_password;
	}
	/**
	 * @return the admin_id
	 */
	public int getAdmin_id() {
		return admin_id;
	}
	/**
	 * @param admin_id the admin_id to set
	 */
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	/**
	 * @return the admin_password
	 */
	public int getAdmin_password() {
		return admin_password;
	}
	/**
	 * @param admin_password the admin_password to set
	 */
	public void setAdmin_password(int admin_password) {
		this.admin_password = admin_password;
	}

}
