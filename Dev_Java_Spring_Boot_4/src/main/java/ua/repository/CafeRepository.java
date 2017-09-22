package ua.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.entity.Cafe;
import ua.entity.Meal;
import ua.model.view.CafeView;

public interface CafeRepository extends JpaNameRepository<Cafe>{
	@Query("From Cafe WHERE name=?1")
	 Cafe findByName(String name);
	
	@Query("SELECT new ua.model.view.CafeView(c.id, c.name, c.photoUrl, c.version, c.address, c.fullDescription, c.type, c.phone, o.time, cl.time) FROM Cafe c JOIN c.open o JOIN c.close cl")
	List<CafeView> findAllCafeView();
	
	@Query("SELECT m.title FROM Meal m")
	List<String> findAllMeals();
		
}
