import pymongo

conn=pymongo.MongoClient("mongodb://localhost:27017/")
# print(conn.list_database_names())
db=conn["Student"]
#print(db.list_collection_names())
col=db["marks"]
# data=[0
#     {"roll":1,"name":"Aafthab","marks":99},
#     {"roll":2,"name":"Hafis","marks":99},
#     {"roll":3,"name":"Ajmal","marks":100},
#     {"roll":4,"name":"Abhinav","marks":100},
#     {"roll":45,"name":"Ashwin","marks":99}
#     ]
# col.insert_many(data)

# for i in col.find():
#     print(i)


# print(col.find_one())

# print(col.find_one({"roll":3},{"name","marks"}))

# for i in col.find({},{"name":1,"_id":0}).sort({"name":-1}):
#     print(i["name"])