import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
    public static int jobSchedulingProfit(int [][] job){

        // Sort the job array in ascending order according to the Start time
        Arrays.sort(job, (a, b) -> Integer.compare(a[0], b[0]));
        // Array that will contain the max profit in each iteration
        int [] optimalProfit = new int[job.length+1];
        // TreeMap that will take start time (Key) and index of that starting time (value)
        // and store them in ascending order according to the value of key
        TreeMap<Integer, Integer> startTimeIndex = new TreeMap<Integer, Integer>();


        return optimalProfit[0];
    }
}