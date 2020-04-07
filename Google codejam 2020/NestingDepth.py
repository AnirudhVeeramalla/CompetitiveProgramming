t = int(input())
for i in range(t):
    s = input()
    print("Case #"+str(i+1)+": ",end="")
    for j in range(int(s[0])):
        print("(",end="")
    print(s[0],end="")
    for j in range(1,len(s)):
        if(s[j-1]<=s[j]):
            for k in range(int(s[j])-int(s[j-1])):
                print("(",end="")
            print(s[j],end="")
        else:
            for k in range(int(s[j-1])-int(s[j])):
                print(")",end="")
            print(s[j],end="")
    for j in range(int(s[-1])):
        print(")",end="")
    print()