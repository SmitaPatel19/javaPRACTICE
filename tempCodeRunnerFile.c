#include <stdio.h>

void Swap(int arr[2][10], int idx1, int idx2) {
    int temp = arr[1][idx1];
    int temp1 = arr[0][idx1];

    arr[1][idx1] = arr[1][idx2];
    arr[0][idx1] = arr[0][idx2];

    arr[1][idx2] = temp;
    arr[0][idx2] = temp1;
}

int partition(int arr[2][10], int st, int en) {
    int piv = arr[1][st];
    int piv1 = arr[0][st];

    int count = 0;

    for (int i = st; i <= en; i++) {
        if (piv >= arr[1][i]) {
            count++;
        }
    }

    int pivi = st + count;
    Swap(arr, st, pivi);

    int i = st;
    int j = en;
    while (i < pivi && j > pivi) {
        while (arr[1][i] <= piv) {
            i++;
        }
        while (arr[1][j] > piv) {
            j--;
        }
        if (i < pivi && j > pivi) {
            Swap(arr, i, j);
            i++;
            j--;
        }
    }
    return pivi;
}

void QuickSort(int arr[2][10], int st, int en) {
    if (st < en) {
        int pividx = partition(arr, st, en);
        QuickSort(arr, st, pividx - 1);
        QuickSort(arr, pividx + 1, en);
    }
}

int Activity(int arr[2][10], int n) {
    // You haven't implemented this function yet
    return 0;
}

int main() {
    int n;
    printf("Enter number of activities : ");
    scanf("%d", &n);

    if (n <= 0 || n > 10) {
        printf("Invalid number of activities. Please enter a number between 1 and 10.\n");
        return 1; // Exit with an error code
    }

    int arr[2][10];
    printf("Enter start and end time of activities : \n");

    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[0][i]);
        scanf("%d", &arr[1][i]);
    }

    printf("Entered Activities are : \n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < n; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    QuickSort(arr, 0, n - 1);

    printf("After sorting, Activities are : \n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < n; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}
