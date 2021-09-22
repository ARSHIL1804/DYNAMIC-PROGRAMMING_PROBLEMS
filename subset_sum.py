
//GIVEN ARRAY AND TARGET VALUE RETURN TRUE IF WE CAN OBTAIN TARGET  VALUE BY ADDING SOME CHOOSEN ARRAY VALUES

//THIS IS RECURTION SOLUTION WITH MEMORIZATION



dp=[[-1 for i in range(1002)] for j in range(1002)]
for i in range(1002):
  dp[i][0]=True
  dp[0][i]=True
def sum(s,arr,i):
  if s==0:
    return True
  elif i < 0:
    return False
  elif dp[i][s] != -1:
    return True
  elif arr[i] > s:
    print("HERE")
    dp[i][s]=sum(s,arr,i-1)
    return dp[i][s]
  else:
    dp[i][s] = sum(s-arr[i],arr,i-1) or sum(s,arr,i-1)
    return dp[i][s]

print(sum(3,[1,2,3,4],3))
