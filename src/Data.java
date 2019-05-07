/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
     
    public void setDia (int dia) {
        this.dia = dia;    
    }
    
     public void setMes (int mes) {
        this.mes = mes;    
    }
     
      public void setAno (int ano) {
        this.ano = ano;    
    }
      
      
    
    public int getDia(){
            return this.dia;
    }
    
    
    public int getMes(){
            return this.mes;
    }
    
    
    public int getAno(){
            return this.ano;
    }
    public void mostrar() {
        System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno());
       // System.out.println(this.getMes());
       // System.out.println(this.getAno());
    
    }
    
}


