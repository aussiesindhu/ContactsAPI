package net.codejava;
import java.util.ArrayList;

public class ListContacts {
	ArrayList<Contact> list;
	
	public ListContacts() {
		list = new ArrayList<Contact>();
	}

	public ArrayList<Contact> getList() {
		return list;
	}

	public void setList(Contact c) {
		this.list.add(c);
	}
	public void delete(Contact c) {
		this.list.remove(c);
	}
	
}
