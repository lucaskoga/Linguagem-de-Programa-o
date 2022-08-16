import java.io.File;
import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class SomaByte extends RecursiveTask<Integer> {
    private static long[] vetB = new long[40];
    private final File file;
    private static long test[] = new long[40];
    private static final int LIMITE = 500;


    public SomaByte(File file){
        this.file = file;
    }

    @Override
    protected Integer compute() {
        long restultado = 0;
        if(file.length() < LIMITE){
            restultado = getArquivo(file);
            return (int) restultado;
        }

        return null;
    }

    public static long getArquivo(File file){
        long lenght = 0;

        File[] files = file.listFiles();

        long count = files.length;
        int i = 0;
        while(i < count){
            if (files[i].isFile()){
                lenght += files[i].length();
            }
            else
                lenght += getArquivo(files[i]);

            i++;
        }
        return lenght;
    }


    public void imprimir(){
        for (int r = 0; r < 12; r++){
            System.out.println("\nVet " + vetB[r]);
        }
    }
}
