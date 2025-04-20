public record Fone(Tipo tipo, String numero) {

    public static boolean eValido(String numero) {
        return numero.matches("[()0-9-]+");
    }
}