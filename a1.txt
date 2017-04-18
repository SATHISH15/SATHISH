#include<stdio.h>
int main()
{
int n;
scanf("%d",&n);
if(n>=0)
printf("%d",n%100);
else
printf("0");
return 0;
}
