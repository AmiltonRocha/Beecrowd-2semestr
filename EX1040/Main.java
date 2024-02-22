package EX1040;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    double nota1 = leitor.nextDouble();
    double nota2 = leitor.nextDouble();
    double nota3 = leitor.nextDouble();
    double nota4 = leitor.nextDouble();
    double media1 =Math.floor(((nota1*0.2)+(nota2*0.3)+(nota3*0.4)+(nota4*0.1))*10)/10;
    
    System.out.format("Media: %.1f\n", media1);
    if(media1>= 5.0 && media1<=6.9){
     System.out.format("Aluno em exame.\n");
     double nota5=leitor.nextDouble();
     System.out.format("Nota do exame: %.1f\n", nota5);    
     double media2 = (media1 + nota5)/2;
     if (media2>=5) {
     System.out.format("Aluno aprovado.\n");
     System.out.format("Media final: %.1f\n",media2);
     }else{
        System.out.format("Aluno reprovado\n");
     }
    }if(media1>=7.0){
        System.out.format("Aluno aprovado.\n");
    }if(media1<=4.9){ 
        System.out.format("Aluno reprovado.\n");
    }
    


}

}

