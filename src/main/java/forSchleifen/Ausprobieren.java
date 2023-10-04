package forSchleifen;

public class Ausprobieren {
    public static void main(String[] args) {
        //XOL + LXX = TLT

        for (int x = 0; x < 10; x++) {
            for (int o = 0; o < 10; o++) {
                for (int l = 0; l < 10; l++) {
                    for (int t = 0; t < 10; t++) {
                        int xol = 100 * x + 10 * o + l;
                        int lxx = 100 * l + 10 * x + x;
                        int tlt = 100 * t + 10 * l + t;
                        if (xol + lxx == tlt) {
                            if (x != o && x != l && x != t && o != l && o != t && l != t) {
                                System.out.printf("####X = %d, O = %d, L = %d, T = %d###%n", x, o, l, t);
                            } else {
                                System.out.printf("X = %d, O = %d, L = %d, T = %d%n", x, o, l, t);
                            }
                        }
                    }
                }
            }
        }
    }
}
