package homeassignment.week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int n =8 ;
		 int n1 = 0;
		 int n2 = 1;
		
		 for (int i = 1; i <= n; ++i) {
		      System.out.print(n1 + ", ");
		      int n3 = n1 + n2;
		      n1 = n2;
		      n2 = n3;
	}
	}
}
