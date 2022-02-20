import java.util.Arrays;

public class Median {

    private Median(){
    }

    public static float median(int[] array){
        int[] arrayInt = Arrays.copyOf(array,array.length);
        Arrays.sort(arrayInt);
        int n = arrayInt.length;
        if (n % 2 == 1){
            return arrayInt[(n + 1) / 2 - 1];
        } else {
            float a = arrayInt[n / 2 - 1] + arrayInt[n / 2];
            return  a / 2;
        }
    }

     public static double median(double[] array){
         double[] arrayDouble = Arrays.copyOf(array,array.length);
        Arrays.sort(arrayDouble);
        int n = arrayDouble.length;
        if (n % 2 == 1){
            return arrayDouble[(n + 1) / 2 - 1];
        } else {
            return (arrayDouble[n / 2 - 1] + arrayDouble[n / 2]) / 2;
        }
    }
}
