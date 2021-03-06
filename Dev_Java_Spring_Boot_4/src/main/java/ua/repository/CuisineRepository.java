package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.entity.Cuisine;

public interface CuisineRepository extends JpaNameRepository<Cuisine>, JpaSpecificationExecutor<Cuisine>{

}
