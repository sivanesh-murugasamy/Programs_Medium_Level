
n=int(input("Enterthe number for febnacci"));

a=0
b=1
print(a)
print(b)

for i in range(n):
    c=a+b
    print(c)
    a=b
    b=c
    
