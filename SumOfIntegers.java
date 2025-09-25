import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to stop):");
        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("done"))
                break;

            Integer num = Integer.parseInt(input);
            numbers.add(num);
        }

        int sum = 0;
        for (Integer n : numbers) {
            sum += n;
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum of integers = " + sum);

        sc.close();
    }
}
