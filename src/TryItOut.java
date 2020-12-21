public class TryItOut {
    public static int nthPower(int[] array, int n) {
        int result = 1;
        if(n < array.length) {
            for (int i = 0; i < n; i++)
                result *= array[n];
            return result;
        }
        return -1;
    }

    public static String hydrate(String drinkString)
    {
        drinkString = drinkString.replaceAll("[^\\d]", " ");
        drinkString = drinkString.trim();
        drinkString = drinkString.replaceAll(" ", "");

        int total = 0;



        for(int i = 0; i < drinkString.length(); i++)
        {
            int num = Character.getNumericValue(drinkString.charAt(i));
            System.out.println(num);

            total += num;
        }

        return String.format("%d glass%s of water", total, total==1?"":"es");
    }

    public static void main(String[] args) {
        System.out.println(hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"));
    }
}
