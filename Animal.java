
package main;


public class Animal {
  
    private String nome;
    private double peso;

    
    public void imprimir(){
        System.out.println("Nome:" + getNome());
        System.out.println("Peso:" + getPeso());
          
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
