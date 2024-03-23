public class GCDExtendedEuclidean {
    public static int[] gcdExtended(int a, int b) {
        if (a == 0) {
            return new int[] {b, 0, 1};
        }
        int[] result = gcdExtended(b % a, a);
        int gcd = result[0];
        int x1 = result[1];
        int y1 = result[2];

        int x = y1 - (b / a) * x1;
        int y = x1;

        return new int[] {gcd, x, y};
    }

    public static void main(String[] args) {
        int num1 = 35, num2 = 15;
        int[] result = gcdExtended(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + result[0]);
        System.out.println("Coefficients x and y are " + result[1] + " and " + result[2]);
    }
}
