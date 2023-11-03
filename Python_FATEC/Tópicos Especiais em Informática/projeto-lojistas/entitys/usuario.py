
 # Classe Usuário, com os atributos bascios
class Usuario:
    # contrutor da classe usuario
    def __init__(self, nome, login, senha):
        self.nome = nome
        self.usuario = login
        self.senha = senha

    # métodos g e s
    def getNome(self):
        return self.nome

    def setNome(self, nome):
        self.nome = nome

    def getLogin(self):
        return self.login

    def setLogin(self, login):
        self.login = login

    def getSenha(self):
        return self.senha

    def setSenha(self, senha):
        self.senha = senha

    # toString
    def __str__(self):
        return f"Usuario [nome: '{self.nome}', login: '{self.login}', senha: '{self.senha}']"
