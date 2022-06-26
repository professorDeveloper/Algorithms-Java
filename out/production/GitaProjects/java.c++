#include <stdio.h>

int main(void)
{
int a[11];
int n;

printf("N: ");
scanf("%i",&n);

int i;
for (i=0; i<n; ++i){
printf("a[%i] : ",i+1);
scanf("%i",&a[i]);
}

int num=1;

for (i=1;i<n;++i){
if (a[i-1]!=a[i]){
++num;
}
}
printf("%i\n",num);
return 0;
}