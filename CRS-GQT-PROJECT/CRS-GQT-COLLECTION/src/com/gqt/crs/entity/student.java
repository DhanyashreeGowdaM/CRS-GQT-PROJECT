package com.gqt.crs.entity;

/**
 * @author Dhanu
 */
public class student {
	private int student_id;
	private String student_name;
	private String student_email;
	private int student_password;
	private String student_address;
	/**
	 * @param student_id
	 * @param student_name
	 * @param student_email
	 * @param student_password
	 * @param student_address
	 */
	public student(int student_id, String student_name, String student_email, int student_password,
			String student_address) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_password = student_password;
		this.student_address = student_address;
	}
	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}
	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return student_name;
	}
	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	/**
	 * @return the student_email
	 */
	public String getStudent_email() {
		return student_email;
	}
	/**
	 * @param student_email the student_email to set
	 */
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	/**
	 * @return the student_password
	 */
	public int getStudent_password() {
		return student_password;
	}
	/**
	 * @param student_password the student_password to set
	 */
	public void setStudent_password(int student_password) {
		this.student_password = student_password;
	}
	/**
	 * @return the student_address
	 */
	public String getStudent_address() {
		return student_address;
	}
	/**
	 * @param student_address the student_address to set
	 */
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

}
