f, s, t = map(int, input().split(" "))

if f == s == t :
    print(10000 + f * 1000)
elif f == s or f == t or s == t :
    if f == s or f == t:
        print(1000 + f * 100)
    else:
        print(1000 + s * 100)
else :
    print(max(f, s, t) * 100)