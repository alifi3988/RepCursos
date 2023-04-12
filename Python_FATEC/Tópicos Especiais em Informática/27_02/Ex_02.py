import os
os.system("cls") # limpando o console


# entrada das variaveis

while(True):

    print("Informe o sexo M[Masculino] ou F[Feminino]")
    sexo = input("R: ")



    # verificação
    if(sexo == "M" or sexo == "F" or sexo == "m" or sexo =="f"):
        break
    else:
        print("Informação não está coerente com o solicitado. Informe novamente!")

while(True):
    print("Informe a idade")
    idade = int(input("R: "))

    # verificação da idade
    if(idade < 10 or idade > 100):
       print("Não será realizado o calculo com essa idade!")
    else:
        break

print("Informe o peso (kg)")
peso = float(input("R: "))

print("Informe a altura (cm)")
altura = float(input("R: "))

# verificações para o resultado

IMC = peso / (altura * altura)

if(IMC < 18.5):
    estado = "MAGREZA"
elif(IMC >= 18.5 and IMC <= 24.9):
    estado = "NORMAL"
elif(IMC >= 25 and IMC <= 29.9):
    estado = "SOBREPESO"
elif(IMC >= 30 and IMC <= 39.9):
    estado = "OBESIDADE"
elif(IMC >= 40):
    estado = "OBESIDADE GRAVE"



# resultado
print("* * * RESULTADO * * * ")

print(f"O estado atual é: {estado}")