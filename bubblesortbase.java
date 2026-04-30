public class bubblesortbase {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 2};

        System.out.print("Original: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.print("Ordenado: ");
        printArray(arr);
    }
}