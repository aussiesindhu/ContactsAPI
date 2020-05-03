package net.codejava;

public class Contact {
	String name;
	int id;
	int phone;
	String address;
	
	public Contact() {
		super();
	}
	public Contact(String name, int id, int phone, String address) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
