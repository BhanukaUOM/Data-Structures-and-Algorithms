def SieveOfEratosthenes(n): 
    prime = [True for i in range(n+1)] 
    p = 2
    while (p*p <= n): 
        if (prime[p] == True): 
            for i in range(p*2, n+1, p): 
                prime[i] = False
        p += 1
                    
/* Python
IsPrime(O(sqrt(N))) 
def isprime(n): 
    if n == 2: 
        return True 
    if n == 3: 
        return True 
    if n % 2 == 0: 
        return False 
    if n % 3 == 0: 
        return False 
  
    i = 5 
    w = 2 
    while i * i <= n: 
        if n % i == 0: 
            return False 
  
        i += w 
        w = 6 - w 
    return True 
 
 
 
 
Sieve of eratosthenes Theorom 
 
a = [0]*200008 
for i in range(2,200000): 
    if (a[i] == 1): 
        continue 
    for j in range(2*i,200000,i): 
        a[j] = 1 
primes = [] 
for i in range(2,200000): 
    if a[i] == 0: 
        primes.append(i) 
 
 
 */
 
        int maxNo = 1000000; 
        boolean[] prime = new boolean[maxNo]; 
        prime[0] = true; 
        prime[1] = true; 
        for(int i=2; i<=(int)Math.sqrt(maxNo); i++){ 
            if(prime[i]==false) 
                for(int j=i+1; j<maxNo; j++){ 
                    if(j % i == 0){ 
                        prime[j] = true; 
                    } 
                } 
        } 
 
int c=1; 
for(int i=0;i<maxNo;i++) 
if(prime[i]==false) 
c++; 
 
        int[] nthPrime = new int[c]; 
        int count=1; 
        for(int i=2; i<maxNo; i++){ 
            if(prime[i]==false){

                nthPrime[count++] = i; 
            } 
        } 
