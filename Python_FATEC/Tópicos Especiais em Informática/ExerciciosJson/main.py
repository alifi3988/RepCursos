#Declaração do Dicionário
import json

data = {}
data["vermelho"] = {"nome":"Vermelhor", "rgb":"255,0,0", "hex":"#FFFF00"}
data["verde"] = {"nome":"verde", "rgb":"0,255,0", "hex":"#00FF00"}
data["azul"] = {"nome":"azul", "rgb":"0,0,255", "hex":"#0000FF"}

# Escrevendo para o formato Json

f = open("outPut.json", "w")
y = json.dump(data, f, sort_keys=True, indent=4)
f.close()

# Lendo em formato Json
f = open("outPut.json", "r")
data = json.load(f)

f.close()

