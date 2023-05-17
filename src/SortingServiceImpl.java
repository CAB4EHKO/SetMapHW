import java.util.*;

public class SortingServiceImpl implements SortingService {
    @Override
    public void printOddNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
    @Override
    public void printUniqueEvenNumbersInAscendingOrder(List<Integer> numbers) {
        Set<Integer> uniqueEvenNumbers = new TreeSet<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                uniqueEvenNumbers.add(number);
            }
        }
        for (int number : uniqueEvenNumbers) {
            System.out.println(number);
        }
    }
    @Override
    public void printUniqueStrings(List<String> strings) {
        Set<String> uniqueStrings = new HashSet<>(strings);
        for (String string : uniqueStrings) {
            System.out.println(string);
        }
    }
    @Override
    public void printDuplicateStringsCount(List<String> strings) {
        Map<String, Integer> stringCount = new HashMap<>();
        for (String string : strings) {
            Integer count = stringCount.getOrDefault(string, 0);
            stringCount.put(string, count + 1);
        }
        for (Map.Entry<String, Integer> entry : stringCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

