from motor.motor_asyncio import AsyncIOMotorClient
from models import Tasck

client = AsyncIOMotorClient("mongodb://localhost/databasefarm")
database = client.farmDataBase
collections = database.task


async def get_one_task_id(id):
    task = await collections.find_one({"id": id})
    return task


async def create_task(task):
    new_task = await collections.insert_one(task)
    create_task = await collections.find_one({"_id": new_task.inserted_id})
    return create_task


async def get_all_task():
    tasks = []
    cursor = collections.find({})
    async for document in cursor:
        tasks.append(Tasck(**document))
    return tasks


async def update_task(id: str, task):
    await collections.update_one({"_id": id}, {"$set": task})
    document = await collections.find_one({"_id": id})
    return document


async def delete_task(id: str):
    await collections.delete_one({"_id": id})
    return True
