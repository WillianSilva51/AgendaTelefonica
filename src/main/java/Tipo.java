public enum Tipo {
    
    CELULAR("Celular"),
    CASA("Casa"),
    TRABALHO("Trabalho");

    private final String tipo;

    Tipo(String nome){
        this.tipo = nome;
    }

    @Override
    public String toString() {
        return this.tipo;
    }
}
