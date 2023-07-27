str=input("Enter a string:").lower()
het=len(str)==len(set(str))
if het:
	print("The string is heterogram")
else:

	print("The string is not a heterogram")