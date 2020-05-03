package net.codejava.SpringBootWebApp;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {

	public List<Contact> getContactList()
	{
		List<Contact> listContact=new ArrayList<>();
		listContact.add(new Contact("Faisal","Faisal3000khan@gmail.com", "India"));
		listContact.add(new Contact("Shoaib","Shoaibkhan@gmail.com", "USA"));
		listContact.add(new Contact("Faiz","Faizkhan@gmail.com", "Dubai"));
		listContact.add(new Contact("Aatif","AatifAslam@gmail.com", "France"));
		
		return listContact;
	}
}
