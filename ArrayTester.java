
/**
 * Write a description of class ArrayTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayTester
{
    public static void main(String[] args) {
        int[][] arr1 = {{1, 1, 1}, {1, 1, 1}};
        ArrayCalc ac = new ArrayCalc();
        double avg = ac.averageArray(arr1);
        System.out.println("The average is " + avg);
        
        int[] sum = ac.sumColumns(arr1);
        for (int thing : sum) {
            System.out.println("The sum is " + sum);
        }
    }
}
