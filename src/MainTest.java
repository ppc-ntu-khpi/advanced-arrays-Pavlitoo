
import java.util.Arrays;

public class MainTest {

    public static void main(String[] args) {
        public static void main(String[] args) {
        // Вхідна матриця для тестування
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Створюємо нову матрицю з сумами в останньому стовпці
        int[][] newMatrix = MatrixUtils.createNewMatrixWithRowSums(matrix);

        // Виводимо нову матрицю
        System.out.println("Нова матриця з сумами в останньому стовпці:");
        for (int[] row : newMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
