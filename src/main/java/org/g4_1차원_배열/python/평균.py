N = int(input())

score = list(map(int, input().split()))
m = max(score)

f = []
for s in score :
    f.append(s / m * 100)

print(sum(f) / len(f))