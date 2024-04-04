import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    df = customers.set_index('id').join(orders.set_index('customerId'), how='outer')
    result = df[df.id.isnull()]
    result = result.rename(columns={'name': 'Customers'})
    return result[['Customers']]