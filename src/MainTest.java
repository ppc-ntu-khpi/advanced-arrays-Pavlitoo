
import java.util.Arrays;

public class MainTest {

    public static void main(String[] args) {
        // Вхідна матриця для тестування
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Викликаємо метод для створення нової матриці з сумами рядків в останньому стовпці
        int[][] newMatrix = MatrixUtils.createNewMatrixWithRowSums(matrix);

        // Виводимо вихідну матрицю
        System.out.println("Вихідна матриця:");
        printMatrix(matrix);

        // Виводимо нову матрицю
        System.out.println("\nНова матриця з сумами в останньому стовпці:");
        printMatrix(newMatrix);
    }

    /**
     * Вивід двовимірної матриці на консоль.
     *
     * @param matrix Матриця для виводу.
     */
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
