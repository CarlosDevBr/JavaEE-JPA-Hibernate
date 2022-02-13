package dominio;

import java.io.Serializable;

public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String main;
	private String email;
	
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
