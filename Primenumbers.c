
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
