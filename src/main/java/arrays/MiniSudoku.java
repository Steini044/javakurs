package arrays;

public class MiniSudoku {
    public static void main(String[] args) {
        int[][] sudoku = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 8 } };
        correctSudoku(sudoku);
    }

    public static void correctSudoku(int[] [] sudoku){
        boolean check = false;

        for (int i = 1; i <= 9; i++) {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if(sudoku[row][col] == i){
                        check = true;
                    }
                }
            }
            if(check == false){
                System.out.printf("Missing %d ",i);
            }
            check = false;
        }
    }
}
