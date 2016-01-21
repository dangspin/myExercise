#! /usr/bin/python

## this is the leetcode problem happy number

def happy_number(num):
    alist=[]
    while num!=1 and num not in alist:
        atp=list(str(num))
        alist.append(num)
        s=0.0
        for i in range(len(atp)):
            s+=(int(atp[i]))**2
        num=int(s)

    return num==1

print happy_number(971)
