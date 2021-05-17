package com.capdesenvolvimento.aulaDev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capdesenvolvimento.aulaDev.entities.Category;
import com.capdesenvolvimento.aulaDev.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
		
	}
	
}
