public class Score {

    protected int player1;
    protected int player2;

    public Score(int player1, int player2) {
        this.player1 = player1;
        this.player2 = player2;
        
    }

    private String nameFor(int score) {
        String name = "";
        switch(score)
        {
            case 0:
                name="Love";
                break;
            case 1:
                name="Fifteen";
                break;
            case 2:
                name="Thirty";
                break;
            case 3:
                name="Forty";
                break;
        }
        return name;
    }

    public String getPlayerScore(){  
        String nameForPlayer = nameFor(p1);

        if (player1 < 4 && player2 < 4 && !(player1 + player2 == 6)) {
            return (player1 == player2) ? nameForPlayer + "-All" : nameForPlayer + "-" + nameFor(player2);
        } else {
            if (player1 == player2)
                return "Deuce";
            nameForPlayer = player1 > player2 ? TennisGame3.p1N : TennisGame3.p2N;
            return ((player1-player2)*(player1-player2) == 1) ? "Advantage " + nameForPlayer : "Win for " + nameForPlayer;
        }     
        return nameFor(player1.getScore()) + "-" + nameFor(player2.getScore());
    }
}