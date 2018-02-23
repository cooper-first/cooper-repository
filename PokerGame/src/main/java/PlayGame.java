import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import static java.lang.Math.*;

public class PlayGame {
    public static String ONE = "成都的朋友们";
    Random random = new Random();
    List<Poker> maxOne = new ArrayList<Poker>();
    Poker testpoker = new Poker();
    public Poker getPoker(Man man,Poker poker) {
        int accept1, accept2;
        Poker pokerObject1 = new Poker();
        Poker pokerObject2 = new Poker();
        while (true) {
             accept1 = random.nextInt(52);
             accept2 = random.nextInt(52);
            if (accept1 != accept2) {
                break;
            }
        }
        pokerObject1.poker = poker.pokerArray[accept1];
        pokerObject2.poker = poker.pokerArray[accept2];
        man.manPoker.add(pokerObject1);
        man.manPoker.add(pokerObject2);
        System.out.println("您的两张牌是：");
        for (int i = 0; i <man.manPoker.size() ; i++) {
            System.out.print(man.manPoker.get(i).poker+"\t");
        }
        Collections.sort(man.manPoker);
        System.out.println(man.manPoker.get(1).poker);
        return man.manPoker.get(1);
    }



    public static void main(String[] args) {
        String two = "成都";
        String three = "成都";
        System.out.println(two.equals(three));

        System.out.println(PlayGame.ONE);

        PlayGame playGame = new PlayGame();
        playGame.testpoker.createPoker1();


//        Poker poker1 = new Poker();
//        poker1.createPoker1();
//        Man play1 = new Man();
//        Poker max1 = playGame.getPoker(play1,poker1);
//        Man play2 = new Man();
//        Poker max2 = playGame.getPoker(play2,poker1);
//        playGame.maxOne.add(max1);
//        playGame.maxOne.add(max2);
//        Collections.sort(playGame.maxOne);
//        System.out.println(playGame.maxOne.get(1).poker);
//        if (max1.poker.equals(playGame.maxOne.get(1).poker)) {
//            System.out.println("\n\n赢家是" + play1.getName());
//        }
//        if (max2.poker.equals(playGame.maxOne.get(1).poker)) {
//            System.out.println("\n\n赢家是" + play2.getName());
//        }
    }
}
