
list=[1,2,3,4,5]
print(list)
temp=list[0]
list[0]=list[4]
list[4]=temp
print(list)

print(len(list))

if list[1]==2:
   print("true")

if 3 in list:
   print("true")

print(list.clear())

