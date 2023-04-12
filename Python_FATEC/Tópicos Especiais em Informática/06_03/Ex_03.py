import os
os.system("cls")

while(True):
    try:
        numero = int(input("Informe um número: "))
        print(f" * * *  Tabuada do numero {numero} * * *")
        for i in range(1, 11):
            print(f" {i:2}x{numero} = {i*numero}")
        else:
            break
    except ValueError as ve:
        print("Erro: Valor informado é inválido. Verifique!")