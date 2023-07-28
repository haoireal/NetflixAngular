package com.poly.ps20626.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import com.poly.ps20626.Constant.nameStored;

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = nameStored.STORED_FIND_USER_LIKED_BY_VIDEO,
			procedureName = "sp_selectUsersLikedByVideoHref",
			resultClasses = {Users.class},
			parameters = @StoredProcedureParameter(name="videoHref",type = String.class))
})
@Entity
@Table(name = "Users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Integer id;
	@Column(name = "password")
	String password;
	@Column(name = "email")
	String email;
	@Column(name = "fullname")
	String fullname;
	@Column(name = "admin")
	boolean admin;
	@Column(name = "verification_code")
	int vericode;
	@Column(name = "Active")
	boolean isveri;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public int getVericode() {
		return vericode;
	}
	public void setVericode(int vericode) {
		this.vericode = vericode;
	}
	public boolean isIsveri() {
		return isveri;
	}
	public void setIsveri(boolean isveri) {
		this.isveri = isveri;
	}

	@Override
	public String toString() {
		
		return fullname.substring(fullname.lastIndexOf(" "), fullname.length());
	}

}
