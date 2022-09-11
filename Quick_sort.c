#include <stdio.h>

int partition(int a[], int low, int high) {
  	int pivot, i, j, t;
  	pivot = a[high];
  	i = (low - 1);
	for(j = low; j < high; j++) {
    	if (a[j] <= pivot) {
      		i++;
      		t = a[i];
      		a[i] = a[j];
    		a[j] = t;
    	}
  	}
  	t = a[i + 1];
  	a[i + 1] = a[high];
  	a[high] = t;
  	return (i + 1);
}

int quick_sort(int a[], int low, int high) {
  	int i, p;
	if(low < high) {
    	p = partition(a, low, high);
		quick_sort(a, low, p - 1);
		quick_sort(a, p + 1, high);
	}

}

int main() {
	printf("Ishan Chakrabarti\n21BCE0669\n");
	int i, n;
	scanf("%d", &n);
  	int a[n];
  	for(i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
  	quick_sort(a, 0, n);
  	for(i = 0; i < n; ++i) {
    	printf("%d\t", a[i]);
	}
}

