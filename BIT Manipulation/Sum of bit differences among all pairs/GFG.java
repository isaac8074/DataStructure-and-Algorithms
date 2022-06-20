/*package whatever //do not write package name here */

import java.io.*;

class GFG {

	static int sumBitDiff(int[] arr){
		int diff = 0;							 //hold the ans
		
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
			
			//XOR toggles the bits and will form a number that will have
			//set bits at the places where the numbers bits differ
			//eg: 010 ^ 111 = 101...diff of bits = count of 1's = 2
			
				int xor = arr[i]^arr[j];
				int count = countSetBits(xor);	 //Integer.bitCount() can also be used
				
				//when i == j (same numbers) the xor would be 0,
				//thus our ans will remain unaffected as (2*0 = 0)
				diff += 2*count;
			}
		}
	
		return diff;
	}

	//Kernighan algo
	static int countSetBits(int n){
		int count = 0;		 // `count` stores the total bits set in `n`

		while (n != 0) {
			n = n & (n - 1); // clear the least significant bit set
			count++;
		}

		return count;
	}

	public static void main (String[] args) {
		int[] arr = {5,10};
		int ans = sumBitDiff(arr);
		System.out.println(ans);
	}
}
