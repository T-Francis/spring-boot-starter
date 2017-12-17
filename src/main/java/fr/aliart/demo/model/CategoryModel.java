package fr.aliart.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categories", catalog = "demo-database")
public class CategoryModel implements java.io.Serializable {

    private Long idCategory;
    private String name;
    private Set<PostModel> postList = new HashSet<>(); 
    
	public CategoryModel() {
    }
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy="category")
	@JsonIgnoreProperties("category")
	public Set<PostModel> getPostList() {
		return postList;
	}

	public void setPostList(Set<PostModel> postList) {
		this.postList = postList;
	}

	
	
}
