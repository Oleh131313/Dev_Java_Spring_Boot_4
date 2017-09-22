package ua.service;

import java.util.List;

import ua.entity.Cafe;
import ua.entity.Meal;
import ua.model.request.CafeRequest;
import ua.model.view.CafeIndexView;
import ua.model.view.CafeView;

public interface CafeService {

	List<CafeView> findAllViews();

	void save(CafeRequest request);

	void delete(Integer id);
	
	CafeRequest findOne(Integer id);
	
	List<CafeIndexView> findAllIndexViews();

	List<String> findAllMeals();

}
