package com.openclassrooms.api.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Products_categories")
public class Products_categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@ManyToOne
    @JoinColumn(name = "product_id", nullable = false) // Nom de la colonne de la clé étrangère
    private Products products_id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name = "update_at",nullable = false)
    @UpdateTimestamp
    private LocalDateTime update_at;

	@Column(name="create_at", nullable = false)
	@CreationTimestamp
	private LocalDateTime create_at;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Products getProducts_id() {
		return products_id;
	}

	public void setProducts_id(Products products_id) {
		this.products_id = products_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(LocalDateTime update_at) {
		this.update_at = update_at;
	}

	public LocalDateTime getCreate_at() {
		return create_at;
	}

	public void setCreate_at(LocalDateTime create_at) {
		this.create_at = create_at;
	}

	
}
