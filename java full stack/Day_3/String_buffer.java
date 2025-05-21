package Day_3;

public class String_buffer {
	public static void main(String[] args){
		String s1="listen";
		String s2="silent";
		StringBuffer sb=new StringBuffer(s1);   //no need to waste new memory in this s1 is immutable
		StringBuffer sb1=new StringBuffer(s2);
		System.out.println(s1.concat(s2));      //s2 is mutable.it is concatinated in different memory.
		System.out.println(sb.append(sb1));
		//string buffer can be appended.
		//both string buffers are appended on single memory
	}

}
//in java StringBuffer is used to create mutable string objects.