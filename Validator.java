public class Validator {
    public void erroNome(String texto, int tamanho) {
        if (texto.length() > tamanho) {
            System.out.println("Nome inválido, por favor, digite novamente");
        }
    }

    public void erroNotas(double notas) {
        if (notas > 10) {
            System.out.println("Nota maior que 10, por favor, digite novamente");
            erroNotas(notas);
        }
    }
}