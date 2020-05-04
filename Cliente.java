
package main2;


public class Cliente extends Pessoa {
    
    private double valorDivida;
    private int anoNasc;

    public Cliente() {
        super(); 
    }

    @Override
    public void imprimir(){
        System.out.println("Cliente:");
        super.imprimir();
        System.out.println("Valor da divida :" + getValorDivida());
        System.out.println("Ano de Nascimento:" + getAnoNasc());
    }
    
    
    
    
    
    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    
    
}
