import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class for Assignment 2
 */
public class HappyNumbers {
    public static void main(String args[])
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        int chosenNumber = readNumber();
        numbers.add(chosenNumber);
        System.out.println("input: " + numbers.get(0));
        System.out.print("output: ");
        isHappyNumber(chosenNumber, numbers);
    }

    /**
     * Method to get the users number as input
     * @return user's number
     */
    private static int readNumber()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int chosenNumber = reader.nextInt();
        while(chosenNumber < 0)
        {
            System.out.println("Error : " + chosenNumber + " is negative please enter a positive number");
            chosenNumber = reader.nextInt();
        }
        return chosenNumber;
    }

    /**
     * Method to test if a number is happy
     * @param nb number to test
     * @param numbers array of numbers containing the previous results
     */
    public static void isHappyNumber(int nb, ArrayList<Integer> numbers)
    {
        System.out.print(nb + ", ");
        String tmp = Integer.toString(nb);
        char[] chars = tmp.toCharArray();
        int total = 0;
        for (char c : chars)
        {
            int t = Character.getNumericValue(c);
            total += t*t;
        }

        if (numbers.contains(total)) {
            System.out.println(total + " - Not Happy");
            return;
        }

        else if (total == 1) {
            System.out.println(total + " - Happy");
            return;
        }

        numbers.add(total);
        isHappyNumber(total, numbers);
    }
}
