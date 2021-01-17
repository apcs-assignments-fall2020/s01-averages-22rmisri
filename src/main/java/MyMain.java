public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double total = 0;
        double c = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                total = total + mat[row][col];
                c = c + 1;
            }
        }
        return total/c;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        double median;
        int c = 0;
        int size = mat.length * mat[0].length;
        double [] arr = new double [size];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                arr[c] = mat[row][col];
                c = c + 1;
            }
        }
        if (arr.length % 2 != 0) {
            int index1 = arr.length/2;
            median = arr[index1];
        }
        else {
            int index2 = arr.length/2;
            int index3 = index2 + 1;
            median = (arr[index2-1] + arr[index3-1]) / 2; 
        }
        return median;
    }

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        int size = mat.length * mat[0].length;
        int c1 = 0;
        double [] arr = new double [size];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                arr[c1] = mat[row][col];
                c1 = c1 + 1;
            }
        }
        int c2 = 0;
        double mode = 0.0;
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c = c + 1;
                }
            }
            if (c > c2) {
                c2 = c;
                mode = arr[i];
            }
        }
        return mode;
    }


    public static void main(String[] args) {
        double[][] m4 = {
        {1,  2,  2,  2,  6},
        {7,  9,  10, 11, 11},
        {11, 11, 17, 18, 20}
        };
        System.out.println(mean(m4));
        System.out.println(median(m4));
        System.out.println(mode(m4));
    }
}
