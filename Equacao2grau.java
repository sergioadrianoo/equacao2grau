package equacao2grau;
import java.util.Scanner;

public class Equacao2grau {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c;
        
        System.out.println("Informe os coeficientes da Equação:");
        System.out.print("a = ");
        a = s.nextDouble();
        System.out.print("b = ");
        b = s.nextDouble();
        System.out.print("c = ");        
        c = s.nextDouble();
        
        try {
            equacao g = new equacao(a,b,c);        
            g.resolver(a, b, c);

            System.out.println("As raízes da Equação são: " + g.x1 + " e " + g.x2);
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}