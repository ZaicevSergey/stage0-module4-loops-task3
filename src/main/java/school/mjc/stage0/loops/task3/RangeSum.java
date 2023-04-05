package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int start = Math.min(firstBoarder, secondBoarder);
        int end = Math.max(firstBoarder, secondBoarder);
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
