import java.util.Scanner;

public class Main {



    public static void main(String[] args) {



        System.out.println("您是否要租车：1是，2否");
        Scanner input = new Scanner(System.in);
        int catchUser = input.nextInt();
        if (catchUser==1) {
            System.out.println("序号\t汽车名称\t租金\t容量");
            System.out.println("1.\t奥迪\t    500元/天\t载人:4人");
            System.out.println("2.\t马自\t    400元/天\t载人:4人");
            System.out.println("3.\t皮卡雪\t450元/天\t载人:4人\t载货:2吨");
            System.out.println("4.\t金龙\t    800元/天\t载人:20人");
            System.out.println("5.\t松花\t    400元/天\t载货:40吨");
        }
        System.out.println("请输入您需要的车辆的数目");
        catchUser = input.nextInt();
        CarInformation[] car = {new CarAudi1(), new CarMazida62(), new CarPikaxue63(), new CarJinlong4(), new CarSonghuajiang5()};
        CarInformation[] car1 = new CarInformation[catchUser];
        for (int i = 0; i <car1.length ; i++) {
            System.out.println("请输入第" + (i + 1) + "辆车的序号：");
            catchUser = input.nextInt();
            if (catchUser==1)
                car1[i] = car[0];
            if (catchUser == 2)
                car1[i] = car[1];
            if (catchUser == 3)
                car1[i] = car[2];
            if (catchUser == 4)
                car1[i] = car[3];
            if (catchUser == 5)
                car1[i] = car[4];


        }
        System.out.println("请输入租车天数");
        int days = input.nextInt();
        int manCarNumber = 0;
        String manCarName="", goodsCarName="";
        int money = 0;
        int goodsCarNumber = 0,peopleCount=0,goodsCount=0;
        for (int i = 0; i <car1.length ; i++) {
            if (car1[i].mannumber != 0) {
                manCarNumber++;
                manCarName = manCarName + car1[i].name + "\t";
                peopleCount = car1[i].mannumber + peopleCount;
            }
            if (car1[i].goodsnumber!=0) {
                goodsCarNumber++;
                goodsCarName = goodsCarName + "\t" + car1[i].name;
                goodsCount= car1[i].goodsnumber + goodsCount;

            }
            money = car1[i].price * days + money;
            money = car1[i].price * days + money;

            }
        System.out.println("您的账单为：");
        System.out.println("可载人的车有:");
        System.out.println(manCarName + "\t" + "共计" + manCarNumber + "辆" + "\t" + "共计" + peopleCount + "人");
        System.out.println("可载货物的车有：");
        System.out.println(goodsCarName+"\t"+"共计"+goodsCarNumber+"辆"+"\t"+"共计"+goodsCount+"吨货物");
        System.out.println("共计金额:"+money);
    }

    }


