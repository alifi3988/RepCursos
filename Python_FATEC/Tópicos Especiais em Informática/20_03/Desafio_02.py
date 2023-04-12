import os
from enum import auto


# função para limpar a tela
def limparTela():
    os.system("cls")


def lerVet():
    n = 0
    lista = list()
    index = 0
    for i in range(15):
        while True:
            try:
                n = int(input("Informe um valor inteiro: "))
                break
            except:
                print("Valor informado não estpa correto!")

        lista.append(n)
    return lista

def modeficandoVetor(lista):
    maior = max(vetor)
    aux = list()
    for i in lista:
        aux.append(i/maior)
    return aux


print(" * * * INICIANDO * * *")
vetor = lerVet()
novVet = modeficandoVetor(vetor)
print(novVet)