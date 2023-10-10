import java.util.*;

class dice_pair{
	public static void main(String args[]){
		Random rand = new Random();
		int c = 0;
		for(int i=0;i<10;i++){
			int val1 = rand.nextInt(6);
			int val2 = rand.nextInt(6);
			System.out.println(val1 +" "+ val2);
			if(val1 == val2){
				c++;
			}
		}
		System.out.println(c);
	}
}
