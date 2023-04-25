import java.util.Scanner;

public class CBBAtividade6 {
    public static void main (String[] args){
        int nums[] = new int[10];
        int i, maior;
        try (Scanner sc = new Scanner(System.in)) {
            for (i = 0; i < nums.length; i++){
            System.out.print("Informe um número: ");
            int num = sc.nextInt();
            nums[i] = num;
            }
            sc.close();
        }
        maior = nums[0];
        System.out.print("Os números informados são: ");
        
        for (i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
            if(nums[i] > maior){
                maior = nums[i];
            }
        }
        System.out.println("O maior número informado é: "+ maior);
    }
}
