package ua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.entity.Meal;
import ua.service.MealService;

@Controller
@RequestMapping("/admin/meal")
public class AdminMealController {

	private final MealService service;

	public AdminMealController(MealService service) {
		this.service = service;
	}
	@GetMapping
	public String show(Model model){
		model.addAttribute("meals", service.findAll());
		return "meal";
	}
	@GetMapping("/admin/meal/delete/{id}")
	public String delete(@PathVariable Integer id){
		service.delete(id);
		return"redirect:/admin/meal";
	}
	@PostMapping
	public String save(@RequestParam String name) {
		service.save(new Meal(name));
		return"redirect:/admin/meal";
	}
}
