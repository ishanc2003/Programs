#include<stdio.h>

int selection_sort(int[], int);

int main() {
	int i, n;
	printf("Ishan Chakrabarti\n21BCE0669\n");
	scanf("%d", &n);
	int a[n];
	for(i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	selection_sort(a, n);
}

int selection_sort(int a[], int n) {
    int p, q, m, t;
    for(p = 0;p < n - 1; p++) {
        m = p;
        for(q = p + 1; q < n; q++) {
            if (a[q] > a[m]) {
                m = q;
        	}
    	}
    	t = a[m];
        a[m] = a[p];
		a[p] = t;
	}
	for(p = 0; p < n; p++) {
		printf("%d\t", a[p]);
	}
}
