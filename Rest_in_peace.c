#include<stdio.h>
int main()
{
	int t;

	scanf("%d",&t);
	while(t>0)
	{
		int n,c=0,b;
		scanf("%d",&n);
		if(n%21==0)
		{
        c++;
		}
		else
		{
		while(n!=0)
		{
        b=n%100;
		if(b==21)
		{
			c++;
			break;
		}
		n=n/10;
		}
		}
        if(c==0)
		{
			printf("The streak lives still in our heart!");
		}
		else
		{
			printf("The streak is broken!");
		}
		printf("\n");
		t--;
	}
	return 0;
}