package appfilachar;

public class AppFilaChar {

    public static void main(String[] args) {
        
        FilaChar fila1 = new FilaChar(10);        
        FilaChar fila2 = new FilaChar(10);

        
        fila1.enqueue('v');        
        fila1.enqueue('i');
        fila2.enqueue('c');        
        fila2.enqueue('t');        
        fila2.enqueue('o');        
        fila2.enqueue('r');
        
        fila1.dequeue();        
        fila2.dequeue();
        
        System.out.println("Fila 1: " + fila1.printFila());            
        System.out.println("Fila 2: " + fila2.printFila());          
              
        System.out.println("\nPróximo: 1='" + fila1.front() + "' 2='" + fila2.front() + "'");       
        System.out.println("Tamanho: 1=" + fila1.size() + "   2=" + fila2.size());

        System.out.println( fila1.size()>fila2.size() ? "\nFila 1 Maior" : "\nFila 2 Maior");

    }
    
}
