package com.zohocrmapp8.Service;

import java.util.List;

import com.zohocrmapp8.Entity.Contacts;

public interface ContactsService {

	public void saveContacts(Contacts contacts);

	public List<Contacts> listContacts();

	public Contacts contactsInfo(long id);
}
