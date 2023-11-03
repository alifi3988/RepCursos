
class Menu:

    def menuInicial(self):
        while(True):
            print("=" * 30)
            print('''
        * * *  M E N U * * *
        [1] - Cadastros
        [2] - Pesquisa
        [3] - Relatório
        [0] - Sair do Sistema
        ''')
            print("="*30)
            resposta = input("Informe uma opção: ").strip()
            if resposta == "1" or resposta == "2" or resposta == "3" or resposta == "0":
                print("=" * 30)
                return resposta
                break
            else:
                print("Resposta inválida. Informe novamente!")


