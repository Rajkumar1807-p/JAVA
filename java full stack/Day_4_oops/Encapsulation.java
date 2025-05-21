//wrapping up of data into a single unit is called encapsulation.
//best example of encapsulation is class.since it wraps objects,methods,fields,etc..
//to achieve encapsulation we use getter and setters.
//

package Day_4_oops;

public class Encapsulation 
{
	private String firstname;
	private String lastname;
	public void setFirstName(String fn) {
		firstname=fn;
	}
	public void setLastName(String ln) {
		lastname=ln;
	}
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public static void main(String[] args)
	{
		Encapsulation e=new Encapsulation();
		e.setFirstName("sai");
		e.setLastName(" kumar");
		System.out.print(e.getFirstName());
		System.out.println(e.getLastName());
	}
}
