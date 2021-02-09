package academy.digitallab.store.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_usuarios")
public class UserBasicData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	@Column(name="apellido")
	private String lastName;
	
	private String email;
	
	public UserBasicData() {	}

	public Long getId() {
		return id;
	}

	public UserBasicData setId(Long id) {
		this.id = id;
		return this;
	}

	public String getUsername() {
        return username;
    }

    public UserBasicData setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserBasicData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserBasicData setEmail(String email) {
        this.email = email;
        return this;
    }

}
