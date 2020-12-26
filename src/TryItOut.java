import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TryItOut {

    public static String whoLikesIt(String... names) {
        if(names.length < 1)
            return "no one likes this";

        else if(names.length == 1)
            return names[0] + " likes this";

        else if(names.length == 2)
            return names[0] + " and " + names[1] + " like this";

        else if(names.length == 3)
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";

        else
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";

    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt()); // "no one likes this"
        System.out.println(whoLikesIt("Peter")); // "Peter likes this"
        System.out.println(whoLikesIt("Jacob", "Alex")); // "Jacob and Alex like this"
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max")); // "Alex, Jacob and 2 others like this"
    }
}
