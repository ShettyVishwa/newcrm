package com.zohocrmapp8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp8.Entity.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
