package ua.model.request;


import java.util.ArrayList;
import java.util.List;

import ua.entity.Meal;
import ua.entity.OpenClose;
import ua.entity.Type;

public class CafeRequest {

	private Integer id;
	
	private String name;
	
	private String photoUrl;
	
	private int version;
	
	private String address;
	
	private String fullDescription;
	
	private String phone;
	
	private String type;
	
	private OpenClose open;
	
	private OpenClose close;
	
	List<Meal> meals = new ArrayList<>();
	

	public CafeRequest(Integer id, String name, String photoUrl, int version, String address, String fullDescription, String phone, String type, OpenClose open, OpenClose close, List<Meal> meals) {
		this.id = id;
		this.name = name;
		this.photoUrl = photoUrl;
		this.version = version;
		this.address = address;
		this.fullDescription = fullDescription;
		this.phone = phone;
		this.type = type;
		this.open = open;
		this.close = close;
		this.meals = meals;
	}

	public CafeRequest() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public OpenClose getOpen() {
		return open;
	}

	public void setOpen(OpenClose open) {
		this.open = open;
	}

	public OpenClose getClose() {
		return close;
	}

	public void setClose(OpenClose close) {
		this.close = close;
	}

	public List<Meal> getMeals() {
		return meals;
	}

	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
