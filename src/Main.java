import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        Robot robot = new Robot();

        System.out.println("Ingrese nombre del primer jugador");
        String nombre1;
        nombre1= t.nextLine();
        Hombre hombre1 = new Hombre(nombre1);
        System.out.println("Ingrese nombre del segundo jugador");
        String nombre2 = t.nextLine();
        Hombre hombre2 = new Hombre(nombre2);

        System.out.println("Empieza jugador 1");
        hombre1.jugarConRobot(robot);

        System.out.println("Ahora te toca jugador 2");

        if(robot.estaDormido()){
            robot.despertar();
        }
        hombre2.jugarConRobot(robot);
    }
}