package lambda;

import java.util.Map;

@FunctionalInterface
public interface Repeticion {

    Map<String, Integer> repetida(String frase);

}