package com.example.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ecommerce.entity.*;
import com.example.ecommerce.dao.*;
import java.util.*;
@Service
public class ProductService {
	
	@Autowired
	ProductRepo r;
	
	public void set1(Product p)
	{
		r.save(p);
	}
	
	public List<Product> set2(){
		return r.findAll();
	}
	//delete
	public void set3(int id)
	{
		r.deleteById(id);
	}
	//findbyid
	public Optional<Product> set4(int id){
		return r.findById(id);
	}

	

}