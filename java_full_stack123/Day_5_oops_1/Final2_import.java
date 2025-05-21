//final in applicable only in package but not into other package


package Day_5_oops_1;
import Day_6_oops.Final1_import;
public class Final2_import extends Final1_import {
	void show() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final2_import f=new Final2_import();
		f.show();
	}

}
