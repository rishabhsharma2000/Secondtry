import java.util.ArrayList;
import java.util.List;

public class RetuturnMissingList {
    public static void main(String[] args) {

        int arr[] = { 2, 4, 2, 5, 7, 3, 7, 1, 3 };
        System.out.println(findMissingElement(arr));
    }

    static List<Integer> findMissingElement(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                list.add(index + 1);
            }
        }
        return list;

    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
