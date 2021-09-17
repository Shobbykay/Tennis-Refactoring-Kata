
public class TennisGame3 extends Score implements TennisGame {
    
    private int p2;
    private int p1;
    public String p1N;
    public String p2N;

    public TennisGame3(String p1N, String p2N) {
        this.p1N = p1N;
        this.p2N = p2N;
    }

    public String getScore() {
        super.getPlayerScore(p1, p2);

    }
    
    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.p1 += 1;
        else
            this.p2 += 1;
        
    }

}
