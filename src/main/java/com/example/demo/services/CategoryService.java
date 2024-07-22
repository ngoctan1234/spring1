package com.example.demo.services;
import java.util.List;
import com.example.demo.models.Category;
public interface CategoryService {
	List<Category> getAll();
	Boolean create(Category category);
	Boolean update(Category category);
	Category findById(Integer id);
	Boolean delete(Integer id);
}
