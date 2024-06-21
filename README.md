<h1><a href="https://prepinsta.com/top-100-codes/">Prepinsta_Top_100_Codes</a></h1>
<p>Below You will find some of the most important codes in languages like C, C++ and Java,Python. These codes are of prime importance for college semester exams and also for various online tests and interviews of the companies offering placements within varying range in LPA.These codes are very important since these will help you clear your basic concepts in various languages.</p>
<hr/>
<h3>Getting Started</h3>
<h4>Introduction to Top 100 codes</h4>
<br/>
<a href="https://youtu.be/fZO3ZttE6hE"><img src="https://github.com/Yogaprasadmk/Prepinsta_Top_100_Codes/assets/120255515/58e436f3-db88-4522-958e-f4bc656e0d1f"></a>
<hr/>

<h3>Question 1: Positive or Negative Numbers</h3>

```js
#include <stdio.h>
int main()
{
    int a;
    printf("Enter a:");
    scanf("%d",&a);
    if(a>0){
        printf("positive");
    }
    else if(a < 0){
        printf("negative");
    }
    else {
        printf("zero");
    }
    return 0;
}
```

<h3>Question 2: Even or odd numbers</h3>

```js
#include <stdio.h>

int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    if(n%2==0){
        printf("even");
    }
    else{
        printf("odd");
    }
return 0;
}
```

<h3>Question 3: Sum of first natural numbers</h3>

```js
#include<stdio.h>
int main(){
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int s;
    s = n * (n + 1) / 2;
    printf("The Sum of Natural Number: %d",s);
    return 0;
}
```

<h3>Question 4: Sum of Natural numbers</h3>

```js
#include<stdio.h>
int main(){
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int a;
    a = n * (n + 1) / 2;
    printf("The Sum of Natural Number: %d",a);
    return 0;
}
```

<h3>Question:5 Sum of given range number</h3>

```js
print("Enter N:")
N = int(input())
print("Enter S:")
S = int(input())
sum = 0;
for i in range(N,S):
    sum = sum + i

print(sum)
```
<h3>Question 6:Greatest of two numbers</h3>

```js
print("enter a:")
a= int(input())
print("Enter b:")
b = int(input())
if(a>b):
print("a is greater")
else:
print("b is greater")
```

<h3>Question 7: Greatest of three number</h3>

```js
#include <stdio.h>

int main()
{
    int a,b,c;
    printf("Enter A:");
    scanf("%d",&a);
    printf("Enter B:");
    scanf("%d",&b);
    printf("Enter C:");
    scanf("%d",&c);
    if(b<a && c<a){
        printf("A is greater");
    }
    else if(a<b && c<b){
        printf("B is greater");
    }
    else{
        printf("C is greater");
    }
    return 0;
}
```

<h3>Question 8: LeapYear or not</h3>

```js
leap = int(input("Enter Leap Year"))
if(leap%4==0):
    print("Leap Year")
else:
    print("Not a leap year")
```

<h3>Question 9: Prime Numbers</h3>

```js

#include <stdio.h>

int main()
{
    int n;
    printf("Enter N:");
    scanf("%d",&n);
    int divide;
    printf("Enter Div:");
    scanf("%d",&divide);
    while(divide<n)
    {
        if(n%divide==0)
        {
            printf("Not Prime");
            break;
        }
        else{
            divide = divide + 1;
            printf("Prime");
            break;
        }
    }
    return 0;
}
```
<h3>🌟FLowchart and Pseudocode for Primenumbers</h3>
<img src="https://github.com/Yogaprasadmk/Prepinsta_Top_100_Codes/assets/120255515/7145948a-bc56-40a6-a814-7f6baf3bfef4"/>
<h3><a href="https://youtu.be/AYcQ9ImSMws?si=DrO9RJTM-ueXiiHB">🚀Click here to Play Video</a></h3>

<h3>Questio 10:Sum of Digits</h3>

```js
public class Main{
    public static void main (String[] args) {
         int a = 123;
         int count = 0;
         int lastdigit = 0;
        while(a>0){
             
            lastdigit = a % 10;
            
            count = lastdigit + count;
            
            a = a/ 10;
        }
        System.out.println(count);
         
    }
}
```

<h3>🌟Pseudocode:</h3>
<img src="https://github.com/Yogaprasadmk/Prepinsta_Top_100_Codes/assets/120255515/01acaf73-7527-4152-8534-7f96fc29cfff">
<h3><a href="https://youtu.be/1xNbjMdbjug?si=fefk0KPGl0WQWQ-0">🚀Click here to Play Video</a></h3>


<h3>Question 11: Reverse Number</h3>

```js
public class ReverseNumber
{
	public static void main(String[] args) {
	    
	    int a = 6789;
	    int dup = 0;  // duplicate
	    int lastdigit = 0;
	    while(a>0){
	        lastdigit = a % 10;
	        dup = (dup * 10) + lastdigit;
	        a = a / 10;
      }
	    if(dup != a){
	        System.out.println("Reverse Number: "+ dup);
	    }
	    else{
	        System.out.println("Not a Reverse Number: "+ dup);
	    }
	}
}
```
<h3>Question 12: Palindrome Number</h3>

```js

public class Palindrome
{
	public static void main(String[] args) {
		int number = 1221;
		int dup = 0;
		int lastdigit = 0;
		int temp = number;
		while(temp > 0){
		    lastdigit = temp % 10;
		    dup = (dup * 10) + lastdigit;
		    temp = temp / 10;
		}
		if(number == dup){
		    System.out.println(dup + " is Palindrome");
		}
		else{
		    System.out.println(dup + "Is not Palindrome");
		}
	}
}
```

<h1>Question 13: Armstrong Number</h1>

```js
public class Main
{
	public static void main(String[] args) {
		int a = 153;
		int dup = a;
		int sum = 0;
		int lastdigit = 0;
		while (a>0){
		    lastdigit = a % 10;
		    sum = sum + (lastdigit* lastdigit * lastdigit);
		    a = a / 10;
		}
		if(sum == dup){
		    System.out.println("Armstrong nUmber");
		}
		else{
		    System.out.println("NOt Armstrong number");
		}
	}
}

```
<h3>Pseudocode</h3>
<img src="https://github.com/Yogaprasadmk/Prepinsta_Top_100_Codes/assets/120255515/be8bbc70-f3f2-48f7-ae05-1c335e53491c">
<h3><a href="https://youtu.be/1xNbjMdbjug?si=fefk0KPGl0WQWQ-0">🚀Click here to Play Video</a></h3>

<h1>Question 14:Perfect Number</h1>

```js

class Main{
    public static void main (String[] args) {
        int n = 6;
        int sum = 0;
        
// if we give zero in i value then it will become arithmetic exception because anything divided by 0 is infinite so we need to give value 1; 
	int  i= 1;
	while(i<=n/2){ // why here n/2 means we required value is 6 it will add the value the divided value 1+2+3  
            if(n%i==0){ // if we use for loop set condition as n/2 in initialization
                sum = sum + i;
            }
            i++;
        }
        if(n == sum) System.out.println("perfect number");
        else System.out.println("not perfect number");
        
    }
}
```

<h1>Question 15: Power of a number</h1>

```js
public class Main{
  public static void main(String args[]){
    int a = 5;
    int b = 2;
    System.out.println(Math.pow(a,b));
  }
}
```

<h1>Question 16: Harshaad Number</h1>

```js

import java.util.Scanner;
class Main{
public static void main(String args){
Scanner S = new Scanner (System.in);
System.out.println("Enter Number:");
int harshad  = S.nextInt();
int last = 0;
int dup = harshad;
int sum = 0;
while(harshad!=0){
last = harshad % 10;
sum = sum + last;
harshad = harshad / 10;
}
if(harshad%sum==0){
System.out.println("Harshaad Number");
}
else{
System.out.println("Not a Harshaad Number");
}
}

```
<h3>Concept:</h3>
<img src="https://github.com/Yogaprasadmk/Prepinsta_Top_100_Codes/assets/120255515/23307b3f-51bc-41e9-910a-e9a8a4290479" width=400 height=400/>

