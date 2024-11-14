package ss8_clean_code_and_refactoring.bai_tap.refactoring;

public class TennisGame {

    private static final int SCORE_LOVE = 0;
    private static final int SCORE_FIFTEEN = 1;
    private static final int SCORE_THIRTY = 2;
    private static final int SCORE_FORTY = 3;
    private static final int WINNING_SCORE = 4;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (isScoreEqual(player1Score, player2Score)) {
            return getEqualScoreDescription(player1Score);
        } else if (isEndGame(player1Score, player2Score)) {
            return getEndGameScoreDescription(player1Score, player2Score);
        } else {
            return getNormalScoreDescription(player1Score, player2Score);
        }
    }

    private static boolean isScoreEqual(int score1, int score2) {
        return score1 == score2;
    }

    private static String getEqualScoreDescription(int score) {
        switch (score) {
            case SCORE_LOVE:
                return "Love-All";
            case SCORE_FIFTEEN:
                return "Fifteen-All";
            case SCORE_THIRTY:
                return "Thirty-All";
            case SCORE_FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static boolean isEndGame(int score1, int score2) {
        return score1 >= WINNING_SCORE || score2 >= WINNING_SCORE;
    }

    private static String getEndGameScoreDescription(int score1, int score2) {
        int scoreDifference = score1 - score2;
        if (scoreDifference == 1){
            return "Advantage player1";
        }
        else if (scoreDifference == -1){
            return "Advantage player2";
        }
        else if (scoreDifference >= 2){
            return "Win for player1";
        }
        else{
            return "Win for player2";
        }
    }

    private static String getNormalScoreDescription(int player1Score, int player2Score) {
        return getScoreDescription(player1Score) + "-" + getScoreDescription(player2Score);
    }

    private static String getScoreDescription(int score) {
        switch (score) {
            case SCORE_LOVE:
                return "Love";
            case SCORE_FIFTEEN:
                return "Fifteen";
            case SCORE_THIRTY:
                return "Thirty";
            case SCORE_FORTY:
                return "Forty";
            default:
                return "";
        }
    }
}
