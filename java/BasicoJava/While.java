package BasicoJava;

public class While {
    public static void main(String[] args) {
        int contador = 10;
        while (contador < 20 ){
            System.out.println("ainda é menor que 20");
                contador++; //pode usar também no lugar de contador++: contador = contador + 1;
            if(contador==20){
                System.out.println("cheguei ao número 20.");
            }

        }
    }
}
