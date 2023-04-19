package com.huynm.bookstore.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tblUser")
public class User implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String username;

	private String password;

	private String email;

	private String phone;

	private String firstname;

	private String lastname;

//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinTable(name = "tblUser_Role", joinColumns = @JoinColumn(name = "userID", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "roleID", referencedColumnName = "id"))
//	private List<Role> roles;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Order> orders;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		
		return null;//return List.of(new SimpleGrantedAuthority(roles.toString()));
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

//	public void setRoles(List<Role> list) {
//		this.roles = list;
//		
//	}
//
//	public List<Role> getRoles() {
//		return roles;
//	}
//	
//	public int getId() {
//		return id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public String getFirstname() {
//		return firstname;
//	}
//
//	public String getLastname() {
//		return lastname;
//	}
//
//
//	public Set<Order> getOrders() {
//		return orders;
//	}
//
//	
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
//	public void setOrders(Set<Order> orders) {
//		this.orders = orders;
//	}
	
}
