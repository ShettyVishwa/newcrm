package com.zohocrmapp8.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp8.Entity.Contacts;
import com.zohocrmapp8.Repository.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService {

	@Autowired
	private ContactsRepository conRepo;
	
	@Override
	public void saveContacts(Contacts contacts) {
        conRepo.save(contacts);
	}

	@Override
	public List<Contacts> listContacts() {
		List<Contacts> contacts = conRepo.findAll();
		return contacts;
	}

	@Override
	public Contacts contactsInfo(long id) {
		Optional<Contacts> findById = conRepo.findById(id);
		Contacts contact = findById.get();
		return contact;
	}

}
