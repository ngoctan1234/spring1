package com.example.demo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Category;
import com.example.demo.repository.*;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return this.categoryRepository.findAll();
	}

	@Override
	public Boolean create(Category category) {
		// TODO Auto-generated method stub
		try {
			  this.categoryRepository.save(category);
			 return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public Boolean update(Category category) {
		// TODO Auto-generated method stub
		try {
			  this.categoryRepository.save(category);
			 return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public Category findById(Integer id) {
		// TODO Auto-generated method stub
		return  this.categoryRepository.findById(id).get();
	}

	@Override
	public Boolean delete(Integer id) {
		// TODO Auto-generated method stub
		try {
			  this.categoryRepository.deleteById(id);
			 return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
