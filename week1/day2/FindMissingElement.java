package homeassignment.week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,4,3,2,8,6,7};  
		Arrays.sort(a);   // [1,2,3,4,6,7,8]
		int cmp=1;
		for (int i=0; i<a.length;i++)
		{
		if(a[i]!=cmp) //
		{
			System.out.println("The Missing element is : " + cmp);
			break;
		}
	cmp=cmp+1;
	}
	}	
}
