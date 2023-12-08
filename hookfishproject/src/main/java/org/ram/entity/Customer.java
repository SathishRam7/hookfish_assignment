package org.ram.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="customer_hookfish")
public class Customer {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "username")
	private String username;

	@Column(name = "phonenumber")
	private Integer phonenumber;

	@Column(name = "gmail")
	private String gmail;
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", phonenumber=" + phonenumber + ", gmail=" + gmail
				+ "]";
	}

	public Customer(Integer id, String username, Integer phonenumber, String gmail) {
		super();
		this.id = id;
		this.username = username;
		this.phonenumber = phonenumber;
		this.gmail = gmail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public Customer() {
		super();
	}



}
