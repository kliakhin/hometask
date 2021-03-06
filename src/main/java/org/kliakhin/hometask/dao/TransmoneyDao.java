package org.kliakhin.hometask.dao;

import org.kliakhin.hometask.entity.Transmoney;

import java.util.List;

public interface TransmoneyDao {

	public Transmoney findById(int id);

	public List<Transmoney> findAll();
	
	public Transmoney findByMerchantId(int id);
	
	public List<Transmoney> findWithFalseStatus();

	public void save(Transmoney transmoney);

	public void remove(int id);

	public void doTransaction(int id);
}
