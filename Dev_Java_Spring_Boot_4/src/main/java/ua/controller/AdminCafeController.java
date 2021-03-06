package ua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.model.request.CafeRequest;
import ua.model.request.MealRequest;
import ua.model.view.CafeView;
import ua.service.CafeService;

@Controller
@RequestMapping("/admin/cafe")
@SessionAttributes("сafe")
public class AdminCafeController {

	private final CafeService service;

	public AdminCafeController(CafeService service) {
		this.service = service;
	}
	
	@ModelAttribute("cafe")
	public CafeRequest getForm() {
		return new CafeRequest();
	}
	
	@GetMapping
	public String show(Model model) {
		model.addAttribute("meals", service.findAllMeals());
		model.addAttribute("cafes", service.findAllViews());
		return "cafe";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/admin/cafe";
	}
	
	@PostMapping
	public String save(@ModelAttribute("cafe")CafeRequest request, SessionStatus status) {
		service.save(request);
		return cancel(status);
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model) {
		model.addAttribute("cafe", service.findOne(id));
		return show(model);
	}
	
	@GetMapping("/cancel")
	public String cancel(SessionStatus status) {
		status.setComplete();
		return "redirect:/admin/cafe";
	}
}