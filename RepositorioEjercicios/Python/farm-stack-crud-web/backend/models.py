from pydantic import BaseModel
class Tasck(BaseModel):
    id: str
    title: str
    description: str
    complited: bool = False

