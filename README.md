# Опис проекту

Цей проект містить Java-клас, який приймає двовимірну матрицю (N x M) і створює нову матрицю, де останній стовпець містить суми елементів рядків вихідної матриці.

## Структура проекту

Проект складається з двох класів:
- `MatrixUtils`: містить метод для створення нової матриці з сумами в останньому стовпці.
- `MatrixUtilsTest`: містить код для тестування функціональності класу `MatrixUtils`.

## Реалізація

Метод `createNewMatrixWithRowSums` приймає вхідну матрицю `matrix` розміром `N x M` і повертає нову матрицю розміром `N x (M + 1)`, де кожен рядок містить елементи вихідної матриці, а останній стовпець - суму елементів цього рядка.

## Приклад використання

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

int[][] newMatrix = MatrixUtils.createNewMatrixWithRowSums(matrix);

System.out.println("Нова матриця з сумами в останньому стовпці:");
for (int[] row : newMatrix) {
    System.out.println(Arrays.toString(row));
}
```

## Тестування проекту

Для тестування проекту:

- Запустіть `MainTest` з IDE або командного рядка.
- Переконайтесь, що результати відповідають очікуванням. Приклад виходу для вище зазначеної матриці:

```
   [1, 2, 3, 6]
   [4, 5, 6, 15]
   [7, 8, 9, 24]

```

## Можливі поліпшення

Проект можна розширити наступним чином:

- Додати методи для обчислення сум стовпців.
- Створити інші корисні функції для роботи з матрицями.
- Додати підтримку більш складних типів даних (наприклад, числа з плаваючою комою).

## Вимоги

- Java Development Kit (JDK) версії 8 або пізнішої.
- Середовище для запуску та компіляції Java.
