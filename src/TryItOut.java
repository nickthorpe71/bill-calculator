import java.util.Arrays;

public class TryItOut {
    public static String highAndLow(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("-8 -3 -5 -4 -2 -1 0 0 -9 -4 -7 -4 -4"));
    }
}
