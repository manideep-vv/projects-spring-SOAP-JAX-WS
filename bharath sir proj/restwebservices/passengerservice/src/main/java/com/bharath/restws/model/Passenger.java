package com.bharath.restws.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Passenger {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
