
public class GCDFor {
    public static int gCDFor(int a, int b) {
        int gcd = 1;
        for(int i = 1; i <= a && i <= b; ++i) {
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static void main(String[] args) {
        int num1 = 81, num2 = 153;
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gCDFor(num1, num2));
    }
}
