// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        int[] bills = {5, 5, 5, 10, 20};
//        lemonadeChange(bills);
        int[]  bills = new int[]{5, 5, 10, 10, 20};
        lemonadeChange(bills);

    }

    public static boolean lemonadeChange(int[] bills) {

        int sum = 0;
        int transaction = 5;
        int change = 0;
        int count = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                sum = sum + bills[i];
                System.out.println("true");
                count++;
                // return true;

            }
//            System.out.println("Sum = " + sum);
            if (bills[i] == 10) {
                change = bills[i] - transaction;
                sum = sum - change; // - 2 -$5 = $10
                sum = sum + bills[i]; // $10 + $10 = $20
                System.out.println("true");
                count++;

            } else if (bills[i] == 20) {
                change = bills[i] - transaction;
                sum = sum - change; // $20 - $15 = $5
                System.out.println("Sum = " + sum);
                System.out.println("true");
                count++;

            }


        }
        if (count == bills.length){
            return true;
        }

        return false;
    }
}
