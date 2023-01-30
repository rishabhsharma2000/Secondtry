
public class FindMissingElement {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 0 };
        System.out.println(missingElement(arr));
    }

    public static int missingElement(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j)
                return j;
        }
        return arr.length;
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
