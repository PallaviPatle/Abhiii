
public class String4 {
	public static void main(String args[])
	{
		String s=new String("you cant change me");
		String s1=new String("you cant change me");
		
		  
		   
		   String s2="you cant change me";
		   String s3="you cant change me";
		   
		   System.out.println(s1==s2);
		   System.out.println(s==s3);
		   
		   System.out.println(s.equals(s1));
		   System.out.println(s.equals(s2));
		   System.out.println(s.equals(s3));

		   String s4="you can't" + "change me";
		   String s5="you cant";
		   String s6=s5+"change me";

		   final String s7="you can't";
		   String s8=s7+"you can't";

		   System.out.println(s7);
		   System.out.println(s8);
		   
		   System.out.println(s8==s7);
		   System.out.println(s3==s7);
		   System.out.println(s2==s8);
		   
		   System.out.println(s8.equals(s7));
		   System.out.println(s3.equals(s7));
		   System.out.println(s2.equals(s8));
		   
		
	}

}
