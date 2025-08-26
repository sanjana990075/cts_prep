"""WITHOUT USING RECURSSION"""


    
"""USING RECURSSION"""

def fib(n):
    if(n==0 or n==1):
        return n
    else:
        return fib(n-1)+fib(n-2)


res=fib(10)
print(res)
"""print(f"{n}th term is{fib(n)})"""
