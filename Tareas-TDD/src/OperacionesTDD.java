import java.util.ArrayList;

public class OperacionesTDD {

        public static int suma(String numeros) {
            ArrayList<Integer> numerosSeparados=new ArrayList<>();
            String numero = "";
            int suma=0;
            boolean negativo=false;
            boolean faltaNumero=false;
            for(int i = 0; i < numeros.length(); i++){
                char ca=numeros.charAt(i);
                if(ca!=','){
                    numero+=ca;
                }
                if(ca==',' || i==numeros.length()-1){
                    numerosSeparados.add(Integer.parseInt(numero));
                    if(i==numeros.length()-1 && ca==','){
                        numerosSeparados.add(-1);
                        faltaNumero=true;
                    }
                    numero="";
                }


            }

            for(int i=0;i<numerosSeparados.size();i++){
                int num=numerosSeparados.get(i);
                if(num<0){
                    if(!faltaNumero){
                        System.out.println("Número negativo no permitido");
                    }
                    return -1;

                }
                suma+=num;
            }
            return suma;
        }

}
