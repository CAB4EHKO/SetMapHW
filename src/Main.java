import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SortingService sortingService = new SortingServiceImpl();
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        sortingService.printOddNumbers(nums);
        System.out.println("==============");

        sortingService.printUniqueEvenNumbersInAscendingOrder(nums);
        System.out.println("==============");

        sortingService.printUniqueStrings(strings);
        System.out.println("==============");

        sortingService.printDuplicateStringsCount(strings);
        System.out.println("==============");
    }
}