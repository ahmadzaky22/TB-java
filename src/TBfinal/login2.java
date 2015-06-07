package TBfinal;

public class login2 {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean kelas(String username, String password){
		this.password = password;
		this.username = username;
		if (this.username.equals("zakypandu")&&this.password.equals("zakypandu")){
			return true;
		}
		else{
			return false;
		}
	}
}

