package com.example.api.model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    

    // Getter
    public String getName() {
      return name;
    }

    // Setter
    public void setName(String newName) {
      this.name = newName;
    }
    
 // Getter
    public String getCountry() {
      return country;
    }

    // Setter
    public void setCountry(String country) {
      this.country = country;
    }
    
 // Getter
    public int getId() {
      return id;
    }

    // Setter
    public void setId(int id) {
      this.id = id;
    }

	public Customers(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	public Customers() {
		
	}
    
    
    // Constructors, getters, and setters
}
