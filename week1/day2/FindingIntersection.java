package homeassignment.week1.day2;

public class FindingIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		int len1 = a.length;
		int len2 = b.length;

	
		for(int i=0; i<len1 ; i++)
			
		{
			for(int j=0; j<len2 ; j++)
			{
				if(a[i]==b[j])
				{
				
					System.out.println(a[i]);
			}
			
		}
		}	
	}
}
			

