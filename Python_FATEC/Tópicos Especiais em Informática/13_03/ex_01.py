import os 




# REALIZAÇÃO DAS FUNÇÕES

def limparTela():
    os.system("cls")


def lerNumero():
    return int(input("Informe um número: "))


def soma(n1,n2):
    return n1+n2


def main():
    limparTela()
    n1 = lerNumero()
    n2 = lerNumero()
    print(f"A soma é {soma(n1,n2)}")

main()


