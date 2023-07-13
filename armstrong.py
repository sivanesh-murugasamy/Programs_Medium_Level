

x=int(input("Enter a number: "))
t=x
sum=0
while t>0:
   digit = t%10
   sum += digit**3
   t //=10

if sum==t:
   print("Armstrong number")
else:
   print("Not an Armstrong number")

  

