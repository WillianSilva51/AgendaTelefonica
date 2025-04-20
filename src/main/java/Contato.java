import java.util.ArrayList;
import java.util.List;

public class Contato implements Comparable<Contato> {
    private final String name;
    private final List<Fone> fones;

    public Contato(String name) {
        this.name = name;
        fones = new ArrayList<>();
    }

    private boolean foneJaAdicionado(Fone fone) {
        return fones.contains(fone);
    }

    public String getNome() {
        return name;
    }

    public int getQuantidadeFones() {
        return fones.size();
    }

    public List<Fone> getFones() {
        return fones;
    }

    public boolean adicionarFone(Fone fone) {
        if (Fone.eValido(fone.numero()) && !foneJaAdicionado(fone)) {
            return fones.add(fone);
        }

        return false;
    }

    public boolean removerFone(int index) {
        if (index >= 0 && index < fones.size()) {
            fones.remove(index);
            return true;
        }
        return false;
    }

    public int compareTo(Contato o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(name);

        for (int i = 0; i < fones.size(); i++) {
            sb.append(" [").append(i).append(":").append(fones.get(i).tipo()).append(fones.get(i).numero())
                    .append("]");
        }

        return sb.toString();
    }
}
