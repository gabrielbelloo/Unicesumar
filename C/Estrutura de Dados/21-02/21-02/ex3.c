#include <stdio.h>

int main(){
	
	int num, x, y;
	
	do {
		printf("Digite um numero de 5 a 20: ");
		scanf("%d",&num);
		
	}while (num<5 || num> 20);
	
	y=num;
	
	for (x=0; x<=num; x++ && y--){
		printf("%d  ", x);
	    printf("%d  ", y);
}
	
	return 0;
}
