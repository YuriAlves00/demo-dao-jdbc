package model.dao;

import java.util.List;

import db.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void DeleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
