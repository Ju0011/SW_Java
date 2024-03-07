#!/usr/bin/env python
# coding: utf-8

# In[1]:


# main.py 파일로 저장한 후, 아래와 같이 terminal에서 실행 
# uvicorn main:app --reload

from fastapi import FastAPI
app = FastAPI()

@app.get("/")
async def root():
    return {"message": "Hello World"}

