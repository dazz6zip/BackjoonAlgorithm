s = []
for _ in range(28):
    s.append(int(input()))
for i in range(1, 31):
    if (i not in s) :
        print(i)