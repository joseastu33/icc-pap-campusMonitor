package java.icc.pap.u01;

public class MetodosDemo {
    public static void main(String[] args){
        Caja<String> original = new Caja<>("Algoritmo");
        //mappear el valor String de la Caja a un Integer
        Integer longitud = original.mapear(texto -> texto.length());
        String etiqueta = original.mapear(texto -> "Materia: " + texto); 
        //sirve para cambiar de un objeto a otro, de un rol a otro, etc.
        
        System.out.println("Original: " + original.obtener());
        System.out.println("longitud: " + longitud);
        System.out.println(etiqueta);
        //Function<String, Integer> fun = texto -> texto.length()
    }
}
