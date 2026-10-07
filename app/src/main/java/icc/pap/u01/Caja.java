package main.java.icc.pap.u01;
//clase generica
public class Caja<T> {
    //dato generico
    private final T valor;

    public Caja(T valor){
        this.valor = valor;
    }
    //metodo generico tipo getter
    public T obtener(){
        return valor;
    }





}
