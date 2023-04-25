# criação da classe Pessoa
class Pessoa:

    def setNome(self, nome):
        self.nome = nome

    def getNome(self):
        return self.nome

    def setIdade(self, idade):
        self.idade = idade

    def getIdade(self):
        return self.idade

    def __str__(self):
        return f"Pessoa[Nome: {self.nome}, Idade:{self.idade}]"
