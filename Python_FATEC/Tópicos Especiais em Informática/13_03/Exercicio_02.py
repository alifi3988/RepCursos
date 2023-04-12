import os

def verificacaoContinuidade():
    try:
        res = input("Deseja add mais [S/N]?")
        if (res == "N" or res == "n"):
            return False
        elif(res == "S" or res == "s"):
            return True
    except:
        print("Dado informado inválido! Informe de acordo com o solicitado")

def colherDadosPadrao(texto):
    listaDados = list()
    while(True):
        t = input(f"Informe o {texto}: ")
        listaDados.append(t)
        if(verificacaoContinuidade() == False):
            break
    return listaDados

def colherDado(texto):
    t = input(f"Informe o {texto}: ")
    return t


def montarDados(curriculo):
    curriculo.write(f"# * * * CURRICULO * * \n")

    nome = colherDado("Nome")
    curriculo.write(f"## {nome}\n")

    endereco = colherDado("Endereco")
    curriculo.write(f"### Endereço: {endereco}\n")

    telefones = colherDadosPadrao("Telefone")
    curriculo.write(f" ### Telefone(s):\n")
    for i in telefones:
        curriculo.write(f"#### - {i}\n")

    email = colherDadosPadrao("E-mail")
    curriculo.write(f" ### E-mail(s):\n")
    for i in email:
        curriculo.write(f"#### - {i}\n")

    escolaridade = colherDado("Escolaridade")
    curriculo.write(f"### Escolaridade: {escolaridade}\n")


    experiencia = colherDadosPadrao("Experiencia")
    curriculo.write(f" ### Experiências(s):\n")
    for i in experiencia:
        curriculo.write(f"#### - {i}\n")

    lista = list()
    lista.append(nome)
    lista.append(endereco)
    lista.append(telefones)
    lista.append(email)
    lista.append(escolaridade)
    lista.append(experiencia)
    return lista


def main():
    arquivo = open("curriculo.md", "a") # criação do arquivo

    lista = list()
    lista = montarDados(arquivo)



main()





