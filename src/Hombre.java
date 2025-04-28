import java.util.Scanner;

public class Hombre {
    private String nombre;
    Scanner t = new Scanner(System. in);
    public void jugarConRobot(Robot robot){
        int opc;
        do{
            System.out.println("""
                    1.Avanzar una cantidad de pasos especifica
                    2.Retroceder una cantidad de pasos especifica
                    3.Ver el nivel de energia del robot 
                    4.Dormir al robot 
                    5.Despertar al robot
                    6.Recargar la bateria
                    """);
            opc = t.nextInt();

            switch(opc){

                case 1->{
                    int pasosA;
                    System.out.println("Ingrese la cantidad de pasos que quiere avanzar");
                    pasosA = t.nextInt();
                    robot.avanzar(pasosA);
                }
                case 2->{
                    int pasosR;
                    System.out.println("Ingrese la cantidad de pasos que quiere retroceder");
                    pasosR = t.nextInt();
                    robot.retroceder(pasosR);
                }
                case 3->{
                    System.out.println("El nivel de bateria actual es de "+robot.energiaActual()+" unidades");
                }
                case 4->{
                    robot.dormir();
                }
                case 5->{
                    robot.despertar();
                }
                case 6->{
                    robot.recargar();
                }
                default -> System.out.println("Opcion no valida, ingrese otra opcion");
            }


        }while(!robot.estaDormido());
    }



    public Hombre(String nombre) {
        this.nombre = nombre;

    }
}
