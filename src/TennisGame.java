public class TennisGame {
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String DEUCE = "Deuce";
    public static final String ALL = " All";
    public static final String ADVANTAGE = "Advantage for ";
    public static final String WIN = "Win for ";

    public static void main(String[] args) {
        System.out.println("Tỉ số : (3-0) "+ getScore("Hùng", "Thắng",3,0));
        System.out.println("Tỉ số : (9-7) " +getScore("Hùng", "Thắng",9,7));
        System.out.println("Tỉ số : (6-6) " + getScore("Hùng", "Thắng",6,6));
        System.out.println("Tỉ số : (3-2) "+ getScore("Hùng", "Thắng",3,2));
        System.out.println("Tỉ số : (3-3) " + getScore("Hùng", "Thắng",3,3));
    }

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        if (player1Score == player2Score) {
            if(player1Score <=3){
                score = getScoreToString(player1Score)+ ALL;
            }else {
                score = DEUCE;
            }
        }else  if(player1Score >=4|| player2Score>=4) {
            int minusResult = player1Score-player2Score;
            if(Math.abs(minusResult)==1){
                score= minusResult>0?ADVANTAGE+player1Name:ADVANTAGE+player2Name;
            }else {
                score= minusResult>0?WIN+player1Name:WIN+player2Name;
            }
        }else {
            score = getScoreToString(player1Score) + " - "+getScoreToString(player2Score);
        }
//        String score = "";
//        int tempScore=0;
//        if (m_score1==m_score2)
//        {
//            switch (m_score1)
//            {
//                case 0:
//                    score = "Love-All";
//                    break;
//                case 1:
//                    score = "Fifteen-All";
//                    break;
//                case 2:
//                    score = "Thirty-All";
//                    break;
//                case 3:
//                    score = "Forty-All";
//                    break;
//                default:
//                    score = "Deuce";
//                    break;
//            }
//        }
//        else if (m_score1>=4 || m_score2>=4)
//        {
//            int minusResult = m_score1-m_score2;
//            if (minusResult==1) score ="Advantage player1";
//            else if (minusResult ==-1) score ="Advantage player2";
//            else if (minusResult>=2) score = "Win for player1";
//            else score ="Win for player2";
//        }
//        else
//        {
//            for (int i=1; i<3; i++)
//            {
//                if (i==1) tempScore = m_score1;
//                else { score+="-"; tempScore = m_score2;}
//                switch(tempScore)
//                {
//                    case 0:
//                        score+="Love";
//                        break;
//                    case 1:
//                        score+="Fifteen";
//                        break;
//                    case 2:
//                        score+="Thirty";
//                        break;
//                    case 3:
//                        score+="Forty";
//                        break;
//                }
//            }
//        }
//        return score;
        return score;
    }

    public static String getScoreToString(int score) {
        String scoreToString="";
        switch (score) {
            case 0:
                scoreToString = LOVE;
                break;
            case 1:
                scoreToString = FIFTEEN;
                break;
            case 2:
                scoreToString = THIRTY;
                break;
            case 3:
                scoreToString = FORTY;
                break;
            default:
                break;

        }
        return scoreToString;
    }
}
