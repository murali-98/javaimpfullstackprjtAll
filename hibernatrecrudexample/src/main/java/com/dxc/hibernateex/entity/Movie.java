package com.dxc.hibernateex.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "movie_details")
public class Movie {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Double price;
	 
	@Column(name="duration")
	private String duration;
	
	@Column(name="price")
	private String ratings;
	
	public Movie() {
		
	}

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", price=" + price + ", duration=" + duration + ", ratings="
				+ ratings + "]";
		
		
	}

	public Movie(String name, Double price, String duration, String ratings) {
		super();
		this.name = name;
		this.price = price;
		this.duration = duration;
		this.ratings = ratings;
	}
	
}
