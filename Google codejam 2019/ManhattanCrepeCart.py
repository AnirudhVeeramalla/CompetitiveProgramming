def main():
    t=int(input())
    for i in range(t):
        print("Case #"+str(i+1)+":",end=" ")
        p,q=list(map(int,input().split()))
        x=[0 for i in range(100002)]
        y=[0 for i in range(100002)]
        m=n=len(x)
        for j in range(p):
            xi,yi,d=input().split()
            xi=int(xi)
            yi=int(yi)
            if d=="N":
                x[0]+=1
                x[m-1]-=1
                y[yi+1]+=1
                y[n-1]-=1
            elif d=="S":
                x[0]+=1
                x[m-1]-=1
                y[0]+=1
                y[yi]-=1
            elif d=="E":
                y[0]+=1
                y[n-1]-=1
                x[xi+1]+=1
                x[m-1]-=1
            elif d=="W":
                y[0]+=1
                y[n-1]-=1
                x[0]+=1
                x[xi]-=1
        for i in range(1,m):
            x[i]=x[i]+x[i-1]
        for i in range(1,n):
            y[i]=y[i]+y[i-1]
        xmax=max(x)
        ymax=max(y)
        xr=yr=0
        for i in range(m):
            if xmax==x[i]:
                xr=i
                break
        for i in range(n):
            if ymax==y[i]:
                yr=i
                break
        print(xr,yr)

main()               
            