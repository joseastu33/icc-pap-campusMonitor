package icc.pap.u01;

public class TiposDemo { //proyecto pequeño
    public static void main(String[] args){

        Caja<String> lugar = new Caja<>("Lab6");
        Caja<Integer> limite = new Caja<>(30);
        Caja<Sensor> dispositivo = new Caja<Sensor>(new Sensor("s01", lugar.obtener()));

        System.out.println(lugar.obtener());
        System.out.println(limite.obtener()); 
        System.out.println(dispositivo); //un record ya tiene el toString por defecto
        System.out.println(dispositivo.obtener().id() + "-" + dispositivo.obtener().ubicacion());
    }

}
