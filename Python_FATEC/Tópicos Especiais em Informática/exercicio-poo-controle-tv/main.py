from Televisor import Televisor

televisao = Televisor(wxPython
                      )

print(f"Televisão: {televisao}")
print(f"Canal atual: {televisao.canal}")
print(f"Volume atual: {televisao.volume}")

# realizando as modificações

televisao.aumentarVolume()
televisao.aumentarVolume()
televisao.reduzirVolume()

print(f"Valor final do volume: {televisao.getVolume()}")

televisao.trocarCanal(24)
televisao.trocarCanal(42)
televisao.trocarCanal(45)
#televisao.trocarCanal()

print(f"Valor final do canal: {televisao.getCanal()}")
