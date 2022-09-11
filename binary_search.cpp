#include<stdio.h>
int binary_search(int[], int , int);
int main() {
	printf("Ishan Chakrabarti\n21BCE0669\n");
	int i, x, n;
	scanf("%d", &n);
	int a[n];
	for(i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	scanf("%d", &x);
	binary_search(a, n, x);
}
binary_search(int a[], int n, int x) {
	int low = 0, high = n, mid, flag = 0, i;

	while(low <= high) {
		mid = (int)(low + high) / 2;
		if(a[mid] == x) {
			flag++;
			break;
		}
		else if(a[mid] > x) {
			high = mid - 1;
		}
		else if(a[mid] < x) {
			low = mid + 1;
		} 
	}
	if(flag == 0) {
		printf("Not Found.");
	}
	else {
		printf("Found");
	}
}
