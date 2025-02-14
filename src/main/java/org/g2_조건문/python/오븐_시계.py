A, B = map(int, input().split(" "))
C = int(input())

t = A * 60 + B + C
A = int(t / 60)
B = t - A * 60

if A >= 24:
    A -= 24

print(A, B)