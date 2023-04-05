package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci <= 0) {

            return;
        }
        int first = 0;
        int second = 1;
        System.out.println(first);
        if (lastFibonacci == 1) {
            return;
        }
        System.out.println(second);
        if (lastFibonacci == 2) {
            return;
        }
        int current = 0;
        for (int i = 2; i < lastFibonacci; i++) {
            current = first + second;
            first = second;
            second = current;
            System.out.println(current);
        }
    }
}
