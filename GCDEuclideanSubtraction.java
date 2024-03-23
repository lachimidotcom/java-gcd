
public class GCDEuclideanSubtraction {
    public static int gCDEuclideanSubtraction(int a, int b) {
        while(a != b) {
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        return a; // or return b; since both are equal
    }

    public static void main(String[] args) {
        int num1 = 50, num2 = 60;
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gCDEuclideanSubtraction(num1, num2));
    }
}
