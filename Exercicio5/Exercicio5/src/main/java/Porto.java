import com.mycompany.exercicio5.Navio;
import com.mycompany.exercicio5.Petroleiro;
import com.mycompany.exercicio5.PortaContentores;
import java.util.ArrayList;
import java.util.List;

public class Porto {
    private final List<Navio> naviosAtracados; // Usaremos uma lista para armazenar os navios atracados no porto.

    public Porto() {
        naviosAtracados = new ArrayList<>();
    }

    // Método para adicionar um novo navio sem permitir duplicação da Matrícula do Navio.
    public void adicionarNavio(Navio navio) {
        if (!verificarMatriculaDuplicada(navio.getMatricula())) {
            naviosAtracados.add(navio);
        } else {
            System.out.println("Já existe um navio com essa matrícula atracado no porto.");
        }
    }

    // Método auxiliar para verificar se já existe um navio com a mesma matrícula no porto.
    private boolean verificarMatriculaDuplicada(String matricula) {
        for (Navio navio : naviosAtracados) {
            if (navio.getMatricula().equals(matricula)) {
                return true; // A matrícula já está sendo usada por outro navio.
            }
        }
        return false; // Não há duplicação de matrícula.
    }

    // Método para devolver a quantidade máxima total de contentores de todos os navios porta contentores atracados no porto.
    public int getQuantidadeMaximaTotalContentores() {
        int totalContentores = 0;
        for (Navio navio : naviosAtracados) {
            if (navio instanceof PortaContentores portaContentores) {
                totalContentores += portaContentores.getNumeroMaximoContentores();
            }
        }
        return totalContentores;
    }

    // Método para devolver a capacidade total de carga de todos os navios porta contentores e petroleiros atracados no porto.
    // Cada contentor tem capacidade para 10 toneladas.
    public float getCapacidadeTotalCarga() {
        float capacidadeTotalCarga = 0;
        for (Navio navio : naviosAtracados) {
            switch (navio) {
                case PortaContentores portaContentores -> capacidadeTotalCarga += portaContentores.getNumeroMaximoContentores() * 10;
                case Petroleiro petroleiro -> capacidadeTotalCarga += petroleiro.getCapacidadeCarga();
                default -> {
                }
            }
        }
        return capacidadeTotalCarga;
    }
}
