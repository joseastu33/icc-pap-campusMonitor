package icc.pap.u01;
import java.util.function.*;
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
    //metodo generico 
    public <R> R mapear(Function<T, R> operacion){ //el que lo usa tiene que decir como pasar de T a R
        //transformo T a R
        R resultado = operacion.apply(valor); //mapear tiene un objetivo:
        return resultado;
    } 
        //public <R> int mapear2(){ //el que lo usa tiene que decir como pasar de T a R
        //return ((String) valor).length();
}       //revisar esta materia 
