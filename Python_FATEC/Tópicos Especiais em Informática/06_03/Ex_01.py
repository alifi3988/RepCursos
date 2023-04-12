# importações
import os
os.system("cls")

nome = ""
valor = 0
desconto = 0
# entrada de dados e verificações
while(True):
    try:
        nome = input("Informe o nome  do produto: ")
        while(True):
            valor = float(input("Informe o valor do produto: "))
            if valor < 0:
                print("Valor tem que ser maior que 0. Informe novamente")
            else:
                break
        break
    except ValueError as ve:
        print("Erro ao informar o valor. Não compatível com o solicitado! Tente novamente!")

# # # # #
if valor >= 50 and valor < 200:
    desconto = ((5/100)*valor)-valor

elif valor >= 200 and valor < 500:
    desconto = ((6/100)*valor)-valor

elif valor >=500 and valor < 1000:
    desconto = ((7/100)*valor)-valor

elif valor >=1000:
    desconto = valor - ((5/100)*valor)

# mostrando o resultado
print("=+"*20)
print("R E S U L T A D O")
print("=+"*20)
print(f'''Produto:       {nome}
Valor inicial: {valor}
Valor final:   {desconto}''')
print("=+"*15)


