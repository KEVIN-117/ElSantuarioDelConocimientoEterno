import pandas as pd

def article_views(views: pd.DataFrame) -> pd.DataFrame:
    df = views[views.author_id == views.viewer_id].viewer_id.unique()
    result = pd.DataFrame({'id':df})
    return result.sort_values(by='id', ascending=True)