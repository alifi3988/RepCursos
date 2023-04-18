import requests as requests
import json

url = 'https://parallelum.com.br/fipe/api/v1/carros/marcas'

data = requests.get(url=url)
print(data.json())

for marca in data.json():
    print(marca["nome"])

