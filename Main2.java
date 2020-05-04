
package main2;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
       
        Scanner git =  new  Scanner (System.in); 
        
        Empregado emp1= new Empregado();
        Cliente clit1= new Cliente();
        
        System.out.println("Digite o Nome, Idade, Sexo, Salario e Matricula:");
        emp1.setNome(git.next());
        emp1.setIdade(git.nextInt());
        emp1.setSexo(git.next());
        emp1.setSalario(git.nextDouble());
        emp1.setMatricula(git.next());
        
        System.out.println("Digite o Nome, Idade, Sexo, Valor-Divida e Ano-Nascimento:");
        clit1.setNome(git.next());
        clit1.setIdade(git.nextInt());
        clit1.setSexo(git.next());
        clit1.setValorDivida(git.nextDouble());
        clit1.setAnoNasc(git.nextInt());
        
        
        emp1.imprimir();
        clit1.imprimir();
        
    }
    
}
