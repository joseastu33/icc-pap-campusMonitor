package icc.pap.models;

import java.util.function.Function;

public class Lectura<T> {
    
    private String idSensor;
    private T valor;
    private String unidad;

    public Lectura(String idSensor, T valor, String unidad){
        this.idSensor = idSensor;
        this.valor = valor;
        this.unidad = unidad;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public T getValor() {
        return valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public <R> Lectura<R> transformar(Function<T, R> conversor, String nuevaUnidad){
        //conversor no es null        
        if (conversor == null){
            throw new IllegalArgumentException("El conversor no puede tener un valor nulo");
        }

        //el resultado no es null
        R conversion = conversor.apply(getValor());
        
        if(conversion == null){
            throw new IllegalArgumentException("El resultado de la conversion no puede ser nulo");
        }

        return new Lectura<R>(getIdSensor(), conversion, nuevaUnidad);

    }
    
}
