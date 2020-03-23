#include<stdio.h>
int main(void)
{
    int n,d;
    scanf("%d%d",&n,&d);
    int A[n];
    for(int i=0;i<n;i++)
        scanf("%d",&A[i]);
    for(int i=d;i<n;i++)
        printf("%d ",A[i]);
    for(int i=0;i<d;i++)
        printf("%d ",A[i]);
}