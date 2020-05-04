
package main;


public class Peixe extends Animal {
    
    private String tipoHabt;
    
    
    @Override
    public void imprimir(){
        System.out.println("Peixe" );
        super.imprimir();
        System.out.println("Tipo Habt:" + getTipoHabt());
        
    }

    public Peixe() {
        super();
    }

    
    public String getTipoHabt() {
        return tipoHabt;
    }

    public void setTipoHabt(String tipoHabt) {
        this.tipoHabt = tipoHabt;
    }
    
    
    
    
}
