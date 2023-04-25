from pessoa import Pessoa
from pessoaFisica import PessoaFisica

alifi = Pessoa()
alifi.nome = "Alifi Augusto Estevam dos Santos"
alifi.idade = 23

print(f"Nome: {alifi.nome} - {alifi.idade} anos")
print(alifi)

# -------------------------------------------------------
pFisica = PessoaFisica("Alifi Augusto Estevam dos Santos", 23, 47013722855)

print(f"Nome: {pFisica.nome} - {pFisica.idade} anos - CPF: {pFisica.cpf}")

print(pFisica)
