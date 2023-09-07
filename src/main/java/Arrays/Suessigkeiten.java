package Arrays;

public class Suessigkeiten {
    private static int relativeDifference(int a, int b) {
        if (a == b) return 0;
        int absoluteDifference = Math.abs(a - b);
        return (int) (100. * absoluteDifference / Math.max(a, b));
    }

    public static void main(String[] args) {
        int a = 130;
        int b = 110;
        System.out.println(relativeDifference(a, b));

        int[] regal1 = {10, 20, 30, 40, 40, 50};
        System.out.println(findSplitPoint(regal1));

        int[] regal2 = {10, 20, 30, 40, 40, 100};
        System.out.println(findSplitPoint(regal2));
    }

     public static int findSplitPoint(int[] regal) {
        if(regal.length < 2)
            return -1;

        int left = regal[0];
        int right = 0;
        int relativeDifference;

         for (int i = 1; i < regal.length; i++) {
             right += regal[i];
         }

         for (int index = 1; index < regal.length; index++) {
             relativeDifference = relativeDifference(left, right);
             if(relativeDifference <= 10){
                 return index;
             }
             left += regal[index];
             right -= regal[index];
         }
        return -1;
    }
}
