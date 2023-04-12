import os
os.system("cls")

rst = list()
for i in range(4):
    rst.append(int(input(f"Informe o valor da {i+1}ª resistência: ")))

# mostrando o resultado
print("=+"*20)
print("* * * RESULTADO * * *")
print("=+"*20)
print(f'''Rst.  equivalente: {sum(rst)}
Maior resistência: {max(rst)}
Menor resistência: {min(rst)}''')
print("=+"*20)

