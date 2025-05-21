package Day_7_Advance_java;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class File_read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			File obj=new File("C:\\Users\\Admin-pc\\Desktop\\saikav.txt");
			Scanner R=new Scanner(obj);
			while(R.hasNextLine()) {
				String data=R.nextLine();
				System.out.println(data);
			}
			R.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An error has occured");
			e.printStackTrace();
		}
	}
}
