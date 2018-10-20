def gcd(a,b):
    if(b==0):
        return a
    else:
        return gcd(b,a%b)

n = 60
m = 100

g = gcd(60,100)
n//=g
m//=g
print(str(n) + "/" + str(m))
