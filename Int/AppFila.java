package appfila;

public class AppFila {

    public static void main(String[] args) {
        
        Fila fila = new Fila(10);
        
        fila.enqueue(10);        
        fila.enqueue(7);
        fila.enqueue(5);
        
        System.out.println(fila.printFila());          
        
        System.out.println(fila.dequeue());        
        System.out.println(fila.dequeue());

        
        System.out.println("Próximo: " + fila.front());       
        System.out.println("Tamanho: " + fila.size());

        
    }
    
}
