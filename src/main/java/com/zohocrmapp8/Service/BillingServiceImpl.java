package com.zohocrmapp8.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp8.Entity.Billing;
import com.zohocrmapp8.Repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billRepo;

	@Override
	public Billing getOneContact(long id) {
		Optional<Billing> findById = billRepo.findById(id);
		Billing billing = findById.get();
		return billing;
	}
}
