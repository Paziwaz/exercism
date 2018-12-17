import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<>();
        for (Signal signal: Signal.values()) {
        	if ((number & signal.getCode()) != 0)
        		handshake.add(signal);
        }
        if ((number & 0b10000) != 0)
        	Collections.reverse(handshake);
        return handshake;
    }

}
