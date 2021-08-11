package entities;


public class Aluno {
    private String name;
    private String presenca;

    public Aluno(){

    }

    public Aluno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresenca() {
        return presenca;
    }

    public void setPresenca(String presenca) {
        this.presenca = presenca;
    }

    public boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    @Override
    public String toString(){
        return "Aluno: "+ name
                + ". ";
    }
}
