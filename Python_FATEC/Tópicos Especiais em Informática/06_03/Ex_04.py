import os
os.system("cls")

seculo = 0
while(True):
    try:
        ano = int(input("Informe o ano desejado: "))

        for i in range(0,ano,100):
            seculo = seculo + 1

            if(ano < 101):
                seculo = 1

        print(f"O Século é {seculo}")
        break


    except ValueError:
        print("Verifique os valores informados!")




