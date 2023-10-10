import java.util.*;

class str_rev{
	public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the string ");
		 String s1 = sc.nextLine();
		 String s2_rev = "";
		 for(int i = 0;i<s1.length();i++){
		 	s2_rev = s1.charAt(i) + s2_rev;
		 }
		 System.out.println(s2_rev);
	}
}
