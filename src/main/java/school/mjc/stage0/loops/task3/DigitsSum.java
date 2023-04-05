package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        if (t == 0) {
            System.out.println(1);
            ;
        }
        if (t < 0) {
            int sum = 0;
            String numStr = "" + t;
            int len = numStr.length();
            for (int i = 1; i < len; i++) {
                char c = numStr.charAt(i);
                int digit = c - '0';
                sum += digit;
            }
            System.out.println(sum);
        } else {
            int sum = 0;
            String numStr = "" + t;
            int len = numStr.length();
            for (int i = 0; i < len; i++) {
                char c = numStr.charAt(i);
                int digit = c - '0';
                sum += digit;
            }
            System.out.println(sum);
        }
    }
}
