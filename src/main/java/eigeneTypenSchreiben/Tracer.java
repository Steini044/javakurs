package eigeneTypenSchreiben;

import java.util.Arrays;

public class Tracer {
    static boolean tracingIsOn;
    public static void trace(String string){
        if(tracingIsOn){
            System.out.println(string);
        }
    }

    public static void trace(String string, Object ... args){
        if(tracingIsOn){
            System.out.printf(string + Arrays.toString(args));
        }
    }

    public static void on(){
        tracingIsOn = true;
    }

    public static void off(){
        tracingIsOn = false;
    }

    public static void main(String[] args) {
        Tracer.on();
        Tracer.trace( "Start" );
        int i = 2;
        Tracer.trace( "i = " + i );
        //  Tracer.trace( "i = %d", i );
        Tracer.off();
        Tracer.trace( "End" );
    }
}
