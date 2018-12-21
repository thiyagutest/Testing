package Demo;

public class SumArray {

	public static void main(String[] args) {
		
		int even_count = 0,odd_count = 0;
		int even = 0, odd = 0, count = 0, sum = 0;
	    int[] a = {10,20,13};
	    
	    for(int i=0;i <= a.length -1;i++){
	    	if(a[i] % 2 == 0)
			{
			  even = even + a[i];
			  even_count++;
			}
			else
			{
			  odd = odd + a[i];
			  odd_count++;
			 }
	    	count++;
	    	sum = sum + a[i];
	    }
	    System.out.println("Even Sum :" + even);
		System.out.println("Odd Sum :" + odd);
		System.out.println("Event numbers count :" + even_count);
		System.out.println("Odd numbers count :" + odd_count);
		System.out.println("Total Count : " + count);
		System.out.println("Total Sum : " + sum);
	}

}

