package OrientaçãoObjeto.Adivinhacao.domain;

public class Player {
    private String name;
    private int life;

    public Player(String name) {
        this.name = name;
        life = 2;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + " | Vidas: " + this.life;
    }

    public String getName() {
        return this.name;
    }

    public int getLife() {
        return this.life;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life){
        this.life -= life;
    }

}
