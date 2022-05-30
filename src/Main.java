public class Main {
    public static void main(String[] args) {
        int [] arr = generateRandomArray ();
        int sum = 0;
        for (int j : arr) {
            sum += j;
//            System.out.println(j);
        }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int maxSum = - 1;
        int minSum = 2_000_000;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей.");

        double averageSum = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }


}