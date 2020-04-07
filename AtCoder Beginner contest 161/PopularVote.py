n,m = list(map(int,input().split()))
A = list(map(int,input().split()))
A.sort(reverse = True)
threshold = sum(A)/(4*m)
if(A[m-1]>=threshold):
    print("Yes")
else:
    print("No")
