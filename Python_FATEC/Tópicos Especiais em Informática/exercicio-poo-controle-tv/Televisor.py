

class Televisor:

    # definindo o contrutor da classe
    def __init__(self):
        self.canal = 23 # definindo como o canal inicial 23
        self.volume = 50 # definindo com o volume inicial 50

    # inserindo o volume com um valor direto

    # pegando o valor de volume atual
    def getVolume(self):
        return self.volume
    # pegando o valor de volume atual
    def getCanal(self):
        return self.canal


    # aumentando o volume
    def aumentarVolume(self):
        self.volume = self.volume + 1
        print(f"Volume: {self.volume}")

    # diminuir o volume
    def reduzirVolume(self):
        self.volume = self.volume - 1
        print(f"Volume: {self.volume}")

    # trocar de canal
    def trocarCanal(self, canal):
        self.canal = canal
        print(f"Canal: {self.canal}")

    #def trocarCanal(self):
    #    self.canal = self.canal + 1
    #    print(f"Canal: {self.canal}")

