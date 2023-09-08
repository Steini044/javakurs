package Arrays;

public class BildVergroessern {
    public static int[][] magnify(int[][] array, int factor){
        int[][] bigPicture = new int[array.length * factor][array[0].length * factor];

        for (int row = 0; row < bigPicture.length; row++) {
            for (int col = 0; col < bigPicture[0].length; col++) {
                bigPicture[row][col] = array[row / factor][col / factor];
            }
        }
        return bigPicture;
    }

    public static void main(String[] args) {
        int[][] array = { {1, 2, 3},
                {4, 5, 6} };
        int[][] bigPicture = magnify(array,4);
        for (int i = 0; i < bigPicture.length; i++) {
            for (int j = 0; j < bigPicture[0].length; j++) {
                System.out.printf("%d ",bigPicture[i][j]);
            }
            System.out.println();
        }
    }
}
