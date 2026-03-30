import pymongo

conn=pymongo.MongoClient("mongodb://localhost:27017/")

conn.admin.command('ping')

db=conn["College"]

col=db["Studlist"]

#QN1
# for i in col.find(
#     {"gender":"female"},
#     {"name":{"fname":1,"lname":1},"mark":1,"_id":0}):
#     print(i)

#QN2
# topper=col.find({"course":"MCA"}).sort({"mark":-1}).limit(1).next()
# print(topper)

#QN3
# for i in col.find({"grade":"A+","gender":"male"}):
#     print(i)

#QN4
# for i in col.find({"course":"Mechanical"}).sort({"mark":-1}).limit(3):
#     print(i)

#QN5
# for i in col.find({"mark":{"$gt":90}},{"name":1,"grade":1,"mark":1,"phone":1,"_id":0}):
#     print(i)

#QN6
# for i in col.find({"mark":{"$gt":80,"$lt":90}}):
#     print(i)

#QN7
# for i in col.find({"name.fname":{"$regex":"^V"}}):
#     print(i)

#QN8
# for i in col.find({"address.city":"Kollam"}):
#     print(i)

#QN9
# for i in col.find({"address.city": {"$nin": ["Kollam", "Thiruvananthapuram"]}}):
#     print(i)

#QN10
# for i in col.find({
#     "gender": "female",
#     "address.city": { "$in": ["Kollam", "Thiruvananthapuram"] }
# }):
#     print(i)