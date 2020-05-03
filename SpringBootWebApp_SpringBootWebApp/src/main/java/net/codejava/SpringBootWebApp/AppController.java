package net.codejava.SpringBootWebApp;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping("/test")
	public String welcome()
	{
		System.out.println("Welcome Test jsp");
		return "testi";
		
	}
	
	@RequestMapping("/List_contact")
	public String listContact(Model model)
	{
		ContactBusiness business=new ContactBusiness();
		List<Contact> contactList=business.getContactList();
		model.addAttribute("contacts",contactList);
		return "contact";
		
	}

}
