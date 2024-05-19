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
