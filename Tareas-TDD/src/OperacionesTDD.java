public class OperacionesTDD {
    public static int suma(String cadenaNumeros) {
        if (cadenaNumeros.isEmpty()) {
            return 0;
        }
        String[] numeros = cadenaNumeros.split(",");
        int suma = 0;
        for (String numero : numeros) {
            suma += Integer.parseInt(numero);
            if (numero.isEmpty()) {
                return -1;
            }
        }

        return suma;
    }
}
