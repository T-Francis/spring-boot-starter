package fr.aliart.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;



@Entity
@Table(name = "users", catalog = "demo-database")
public class UserModel implements java.io.Serializable{


    private Long idUser;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private Set<RoleModel> roleList = new HashSet<>(); 
    private Set<CommentModel> commentList = new HashSet<>();
    private Set<PostModel> postList = new HashSet<>(); 
    
    public UserModel() {
    }
    
    @Id
    @Column(name = "id_user")
    public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	
    @Column(name = "firstname")
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Column(name = "lastname")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
    @Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", joinColumns = {
			@JoinColumn(name = "id_user", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "id_role",
					nullable = false, updatable = false) })
	public Set<RoleModel> getRoleList() {
		return roleList;
	}

	public void setRoleList(Set<RoleModel> roleList) {
		this.roleList = roleList;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<CommentModel> getCommentList() {
		return commentList;
	}

	public void setCommentList(Set<CommentModel> commentList) {
		this.commentList = commentList;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<PostModel> getPostList() {
		return postList;
	}

	public void setPostList(Set<PostModel> postList) {
		this.postList = postList;
	}
	
}
