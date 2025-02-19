N, X = map(int, input().split())
A = []
A.extend(map(int, input().split()))
A = [i for i in A if i < X]
print(" ".join(map(str, A)))