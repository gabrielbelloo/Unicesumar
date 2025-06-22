#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct No {
    char nome[30];
    int idade;
    struct No* proximo;
} No;

void push(No** topo) {
    No* novo = (No*)malloc(sizeof(No));
    if (novo == NULL) {
        printf("Erro ao alocar memória!\n");
        return;
    }

    printf("Digite o nome: ");
    scanf(" %[^\n]", novo->nome);

    printf("Digite a idade: ");
    scanf("%d", &novo->idade);

    novo->proximo = *topo;
    *topo = novo;

    printf("Elemento inserido com sucesso!\n");
}

void pop(No** topo) {
    if (*topo == NULL) {
        printf("A pilha está vazia. Nada para remover.\n");
        return;
    }

    No* temp = *topo;
    printf("Removendo: Nome = %s | Idade = %d\n", temp->nome, temp->idade);

    *topo = temp->proximo;
    free(temp);
}

void imprimir(No* topo) {
    if (topo == NULL) {
        printf("A pilha está vazia\n");
        return;
    }

    printf("\nElementos na pilha:\n");
    No* atual = topo;
    while (atual != NULL) {
        printf("Nome: %s | Idade: %d\n", atual->nome, atual->idade);
        atual = atual->proximo;
    }
}

void retornaQuantidade(No** topo) {
	if (*topo == NULL) {
		printf("A pilha está vazia\n");
		return;
	}
	
	No* atual = *topo;
	int cont = 0;
	while (atual != NULL) {
		cont = cont + 1;
		atual = atual->proximo;
	}
	printf("A pilha contém %d elementos", cont);
}

int main() {
    No* topo = NULL;
    int opcao;

    do {
        printf("\n\nMenu PILHA1\n\n");
        printf("1 - Push\n");
        printf("2 - Pop\n");
        printf("3 - Imprimir\n");
        printf("4 - Verificar quantidade de elementos\n");
        printf("0 - Sair\n");
        printf("Escolha uma opção: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
                push(&topo);
                break;
            case 2:
                pop(&topo);
                break;
            case 3:
                imprimir(topo);
                break;
            case 4:
            	retornaQuantidade(&topo);
            	break;
            case 0:
                printf("Encerrando o programa\n");
                break;
            default:
                printf("Opção inválida\n");
        }

    } while (opcao != 0);

    while (topo != NULL) {
        pop(&topo);
    }

    return 0;
}
