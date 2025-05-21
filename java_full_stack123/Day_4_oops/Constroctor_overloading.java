package Day_4_oops;

public class Constroctor_overloading 
{
	int ssc;
	int inter;
	int btech;
	public Constroctor_overloading()
	{
		System.out.println("Welcome to my profile:sai kumar");
	}
	public Constroctor_overloading(int ssc)
	{
		this.ssc=ssc;
		System.out.println("tenth result:"+ssc);
	}
	public Constroctor_overloading(int ssc,int inter)
	{
		this.ssc=ssc;
		this.inter=inter;
		System.out.println("tenth result:"+ssc+" "+"inter result:"+inter);
	}
	public Constroctor_overloading(int ssc,int inter,int btech)
	{
		this.ssc=ssc;
		this.inter=inter;
		this.btech=btech;
		System.out.println("tenth result:"+ssc+" "+"inter result:"+inter+"btech result:"+btech);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constroctor_overloading c1=new Constroctor_overloading();
		Constroctor_overloading c2=new Constroctor_overloading(100);
		Constroctor_overloading c3=new Constroctor_overloading(100,97);
		Constroctor_overloading c4=new Constroctor_overloading(100,97,81);

	}

}
//Welcome to my profile:sai kumar
//tenth result:100
//tenth result:100 inter result:97
//tenth result:100 inter result:97btech result:81