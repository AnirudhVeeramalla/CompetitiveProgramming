def swap(a,b,A):
  temp = A[a];
  A[a] = A[b];
  A[b] = temp
  
A = list(map(int,input().split()))
swap(0,1,A)
swap(0,2,A)
print(A[0],A[1],A[2])
