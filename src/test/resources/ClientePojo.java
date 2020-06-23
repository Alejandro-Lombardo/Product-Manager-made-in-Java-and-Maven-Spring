
public class ClientePojo {
	private Long id;
	private String name;
	private String lastName;
	private String email;
	private String password;
	
	
	// Constructor seteado por default
	public ClientePojo()
	{
		
	}

	public ClientePojo(Long id, String name, String lastName, String email, String password)
	{
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
}
