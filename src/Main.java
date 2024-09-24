import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Double> getRollingAverage(ArrayList<Integer> arr, int k) {
        List<Double> result = new ArrayList<>();
        int n = arr.size();

        for (int i = 0; i <= n - k; i++) {
            double sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr.get(j);
            }
            result.add(sum / k);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        int k = 2;

        List<Double> res = getRollingAverage(arr, k);
        System.out.println(res);
    }
}
