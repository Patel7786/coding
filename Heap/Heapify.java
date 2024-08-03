package Heap;

public class Heapify {
    public void swap(int arr[], int index, int parent) {
        int temp = arr[index];
        arr[index] = arr[parent];
        arr[parent] = temp;
    }

    void heapify(int arr[], int size, int i) {

        System.out.println("heapify ______");
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;
        if (left < size && arr[largest] < arr[left])
            largest = left;
        if (right < size && arr[largest] < arr[right])
            largest = right;
        if (largest != i) {
            swap(arr, largest, i);
            heapify(arr, size, largest);
        }

    }

    void output(int arr[], int size) {
        for (int i = 1; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Heapify h = new Heapify();
        int brr[] = new int[] { -1, 1, 3, 4, 5, 6, 7, 9, 2 };
        int n = brr.length;
        for (int i = n / 2; i > 0; i--)
            h.heapify(brr, n, i);
        h.output(brr, n);
    }
}
