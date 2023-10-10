import java.util.*;

class input_uni{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the inputs integer ");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<5;i=i){
			int val = sc.nextInt();
			if(!arr.contains(val)){
				arr.add(val);
				i=i+1;
			}
			else{
				System.out.println("enter the unique value ");
			}
		}
		System.out.println(arr);
	}
}
