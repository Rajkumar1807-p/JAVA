package Day_7_Advance_java;
import java.io.*;
public class Files2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f1=new FileWriter("C:\\Users\\Admin-pc\\Desktop\\saikav.txt");
		f1.write("Hi i am sai kumar");
		f1.close();
		System.out.println("success");

	}

}
