package com.openclassrooms.api.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="sku", nullable = false)
	private String sku;
	
	@Column(name="quantity", nullable = false)
	private int quantity;
	
	@Column(name="currency", nullable = false)
	private String currency;
	
	@Column(name="brand", nullable = false)
	private String brand;
	
	@Column(name="couleur", nullable = false)
	private String couleur;
	
	@Column(name="description", nullable = false)
	private String description;
	
	@Column(name="thumbmail", nullable = false)
	private String thumbmail;
	
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

	public String getFirst_name() {
		return name;
	}

	public void setFirst_name(String first_name) {
		this.name = first_name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getThumbmail() {
		return thumbmail;
	}

	public void setThumbmail(String thumbmail) {
		this.thumbmail = thumbmail;
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
