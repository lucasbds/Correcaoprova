/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Imovel {
    private Proprietario proprietario;
    private Data dataCompra;
    private String tipo;
    
    
    
     
    public void setProprietario (Proprietario proprietario){
       this.proprietario = proprietario;    
    }
    
    public void setDataCompra (Data dataCompra){
       this.dataCompra = dataCompra;    
    }
     
    public void setTipo(String tipo){
       this.tipo = tipo;    
   }
       
      
      
    
    public String getProprietario (){
            return this.proprietario;
   }
    
    
    public Data getDataCompra(){
            return this.dataCompra;
    }
    
    public Data getTipo(){
            return this.tipo;
    }
    
    
   
    public void mostrar(){
      
       System.out.println(this.getProprietario());
       System.out.println(this.getDataCompra());
       System.out.println(this.getTipo());
    
       
    public boolean informarTipo(String t){
        this.tipo =t
                
    }   
    }/*
}
