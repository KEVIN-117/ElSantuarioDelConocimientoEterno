import pandas as pd

def invalid_tweets(tweets: pd.DataFrame) -> pd.DataFrame:
    tweets["len_tweets"]= tweets.content.map(lambda x: len(x))
    result = tweets[tweets.len_tweets > 15]
    return pd.DataFrame({"tweet_id": result.tweet_id})


data = {
    "tweet_id": [1, 2],
    "content": ["Vote for Biden", "Let us make America great again!"]
}

df = pd.DataFrame(data)

print(invalid_tweets(df))
