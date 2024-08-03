package Heap;

public class basicHeapOrepesations {
    int arr[] = new int[1000];
    int ind = 0;

    void output() {
        for (int i = 1; i <= ind; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void swap(int arr[], int index, int parent) {
        int temp = arr[index];
        arr[index] = arr[parent];
        arr[parent] = temp;
    }

    // max heap
    public void insert(int element) {
        ind++;
        arr[ind] = element;
        int index = ind;
        while (index > 1) {
            int parent = index / 2;
            if (arr[parent] < arr[index]) {
                swap(arr, parent, index);
                index = parent;
            } else
                break;
        }

    }

    public void delete() {
        if (ind == 0) {
            System.out.println("nothing to delete!!!!");
            return;
        }
        System.out.println("Delete Function invoked!!!! alert");
        arr[1] = arr[ind--];
        for (int i = 1; i <= ind / 2; i++) {
            int largest = 0;
            int left = 2 * i;
            int right = 2 * i + 1;
            if (arr[i] < arr[left]) {
                largest = left;
            }
            if (arr[i] < arr[right]) {
                largest = right;
            }

            if (largest != 0) {
                swap(arr, largest, i);
            } else
                break;
        }
    }

    // hepify

    public static void main(String[] args) {
        System.out.println("insert in heap");
        basicHeapOrepesations b = new basicHeapOrepesations();
        b.insert(1);
        b.insert(2);
        b.insert(4);
        b.insert(30);
        b.insert(3);
        b.output();
        b.delete();
        b.delete();
        b.output();

        b.output();

    }
}
