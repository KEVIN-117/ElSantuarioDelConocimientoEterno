from builtins import print

import pandas as pd


df = pd.read_csv('./AnalisisData.csv')
data = df.Protocol.unique()
print(data)