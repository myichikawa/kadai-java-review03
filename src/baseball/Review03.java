package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam b1 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam b2 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam b3 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam b4 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam b5 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam b6 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        b1.report("東京ヤクルトスワローズ", 80, 59, 4);
        b2.report("横浜DeNAベイスターズ", 73, 68, 2);
        b3.report("阪神タイガース", 68, 71, 4);
        b4.report("読売ジャイアンツ", 68, 72, 3);
        b5.report("広島東洋カープ", 66, 74, 3);
        b6.report("中日ドラゴンズ", 66, 75, 2);


    }
}
