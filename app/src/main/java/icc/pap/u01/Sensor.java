package icc.pap.u01;

public record Sensor(String id, String ubicacion) implements Comparable<Sensor>{ //un record es una ARCHIVO con una representacion REDUCIDA DE UNA CLASE 
    //directamente con el record tengo el constructor ya de la CLASE sensor
    //clase = CUANDO NECESITEMOS MODIFICAR LOS DATOS y necesitemos MODIFICAR MEDIANTE METODOS
    //record = UNA VEZ DEFINIMOS los VALORES no se pueden cambiar

    @Override 
    public int compareTo(Sensor otro){
        return this.id.compareTo(otro.id);
    }
}
