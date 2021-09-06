

//THIS IS KNAPSACK (0/1)PROBLEM SOLVED BY RECURSIVE METHOD
//HERE I ONLY USE SOLUTION CLASS BUT AS THIS IS JAVA CODE YOU CAN ADD main FUNCTION IN THIS CODE TO CALL knapsack FUNCTION.
//For any suggetion you can send pull request

//Problem Statement : https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

class Knapsack_01Solution 
{ 
    static int [][]t=new int[10001][10001];
    //Function to return max value that can be put in knapsack of capacity W.

    static int knapsack(int W, int wt[], int val[], int n) 
    { 
       if(n==0 || W==0){
           return 0;
       }
       if (t[n][W] != -1){
           return t[n][W];
       }
       if(wt[n-1]<=W){
           return t[n][W]=Math.max(val[n-1] + knapsack(W-wt[n-1],wt,val,n-1),knapsack(W,wt,val,n-1));
       }
       else{
           return t[n][W]=knapsack(W,wt,val,n-1);
       }
    } 
        static int knapSack(int W, int wt[], int val[], int n) 
    { 
          for (int i=0;i<=n;i++){
              for (int j=0;j<=W;j++)
                  {
                      t[i][j]=-1;
                 }
          }
          return knapsack(W,wt,val,n);
    } 
          
}
