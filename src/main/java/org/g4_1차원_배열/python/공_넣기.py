N, M = map(int, input().split())
T = [0 for _ in range(N)]
for _ in range(M):
    i, j, k = map(int, input().split())
    for J in range(i - 1, j):
        T[J] = k
print(*T)