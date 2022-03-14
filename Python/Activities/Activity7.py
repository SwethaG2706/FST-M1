import numbers


numbers = list(input("Enter a seq of comma separated values: ").split(", "))
sum = 0

for number in numbers:
    sum += int(number)

print(sum)