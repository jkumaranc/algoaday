## Problem 1: Sum of numbers in string
Given a string str containing alphanumeric characters, calculate sum of all numbers present in the string.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a string containing alphanumeric characters.

Output:
Print the sum of all numbers present in the string.

Constraints:
1<=T<=105
1<=length of the string<=105

Example:
Input:
4
1abc23
geeks4geeks
1abc2x30yz67
123abc

Output:
24
4
100
123

Explanation:
Testcase 1: 1 and 23 are numbers in the string which is added to get the sum as 24.
Testcase 4: 123 is a single number, so sum is 123.
Source : https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string/0

### Solution
### Java Class : `org.iamjk.algoaday.SumOfNumbersInString.java`
### Test Class : `org.iamjk.algoaday.SumOfNumbersInStringTest.java`

## How to run
`cd java`

`mvn clean test`
