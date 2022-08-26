package com.zohocrmapp8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp8.Entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
