package practice_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }
    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }
    int addPlayer(){
        if (this.currentPlayers < maxPlayers) {
            return this.currentPlayers++;
        }
        return maxPlayers;
    }
    void printGameStatus() {
        System.out.println(this.gameName + " " + this.currentPlayers + " " + maxPlayers);
    }

}
