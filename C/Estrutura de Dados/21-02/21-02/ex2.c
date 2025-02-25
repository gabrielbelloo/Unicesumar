#include <stdio.h>

int main(){
	
	int y=20;
	
	for (int x=1; x<11; x++ && y--) {
		
		printf("%d ", x);
	    printf(" %d\n", y);
		
	}
	
	return 0;
}
