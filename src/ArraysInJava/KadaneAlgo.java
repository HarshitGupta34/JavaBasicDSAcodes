package ArraysInJava;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {1, 2, -5, -2, 5, -3};

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0, tempStart = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Start index: " + start);
        System.out.println("End index: " + end);
    }
}
