package OrientaçãoObjeto.Adivinhacao.domain;

public class Jogo {
    private int randomNumber;
    private Player player;
    private int number;
    private boolean gameIsAlive = true;

    public Jogo(Player player) {
        this.player = new Player(player.getName());
    }

    public void setRandomNumber() {
        this.randomNumber = (int) (Math.random() * 101);
    }

    public int getRandomNumber() {
        return this.randomNumber;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean getGameIsAlive() {
        return this.gameIsAlive;
    }

    public String hpDamage() {
        if (this.number != this.randomNumber) {
            player.setLife(1);
            return giveHint() + " Vidas restantes: " + (player.getLife() + 1);
        }
        return "Você acertou! Tentativas que restaram: " + (player.getLife() + 1);
    }

    public String giveHint() {
        if (this.number < this.randomNumber) {
            return "Um pouco mais!";
        }
        return "Um pouco menos!";
    }

    public void erro() {
        if (this.number == this.randomNumber) {
            return;
        }

        if (player.getLife() < 0) {
            System.out.println("Você perdeu! O número era: " + getRandomNumber());
            return;
        }
        System.out.println("Tente novamente!");
    }

    public boolean endGame() {
        if (player.getLife() < 0 || this.number == this.randomNumber) {
            return this.gameIsAlive = false;
        }
        return this.gameIsAlive = true;
    }
}