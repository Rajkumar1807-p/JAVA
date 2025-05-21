package Day_4_oops;

public class Encapsulation_autometic {
	private String firstname;
	private String lastname;
	private String email;
	private long number;
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public long getNumber() {
		return number;
	}
	public static void main(String[] args)
	{
		Encapsulation_autometic e=new Encapsulation_autometic();
		e.setFirstname("sai");
		e.setLastname(" kumar");
		e.setEmail("saikumarmushetty012@gmail.com");
		e.setNumber(8977878125L);
		System.out.print(e.getFirstname());
		System.out.println(e.getLastname());
		System.out.println(e.getEmail());
		System.out.println(e.getNumber());
	}

}
