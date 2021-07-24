/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha1_5413;

import java.util.Scanner;

/**
 *
 * @author patri
 */
public class Ficha1_5413 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        Automovel x = new Automovel("AA-00-01", "Bercedes","C220", 2012 );
        Automovel y = new Automovel("AA-00-02", "Bmw","320d", 1998);
        
         x.imprimeCarro();
         y.imprimeCarro();
        
        
        System.out.println("Insira uma matricula: ");
        String mat = in.next();
        System.out.println("Insira uma marca: ");
        String mar = in.next();
        System.out.println("Insira um modelo: ");
        String mod = in.next();
        System.out.println("Insira o ano de construção: ");
        int ano = in.nextInt();
        
        
        
        
        
        
        
        Automovel z = new Automovel(mat, mar, mod, ano);
        z.imprimeCarro();
        
        
        System.out.println("----ALTERAÇÃO-----");
        x.setAnoConstrucao(2014);
        x.imprimeCarro();
        
        
         
         
         
         
        
        
        
    }
    
}
