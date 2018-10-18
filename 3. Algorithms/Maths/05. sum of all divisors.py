import math

n = 50000

div_sum = [1 for i in range(n)]
div_sum[0] = 0
div_sum[1] = 0

for i in range(2, n):
    sq = int(math.sqrt(i))
    for j in range(2, sq+1):        
        if i%j==0:
            p = i//j
            if p!=j:
                div_sum[i] += j + p
            else:
                div_sum[i] += j
