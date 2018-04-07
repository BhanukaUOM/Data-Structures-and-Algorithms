n = 100001

div_sum = [0 for i in range(n)]

for i in range(2, n):
    sq = int(math.sqrt(i))
    for j in range(1, sq+1):        
        if i%j==0:
            p = i//j
            if p!=i:
                div_sum[i] += j + p
            else:
                div_sum[i] += j
