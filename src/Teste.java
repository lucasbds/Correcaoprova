public class Teste{
    
    public static void main(String[] args) {
        
        Proprietario p1 = new Proprietario();
        p1.setNome("Lucas");
        
        Data da = new Data();
        da.setano(1997);
        da.setmes(04);
        da.setdia(30);
        
        Data r1 = new Data();
        r1.setdia(16);
        r1.setmes(16);
        r1.setano(2016);
        
        Imovel m1 = new Imovel();
        m1.setDatadaCompra(da);
        m1.setProprietario(p1);
        m1.setTipo("");
        
        p1.getmostrar();;
        m1.getinformarTipo("Sitio");
        m1.getmostrar();
        
}
    
}