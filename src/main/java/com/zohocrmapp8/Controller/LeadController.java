package com.zohocrmapp8.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp8.Entity.Contacts;
import com.zohocrmapp8.Entity.Lead;
import com.zohocrmapp8.Service.ContactsService;
import com.zohocrmapp8.Service.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactsService conService;
	 
	@RequestMapping("/")
	public String createNewLeadPage() {
		return "CreateLead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "LeadInfo";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id) {
		Lead lead = leadService.convertOneLead(id);
		
		Contacts c=new Contacts();
		c.setId(lead.getId());
		c.setFirstName(lead.getFirstName());
		c.setLastName(lead.getLastName());
		c.setEmail(lead.getEmail());
		c.setMobile(lead.getMobile());
		
		conService.saveContacts(c);
		leadService.deletaLead(id);
		return "CreateLead";
	}
	
	@RequestMapping("/listalllead")
	public String listAllLead(ModelMap model) {
		List<Lead> leads = leadService.listLeads();
		model.addAttribute("leads", leads);
		return "AllLeadsList";
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadService.leadInfo(id);
		model.addAttribute("lead", lead);
		return "LeadInfo";
	}		
}
