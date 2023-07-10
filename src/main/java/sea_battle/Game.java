package sea_battle;

import java.util.Scanner;

public class Game {
    private Player[] players = {new Player(), new Player()};
    private Messages mess = new Messages();
    private String tmpName;

    public Game() {
    }

    public void setGameParameters() {
        int choiceInt;
        String choice;
        System.out.print(mess.getMess1());
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            choice = sc1.next();
            choice = choice.toUpperCase();
            if (choice.equals("ДА") || choice.equals("НЕТ"))
                break;
            else {
                System.out.println("⚠ ПОЖАЛУЙСТА, ПРОВЕРЬТЕ ПРАВИЛЬНОСТЬ ВВОДА ⚠");
                System.out.print("\uD83C\uDF0A [ДА / НЕТ]: ");
            }
        }
        if (choice.toUpperCase() == "НЕТ") {
            System.out.println("«ТОЛЬКО СМЕЛЫМ ПОКОРЯЮТСЯ МОРЯ..»\nВСЕГО ДОБРОГО, ДОСВИДАНИЯ \uD83D\uDC4B");
            return;
        }
        System.out.println(mess.getMess2());
        System.out.print(mess.getMess3_1());
        tmpName = sc1.next();
        System.out.print("\uD83C\uDF0A ОЧЕНЬ ПРИЯТНО, " + tmpName.toUpperCase() + "!");
        System.out.print(mess.mess4());
        while (true) {
            choiceInt = sc1.nextInt();
            if (choiceInt >= 1 && choiceInt <= 3)
                break;
            System.out.print("⚠ ПОЖАЛУЙСТА, ПРОВЕРЬТЕ ПРАВИЛЬНОСТЬ ВВОДА ⚠");
            System.out.println("\n\uD83C\uDF0A [1 - 3]: ");
        }
        sc1.close();
        players[0].setLogo(choiceInt);
        players[0].setName(tmpName);
        tmpName = "гриша";
        System.out.println(mess.getMess3_2()); //TODO
        //tmpName = sc1.next();
        System.out.println("\n\uD83C\uDF0A"+mess.mess4(players[0].getLogo()));  //TODO нормально сделать
        System.out.print(mess.mess4(players[0].getLogo()));
        while (true) {
            choiceInt = sc1.nextInt();
            if (choiceInt >= 1 && choiceInt <= 3)
                break;
            System.out.print("⚠ ПОЖАЛУЙСТА, ПРОВЕРЬТЕ ПРАВИЛЬНОСТЬ ВВОДА ⚠");
            System.out.println("\n\uD83C\uDF0A [1 - 3]: ");
        }
        players[1].setLogo(choiceInt);
        players[1].setName(tmpName);
        sc1.close();
    }
}

