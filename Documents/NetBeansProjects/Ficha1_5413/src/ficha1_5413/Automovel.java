/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha1_5413;

/**
 *
 * @author patri
 */
public class Automovel {
    private String matricula;
    private String marca;
    private String modelo;
    private int anoConstrucao;
    
    
    public Automovel(String matricula, String marca, String modelo, int anoConstrucao){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anoConstrucao = anoConstrucao;
        
    }
    
    public String getMatricula(){
        return this.matricula;
        
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMarca(){
        return this.marca;
        
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return this.modelo;
        
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getAnoConstrucao(){
        return anoConstrucao;
        
    }
    public void setAnoConstrucao(int anoConstrucao){
        this.anoConstrucao = anoConstrucao;
    } 
    
    public void imprimeCarro(){
        System.out.println("########## AUTOMÓVEL "+this.matricula+"########");
        System.out.println("MARCA:"+this.marca);
        System.out.println("MODELO:"+this.modelo);
        System.out.println("ANO DE CONSTRUCÃO: "+this.anoConstrucao);
        System.out.println("#################################");
    }
    
    public double pagaImposto (){
        if(this.anoConstrucao<2007){
            return 30;
        }else if (this.anoConstrucao<=2010){
            return 50;
        }else{
            return 100;
        }
    }
    
    
}
