public class ComidaFacade {
    private Carne carne;
    private Ensalada ensalada;

    public ComidaFacade(){
        this.carne = new Carne();
        this.ensalada = new Ensalada();
    }

    public void hacerComida(){
        carne.hacer();
        ensalada.hacer();
    }
}
