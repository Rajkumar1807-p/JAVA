package Day_3;

public class String_all_methods {
	public static void main(String[] args)
	{
		String s="Saikumar";
		char ch=s.charAt(1);
		System.out.println(ch);
		int n1=s.codePointAt(1);
		System.out.println(n1);
		int n2=s.codePointBefore(1);
		System.out.println(n2);
		int n3=s.codePointCount(0,5);
		System.out.println(n3);
		String s1="Saikumar";
		System.out.println(s.compareTo(s1));
		String s2="SaiKumar";
		System.out.println(s.compareToIgnoreCase(s1));
		String s3="1234";
		System.out.println(s1.concat(s3));
		String s4="kumar";
		System.out.println(s1.contains(s4));
		System.out.println(s1.contentEquals(s4));
		char[] s5= {'s','a','i','k','u','m','a','r'};
		String s6 = String.copyValueOf(s5, 0, 3);
		System.out.println(s6);

        // endsWith
        System.out.println("endsWith(\"ar\"): " + s.endsWith("ar"));
        
        // equals
        System.out.println("equals: " + s.equals(s1));
        
        // equalsIgnoreCase
        System.out.println("equalsIgnoreCase: " + s.equalsIgnoreCase(s2));
        
        // format
        String formatted = String.format("Welcome, %s!", s);
        System.out.println("format: " + formatted);
        
        // getBytes
        byte[] bytes = s.getBytes();
        System.out.print("getBytes: ");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();
        
        // getChars
        char[] charArray = new char[4];
        s.getChars(0, 4, charArray, 0);
        System.out.print("getChars: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // hashCode
        System.out.println("hashCode: " + s.hashCode());
        
        // indexOf
        System.out.println("indexOf('k'): " + s.indexOf('k'));
        
        // intern
        String interned = s.intern();
        System.out.println("intern: " + interned);
        
        // isEmpty
        System.out.println("isEmpty: " + s.isEmpty());
        
        // join
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("join: " + joined);
        
        // lastIndexOf
        System.out.println("lastIndexOf('a'): " + s.lastIndexOf('a'));
        
        // length
        System.out.println("length: " + s.length());
        
        // matches
        System.out.println("matches(\".*kumar\"): " + s.matches(".*kumar"));
        
        // replace
        System.out.println("replace('a','@'): " + s.replace('a', '@'));
        
        // replaceAll
        System.out.println("replaceAll(\"a\", \"#\"): " + s.replaceAll("a", "#"));
        
        // split
        String[] parts = s.split("k");
        System.out.println("split on 'k':");
        for (String part : parts) {
            System.out.println(part);
        }

        // startsWith
        System.out.println("startsWith(\"Sai\"): " + s.startsWith("Sai"));
        
        // toLowerCase
        System.out.println("toLowerCase: " + s.toLowerCase());
        
        // toUpperCase
        System.out.println("toUpperCase: " + s.toUpperCase());
		
	}

}
