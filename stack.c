#include<stdio.h>
#define max 10

void push();
int pop();
int peek();
void display();

int stack[max], top = -1;

void main() {
	int item, choice, x = 1;
	while(x == 1) {
		printf("\n\nAvailable Operations: \n\t1. Push\n\t2. Pop\n\t3. Peek\n\t4. Display\n\t5. Exit\n\t\n\tChoice: ");
		scanf("%d", &choice);
		switch(choice) {
			case 1:
				push(); 
				break;
			case 2: 
				pop();
				break;
			case 3:
				peek(); 
				break;
			case 4:
				display();
				break;
			case 5:
				printf("\n\nExiting.....\nThank You!!");
				x = 0;
				break;
				exit(1);
			default: 
				printf("\n\t\tInvalid Input!");
		}
	}
}

void push() {
	if(top == max - 1) {
		printf("\n\t\t Stack Overflow");
		return;
	}
	else {
		int item;
		printf("\n\t\tEnter an item to push onto stack: ");
		scanf("%d", &item);
		top++;
		stack[top] = item;
	}
}

int pop() {
	int item;
	if(top == -1) {
		printf("\n\t\tStack Underflow");
	}
	else {
	item = stack[top];
	top--;
	printf("\n\t\tThe item popped from the top of the stack is: %d", item);
	}
}

int peek() {
	int item;
	if(top == -1) {
		printf("\n\t\tEmpty Stack");
	}
	else {
		item = stack[top];
	printf("\n\t\tThe item at the top of the stack is: %d", item);
	}
}

void display() {
	int pos;
	if(top == -1) {
		printf("\n\t\tEmpty Stack");
	}
	else {
		printf("\n\t\tStack:");
		for(pos = top; pos >= 0; pos--) {
		printf("\n\t\t%d", stack[pos]);
		}
	}
}
