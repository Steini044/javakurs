package Zeichenketten;

public class TexteEntspalten {

    public static boolean isSpace(String string, int index){
        if(string.length() <= index){
            return true;
        }
        return string.charAt(index) == ' ';
    }

    public static int findColumnIndex(String[] lines){
        int maxLength = lines[0].length();
        for (String line : lines) {
            maxLength = Math.max(maxLength, line.length());
        }

        mainloop:
        for (int i = 0; i < maxLength - 1; i++) {
            for (String line: lines) {
                if(! isSpace(line,i)){
                    continue mainloop;
                }
            }
            return i;
        }
        return -1;
    }

    public static void decolumnize(String text){
        String[] lines = text.split("\n");
        int columnIndex = findColumnIndex(lines);

        if(columnIndex == -1){
            System.out.println( text );
            return;
        }
        //print left column
        for (String line: lines){
            String lineToPrint = line.substring(0, Math.min(line.length(), columnIndex)).trim();
            System.out.println(lineToPrint);
        }
        //print right column
        for(String line: lines){
            if(columnIndex < line.length()){
                String lineToPrint = line.substring(columnIndex + 1).trim();
                System.out.println(lineToPrint);
            } else {
                System.out.println();
            }
        }
    }
    public static void main( String[] args ) {
        System.out.println("TEST 1:");

        String text;
        text = "Iâ€™m dishonest, and a to watch out for,\n" +
                "dishonest man you    because you can\n" +
                "can always trust to  never predict when\n" +
                "be dishonest.        theyâ€™re going to do\n" +
                "Honestly, itâ€™s the   something incredibly\n" +
                "honest ones you want stupid.";
        System.out.println( text + "\n=> " );
        decolumnize( text );

        System.out.println("TEST 2:");

        text = "Iâ€™m dishonest, and a never predict when\n" +
                "dishonest man you    theyâ€™re going to do\n" +
                "can always trust to  something incredibly\n" +
                "be dishonest.        stupid.\n" +
                "Honestly, itâ€™s the\n" +
                "honest ones you want\n" +
                "to watch out for,\n" +
                "because you can";
        System.out.println( text + "\n=> " );
        decolumnize( text );

        System.out.println("TEST 3:");

        text = "Iâ€™m dishonest, and a\n" +
                "dishonest man you\n" +
                "can always trust to\n" +
                "be dishonest.\n" +
                "\n" +
                "Honestly, itâ€™s the\n" +
                "honest ones you want\n" +
                "to watch out for,\n" +
                "because you can\n" +
                "never predict when\n" +
                "theyâ€™re going to do\n" +
                "something incredibly\n" +
                "stupid.";
        System.out.println( text + "\n=> " );
        decolumnize( text );


        System.out.println("TEST 4:");
        text = "Iâ€™m dishonest, and a never predict when\n" +
                "dishonest man you    theyâ€™re going to do\n" +
                "can always trust to  something incredibly\n" +
                "be dishonest.\n" +
                "                     stupid.\n" +
                "Honestly, itâ€™s the\n" +
                "honest ones you want\n" +
                "to watch out for,\n" +
                "because you can";
        System.out.println( text + "\n=> " );
        decolumnize( text );


        System.out.println("TEST 5:");
        text = "Iâ€™m dishonest, and a    never predict when\n" +
                "dishonest man you       theyâ€™re going to do\n" +
                "can always trust to     something incredibly\n" +
                "be dishonest.           stupid.\n" +
                "Honestly, itâ€™s the\n" +
                "honest ones you want\n" +
                "to watch out for,\n" +
                "because you can";
        System.out.println( text + "\n=> " );
        decolumnize( text );

        decolumnize( "" );
        decolumnize( "One line" );
    }
}
