<div align="center">
  
  # Algorithms Design Project
  
  ## Contributers
  
  |[First Problem](#first-problem)|[Second Problem](#second-problem)|
  |:------------------------------|:--------------------------------|
  |Ragab Hassan                   |Samer Adel                       |
  |Aya Mohamed                    |Abdelrahman Salah                |
  |                               |Omar Tarek                       |
</div>


### First Problem
Given a set of N jobs where each jobi has a deadline and profit associated with it. Each job takes 1 unit of time to complete and only one job can be scheduled at
a time. We earn the profit associated with job if and only if the job is completed by its deadline. Find the number of jobs done and the maximum profit. Jobs will
be given in the form (Jobid, Deadline, Profit) associated with that Job.

#### Solution:

to solve this problem we think to apply greedy algorithm, to do this we have some steps first of all we need to sort data by profit, because we intersted in job
with max profit we need to sort data based on profit which is the third index in in each tuple the main idea is to creat an array of zeros. then we reassign evry
index by 1 if the time is free if the time is busy, we don't assign the index then we iterate on every empty job to schedule we assign 1 to evey empty job then we
add its profit to the latest profit if the job has already assigned to the job, we won't add its profit finally,we return max profit

We apply Greedy Approach in this problem:

1. Sort the jobs according to profit in descending order which is the third index in each tuple.
2. Create an array of zeros.
3. Reasignning every index by 1 if the time slot is free otherwise we do not assign the index.
4. Iterate on every empty to job schedule and assign 1 to every empty job.
5. Add its profit to latest profit if the job has already assigned to job slot otherwise we do not add its profit.
6. Return max profit.



<div align="center">
  <img src="illustrative%20photos/illustrative1.png" width="700">
  
  Fig.1 Shows an example of how jobs are assigned to slots
 </div>

### Second Problem
You are given a list of N jobs with their start time, end time, and the profit you can earn by doing that job. Your task is to find the maximum profit you can earn
by picking up some (or all) jobs, ensuring no two jobs overlap. If you choose a job that ends at time X, you will be able to start another job that starts at time X.

<div align="center">
  <img src="illustrative%20photos/illustrative2.png">
  
  Fig.2 Shows a visualization example for jobs starting time and ending time and their overlapping
</div>

#### Solution:

We apply Dynamic Programmnig Approach in this problem:

1. Sort the array by the start time in an ascending order.
2. Create an array which will contain the max profit of each step and the previous ones.
3. Create TreeMap that will take start time (Key) and index of that starting time (value) in the job array and store them in ascending order according to the value of key.
4. Look for the next non overlapping job index where the next start time >= the end of current job we are looking for the lowest Key in startTimeIndex which is greater than or equal to the current end time then we get the Value of this key if no key is found then it will = the length of the job array.
5. Check which profit is greater (the previous profit or the current profit along with the profit of the next non overlapping) and save that in the profit array.
6. Put the current start time in the TreeMap (starTimeIndex) to begin with it the next iteration of the loop again with the lower index.
7. Return the maximum profit that can be obtained from the jobs that is stored in the first index in the profit array.


