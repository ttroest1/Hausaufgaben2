package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -100;
		int j = 170;
		int k = 2000;
		int min = -400;
		int max = -90;
		
		min = i;
		if(min>j) {
			min = j;
		}
		if(min>k) {
			min = k;	
		}
		max = i;
		if(max<j) {
			max = j;
		}
		if(max<k) {
			max = k;
		}
		System.out.println("Minimum ist: "+min);
		System.out.println("Maximum ist: "+max);		
	}
}
	
