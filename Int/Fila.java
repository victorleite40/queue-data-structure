package appfila;

public class Fila {
    private int quantidade, fila[];
     
    public Fila(int tamanho) {
        fila = new int [tamanho];
        quantidade = 0;
    }
    
    public boolean isEmpty() {
        return quantidade==0;
    }
    
    public boolean isFull() {
        return quantidade==fila.length;
    }
    
    public int size() {
        return quantidade;
    }
    
    public int front() {
        return isEmpty() ? -1 : fila[0] ;
    }
    
    public boolean enqueue(int valor) {
        if (!isFull()) {
            fila[quantidade++]=valor;
            return true;
        } else {
            return false;
        }
    }
    
    public int dequeue() {
        int temp = fila[0];
        if (!isEmpty()) {
            for (int i=0;i<=quantidade;i++) {
                fila[i]=fila[i+1];
            }   
            quantidade--;
            return temp;
        } else {
            return -1;
        }
    }
    
    public String printFila() {
        String printFila = "";
        for (int i = 0; i < quantidade; i++) {
            printFila += (i<quantidade-1) ?  Integer.toString(fila[i]) + ", " : Integer.toString(fila[i]);                              
        }                    
        return printFila;
    }
   
}