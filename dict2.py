

d={'GFg' : {"a":7,"b":9,"c":12},'is':{"a":15,"b":19,"c":20},'best':{"a":5,"b":10,"c":2}}

t="a"

dict=[val[t] for key, val in d.items()]
print(dict)