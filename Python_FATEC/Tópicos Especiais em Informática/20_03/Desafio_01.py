import os
from enum import auto


# função para limpar a tela
def limparTela():
    os.system("cls")


# função de verificação se é um palindrome
def verificarPalindrome(frase):

    frase = frase.lower()

    if frase.find(" ") != -1:
        auxiliar = frase.replace(" ", "")
    else:
        auxiliar = frase
    aux = ""
    for s in auxiliar:
        aux = aux + s
    if aux == frase.replace(" ", ""):
        return True
    else:
        return False





def colherDado():
    palavra = input("Informe uma palavra/frase para verificar se é Palindrome: ").strip()

    return palavra


# apresentação do menu
def main():
    limparTela()
    palavra = colherDado()
    print("==" * 15)
    print(" * * * RESULTADO * * *")
    print("==" * 15)
    if verificarPalindrome(palavra):
        resp = "É"
    else:
        resp = "NÃO É"
    print(f"A palavra/frase < {palavra} > {resp} um Palindrome.")
    print("==" * 15)


# mostrando resultado
main()


