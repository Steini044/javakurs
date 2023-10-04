package zeichenketten;

public class YZswapper {
    public static void printSwappedYZ(String string) {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'y') {
                System.out.print("z");
            } else if (c == 'Y') {
                System.out.print("Z");
            } else if (c == 'z') {
                System.out.print("y");
            } else if (c == 'Z') {
                System.out.print("Y");
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }

    public static void printSwappedYZSwitch(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.print(
                    switch(string.charAt(i)){
                        case 'y' -> 'z';
                        case 'Y' -> 'Z';
                        case 'z' -> 'y';
                        case 'Z' -> 'Y';
                        default -> string.charAt(i);
                    }
            );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printSwappedYZ("yootaxz");
        printSwappedYZ("Yanthoxzl");
        printSwappedYZSwitch("yootaxz");
        printSwappedYZSwitch("Yanthoxzl");
    }
}
