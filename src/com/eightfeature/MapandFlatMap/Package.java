package com.eightfeature.MapandFlatMap;

import java.util.List;

public class Package {

	
	private String name;
	
	private List<String> items;

	public Package(String name, List<String> items) {
		super();
		this.name = name;
		this.items = items;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}
	
	
	
}
