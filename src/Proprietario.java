/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Proprietario {
    private String nome;
    private Data dataNascimento;
    
    
    
     
    public void setNome (String nome ) {
        this.nome = nome;    
    }
    
     public void setDataNascimento (Data dataNascimento) {
        this.dataNascimento = dataNascimento;    
    }
     
     
      
      
    
    public String getNome (){
            return this.nome;
    }
    
    
    public Data getDataNascimento(){
            return this.dataNascimento;
    }
    
    
   
    public void mostrar() {
      
       System.out.println(this.getNome());
       System.out.println(this.getDataNascimento());
    
    }/*
    */
}


