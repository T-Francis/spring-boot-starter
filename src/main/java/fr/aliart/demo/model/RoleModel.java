package fr.aliart.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles", catalog = "demo-database")
public class RoleModel implements java.io.Serializable {

    private Long idRole;
    private String name;
    private Set<UserModel> userList = new HashSet<>();    
    
	public RoleModel() {
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

    @Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
    
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "roleList")
    public Set<UserModel> getUserList() {
		return userList;
	}

	public void setUserList(Set<UserModel> userList) {
		this.userList = userList;
	}
    
}
