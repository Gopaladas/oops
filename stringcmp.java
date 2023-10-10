import java.util.*;

class stringcmp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string1 : ");
		String s1 = sc.nextLine();
		System.out.println("enter the string2 : ");
		String s2 = sc.nextLine();
		if(s1.compareTo(s2)==0){
			System.out.println("strings are equal ");
		}
		else{
			System.out.println("strings are not equal ");
		}
	}
}
