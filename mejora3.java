public class mejora3 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int comparaciones = 0;
        int intercambios = 0;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++;

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambios++;
                }
            }
        }

        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {9, 4, 6, 2, 7};

        System.out.print("Original: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.print("Ordenado: ");
        printArray(arr);
    }
}