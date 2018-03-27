import math

N = int(input())

a = [0]*200008 
for i in range(2,200000): 
    if (a[i] == 1): 
        continue 
    for j in range(2*i,200000,i): 
        a[j] = 1 
primes = {}
for i in range(2,200000): 
    if a[i] == 0: 
        primes[i] = True 
ans = 1
for p in primes :
    if p*p*p > N:
        break
    count = 1
    while N%p==0:
        N = N/p
        count = count + 1
    ans = ans * count
if N in primes:
    ans = ans * 2
elif math.sqrt(N) in primes:
    ans = ans * 3
elif N != 1:
    ans = ans * 4
print(ans-1)
