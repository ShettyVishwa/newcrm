package com.zohocrmapp8.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp8.Entity.Billing;
import com.zohocrmapp8.Service.BillingService;

@Controller
public class BillingController {

	@Autowired
	private BillingService billService;
	
	@RequestMapping("/showGenerateBillPage")
	public String showGenarateBillPage(@RequestParam("id") long id,ModelMap model) {
		Billing bill = billService.getOneContact(id);
		model.addAttribute("bill", bill);	
		return "GenarateBill";
	}
}
