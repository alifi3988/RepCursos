
# criação da classe loja
class Loja:

    # contrutor da classe
    def __init__(self, nomeLoja, nomeGerente, localizacaoLoja, telefone, descCurta, fotoLoja):
        self.nomeLoja = nomeLoja
        self.nomeGerente = nomeGerente
        self.localizacaoLoja = localizacaoLoja
        self.telefone = telefone
        self.descCurta = descCurta
        self.foto = fotoLoja

    # métodos g e s
    def getNomeLoja(self):
        return self.nomeLoja

    def setNomeLoja(self, nomeLoja):
        self.nomeLoja = nomeLoja

    def getNomeGerente(self):
        return self.nomeGerente

    def setNomeGerente(self, nomeGerente):
        self.nomeGerente = nomeGerente

    def getLocalizacaoLoja(self):
        return self.localizacaoLoja

    def setLocalizacaoLoja(self, localizacaoLoja):
        self.localizacaoLoja = localizacaoLoja

    def getTelefone(self):
        return self.telefone

    def setTelefone(self, telefone):
        self.telefone = telefone

    def getDescCurta(self):
        return self.descCurta

    def setDescCurta(self, descCurta):
        self.descCurta = descCurta

    def getFoto(self):
        return self.foto

    def setFoto(self, foto):
        self.foto = foto

