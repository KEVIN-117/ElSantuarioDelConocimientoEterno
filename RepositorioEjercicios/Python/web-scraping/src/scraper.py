from os import path
from pathlib import PurePath

import requests

with open('../data/input/url.txt', 'r') as fc:
    urls = fc.readlines()
urls = [url.strip() for url in urls]

for url in urls:
    pass