package com.lti.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.lti.shoppingbackend.dao.CategoryDAO;
import com.lti.shoppingbackend.dto.Category;

public class CategoryDAOImpl implements CategoryDAO{

	private static List<Category> categories=new ArrayList<>();
	static {
		Category category=new Category();
		category.setId(1);
		category.setName("TV");
		category.setDescription("television");
			category.setImageURL("image1.jpg");
			categories.add(category);
			
			Category category1=new Category();
			category.setId(2);
			category.setName("lappy");
			category.setDescription("laptop");
				category.setImageURL("image2.jpg");
				categories.add(category1);
	}
	@Override
	public List<Category> list() {
		
		return categories;
	}

}
