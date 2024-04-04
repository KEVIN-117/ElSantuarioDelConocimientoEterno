import pandas as pd

def find_patients(patients: pd.DataFrame) -> pd.DataFrame:
    result = patients[patients[patients.conditions.contains("DIAB1")]]
    return result