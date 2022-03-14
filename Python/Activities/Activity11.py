fruit_shop = {
    "apple": 10,
    "banana": 5,
    "cherry": 3
}

key_to_check = input("What are you looking for? ").lower()
 
if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")