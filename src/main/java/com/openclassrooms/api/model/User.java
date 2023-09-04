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
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="first_name", nullable = false)
	private String first_name;
	
	@Column(name="last_name", nullable = false)
	private String last_name;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="hash", nullable = false)
	private String hash;
	
	@Column(name="phone_number", nullable = false)
	private String phone_number;
	
	@Column(name="country_code", nullable = false)
	private String country_code;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name = "update_at",nullable = false)
    @UpdateTimestamp
    private LocalDateTime update_at;
//	
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
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
