public class GCDEuclideanDivision {
    public static int gCDEuclideanDivision(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 8;
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gCDEuclideanDivision(num1, num2));
    }
}
