package com.samples.pgm;

public class Patternsss {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// Letter A
				// if (j == 0 || ((i == 0 ||i == n-1) && (j > 1 && j < n-2)) || (j == n-2 && i != 0 && i != n-1)) 
				
					
					
				     // A
					//if (i == 0 || j == 0 || i == n / 2 || j == n - 1 )
				//T
				//if (i == 0 || j == 0 || i == n-1 || i == n/2 && j<=n/2)
					if (i == 1  || j == 1 || j == n-2 || i == n-2 )
				 {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();
		}

	}
}
