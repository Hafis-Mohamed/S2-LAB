def shownum(n):
    if n==0:
        return
    else:
        shownum(n-1)
    print(n)
shownum(5)