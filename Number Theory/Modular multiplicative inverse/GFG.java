// Java program to find modular inverse
// of a under modulo m
import java.io.*;

class GFG {

	// A naive method to find modulor
	// multiplicative inverse of 'a'
	// under modulo 'm'
	static int modInverse(int a, int m)
	{
	
		for (int x = 1; x < m; x++)
			if (((a%m) * (x%m)) % m == 1)
				return x;
		return 1;
	}

	// Driver Code
	public static void main(String args[])
	{
		int a = 3, m = 11;
	
		// Function call
		System.out.println(modInverse(a, m));
	}
}

/*This code is contributed by Nikita Tiwari.*/
