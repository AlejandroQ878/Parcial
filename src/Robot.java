public class Robot {
    private Bateria bateria;
    private boolean dormido;

    public Robot() {
    }

    public Robot(Bateria bateria, boolean dormido) {
        this.bateria = new Bateria(1000);
        this.dormido = dormido= false;
    }

    public void avanzar(int pasos){

        if(dormido){
            System.out.println("El robot esta dormido");
            return;
        }
        if(bateria.getCarga()==0){
            System.out.println("La bateria esta vacia, racargala");
            return;
        }
        int energiaC = (pasos/100)*10;
        if(energiaC > bateria.getCarga()){
            energiaC = bateria.getCarga();
        }
        bateria.setCarga(bateria.getCarga()- energiaC);
        System.out.println("El robot a avanzado "+pasos+ " y a gastado "+energiaC+ " unidades de energia");
    }
    public void retroceder(int pasos){

        if(dormido){
            System.out.println("El robot esta dormido");
            return;
        }
        if(bateria.getCarga()==0){
            System.out.println("La bateria esta vacia, racargala");
            return;
        }
        int energiaC = (pasos/100)*10;
        if(energiaC > bateria.getCarga()){
            energiaC = bateria.getCarga();
        }
        bateria.setCarga(bateria.getCarga()- energiaC);
        System.out.println("El robot a retrocedido "+pasos+ " y a gastado "+energiaC+ " unidades de energia");

    }
    public void dormir(){
        dormido = true;
        System.out.println("El robot esta dormido");

    }
    public void despertar(){
        dormido = false;
        System.out.println("El robot esta despierto");

    }
    public void recargar(){
        bateria.setCarga(1000);
        System.out.println("La bateria a sido recargada");

    }
    public boolean bateriaLlena (){
        return bateria.getCarga()==1000;

    }
    public boolean bateriaVacia (){
        return bateria.getCarga()<=0;
    }
    public int energiaActual () {
        return bateria.getCarga();
    }
    public boolean estaDormido(){
        return dormido;
    }

    }



