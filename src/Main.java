
import java.util.Arrays;

/**
 * Клас для роботи з матрицями.
 */
public class Main {

    /**
     * Створює нову матрицю, де останній стовпець містить суми елементів рядків вихідної матриці.
     *
     * @param matrix Вхідна матриця розміру N x M.
     * @return Нова матриця, де останній стовпець містить суми елементів рядків.
     */
    public static int[][] createNewMatrixWithRowSums(int[][] matrix) {
        // Кількість рядків та стовпців у вихідній матриці
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Створюємо нову матрицю з одним додатковим стовпцем
        int[][] newMatrix = new int[rows][columns + 1];

        // Заповнюємо нову матрицю значеннями вихідної матриці і додаємо суми рядків
        for (int i = 0; i < rows; i++) {
            // Копіюємо елементи з вихідної матриці в нову
            System.arraycopy(matrix[i], 0, newMatrix[i], 0, columns);
            // Останній стовпець містить суму елементів рядка
            newMatrix[i][columns] = Arrays.stream(matrix[i]).sum();
        }

        return newMatrix;
    }
}
