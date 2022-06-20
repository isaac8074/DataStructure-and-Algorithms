public class GFG {
    static void bin(long n) {
        long i;
        System.out.print("0");
        for (i = 1 << 30; i > 0; i = i / 2) {
            if ((n & i) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        bin(7);
        System.out.println();
        bin(4);
    }
}

// This code is contributed by divyesh072019.
