public class isPowerOfTwo {
    public static void main(String[] args) {
        isPowerOfTwo solution = new isPowerOfTwo();
        int n = 16; // Example input
        boolean result = solution.isPowerOfTwo(n);
        System.out.println(n + " is a power of two: " + result);
    }
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        
        while (n % 2 == 0) {
            n /= 2;
        }
        
        return n == 1;
    }
}
