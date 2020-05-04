
package main;


public class Cachorro extends Animal {
    
    private String raça;

    
    @Override
    public void imprimir(){
        System.out.println("Cachorro:" );
        super.imprimir();
        System.out.println("Raça:" + getRaça());
        
    }

    public Cachorro() {
        super();
        
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
    
    
    
    
    
}
