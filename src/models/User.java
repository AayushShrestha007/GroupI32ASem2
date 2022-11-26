package models;

public class User{
    // creation of instance variable
    private String username;
    private String password;
    private String email;



    // creation of public getter and setter --> for username
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
    // creation of public getter and setter --> for passsword
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
        	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


    // creation of public constructor
    public User( String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email=email;

    }}