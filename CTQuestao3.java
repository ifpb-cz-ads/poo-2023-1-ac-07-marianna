import java.util.Scanner;

public class CTQuestao3 {
    public static void main(String[] args) {
            float notas[] = new float[10];
            int i, contador = 0;
            float media = 0;
        try (Scanner sc = new Scanner(System.in)) {
            
            for (i = 0; i < notas.length; i++){
                System.out.print("Informe a nota: ");
                float num = sc.nextFloat();
                notas[i] = num;
                media = media + num;
                
                if (num < 7){
                    contador++;
                }
            }
            sc.close();
        }
            System.out.println("A média é: "+ media / 10);
            System.out.println("A quantidade de notas abaixo da média é: "+ contador +" e a quantidade acima da média é: "+ (10 - contador));    
    }
}
