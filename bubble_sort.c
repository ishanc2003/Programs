#include<stdio.h> 
int bubble_sort(int[], int);
int main() {
	int i, n;
	printf("Ishan Chakrabarti\n21BCE0669\n");
	scanf("%d", &n);
	int a[n];
	for(i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	bubble_sort(a, n);
}
bubble_sort(int a[], int n) {
	int i, j, t;
	for(i = 0; i < n; i++) {
		for(j = 0; j < n - 1; j++) {
			if(a[j] < a[j + 1]) { //Bubble Sort in Descending Order
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
		}
	}
	for(i = 0; i < n; i++) {
		printf("%d\t", a[i]);
	}
}
