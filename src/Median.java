public class Median {


    private Median(){
    }

    public static float median(int[] array){
       int[] arrayInt = getIntSortIncrease(array);
        int n = arrayInt.length;
        if (n % 2 == 1){
            return arrayInt[(n + 1) / 2 - 1];
        } else {
            float a = arrayInt[n / 2 - 1] + arrayInt[n / 2];
            return  a / 2;
        }
    }

    public static double median(double[] array){
       double[] arrayDouble = getIntSortIncrease(array);
        int n = arrayDouble.length;
        if (n % 2 == 1){
            return arrayDouble[(n + 1) / 2 - 1];
        } else {
            return (arrayDouble[n / 2 - 1] + arrayDouble[n / 2]) / 2;
        }
    }

    private static int[] getIntSortIncrease(int[] arrayInt){
        for (int i = arrayInt.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arrayInt[j] > arrayInt[j + 1]){
                    int tmp = arrayInt[j];
                    arrayInt[j] = arrayInt[j + 1];
                    arrayInt[j + 1] = tmp;
                }
            }
        }
        return arrayInt;
    }

    private static double[] getIntSortIncrease(double[] arrayDouble){
        for (int i = arrayDouble.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arrayDouble[j] > arrayDouble[j + 1]){
                    double tmp = arrayDouble[j];
                    arrayDouble[j] = arrayDouble[j + 1];
                    arrayDouble[j + 1] = tmp;
                }
            }
        }
        return arrayDouble;
    }
}
