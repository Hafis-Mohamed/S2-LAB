import pymongo

conn=pymongo.MongoClient("mongodb://localhost:27017/")

db=conn["Student"]

col=db["marks"]

# data=[
#     {"id":0,"roll":1,"name":"Hafis","m1":45,"m2":46,"m3":30},
#     {"id":1,"roll":2,"name":"Aafthab","m1":47,"m2":48,"m3":35},
#     {"id":2,"roll":3,"name":"Ajmal","m1":44,"m2":48,"m3":36}
# ]

# col.insert_many(data)

# j=0
# for i in col.find({"name":{"$regex":"ma"}}):
#     total=i["m1"]+i["m2"]+i["m3"]
#     print(i["name"],total)
#     j+=1
# print("Total No of Students:",j)


# col.update_one({"roll":1},{"$set":{"m1":24}})

# col.delete_many({})