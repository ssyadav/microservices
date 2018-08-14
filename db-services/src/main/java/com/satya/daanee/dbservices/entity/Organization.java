/**
 * 
 */
package com.satya.daanee.dbservices.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * @author satyaveer.yadav
 *
 */
@Entity
@Table(name = "organization", catalog = "daanee")
public class Organization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orgid")
	private Long orgid;

	@Lob
	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	@Column(name = "createdby")
	private String createdby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdon")
	private Date createdon;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "email")
	private String email;

	@Column(name = "grouptype")
	private String grouptype;

	@Column(name = "isorganization")
	private byte isorganization;

	@Column(name = "name")
	private String name;

	@Column(name = "phone")
	private String phone;

	@Column(name = "state")
	private String state;

	@Column(name = "status")
	private String status;

	@Column(name = "addzipcoderess")
	private String zipcode;

	// bi-directional many-to-one association to Organization
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENTORGANIZATIONID")
	private Organization organization;

	// bi-directional many-to-one association to Organization
	@OneToMany(mappedBy = "organization")
	private List<Organization> organizations;

	// bi-directional many-to-one association to User
	@OneToMany(mappedBy = "organization")
	private List<User> users;
	
	public Organization() {
	}

	public Long getOrgid() {
		return orgid;
	}

	public void setOrgid(Long orgid) {
		this.orgid = orgid;
	}
	
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}


	public Date getCreatedon() {
		return this.createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getGrouptype() {
		return this.grouptype;
	}

	public void setGrouptype(String grouptype) {
		this.grouptype = grouptype;
	}


	public byte getIsorganization() {
		return this.isorganization;
	}

	public void setIsorganization(byte isorganization) {
		this.isorganization = isorganization;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public List<Organization> getOrganizations() {
		return this.organizations;
	}

	public void setOrganizations(List<Organization> organizations) {
		this.organizations = organizations;
	}

	public Organization addOrganization(Organization organization) {
		getOrganizations().add(organization);
		organization.setOrganization(this);

		return organization;
	}

	public Organization removeOrganization(Organization organization) {
		getOrganizations().remove(organization);
		organization.setOrganization(null);

		return organization;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
