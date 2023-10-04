package eigeneTypenSchreiben;

import java.util.Objects;

public class Toaster {
    int capacity;
    boolean stainless;
    boolean extraLarge;

    @Override public boolean equals( Object o ) {
        if ( !(o instanceof Toaster toaster) ) return false;

        return    capacity == toaster.capacity
                && stainless == toaster.stainless && extraLarge == toaster.extraLarge;
    }

    @Override public int hashCode() {
        return Objects.hash( capacity, stainless, extraLarge );
    }
}
