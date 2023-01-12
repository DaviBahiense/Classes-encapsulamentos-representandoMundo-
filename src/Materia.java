public class Materia {
    private String nome;
    private int semestre;
    private String assunto;
    Livro livro = new Livro();

  public  Materia (String nome, int semestre, String assunto){
    this.nome=nome;
    this.semestre = semestre;
    this.assunto= assunto;
  }

    public String getNome() {
        return nome;
    }
    public int getSemestre() {
        return semestre;
    }
    public String getAssunto() {
        return assunto;
    }
    public Livro getLivro() {
        return livro;
    }
   

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    
    
}
