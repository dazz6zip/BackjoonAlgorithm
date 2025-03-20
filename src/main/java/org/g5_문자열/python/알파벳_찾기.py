S = input()
t = [-1] * 26
for i, c in enumerate(S) :
    p = ord(c) - ord('a')

    if t[p] == -1 :
        t[p] = i

print(" ".join(map(str, t)))
