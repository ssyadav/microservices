/**
 * 
 */
package com.satya.daanee.dbservices.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * @author satyaveer.yadav
 *
 */
@Entity
@Table(name = "role", catalog = "daanee")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roleid")
	private int roleid;

	@Column(name="role")
	private String role;

	//bi-directional many-to-many association to User
	@ManyToMany(mappedBy="roles")
	private List<User> users;

	public Role() {
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleId) {
		this.roleid = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	
}
