// Online C compiler to run C program online
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
struct stack{
    int top;
    unsigned capacity;
    int* array;
};
struct stack* createStack(unsigned capacity){
    
   struct stack* stack= (struct stack*)malloc(sizeof(struct stack));
    stack->capacity = capacity;
    stack->array = (int*)malloc(stack->capacity * sizeof(int));
    stack->top = -1;
}
int isFull(struct stack* stack){
    return stack->top == stack->capacity-1;
}
int isEmpty(struct stack* stack){
    return stack->top == -1;
}
void peek(struct stack* stack){
    if(isEmpty(stack)){
        printf("stack is empty\n");
    }
    printf("top element of stack %d \n",stack->array[stack->top]);
}
int pop(struct stack* stack){
    if(isEmpty(stack)){
        return INT_MIN;
    }
    return stack->array[stack->top--];
}
void push(struct stack* stack , int element){
    if(isFull(stack)){
        printf("stack is full can't add more elements\n ");
    }
    stack->array[++stack->top] = element;
    printf("%d element added in stack\n",element);
}
void display(struct stack* stack){
    if(isEmpty(stack)){
        printf("stack is empty\n");
    }
    int n = stack->top;
    for(int i = 0;i<=n;i++){
        printf("%d ",stack->array[i]);
    }
}
int main() {
    struct stack* stk = createStack(5);
    push(stk,10);
    push(stk,20);
    push(stk,30);
    push(stk,40);
    push(stk,50);
    printf("%d popped\n",pop(stk));
    display(stk);
    return 0;
}