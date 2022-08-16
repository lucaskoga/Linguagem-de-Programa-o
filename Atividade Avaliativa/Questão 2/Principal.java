import java.io.File;

public class Principal {
    public static void main(String[] args) {
        //Soma Convencional
        File file = new File("C:/Users/User/Desktop/Atividade");
        long inicio = System.currentTimeMillis();
        SomaByte soma = new SomaByte(file);
        long set = soma.getArquivo(file);
        System.out.println("Soma de Byte convensional: "+ set);
        System.out.println("Soma de Convertido em MegaByte: "+ (double)set / (1024 * 1024));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de Compilacao convensional: "+ (fim - inicio));


    }
}
