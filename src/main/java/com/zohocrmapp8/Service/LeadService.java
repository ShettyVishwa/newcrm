package com.zohocrmapp8.Service;

import java.util.List;

import com.zohocrmapp8.Entity.Lead;

public interface LeadService {

	public void saveOneLead(Lead lead);

	public Lead convertOneLead(long id);

	public void deletaLead(long id);

	public List<Lead> listLeads();

	public Lead leadInfo(long id);
}
