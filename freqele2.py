n=int(input())
ele=list(map(int,input().split()))
freq={}
for i in ele:
    if i in freq:
        freq[i]+=1
    else:
        freq[i]=1
for key,val in sorted(freq.items()):
    print(key,":",freq[val])
    
        
    