package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.entity.Cafe;

public interface CafeRepository extends JpaNameRepository<Cafe>{
	@Query("From Cafe WHERE name=?1")
	 Cafe findByName(String name);
		
}
