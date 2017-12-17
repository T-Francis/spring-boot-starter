package fr.aliart.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "posts", catalog = "demo-database")
public class PostModel implements java.io.Serializable {

    private Long idPost;
    private String title;
    private String subtitle;
    private String content;
    private UserModel user;
    private CategoryModel category;
    
	public PostModel() {
    }
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post",updatable = false, nullable = false)
	public Long getIdPost() {
		return idPost;
	}

	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}
	
    @Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
    @Column(name = "subtitle")
	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
    @Column(name = "content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@ManyToOne(fetch = FetchType.LAZY,optional=false)
	@JoinColumn(name = "id_user", foreignKey=@ForeignKey(name="FK_posts_id_user"))
	@JsonIgnoreProperties("user")
	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY,optional=false)
	@JoinColumn(name = "id_category", foreignKey=@ForeignKey(name="FK_posts_id_category"))
	public CategoryModel getCategory() {
		return category;
	}

	public void setCategory(CategoryModel category) {
		this.category = category;
	}

}
