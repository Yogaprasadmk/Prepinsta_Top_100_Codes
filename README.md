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


```
leap = int(input("Enter Leap Year"))
if(leap%4==0):
    print("Leap Year")
else:
    print("Not a leap year")
```
