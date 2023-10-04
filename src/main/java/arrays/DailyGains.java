package arrays;

public class DailyGains {
    public static void main(String[] args) {
        int[] dailyGains = {1000, 2000, 500, 9000, 9010, 300, 500, 1000, 40, 2000};

        System.out.println(count5PercentJumps(dailyGains));
    }

    private static int count5PercentJumps(int[] dailyGains) {
        if(dailyGains.length < 2)
            return 0;
        int sum = 0;
        for (int i = 0; i < dailyGains.length - 1; i++) {
            if(dailyGains[i + 1] > (dailyGains[i] * 1.05))
                sum++;
        }
        return sum;
    }
}
