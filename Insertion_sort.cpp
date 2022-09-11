#include<stdio.h>

int insertion_sort(int[], int);

int main() {
	printf("Ishan Chakrabarti\n21BCE0669\n");
	int i, n;
	scanf("%d", &n);
	int a[n];
	for(i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	insertion_sort(a, n);
}

insertion_sort(int a[], int n) {
	int p, q, t, x;
	for(p = 1; p < n; p++) {
		x = a[p];
		q = p - 1;
		while(x > a[q] && x >= 0) { //Insertion Sort in Descending Order
			a[q + 1] = a[q];
			--q;
		}
		a[q + 1] = x;
	}
	for( p = 0; p < n; p++) {
		printf("%d\t", a[p]);
	}
}
