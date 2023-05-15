import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int numberOfJob = input.nextInt();
        int [][] job =new int [numberOfJob][3];
        for(int i=0;i<job.length;i++){
            int jobNO=i+1;
            System.out.print("enter job "+jobNO+" details (Starttime Endtime Profit) ");
            for(int j=0;j<job[0].length;j++){
                job[i][j] = input.nextInt();
            }
            System.out.println();
        }
        int optimalProfit = jobSchedulingProfit(job);
        System.out.println("Max profit we can get is "+optimalProfit);

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

            //We are looking for the next non overlapping index in the array
            //in other words we need the next start time which is greater than or equal the current end time
            //we look for the lowest Key in startTimeIndex which is greater than or equal to the current end time
            //then we get the Value of this key
            //if no key is found then it will = the length of the job array
            int nextNonOverlappingIndex=java.util.Optional.ofNullable(startTimeIndex.ceilingEntry(job[i][1])).map(e->e.getValue()).orElse(job.length);
            //we check which profit is greater,the previous profit or
            //the current profit with the profit of the next non overlapping
            optimalProfit[i]=Math.max(optimalProfit[i+1],job[i][2]+optimalProfit[nextNonOverlappingIndex]);
            //then we put the current start time in the startimeindex to begin the for loop again with the lower index
            startTimeIndex.put(job[i][0],i);
        }
        return optimalProfit[0];
    }
}
