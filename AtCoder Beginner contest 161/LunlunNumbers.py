from queue import Queue
k = int(input())
q = Queue(maxsize = 10000000)
for i in range(1,10):
    q.put(i)
if(k<10):
    print(k)
else:
    count = 0
    while(count<k-1):
        ele = q.get()
        temp = ele%10
        if(temp-1>=0):
            q.put(int(str(ele)+str(temp-1)))
        q.put(int(str(ele)+str(temp)))
        if(temp+1<=9):
            q.put(int(str(ele)+str(temp+1)))
        count+=1
    print(q.get())

