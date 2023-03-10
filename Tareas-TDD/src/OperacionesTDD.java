import java.util.ArrayList;

public class OperacionesTDD {

        public static int suma(String numeros) {
            ArrayList<Integer> numerosSeparados=new ArrayList<>();
            String numero = "";
            int suma=0;
            for(int i = 0; i < numeros.length(); i++){
                char ca=numeros.charAt(i);

                if(ca==','){
                    numerosSeparados.add(Integer.parseInt(numero));
                    if(i==numeros.length()-1){
                        numerosSeparados.add(-1);
                    }
                    numero="";
                }
                if(ca!=','){
                    numero+=ca;
                }

            }

            for(int i:numerosSeparados){
                if(i<0){
                    return -1;
                }
                suma+=i;
            }
            return suma;
        }

}
