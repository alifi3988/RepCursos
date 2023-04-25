from pessoa import Pessoa


class PessoaFisica(Pessoa):

    def __init__(self, nome, idade, cpf):
        self.nome = nome
        self.idade = idade
        self.cpf = cpf

    def setCpf(self, cpf):
        self.cpf = cpf

    def getCpf(self):
        return self.cpf

    def __str__(self):
        return f"PessoaFisica[Nome: {self.nome}, Idade: {self.idade}, CPF: {self.cpf}]"