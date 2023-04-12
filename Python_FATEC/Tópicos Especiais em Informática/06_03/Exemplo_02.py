import os 
os.system("cls")


for i in range(5):
    print(i)

for i in range(1,10,2):
    print(i)

for i in range(10,1,-1):
    print(i)

soma = 0
for i in range(10,1,-1):
    soma+=1
else:
    print("Soma = %d" %soma)
