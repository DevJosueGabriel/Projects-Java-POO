public class Tecnico extends Aluno {
    private int registroProf;

    public void praticar(){
        System.out.println(this.getNome() + " está praticando.");
    }

    public int getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(int registroProf) {
        this.registroProf = registroProf;
    }
}
