public class DivisibleBy2_3_5 {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        while (count < 5) {
            if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
