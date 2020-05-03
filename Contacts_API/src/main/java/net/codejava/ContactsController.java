package net.codejava;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {
	
	ListContacts list = new ListContacts();
	
	@GetMapping("/getContact")
	ArrayList<Contact> getContact(){
		return list.getList();
	}
	
	@PostMapping("/addContact")
	Contact addContact(@RequestBody Contact c) {
		list.setList(c);
		return c;
	}
	
	@PutMapping("/editContact/{id}")
	Contact editContact(@PathVariable("id") int id, @RequestBody String name) {
		for(Contact c1: list.getList()) {
			if(c1.getId()==id)
			{
				c1.setName(name);
				return c1;
			}
		}
		return null;
	}
	
	@DeleteMapping("/rmvContact/{id}")
	ArrayList<Contact> rmvContact(@PathVariable("id") int id) {
		for(Contact c1: list.getList()) {
			if(c1.getId()==id)
				list.delete(c1);
		}
		return list.getList();
	}
	
}
