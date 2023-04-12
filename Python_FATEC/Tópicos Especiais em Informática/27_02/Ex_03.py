import os
os.system("cls")


# dados de entrada
print("Informe os dados conforme o solicitado")

produto = float(input("Valor do produto: R$"))

acrescimo = (12/100)*produto + produto

print(f"O valor atual é R${round(acrescimo):.2f}")