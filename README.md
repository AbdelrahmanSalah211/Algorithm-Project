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

1. sort the jobs according to profit in descending order which is the third index in each tuple.
2. create an array of zeros.
3. reasignning every index by 1 if the time slot is free otherwise we do not assign the index.
4. iterate on every empty to job schedule and assign 1 to every empty job.
5. add its profit to latest profit if the job has already assigned to job slot otherwise we do not add its profit.
6. return max profit.



<div align="center">
  <img src="illustrative%20photos/illustrative2.png">
  fig.1 shows how jobs are assigned to slots
 </div>

### Second Problem
You are given a list of N jobs with their start time, end time, and the profit you can earn by doing that job. Your task is to find the maximum profit you can earn
by picking up some (or all) jobs, ensuring no two jobs overlap. If you choose a job that ends at time X, you will be able to start another job that starts at time X.

<div align="center">
  <img src="illustrative%20photos/illustrative1.png">
  
  fig.2 shows a visualization example for jobs starting time and ending time and their overlapping
</div>

#### Solution:

We apply Dynamic Programmnig Approach in this problem:

1. sort the array by the start time in an ascending order
2. create an array which will contain the optimal profit of each step and the previous ones
3. create TreeMap that will take start time (Key) and index of that starting time (value) and store them in ascending order according to the value of key
4. We are looking for the next non overlapping job index in other words we need the next start time which is greater than or equal the end of current job we are looking for the lowest Key in startTimeIndex which is greater than or equal to the current end time then we get the Value of this key if no key is found then it will = the length of the job array
5. we check which profit is greater (the previous profit or the current profit with the profit of the next non overlapping )and save that profit
6. then we put the current start time in the startimeindex to begin the for loop again with the lower index


