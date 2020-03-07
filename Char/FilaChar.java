package appfilachar;

public class FilaChar {
    private int quantidade;
    private char fila[];
     
    public FilaChar(int tamanho) {
        fila = new char [tamanho];
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
    
    public char front() {
        return isEmpty() ? ' ' : fila[0] ;
    }
    
    public boolean enqueue(char valor) {
        if (!isFull()) {
            fila[quantidade++]=valor;
            return true;
        } else {
            return false;
        }
    }
    
    public char dequeue() {
        char temp = fila[0];
        if (!isEmpty()) {
            for (int i=0;i<=quantidade;i++) {
                fila[i]=fila[i+1];
            }   
            quantidade--;
            return temp;
        } else {
            return ' ';
        }
    }
    
    public String printFila() {
        String printFila = "";
        for (int i = 0; i < fila.length; i++) {
            printFila += (i<quantidade-1) ?  fila[i] + ", " : fila[i];                              
        }                    
        return printFila;
    }
   
}