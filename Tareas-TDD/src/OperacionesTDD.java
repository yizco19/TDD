public class OperacionesTDD {
    public static int suma(String numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return 0;
        }
        String[] numerosSeparados = numeros.split(",");
        int suma = 0;
        for (String numero : numerosSeparados) {
            if (numero.isEmpty()) {
                return -1;
            }
            suma += Integer.parseInt(numero);
        }
        return suma;
    }

}
