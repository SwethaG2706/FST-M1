list1 = [1, 2, 3, 4, 5]
list2 = [6, 7, 8, 9, 10]

print("First list", list1)
print("Second list", list2)

list3 = []

for num in list1:
    if (num % 2 != 0):
        list3.append(num)

for num in list2:
    if (num % 2 == 0):
        list3.append(num)

print("result list is: ")
print(list3)



