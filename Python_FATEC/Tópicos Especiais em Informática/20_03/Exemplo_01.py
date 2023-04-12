# Exemplo de Tuplas/Collections
import os
import collections
from turtle import color

os.system("cls")

# Tuplas Nomeadas | Criação da Tupla
Pessoa = collections.namedtuple("Pessoa", "id nome anoNascimento email")
id = 0
pessoas = []
# colhendo os dados para inserção
while (True):
    while (True):
        try:
            nome = input("Nome: ")
            anoNascimento = int(input("Ano de nascimento: "))
            email = input("E-mail: ")
            break
        except:
            print("Valor informado não é compatível com o solicitado. Informe novamente!")

    while True:
        r = ["N", "n", "s", "S"]
        try:
            resp = input("Deseja continuar [S/N]")
            if r.__contains__(resp):
                break
        except:
            print("Informe corretamente!")
    id=id+1
    pessoas.append(Pessoa(id, nome, anoNascimento, email))

    # verificação de continuidade
    if resp == "N" or resp == "n":
        break

    # Finlaização do segundo while
# finalização do primeiro while


print("=+" * 20)
print(" * * * IMPRESSÃO * * * ")
print("=+" * 20)
for p in pessoas:
    print(f'''ID: {p.id}
Nome: {p.nome}
Idade: {2023 - p.anoNascimento}
E-mail: {p.email}''')
    print("=+" * 20)
