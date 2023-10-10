import java.util.*;

class charoucc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word : ");
		String s = sc.nextLine();
		System.out.println("enter the letter : " );
		String ch = sc.next();
		int val = 0,count = 0;
		for(int i=0;i<s.length();i++){
			s = s.substring(val,s.length());
			val = s.indexOf(ch);
			if(val!=-1){
			   count++;
			}
			val = val + 1;
		}
		System.out.println(ch +" repeated "+ count +" times");
	}
}
