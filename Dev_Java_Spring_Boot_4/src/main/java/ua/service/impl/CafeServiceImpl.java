package ua.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ua.entity.Cafe;
import ua.entity.Meal;
import ua.entity.Type;
import ua.model.request.CafeRequest;
import ua.model.view.CafeIndexView;
import ua.model.view.CafeView;
import ua.repository.CafeRepository;
import ua.service.CafeService;
@Service
public class CafeServiceImpl implements CafeService{

	private final CafeRepository repository;
	
	@Autowired
	public CafeServiceImpl(CafeRepository repository) {
		this.repository=repository;
	}

	@Override
	public List<CafeView> findAllViews() {
		List<CafeView> cafeView = repository.findAllCafeView();
		return cafeView;
	}

	@Override
	public void save(CafeRequest request) {
		Cafe cafe = new Cafe();
		cafe.setAddress(request.getAddress());
		cafe.setFullDescription(request.getFullDescription());
		cafe.setName(request.getName());
		cafe.setPhone(request.getPhone());
		cafe.setClose(request.getClose());
		cafe.setMeals(request.getMeals());
		cafe.setOpen(request.getOpen());
		cafe.setPhotoUrl(request.getPhotoUrl());
		cafe.setType(Type.valueOf(request.getType()));
		repository.save(cafe);
		
		
	}

	@Override
	public void delete(Integer id) {
		repository.delete(id);
		
	}

	@Override
	public CafeRequest findOne(Integer id) {
		Cafe cafe = repository.findOne(id);
		CafeRequest request = new CafeRequest();
		request.setAddress(cafe.getAddress());
		request.setFullDescription(cafe.getFullDescription());
		request.setName(cafe.getName());
		request.setPhone(cafe.getPhone());
		request.setClose(cafe.getClose());
		request.setMeals(cafe.getMeals());
		request.setOpen(cafe.getOpen());
		request.setPhotoUrl(cafe.getPhotoUrl());
		request.setType(String.valueOf(cafe.getType()));
		return request;
	}

	@Override
	public List<CafeIndexView> findAllIndexViews() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findAllMeals() {
		List<String> meals = repository.findAllMeals();
		return meals;
	}

	
	
}
