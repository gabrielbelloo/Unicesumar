#include <stdio.h>

int main(){
	
	int pessoas;
	float doacao, total;
	
	for (pessoas=0; pessoas<100 && total<7500; pessoas++){
		
		printf("Pessoa n %d, ira doar R$: ", pessoas+1);
		scanf("%f",&doacao);
		
		total=total+doacao;
	}  
	
		printf("\nMedia de doacao por pessoa = R$: %.2f", (total/pessoas));


return 0;
}
