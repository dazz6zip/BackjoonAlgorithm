N, M = map(int, input().split())
T = [t + 1 for t in range(N)]
for _ in range(M) :
    i, j = map(int, input().split())
    temp = T[i - 1]
    T[i - 1] = T[j - 1]
    T[j - 1] = temp

print(*T)
