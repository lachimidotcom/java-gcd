public class GCDRecursion {
    public static int gCDRecursion(int a, int b) {
        if(b == 0)
            return a;
        else
            return gCDRecursion(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 366, num2 = 60;
        System.out.println("G.C.D of " + num1 + " and " + num2 + " is " + gCDRecursion(num1, num2));
    }
}
