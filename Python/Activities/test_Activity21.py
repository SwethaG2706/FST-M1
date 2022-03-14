import difflib
from re import sub
import pytest

#Addition test

def test_addition():

    num1 = 10
    num2 = 20

    sum = num1 + num2

    assert sum == 30

#Subtraction test

def test_subtraction():

    num1 = 10
    num2 = 20

    diff = num2 - num1

    assert diff == 10

    # Multiplication test
def test_multiplication():
  
	# Initialize two numbers
	num1 = 5
	num2 = 20
    
	# Multiply them
	prod = num1 * num2
 
	# Assertion
	assert prod == 100
 
# Division test
def test_division():
  
	# Initialize two numbers
	num1 = 100
	num2 = 5
    
	# Divide them
	quot = num1 / num2
 
	# Assertion
	assert quot == 20








