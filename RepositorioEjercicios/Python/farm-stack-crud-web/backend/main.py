from fastapi import FastAPI
from dataBase import get_all_task, get_one_task_id, create_task
from models import Tasck
app = FastAPI()


@app.get("/")
def home():
    return {"message": "welcome my app farm stack"}


@app.get("/api/tasks")
async def get_tasks():
    tasks = await get_all_task()
    return tasks


@app.get("/api/tasks/{id}")
async def get_task(id):
    task = await get_one_task_id(id)
    return task


@app.post("/api/tasks")
async def create_new_task(task: Tasck):
    print(task)
    #new_task = await create_task(task)
    return {"mesaage":"create new task"}


@app.put("/api/tasks/{id}")
async def update_task(id, task):
    return {"message": "task updated is success", "data": task}


@app.delete("/api/tasks/{id}")
async def delete_task(id):
    return {"message": "task deleted is success"}