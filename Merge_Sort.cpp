#include <stdio.h>
int merge_sort(int[], int, int);
int merge_arrays(int[], int, int, int);

int main() {
	printf("Ishan Chakrabarti\n21BCE0669\n");
	int i, n;
	scanf("%d", &n);
  	int a[n];
  	for(i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
  	merge_sort(a, 0, n);
	for (int i = 0; i < n; i++) {
    	printf("%d ", a[i]);
	}
}

int merge_sort(int a[], int left, int right) {
	int mid;
  	if (left < right) {
    	mid = (int)(left + right) / 2;
    	merge_sort(a, left, mid);
    	merge_sort(a, mid + 1, right);
    	merge_arrays(a, left, mid, right);
  	}
}

int merge_arrays(int a[], int left, int mid, int right) {
	int p, q, i, j, k;
	p = (mid - left) + 1;
  	q = right - mid;
  	int X[p], Y[q];
	for(i = 0; i < p; i++) {
    	X[i] = a[left + i];
	}
  	for(j = 0; j < q; j++) {
    	Y[j] = a[mid + 1 + j];
	}
	i = 0;
  	j = 0;
  	k = left;
  	while (i < p && j < q) {
    	if (X[i] <= Y[j]) { //Merge Sort in ascending order
      		a[k] = X[i];
      		i++;
    	} 
		else {
      		a[k] = Y[j];
      		j++;
    	}
    	k++;
  	}
  	while (i < p) {
    	a[k] = X[i];
    	i++;
    	k++;
  	}
  	while (j < q) {
    	a[k] = Y[j];
    	j++;
    	k++;
  	}
}


