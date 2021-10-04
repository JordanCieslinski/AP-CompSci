public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println();

        for (int i = 5; i >= 0; i--) {
            for (int j = i + 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int count = 0;

        for (int i = 7; i >= 1; i--) {
            count++;
            for (int j = i + 1; j <= 8; j++) {
                System.out.print(count);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 3; i++) {

            for (int j = 0; j <= 9; j++) {
                for (int k = 1; k <= 3; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }


        System.out.println();
        int num = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 1; j <= i+1; j++) {

                num = (int) Math.pow(10, i);

                System.out.print(num + "");

            }
            System.out.println();


        }


    }

}