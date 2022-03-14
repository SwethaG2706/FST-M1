from sqlite3 import Row
import pandas

dataframe = pandas.read_csv("sample.csv")

print("Full Data : ")
print(dataframe)

#Print values in Username column only
print("================")
print("Usernames")
print(dataframe["Usernames"])

#Print Username and Password in second Row
print("================")
print("Usernames:", dataframe["Usernames"][1], "|", "Password: ", dataframe["Passwords"][1])

	
#Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))
 
#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))