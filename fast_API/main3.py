#!/usr/bin/env python
# coding: utf-8

# In[1]:


# uvicorn main3:app --reload --port=8000
 
from fastapi import FastAPI

app = FastAPI()

 
fake_items_db = [{"item_name": "Foo"}, {"item_name": "Bar"}, {"item_name": "Baz"}]

@app.get("/test1/")
async def read_item(skip: int = 0, limit: int = 10):
    print ( skip , " " , limit) 
    return fake_items_db[skip : skip + limit]



resultJson = {"item_name": "Foo", "num" : 0,  } 

@app.get("/test2/")
async def test(num: int = 0, text: str="호호" ):
    print ( num , text ) 
    resultJson["num"]=num  
    resultJson["item_name"]=text
    return resultJson 

