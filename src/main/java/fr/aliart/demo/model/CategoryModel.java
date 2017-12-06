package fr.aliart.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories", catalog = "demo-database")
public class CategoryModel implements java.io.Serializable {

    private Long idCategory;
    private String name;
    
	public CategoryModel() {
    }
	
    @Id
    @Column(name = "id_category")    
	public Long getIdCategory() {
		return idCategory;
	}
	
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}
	
    @Column(name = "name")   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
