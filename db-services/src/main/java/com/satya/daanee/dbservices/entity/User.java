/**
 * 
 */
package com.satya.daanee.dbservices.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author satyaveer.yadav
 *
 */
@Entity
@Table(name = "user", catalog = "daanee")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private Long userid;

	@Column(name = "accepted")
	private byte accepted = 1;

	@Column(name = "address")
	private String address;

	@Column(name = "comments")
	private String comments;

	@Column(name = "createdon")
	private Date createdon;

	@Column(name = "defaultpassword")
	private byte defaultpassword = 1;

	@Column(name = "email")
	private String email;

	@Column(name = "failedattempts")
	private int failedattempts = 0;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "fullname")
	private String fullname;

	@Column(name = "languagepreference")
	private String languagepreference;

	@Column(name = "lastlogin")
	private Date lastlogin;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "lastpasswdchangedon")
	private Date lastpasswdchangedon;

	@Column(name = "lastupdatedon")
	private Date lastupdatedon;

	@Column(name = "locale")
	private String locale;

	@Column(name = "lockdate")
	private Date lockdate;

	@Column(name = "loginfaileddate")
	private Date loginfaileddate;

	@Column(name = "middlename")
	private String middlename;

	@Column(name = "note")
	private String note;

	@Column(name = "passwdexpired")
	private byte passwdexpired = 0;

	@Column(name = "password")
	private String password;

	@Column(name = "phone")
	private String phone;

	@Column(name = "photopath")
	private String photopath;

	@Column(name = "sectoken")
	private String sectoken;

	@Column(name = "status")
	private String status;

	@Column(name = "tokengenerationdate")
	private Date tokengenerationdate;

	@Column(name = "username")
	private String username;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orgid")
	private Organization organization;

	@ManyToMany
	@JoinTable(name = "USERROLE", joinColumns = { @JoinColumn(name = "USERID") }, inverseJoinColumns = {
			@JoinColumn(name = "ROLEID") })
	private List<Role> roles;

	public User() {
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public byte getAccepted() {
		return accepted;
	}

	public void setAccepted(byte accepted) {
		this.accepted = accepted;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public byte getDefaultpassword() {
		return defaultpassword;
	}

	public void setDefaultpassword(byte defaultpassword) {
		this.defaultpassword = defaultpassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFailedattempts() {
		return failedattempts;
	}

	public void setFailedattempts(int failedattempts) {
		this.failedattempts = failedattempts;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getLanguagepreference() {
		return languagepreference;
	}

	public void setLanguagepreference(String languagepreference) {
		this.languagepreference = languagepreference;
	}

	public Date getLastlogin() {
		return lastlogin;
	}

	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getLastpasswdchangedon() {
		return lastpasswdchangedon;
	}

	public void setLastpasswdchangedon(Date lastpasswdchangedon) {
		this.lastpasswdchangedon = lastpasswdchangedon;
	}

	public Date getLastupdatedon() {
		return lastupdatedon;
	}

	public void setLastupdatedon(Date lastupdatedon) {
		this.lastupdatedon = lastupdatedon;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Date getLockdate() {
		return lockdate;
	}

	public void setLockdate(Date lockdate) {
		this.lockdate = lockdate;
	}

	public Date getLoginfaileddate() {
		return loginfaileddate;
	}

	public void setLoginfaileddate(Date loginfaileddate) {
		this.loginfaileddate = loginfaileddate;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public byte getPasswdexpired() {
		return passwdexpired;
	}

	public void setPasswdexpired(byte passwdexpired) {
		this.passwdexpired = passwdexpired;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhotopath() {
		return photopath;
	}

	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}

	public String getSectoken() {
		return sectoken;
	}

	public void setSectoken(String sectoken) {
		this.sectoken = sectoken;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTokengenerationdate() {
		return tokengenerationdate;
	}

	public void setTokengenerationdate(Date tokengenerationdate) {
		this.tokengenerationdate = tokengenerationdate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
