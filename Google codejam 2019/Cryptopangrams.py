import math
def isperfect(n):
    num=int(math.sqrt(n))
    return (num*num)==n

t=int(input())
for i in range(t):
    print("Case #"+str(i+1)+": ",end="")
    inputs=list(map(int,input().split()))
    A=list(map(int,input().split()))
    alphabets=set()
    alphaorder=list()
    # if n==1:
    #     print("AB")
    #     continue
    j=0
    n=len(A)-1
    while(j<n and A[j]==A[j+1]):
        alphabets.add(A[j])
        j+=1
    if j==len(A)-1 and len(alphabets)==1 and isperfect(A[0]):
        print("A"*(inputs[1]+1))
        continue
    elif j==len(A)-1:
        if inputs[1]%2!=0:
            print("AB"*(int(inputs[1]/2+1)))
        else:
            print("AB"*(int(inputs[1]/2)),end="")
            print("A")
        continue
    alphabets=set()
    n=math.gcd(A[j],A[j+1])
    alphaorder.append(n)
    alphabets.add(n)
    gc=n
    temp=j
    while(temp>=0):
        alphaorder.insert(0,A[temp]//n)
        alphabets.add(A[temp]//n)
        n=A[temp]//n
        temp-=1
    n=len(A)
    temp=j+1
    while(temp<n):
        alphaorder.append(A[temp]//gc)
        alphabets.add(A[temp]//gc)
        gc=A[temp]//gc
        temp+=1
   
    alphasorted=list(alphabets)
    alphasorted.sort()
    for j in alphaorder:
        index=alphasorted.index(j)
        print(chr(index+65),end="")
    print()
