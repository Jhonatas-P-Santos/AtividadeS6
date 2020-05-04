
package main2;


public class Empregado extends Pessoa {
    
   private double salario;
   private String matricula;

    public Empregado() {
        super();
    }

   @Override
    public void imprimir(){
        System.out.println("Empregado:");
        super.imprimir();
        System.out.println("Salario :" + calculaSala());
        System.out.println("Matricula:" + getMatricula());
    }
    
   public double calculaSala(){
       double inss;
       inss= salario*0.11;
       
       return inss; 
   }
    
   
    
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   
    
    
}
