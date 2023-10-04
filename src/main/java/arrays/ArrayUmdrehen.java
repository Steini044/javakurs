package arrays;

public class ArrayUmdrehen {
    public static void main(String[] args) {
        double[] numbers = new double[]{1,2,3};
        System.out.printf("%f, %f, %f%n",numbers[0], numbers[1], numbers[2]);
        reverse(numbers);
        System.out.printf("%f, %f, %f%n",numbers[0], numbers[1], numbers[2]);
    }

    public static void reverse(double[] numbers) {
        int first = 0;
        int last = numbers.length - 1;

        while(first < last) {
            double swap = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = swap;
            first++;
            last--;
        }
    }
}
