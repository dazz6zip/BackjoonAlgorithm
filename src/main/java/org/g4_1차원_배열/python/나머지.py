t = []
for _ in range(10) :
    t.append(int(input()) % 42)
print(len(set(t)))