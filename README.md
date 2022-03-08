# Java_Project2

# Calculator API
## Usage
1. Start the application
2. Go to localhost/calculator/calculateX?input=a,b,c (replace X with 1 or 2, replace a,b,c with numbers)
3. Be happy with response

## calculate1 endpoint returns:
1. Minimal odd number (*minOdd*)
2. Sum of even numbers (*sumOfEven*)
3. List of odd numbers (*odds*)

## calculate2 endpoint returns:
1. List of squared numbers (*squared*)
2. Sum of even numbers (*sumOfEven*)
3. Average of positive numbers (*averageOfPositives*)

## API request examples
1. Request: http://localhost:8080/calculator/calculate1?input=1,2,3,4,5
    Response: {"minOdd":1,"sumOfEven":6,"odds":[1,3,5]}
2. Request: http://localhost:8080/calculator/calculate1?input=1,99
   Response: {"minOdd":1,"sumOfEven": null,"odds":[1,99]}
