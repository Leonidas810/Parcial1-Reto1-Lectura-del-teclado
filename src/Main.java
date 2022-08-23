import java.util.Scanner;
public class Main {
    public  static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        String operacion = "SUMA";
        float op1 ,op2;
        while (operacion!="SUMA" || operacion!="RESTA" || operacion!="MULTIPLICACION" || operacion!="DIVISION"){
            operacion="PEDO";
            System.out.println("Captura operacion:");
            operacion = teclado.next();
            switch (operacion) {
                case "SUMA" -> {
                    System.out.println("Operando 1:");
                    op1= teclado.nextLong();
                    System.out.println("Operando 2:");
                    op2=teclado.nextLong();
                    System.out.println(op1 + "+" + op2 + "=" + (op1+op2));
                }
                case "RESTA" -> {
                    System.out.println("Operando 1:");
                    op1= teclado.nextLong();
                    System.out.println("Operando 2:");
                    op2=teclado.nextLong();
                    System.out.println(op1 + "-" + op2 + "=" + (op1-op2));
                }
                case "MULTIPLICACION" -> {
                    System.out.println("Operando 1:");
                    op1= teclado.nextLong();
                    System.out.println("Operando 2:");
                    op2=teclado.nextLong();
                    System.out.println(op1 + "*" + op2 + "=" + (op1*op2));
                }
                case "DIVISION" -> {
                    System.out.println("Operando 1:");
                    op1= teclado.nextLong();
                    System.out.println("Operando 2:");
                    op2=teclado.nextLong();
                    System.out.println(op1 + "/" + op2 + "=" + (op1/op2));
                }
                default -> {
                    System.out.println("Operacion no soportada");
                    System.exit(0);
                }
            }
        }
    }
}
