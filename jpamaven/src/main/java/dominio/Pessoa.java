package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String main;
	private String email;
	
	
	//EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	
	public Pessoa() {
		
	}

	public Pessoa(Integer id, String main, String email) {
		super();
		this.id = id;
		this.main = main;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", main=" + main + ", email=" + email + "]";
	}	
}
