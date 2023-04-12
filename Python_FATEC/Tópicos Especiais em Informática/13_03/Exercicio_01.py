import os


#Função para limpar a tela
def limparTela():
    os.system("clear")


def receberValores():
    lista = list()
    print("Informe os valores solicitado. Para parar aperte a letra 'P'.")
    while(True):
        try:
            valor = input("Informe um valor num érico: ")
            if(valor == "P" or valor == "p"):
                break
            elif(int(valor)):
                lista.append(int(valor))
        except:
            print("Valor informado não é compativel com o solicitado!")

    return lista


def pares(lista):
    pares = list()
    for i in lista:
        if (i % 2 == 0):
            pares.append(i)
    return pares

def impares(lista):
    impares = list()
    for i in lista:
        if (i % 2 != 0):
            impares.append(i)
    return impares


def determinarNumeros():

    lista = receberValores().copy()

    qPares = pares(lista)
    qImpares = impares(lista)
    maior = max(lista)
    menor = min(lista)

    print(" * * * RESULTADO * * * ")
    print(f'''
    Qtd. pares: {len(qPares)}
    Numeros impares: {qImpares}
    Maior numero: {maior}
    Menor numero: {menor}
    ''')

def main():
    determinarNumeros()


main()






