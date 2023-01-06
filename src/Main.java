public class Main {
    public static void main(String[] args) {
        int[] happyNew2023Year = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < happyNew2023Year.length; i++) {
            System.out.print(happyNew2023Year[i]);
            if (i != happyNew2023Year.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < happyNew2023Year.length; i++) {
            if (happyNew2023Year[i] % 2 == 0) {
                happyNew2023Year[i] += 1;
            }
            System.out.print(happyNew2023Year[i]);
            if (i != happyNew2023Year.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 3; i <= 7; i++) {
            if (happyNew2023Year[i] % 2 != 0 && i % 2 != 0) {
                happyNew2023Year[i] -= 1;
            }
            System.out.print(happyNew2023Year[i]);
            if (i != 7) {
                System.out.print(", ");
            }
        }
    }
}