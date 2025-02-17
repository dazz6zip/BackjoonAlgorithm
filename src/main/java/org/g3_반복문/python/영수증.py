p = int(input())
t = 0
for i in range(int(input())):
    sp, q = map(int, input().split(" "))
    t += sp * q
if p == t :
    print("Yes")
else :
    print("No")