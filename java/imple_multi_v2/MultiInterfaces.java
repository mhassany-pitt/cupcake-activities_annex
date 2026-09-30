public interface Listener {    
    double PI = 3.14149;     
    void listen();     
}    
public interface Runnable {    
    int PERIOD = 10;    
    void run();    
}    
  
public class MultiInterfaces implements Listener, Runnable {    
    public void listen() {    
    }    
    public void run() {    
    }    
}  