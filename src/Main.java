
import java.util.Arrays;

/**
 * Клас для роботи з матрицями.
 */
public class Main {

    /**
     * Створює нову матрицю, де останній стовпець містить суми елементів рядків вихідної матриці.
     *
     * @param matrix Вхідна матриця розміру N x M.
     * @return Нова матриця розміру N x (M + 1), де останній стовпець містить суми рядків.
     */
    public static int[][] createNewMatrixWithRowSums(int[][] matrix) {
        int rows = matrix.length; // Кількість рядків
        int columns = matrix[0].length; // Кількість стовпців

        // Створюємо нову матрицю з одним додатковим стовпцем
        int[][] newMatrix = new int[rows][columns + 1];

        for (int i = 0; i < rows; i++) {
            // Копіюємо весь рядок у нову матрицю
            System.arraycopy(matrix[i], 0, newMatrix[i], 0, columns);
            // Останній стовпець містить суму елементів рядка
            newMatrix[i][columns] = Arrays.stream(matrix[i]).sum();
        }

        return newMatrix;
    }
}
