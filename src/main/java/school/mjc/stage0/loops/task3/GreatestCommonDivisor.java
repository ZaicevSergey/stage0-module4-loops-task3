package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0 && second == 0) {
            return;
        }
        int gcd = findGCD(first, second);
        System.out.println(gcd);
    }

    private int findGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        while (absB != 0) {
            int temp = absB;
            absB = absA % absB;
            absA = temp;
        }
        return absA;
    }
}
