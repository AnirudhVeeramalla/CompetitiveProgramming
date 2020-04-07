import operator
t = int(input())
for i in range(t):
    n = int(input())
    A = []
    for j in range(n):
        temp = list(map(int,input().split()))
        A.append([temp[0],temp[1],j,""])
    A.sort(key=operator.itemgetter(0))
    A[0][3] = "J"
    A[1][3] = "C"
    jm = A[0][1]
    c = A[1][1]
    flag = False
    print("Case #"+str(i+1)+": ",end="")
    for j in range(2,n):
        if(A[j][0]>=jm):
            A[j][3] = "J"
            jm = A[j][1]
        elif (A[j][0]>=c):
            A[j][3] = "C"
            c = A[j][1]
        else:
            print("IMPOSSIBLE")
            flag = True
            break
    if flag:
        continue
    A.sort(key=operator.itemgetter(2))
    for start,end,index,value in A:
        print(value,end="")
    print()
    
    