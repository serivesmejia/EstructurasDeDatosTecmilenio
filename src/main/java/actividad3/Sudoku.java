package actividad3;

public class Sudoku {
    private static final int N = 9;

    // Verifica si se puede colocar un número
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Revisar fila y columna
        for (int x = 0; x < N; x++) {
            if (board[row][x] == num || board[x][col] == num) return false;
        }

        // Revisar subcuadro 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) return false;
            }
        }

        return true;
    }

    // Resolver el sudoku usando backtracking
    public static boolean solveSudoku(int[][] board, int row, int col) {
        // Si terminamos todas las filas, el sudoku está resuelto
        if (row == N) return true;

        // Si llegamos al final de la columna, pasamos a la siguiente fila
        if (col == N) return solveSudoku(board, row + 1, 0);

        // Saltar las celdas que ya están llenas
        if (board[row][col] != 0) {
            return solveSudoku(board, row, col + 1);
        }

        // Intentar con números del 1 al 9
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;

                if (solveSudoku(board, row, col + 1)) return true;

                // backtracking
                board[row][col] = 0;
            }
        }

        return false; // no hay solución
    }

    public static void printBoard(int[][] board) {
        for (int r = 0; r < N; r++) {
            for (int d = 0; d < N; d++) {
                System.out.print(board[r][d] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*
         * Representación del tablero:
         * - Los números del 1 al 9 son valores ya dados en el Sudoku.
         * - El número 0 representa una celda vacía que el algoritmo debe llenar.
         * - Despues de haber yo hecho el algoritmo, se elaboró tablero fue generado con ChatGPT.
         *
         * Este es un Sudoku clásico "fácil":
         *
         *  5 3 . | . 7 . | . . .
         *  6 . . | 1 9 5 | . . .
         *  . 9 8 | . . . | . 6 .
         *  ------+-------+------
         *  8 . . | . 6 . | . . 3
         *  4 . . | 8 . 3 | . . 1
         *  7 . . | . 2 . | . . 6
         *  ------+-------+------
         *  . 6 . | . . . | 2 8 .
         *  . . . | 4 1 9 | . . 5
         *  . . . | . 8 . | . 7 9
         *
         * (Los puntos "." representan los ceros en el arreglo).
         */
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(board, 0, 0)) {
            printBoard(board);
        } else {
            System.out.println("No existe solucion.");
        }
    }
}
