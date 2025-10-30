package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1000;
		int j = 2000;
		int k = 3;
		
		k = -10;				//Fall 5
		if(i>j) {
			if(i>200) {
				if(j>100) {
					k = 3; 	//Fall 3
				}
				else {
					k = 2;	//Fall 2
				}
			}
			else {
				if(j<=100) {
					k = 1;	//Fall 1
				}
			}
		
		}
		else {
			if(i<=200) {
				if(j<=100) {
					k = 4;	//Fall 4
				}
			}
		}
		System.out.println("k hat den Wert "+k);
	}
}
