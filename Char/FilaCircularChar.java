package appfilachar;

public class FilaCircularChar {
    private int quantidade, fila[], inicio, fim;
    
    public FilaCircularChar(int tamanho) {
        fila = new int [tamanho];
        quantidade = 0;
        inicio=0;
        fim=0;
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
        return isEmpty() ? -1 : fila[inicio] ;
    }
    
    public boolean enqueue(int valor) {
        if (!isFull()) {
            fila[fim++]=valor;
            quantidade++;
            if (fim==fila.length) fim=0;
            return true;
        } else {
            return false;
        }
    }
    
    public int dequeue() {
        if (!isEmpty()) {
            quantidade--;
            int temp = fila[inicio++];
            inicio=(inicio+1)%fila.length;
            return temp;
        } else {
            return -1;
        }
    }
}
