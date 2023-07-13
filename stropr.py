

string1="madam"
print(string1)


print(string1.find("@"))

if string1 == string1[: : -1]:
        print("Given string is palindrom")
else:
    print("Given string is not palindrom")




for x in string1:
    if x.find('a') or x.find('e') or x.find('i') or x.find('o') or x.find('u'):
       print("vowels founded")
       break
    else:
       print("vowels not founded")

string1="aabbcc"
list1 =[]
for char in string1:
    if char not in list1:
       list1.append(char)
       st="".join(list1)

print(st)

string = "ram is good boy"
s = string.split()[::-1]
l = []
for i in s:
	l.append(i)
print(" ".join(l))

s4=input("Enter String: ")
s5=s4[:5]
print(s5.upper())