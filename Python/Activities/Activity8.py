import numbers
from posixpath import split


numbers = list(input("Enter list of numbers: ").split(","))

firstElement = numbers[0]
# Get last element in list
lastElement = numbers[-1]
 
# Check if first and last element are equal
if (firstElement == lastElement):
    print(True)
else:
    print(False)