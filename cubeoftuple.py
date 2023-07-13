

"""Cube of tuble"""
a=int(input("Enter the no of elements"))
lis=[]
for n in range(a):
    x=int(input())
    lis.append(x)

l=[]
for i in lis:
    myt=(i,(i*i*i))
    l.append(myt)
print(l)



