import pandas as pd

def calculate(row):
    if row["employee_id"] % 2 != 0 and not row["name"].startswith('M'):
        return row["salary"]
    else:
        return 0

def calculate_special_bonus(employees: pd.DataFrame) -> pd.DataFrame:
    employees["bonus"] = employees.apply(calculate, axis=1)
    result = employees[["employee_id", "bonus"]]
    return result.sort_values(by='employee_id', ascending=True)