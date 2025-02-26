N, M = map(int, input().split())
t = [i + 1 for i in range(N)]
for _ in range(M) :
    i, j = map(int, input().split())
    t[i - 1 : j] = t[i - 1 : j][::-1]
print(*t)
