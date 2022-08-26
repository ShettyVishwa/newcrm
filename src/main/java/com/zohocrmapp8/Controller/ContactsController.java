package com.zohocrmapp8.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp8.Entity.Contacts;
import com.zohocrmapp8.Service.ContactsService;

@Controller
public class ContactsController {
  
	@Autowired
	private ContactsService conService;
	
	@RequestMapping("/listallcontacts")
	public String listAllContacts(ModelMap model) {
		List<Contacts> contacts = conService.listContacts();
		model.addAttribute("contacts", contacts);
		return "AllContactsList";
	}
	
	@RequestMapping("/contactsInfo")
	public String contactsInfo(@RequestParam("id") long id,ModelMap model) {
		Contacts contact = conService.contactsInfo(id);
		model.addAttribute("contact", contact);
		return "ContactsInfo";
	}
}
