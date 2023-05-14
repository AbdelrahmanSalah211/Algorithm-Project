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
        for(int i=job.length-1;i>=0;i--){
            int nextnonoverlappingIndex=java.util.Optional.ofNullable(
                    startTimeIndex.ceilingEntry(job[i][1])).map(e->e.getValue()).orElse(job.length);
            optimalProfit[i]=Math.max(optimalProfit[i+1],job[i][2]+optimalProfit[nextnonoverlappingIndex]);
            startTimeIndex.put(job[i][0],i);
        }


        return optimalProfit[0];
    }
}