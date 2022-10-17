package com.rohan.dao.impl;

import javax.persistence.EntityManager;

import com.rohan.dao.AccountDao;
import com.rohan.entities.Account;
import com.rohan.utilities.GetConnection;

public class AccountImpl implements AccountDao{

	@Override
	public Account findById(int id) {
		
		EntityManager em =  GetConnection.get();
		
		
		Account res = em.find(Account.class, id);
		
		em.close();
		
		return res;
	}

	@Override
	public String save(Account account) {
		
		
		EntityManager em =  GetConnection.get();
		
		
		em.getTransaction().begin();

		
		em.persist(account);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
		
		return "Record added successfully...";
	}

	@Override
	public String deleteAccountById(int id) {
	
		EntityManager em =  GetConnection.get();
		
		Account account = em.find(Account.class , id);

		em.getTransaction().begin();

		
		em.remove(account);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
		
		return "Record removed successfully...";
	}

	@Override
	public String withdraw(double amount, int accountId) {
		
		
		EntityManager em =  GetConnection.get();
		
		Account account = em.find(Account.class , accountId);

		em.getTransaction().begin();

		
		
		account.setBalance(account.getBalance() - amount);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
		
		return amount + "Rs has been withdrawn ...";
		
	}

	@Override
	public String deposit(double amount, int accountId) {

		EntityManager em =  GetConnection.get();
		
		Account account = em.find(Account.class , accountId);

		em.getTransaction().begin();

		
		
		account.setBalance(account.getBalance() + amount);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
		
		return amount + "Rs has been deposited...";
		
	}

	
	
		
}
