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
