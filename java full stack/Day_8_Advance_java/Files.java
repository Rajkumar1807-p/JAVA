package Day_8_Advance_java;
import java.io.*;
public class Files {
	public static void main(String[] args) throws IOException{
		File f1=new File("C:\\Users\\Admin-pc\\Desktop\\saikav.txt");
		if (f1.createNewFile())
		{
			System.out.println("file created success.");
		}
		else
		{
			System.out.println("file not created(already exist).");
		}
	}
}
