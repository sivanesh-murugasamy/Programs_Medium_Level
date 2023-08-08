
a=int(input())
b=int(input())

try:
   res=a/b
   print(res)

except ZeroDivisionError as e:
       print(e)