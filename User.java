package demo;

public class User {

	private String Username;
	private int UserID;
	
	public User(String Username, int UserID)
	{
		this.Username = Username;
		this.UserID = UserID;
	}
	
	
	public String get_name(String Username)
	{
		return Username;
	}
	
	public Integer get_id(int UserID)
	{
		return UserID;
	}
}
