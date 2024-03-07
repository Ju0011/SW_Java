#!/usr/bin/env python
# coding: utf-8

# In[1]:


from fastapi import FastAPI

app = FastAPI()
@app.get("/items/{item_id}")
async def read_item(item_id):
    return {"item_id" : item_id}

