import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int index = 0; index < array.length; index++) {
            if (index == array.length - 1) {
                System.out.println(array[index]);
                break;
            }
            System.out.print(array[index] + "," + " ");
        }
        System.out.println();

        double[] a = new double[]{1.57, 7.654, 9.986};
        for (int index = 0; index < a.length; index++) {
            if (index == a.length - 1) {
                System.out.println(a[index]);
                break;
            }
            System.out.print(a[index] + "," + " ");
        }
        System.out.println();

        int[] x = new int[3];
        x[0] = 4;
        x[1] = 5;
        x[2] = 8;
        for (int index = 0; index < x.length; index++) {
            if (index == x.length - 1) {
                System.out.println(x[index]);
                break;
            }
            System.out.print(x[index] + "," + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i]);
            if (i != 0){
            System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = x.length - 1; i >= 0; i--){
            System.out.print(x[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int index = 0; index < array.length; index++) {
            if(array[index] % 2 != 0 ){
               array[index] += 1;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}