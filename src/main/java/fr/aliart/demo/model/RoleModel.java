package fr.aliart.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles", catalog = "demo-database")
public class RoleModel implements java.io.Serializable {

    private Long idRole;
    private String name;
    
    public RoleModel() {
    }
    
    @Id
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
    
    
    
}
