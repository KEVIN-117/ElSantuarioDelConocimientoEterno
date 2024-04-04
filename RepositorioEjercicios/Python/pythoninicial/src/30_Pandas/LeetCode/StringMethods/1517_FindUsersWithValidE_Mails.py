from builtins import print

import pandas as pd


def valid_emails(users: pd.DataFrame) -> pd.DataFrame:
    patron = r'^[a-zA-Z][a-zA-Z0-9_\-\.]*@leetcode\.com$'
    resul = users[users['mail'].str.match(patron)]
    return resul[["user_id", "name", "mail"]]


data = {
    "user_id": [1, 2,3,4,5,6],
    "name": ["Winston", "Jonathan", "Annabelle", "Sally", "Marwan", "David"],
    "mail": ["jonathanisgreat", "bella-@leetcode.com", "sally.come@leetcode.com", "quarz#2020@leetcode.com", "david69@gmail.com", ".shapo@leetcode.com"]
}

df = pd.DataFrame(data)

print(valid_emails(df))
