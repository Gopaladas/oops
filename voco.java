import java.util.*;

class voco{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String s1 = sc.nextLine();
		int vo_count=0,co_count=0;
		ArrayList<Character> arr = new ArrayList<Character>();
		s1 = s1.toLowerCase();
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='a' || s1.charAt(i)=='o' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'){
			 	vo_count++;	
			 	
			 	if(!arr.contains(s1.charAt(i))){
			 		arr.add(s1.charAt(i));
			 	}
			}
			else{
				co_count++;
			}
		}
		System.out.println(vo_count +" vowels "+ co_count +" consonants ");
		System.out.println(arr); 
	}
}
