<div align="center">
  
  # Algorithms Design Project
  
  ## Contributers
  
  |[First Problem](#first-problem)|[Second Problem](#second-problem)|
  |:-----------|:-----------------|
  |Ragab Hassan |Samer Adel       |
  |Aya Mohamed  |Abdelrahman Salah|
  |             |Omar Tarek       |
</div>


### First Problem
Given a set of N jobs where each jobi has a deadline and profit associated with it. Each job takes 1 unit of time to complete and only one job can be scheduled at a
time. We earn the profit associated with job if and only if the job is completed by its deadline. Find the number of jobs done and the maximum profit. Jobs will be
given in the form (Jobid, Deadline, Profit) associated with that Job.

to solve this problem we think to apply greedy algorithm, to do this we have some steps
first of all we need to sort data by profit, because we intersted in job with max profit
we need to sort data based on profit which is the third index in in each tuple
the main idea is to creat an array of zeros. then we reassign evry index by 1 if the time is free
if the time is busy, we don't assign the index
then we iterate on every empty job to schedule
we assign 1 to evey empty job 
then we add its profit to the latest profit
if the job has already assigned to the job, we won't add its profit
finally,we return 



![alt text](https://github.com/AbdelrahmanSalah211/Algorithm-Project/tree/master/illustrative%20photos/illustrative1.png)





### Second Problem
You are given a list of N jobs with their start time, end time, and the profit you can earn by doing that job. Your task is to find the maximum profit you can earn
by picking up some (or all) jobs, ensuring no two jobs overlap. If you choose a job that ends at time X, you will be able to start another job that starts at time X.
