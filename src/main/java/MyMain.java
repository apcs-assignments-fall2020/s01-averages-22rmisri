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
    
       
        return -1.0;
    }


    public static void main(String[] args) {
     
      
       
       // Write some code here to test your methods!
    }
}
