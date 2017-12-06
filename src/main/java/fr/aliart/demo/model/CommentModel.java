package fr.aliart.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "comments", catalog = "demo-database")
public class CommentModel implements java.io.Serializable {

    private Long idComment;
    private String title;
    private String content;
    private UserModel user;
    private PostModel post;
	
	public CommentModel() {
    }
	
    @Id
    @Column(name = "id_comment")
	public Long getIdComment() {
		return idComment;
	}

	public void setIdComment(Long idComment) {
		this.idComment = idComment;
	}
	
    @Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
    @Column(name = "content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user", foreignKey=@ForeignKey(name="FK_comments_id_user"))
	@JsonIgnoreProperties("user")
	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_post", foreignKey=@ForeignKey(name="FK_comments_id_post"))
	@JsonIgnoreProperties("post")
	public PostModel getPost() {
		return post;
	}

	public void setPost(PostModel post) {
		this.post = post;
	}    
	

}
