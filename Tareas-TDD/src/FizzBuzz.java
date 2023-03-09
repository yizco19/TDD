import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String jugar(int maximo) {
        if (maximo <= 0) {
            return "";
        }

        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= maximo; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultado.append("FizzBuzz\n");
            } else if (i % 3 == 0) {
                resultado.append("Fizz\n");
            } else if (i % 5 == 0) {
                resultado.append("Buzz\n");
            } else {
                resultado.append(i).append("\n");
            }
        }

        return resultado.toString();
    }

// TC: O(n), SC: O(n)


}
