package lesson5.sea_battle;

import java.util.Random;
import java.util.Scanner;

public class Messages {
    private static int f1, f2, f3, f4, ff1, ff2, ff3, ff4;
    private static String ch1,ch2,ch3,ch4;
    private static String tmpName;
    private Flags[] f = {
            new Flags(1, getCh1(), getFlag1()),
            new Flags(2, getCh2(), getFlag2()),
            new Flags(3, getCh3(), getFlag3()),
            new Flags(4, getCh4(), getFlag4())
    };

    private static String flag1 = "\n\uD83C\uDF0A \uD83C\uDFF4\u200D☠\uFE0F «ПИРАТСКИЙ»    - ";
    private static String flag2 = "\n\uD83C\uDF0A \uD83C\uDDE7\uD83C\uDDF2 «БЕРМУДСКИЙ»   - ";
    private static String flag3 = "\n\uD83C\uDF0A \uD83C\uDDF5\uD83C\uDDE6 «ПАНАМСКИЙ»    - ";
    private static String flag4 = "\n\uD83C\uDF0A \uD83C\uDDF8\uD83C\uDDF4 «СОМАЛИЙСКИЙ»  - ";
    private String mess1 = "\uD83C\uDF0A"+" ЗДРАВСТВУЙТЕ! ПЕРЕД ВАМИ ИГРА «МОРСКОЙ БОЙ», ПРЕДНАЗНАЧЕННАЯ ДЛЯ ДВУХ ИГРОКОВ.\n\uD83C\uDF0A ХОДЫ ДЕЛАЮТСЯ ПООЧЕРЕДНО, ПЕРВЫЙ ХОД ОПРЕДЕЛЯЕТСЯ ЖРЕБИЕМ. ЖЕЛАЕТЕ СЫГРАТЬ?\n\uD83C\uDF0A [ДА / НЕТ]: ";
    private String mess2 = "\uD83C\uDF0A ХО - ХО - ХО!\n\uD83C\uDF0A ОТЛИЧНО! РАД ПРИВЕТСТВОВАТЬ, ДРУЗЬЯ!\n\uD83C\uDF0A УКАЗАЖИТЕ ВАШИ ИМЕНА, И ОПРЕДЕЛИТЕСЬ ПОД КАКИМИ ФЛАГАМИ, ВЫ БУДЕТЕ СРАЖАТЬСЯ!";
    private String mess3_1 = "\uD83C\uDF0A И ТАК, ИГРОК НОМЕР ОДИН, КАК МОЖНО К ВАМ ОБРАЩАТЬСЯ?\n\uD83C\uDF0A FIRST PLAYER: ";
    private String mess3_2 = "\uD83C\uDF0A ИГРОК НОМЕР 2, КАК ВАС ЗОВУТ?\n\uD83C\uDF0A SECOND PLAYER: ";
    private String mess4_1 = "\n\uD83C\uDF0A ПОД КАКИМ ФЛАГОМ ПОЙДЁТ В МОРЕ ВАШ ФЛОТ?";
    private String mess4_2 = "\uD83C\uDF0A КАКОЙ ФЛАГ БУДЕТ РАЗВИВАТЬСЯ НАД ВАШИМИ ЭСМИНЦАМИ?";

    public Messages() {}

    public String getMess1() {
        return mess1;
    }

    public String getMess2() {
        return mess2;
    }

    public String mess4() {
        Random r = new Random();
        int[] repeat = new int[4];
        int tmp;
        String subStr = "";
        for (int i = 1; i <= 3; i++) {
            tmp = r.nextInt(5);
            if (tmp != repeat[0] && tmp != repeat[1] && tmp != repeat[2] && tmp != repeat[3]) {
                repeat[i - 1] = tmp;
                switch (tmp) {
                    case 1:
                        f1 = i;
                        subStr += (f[0].getStr() + " " + f1 + ".");
                        ff1 = f[0].getId();
                        ch1 = f[0].getLogo();
                        break;
                    case 2:
                        f2 = i;
                        subStr += f[1].getStr() + " " + f2 + ".";
                        ff2 = f[1].getId();
                        ch2 = f[1].getLogo();
                        break;
                    case 3:
                        f3 = i;
                        subStr += f[2].getStr() + " " + f3 + ".";
                        ff3 = f[2].getId();
                        ch3 = f[2].getLogo();
                        break;
                    case 4:
                        f4 = i;
                        subStr += f[3].getStr() + " " + f4 + ".";
                        ff4 = f[3].getId();
                        ch4 = f[3].getLogo();
                        break;
                }
            } else i--;
        }
        return mess4_1 + subStr + "\n\uD83C\uDF0A [1 - 3]: ";
    }

    public String mess4(String logoOne){
        Random r = new Random();
        int[] repeat = new int[4];
        int tmp;
        String subStr = "";
        for (int i = 1; i <= 3; i++) {
            tmp = r.nextInt(5);
            if ((tmp != repeat[0] && tmp != repeat[1] && tmp != repeat[2] && tmp != repeat[3])&&f[i].getLogo()!=logoOne) {
                repeat[i - 1] = tmp;
                switch (tmp) {
                    case 1:
                        subStr += f[0].getStr();
                        f1 = i;
                        ff1 = f[0].getId();
                        ch1 = f[0].getLogo();
                        break;
                    case 2:
                        subStr += f[1].getStr();
                        f2 = i;
                        ff2 = f[1].getId();
                        ch2 = f[1].getLogo();
                        break;
                    case 3:
                        subStr += f[2].getStr();
                        f3 = i;
                        ff3 = f[2].getId();
                        ch3 = f[2].getLogo();
                        break;
                    case 4:
                        subStr += f[3].getStr();
                        f4 = i;
                        ff4 = f[3].getId();
                        ch4 = f[3].getLogo();
                        break;
                }
            } else i--;
        }
        return mess4_2 + subStr + "\n\uD83C\uDF0A [1 - 3]: ";
    }

    public String getMess3_1() {
        return mess3_1;
    }

    public String getMess3_2() {
        return mess3_2;
    }

    public String getMess4_1() {
        return mess4_1;
    }

    public String getMess4_2() {
        return mess4_2;
    }

    public static String getCh1() {
        return ch1;
    }

    public static String getCh2() {
        return ch2;
    }

    public static String getCh3() {
        return ch3;
    }

    public static String getCh4() {
        return ch4;
    }

    public static String getFlag1() {
        return flag1;
    }

    public static String getFlag2() {
        return flag2;
    }

    public static String getFlag3() {
        return flag3;
    }

    public static String getFlag4() {
        return flag4;
    }

}

