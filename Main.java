
package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner git =  new  Scanner (System.in); 
        
        Peixe pex1= new Peixe();
        Cachorro cach1= new Cachorro();
        
        
        System.out.println("Digite o Nome, Peso e habtat do peixe:");
        pex1.setNome(git.next());
        pex1.setPeso(git.nextDouble());
        pex1.setTipoHabt(git.next());
        
        System.out.println("Digite o Nome, Peso e raça do cachorro:");
        cach1.setNome(git.next());
        cach1.setPeso(git.nextDouble());
        cach1.setRaça(git.next());
        
        pex1.imprimir();
        cach1.imprimir();
        
    }
    
}
