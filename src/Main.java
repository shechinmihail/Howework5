public class Main {

    public static void main(String[] args) {

        // Task 1

        int[] work = new int[3];
        work[0] = 1;
        work[1] = 2;
        work[2] = 3;

        double[] work2 = {1.57, 7.654, 9.986};

        float[] work3 = {3.6f, 65.4f, 23.45f, 76.77777f};

        // Task 2

        for (int i = 0; i < work.length; i++) {
            System.out.print(work[i]);
            if (i != work.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < work2.length; i++) {
            System.out.print(work2[i]);
            if (i != work2.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < work3.length; i++) {
            System.out.print(work3[i]);
            if (i != work3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        // Task 3

        for (int i = work.length-1; i>=0; i--) {
            System.out.print(work[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = work2.length-1; i >= 0; i--) {
            System.out.print(work2[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        System.out.println();

        for (int i = work3.length-1; i >= 0; i--) {
            System.out.print(work3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        // Task 4

        for (int i = 0; i < work.length; i++) {
            if (work[i] % 2 == 1) {
                work[i]++;
            }
            System.out.print(work[i]);
            if (i != work.length - 1) {
                System.out.print(", ");
            }
        }


    }

}