package com.itproger.myapplication;

import android.widget.Toast;

import java.util.Arrays;
import java.util.Scanner;

public class Ball {
    public static Ball ballA = new Ball(0, "а");
    public static Ball ballB = new Ball(0, "б");
    public static Ball ballC = new Ball(0, "с");
    public static Ball ballD = new Ball(0, "ди");

    public int znach;
    public String ima;
    public static String otwet;
    public static Ball[] twoTur = new Ball[2];//для var2
    public static int kolvo;//для var3/4
    //для var5:
    public static Ball[] spisok = new Ball[]{ballA, ballB, ballC, ballD};
    public static Ball[] tablNach = spisok;                 // 4
    public static Ball[] tablVtor = new Ball[spisok.length];
    public static int kolvoTurov = spisok.length - 1;          // 3
    public static Ball[][] all = new Ball[kolvoTurov][];
    public static int countOfNulls = 0;
    public static int lox = 0;

    public Ball(int znach, String ima) {//конструктор
        this.znach = znach;
        this.ima = ima;
    }

    public static int whatID(Ball[] where, Ball who) {
        int i;
        for (i = 0; i < where.length; i++) {
            if (where[i] == who) {
                break;
            }
        }
        return i;
    }

    public static <T> int indexOf(T[] arr, T val) {
        return Arrays.asList(arr).indexOf(val);
    }//чоэто

    //      ДОПОЛНИТЕЛЬНО:
    //Убрать надпись My Application
    //Сделать приложению название и значок
    //Нарисовать и вставить фон и радостную (очень) Ломилку
    //Сделать невозможным отступление назад
    //Сделать невозможным ввести число если ничего не написано
    //Реализовать ввод имён.
    //       ЖЕЛАТЕЛЬНО:
    //5 ВАРИАНТТТ
    //Подчистить тосты
    //Добавить 3 и 4 варианты
    //Что если равно??


    //1)
    public static String var1() {
        Ball[] spisok = new Ball[]{ballA, ballB, ballC, ballD};
        otwet = spisok[0].ima;
        for (int i = 1; i < 4; i++) {
            if (spisok[i].znach > spisok[i - 1].znach) {
                otwet = spisok[i].ima;
            }
        }
        return otwet;
    }

    //2)
    public static String var2() {
        Ball[] spisok = new Ball[]{ballA, ballB, ballC, ballD};
        //Ball[] twoTur = new Ball[2];
        Ball vremenno;
        for (int a = 4; a > 0; a--) {
            for (int i = 1; i < a; i++) {
                if (spisok[i].znach < spisok[i - 1].znach) {
                    vremenno = spisok[i];
                    spisok[i] = spisok[i - 1];
                    spisok[i - 1] = vremenno;
                }
            }
        }
        Ball spisokCopy0 = new Ball(spisok[2].znach, spisok[2].ima);
        twoTur[0] = spisokCopy0;
        Ball spisokCopy1 = new Ball(spisok[3].znach, spisok[3].ima);
        twoTur[1] = spisokCopy1;
        //twoTur[0] = spisok[2];
        //twoTur[1] = spisok[3];
        //System.arraycopy(spisok, 2, twoTur, 0, 2);

        /////Новый экран
        return "";
    }

    public static String var22() {
        /////После нового экрана
        otwet = twoTur[0].znach > twoTur[1].znach ? twoTur[0].ima : twoTur[1].ima;
        return otwet;
    }

    public static void var5() { //метод  размещает в шахматном порядке таблицы tablNach и tablVtor внутри all
    all[0] = tablNach;
        for(int y = 1; y<kolvoTurov; y++) {
            if (all[y - 1] == tablNach) {
                all[y] = tablVtor;
            } else {
                all[y] = tablNach;
            }
        }
    }

    public static String var55() {
//        for (int k = 0; k < kolvoTurov; k++) {//-1
//            //////////////////////////////
//            for (int kk = 0; kk < spisok.length; kk++) {
//                if (all[k][kk] != null) {
//                    System.out.println("\nТур номер " + k + ", оставшиеся в живых: " + (all[k][kk].ima));
//                } else {
//                    System.out.println("\nТур номер " + k + ", оставшееся место == null");
//                }
//            }
//            System.out.println("\n");
//            //////////////////////////////
//            int lox = 0;
//            for (int min = 1; min < spisok.length; min++) { //Находим лоха (минимум)
//                if (all[k][min] != null) {
//                    if (all[k][min].znach < all[k][lox].znach) {
//                        System.out.println("обнаружен новый минимум, это " + all[k][min].ima);
//                        lox = whatID(all[k], all[k][min]); //Нам нужно id лоха
//                    }
//                } else {
//                    countOfNulls = countOfNulls + 1; //да-да-да, костыль. Он тут чтоб А ЕСЛИ БАЛЛЫ РАВНЫ А А А задел на будущее так сказатб.
//                }
//            }
//            System.out.println("айди лоха " + lox);
//
//
//            if (lox > 0) {
//                System.out.println("id лоха > 0 --> Всё, что ДО него, щас сохраним");
//                if (k < kolvoTurov - 1) {
//                    for (int t = 0; t < lox; t++) {
//                        all[k + 1][t] = all[k][t];
//                    }
//                } else {
//                    otwet = all[kolvoTurov - 1][0].ima;
//                }
//            }
//
//            System.out.println("3 минус число нулей = ");
//            System.out.println(countOfNulls);
//
//            if (lox < (spisok.length - 1) - countOfNulls) {
//                System.out.println("id лоха < spisok.length-1 - *Число нулей в конце списка* --> Всё, что ПОСЛЕ него, щас сохраним");
//                if (k < kolvoTurov - 1) {
//                    System.out.println("Начнём сохранять с id " + (lox + 1));
//                    for (int tt = lox + 1; tt < spisok.length; tt++) {
//                        System.out.println("id сохраняемого = " + tt);
//                        if (all[k][tt] != null) {
//                            all[k + 1][tt - 1] = all[k][tt];
//                        }
//                    }
//                } else {
//                    otwet = all[kolvoTurov - 1][1].ima;
//                }
//            }
//
//
//            //countOfNulls=countOfNulls+1; //да-да-да, костыль. Ну блин я не знаю, как динамически сокращать размер массива который не ArrayList
//            for (int n = 0; n < spisok.length; n++) { //Обнуление всех элементов текущего списка
//                all[k][n] = null;
//            }
//        }
        return otwet;
    }
}
//    //3) по системе Кондорсе, в результате парных сравнений кандидатов;
//    public static String var3(){
//        Ball[] kondorse = new Ball[]{ballA, ballB, ballC, ballD};
//        Ball[] vremKondorse = new Ball[2]; //временно локальный победитель для 2 тура
//        boolean[] come = new boolean[]{false, false, false, false}; //Чтобы понять, кому начислять баллы после 2 раунда. Необязательна, но так проще читать.
//        String anotherOneForComparison; //Выбранное имя чтоб понять кого выбрал голосующий
//
//        for (int i=0; i<kolvo; i++){
//            System.out.println("Приветствую, голосующий №"+(i+1)+"! Вы должны будете в качестве ответа вписать имя.");
//            //A или B
//            //выбрать между kondorse[0].ima и +kondorse[1].ima //Здесь есть вариант, что юзер неверно впишет имя/////////
//            //anotherOneForComparison = sc.nextLine(); //////////////////          //////////////////////////////////////
//            if (anotherOneForComparison.equals(kondorse[0].ima)){ //если A то начислится 1 балл
//                kondorse[0].znach=kondorse[0].znach+1;
//                vremKondorse[0] = kondorse[0];
//                come[0] = true; //vremKondorse[0] = A
//            }else if (anotherOneForComparison.equals(kondorse[1].ima)) { //если B то начислится 1 балл
//                kondorse[1].znach = kondorse[1].znach + 1;
//                vremKondorse[0] = kondorse[1];
//                come[1] = true; //vremKondorse[0] = B
//            }else{
//                System.out.println("Вы неправильно ввели имя!");/////////////////////////////////////////////////////////
//                java.lang.System.exit(1);
//            }
//            //C или D
//            System.out.println("Выберите между кандидатом "+kondorse[2].ima+" и кандидатом "+kondorse[3].ima);
//            anotherOneForComparison = sc.nextLine();
//            if (anotherOneForComparison.equals(kondorse[2].ima)){ //если C то начислится 1 балл
//                kondorse[2].znach=kondorse[2].znach+1;
//                vremKondorse[1] = kondorse[2];
//                come[2] = true; //vremKondorse[1] = C
//            }else if (anotherOneForComparison.equals(kondorse[3].ima)) { //если D то начислится 1 балл
//                kondorse[3].znach = kondorse[3].znach + 1;
//                vremKondorse[1] = kondorse[3];
//                come[3] = true; //vremKondorse[1] = D
//            }else{
//                System.out.println("Вы неправильно ввели имя!");
//                java.lang.System.exit(1);
//            }
//            //Сравниваем 2ух победителей прошлого раунда
//            System.out.println("Выберите между кандидатом "+vremKondorse[0].ima+" и кандидатом "+vremKondorse[1].ima);
//            anotherOneForComparison = sc.nextLine();
//            if (anotherOneForComparison.equals(vremKondorse[0].ima)){ //Либо A либо B В СРАНЕНИИ либо с C либо с D
//                if(come[0]){
//                    kondorse[0].znach=kondorse[0].znach+1;
//                }else {
//                    kondorse[1].znach=kondorse[1].znach+1;
//                }
//            }else if (anotherOneForComparison.equals(vremKondorse[1].ima)){//Либо A либо B В СРАНЕНИИ либо с C либо с D
//                if(come[2]){
//                    kondorse[2].znach=kondorse[2].znach+1;
//                }else {
//                    kondorse[3].znach=kondorse[3].znach+1;
//                }
//            }else{
//                System.out.println("Вы неправильно ввели имя!");
//                java.lang.System.exit(1);
//            }
//            for(int n = 0; n < come.length; n++){//сброс всех true
//                come[n] = false;
//            }
//        }
//        for (int t = 1; t<kondorse.length; t++){ //финальное сравнение набранных баллов
//            if (kondorse[t].znach>kondorse[t-1].znach){
//                otwet = kondorse[t].ima;
//            }
//        }
//        return otwet;
//    }
//
//    //4) по системе Борда (набирая баллы за места);
//    public static String var4(){
//        Ball[] bord = new Ball[]{ballA, ballB, ballC, ballD};
//        int[] doNotReplay = new int[bord.length]; //шобы нельзя было нескольким кандидатам ставить одинаковую оценку
//        int anotherOneForComparison; //Выбранное имя чтоб понять кого выбрал голосующий
//
//        for (int i=0; i<kolvo; i++){
//            for (int dont = 0; dont < bord.length; dont++){
//                //doNotReplay[dont] = bord[dont].znach;
//                doNotReplay[dont]=-1;
//            }
//            System.out.println("Приветствую, голосующий №"+(i+1)+"! Вы должны будете в ответе оценить кандидата от 1 до "+ bord.length +" баллами. Повторяться нельзя.");
//            for (int n = 0; n< bord.length; n++) {
//                System.out.println("Сколько баллов вы присвоите кандидату " + bord[n].ima + "?");
//                anotherOneForComparison = sc.nextInt();
//                if (anotherOneForComparison <= bord.length && anotherOneForComparison>=1) {//проверка не слишком ли маленькое или большое число
//                    for (int kh = 0; kh < bord.length; kh++) {//перебор проверочного массива с целью проверки
//                        if (doNotReplay[kh] == anotherOneForComparison) {//если это число есть в проверочном массиве, то:
//                            System.out.println("Вы неправильно ввели число! Оно уже числится в списке используемых чисел");
//                            System.exit(1);
//                        } //else { //если всё-всё в порядке, то:
//                    }
//                    bord[n].znach = bord[n].znach + anotherOneForComparison;
//                    doNotReplay[n] = anotherOneForComparison;
//                }else{
//                    System.out.println("Вы неправильно ввели число! Оно не соответсвует условиям задания.");
//                    System.exit(1);
//                }
//            }
//        }
//        for (int t = 1; t<bord.length; t++){ //финальное сравнение набранных баллов
//            if (bord[t].znach>bord[t-1].znach){
//                otwet = bord[t].ima;
//            }
//        }
//        return otwet;
//    }