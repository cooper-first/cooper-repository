import java.util.*;

public class Poker implements Comparable<Poker> {
    String[] pokerArray;
    String poker;
    String stringNumber1="23456789",stringNumber2="10", stringNumber3 = "JQKA";
    List<String> pokerList = new ArrayList<String>();
    String stringTyep1="方块",stringType2= "红桃", stringType3="梅花", stringType4 = "黑桃";

    public void createPoker1() {
        System.out.println("------------创建扑克牌-----------------");
        createPoker(stringTyep1);
        createPoker(stringType2);
        createPoker(stringType3);
        createPoker(stringType4);
        pokerArray = pokerList.toArray(new String[pokerList.size()]);
        System.out.println(Arrays.toString(pokerArray));
        System.out.println("-----------扑克牌创建成功------------");
        pokerArray = washPoker(pokerArray);
        System.out.println(Arrays.toString(pokerArray));

        }

    public void createPoker(String string) {
        for (int j = 0; j <8 ; j++) {
            char catchChar = stringNumber1.charAt(j);
            Poker object = new Poker();
            pokerList.add(string + catchChar);

        }
        pokerList.add(string + stringNumber2);
        for (int i = 0; i <4 ; i++) {
            char catchChar = stringNumber3.charAt(i);
            pokerList.add(string + catchChar);
        }
    }

    public String[] washPoker(String[] stringArray) {
        System.out.println("----------------开始洗牌-----------------------");
        System.out.println("----------------洗牌结束------------------------");
        Set<String> setPoker = new HashSet<String>();
        setPoker.addAll(Arrays.asList(stringArray));
        String[] washPokerArray=setPoker.toArray(new String[setPoker.size()]);
        return washPokerArray;

    }

    public static void main(String[] args) {
        Poker poker1 = new Poker();

    }

    public String specialCase(String type) {
        if (type.equals("方块")) {
            type = "1";
            }
        if (type.equals("红桃")) {
            type = "2";
        }
        if (type.equals("梅花")) {
            type = "3";

        }
        if (type.equals("黑桃")) {
            type = "4";

        }
        return type;
    }

    public int compareTo(Poker o) {
        String a=this.poker.substring(2);
        String b = o.poker.substring(2);
        if (a.equals("10")) {
            a = "H";
        }
        if (b.equals("10")) {
            b = "H";

        }
        if (a.equals("Q")) {
            a = "L";

        }
        if (b.equals("Q")) {
            a = "L";
        }
        if (a.equals("K")) {
            a = "M";
        }
        if (b.equals("K")) {
            a = "M";
        }
        if (a.equals("A")) {
            a = "N";

        }
        if (b.equals("A")){
            b = "N";
            }
        if (a.equals(b)) {
            String a1 = specialCase(this.poker.substring(0, 2));
            String b1 = specialCase(o.poker.substring(0, 2));
            return a1.compareTo(b1);
        }
        return a.compareTo(b);


    }
}

