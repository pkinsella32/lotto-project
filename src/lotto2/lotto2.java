/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto2;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Paul
 */
public class lotto2 extends JFrame {

    //declaring variables and arrays also initialising the arrays. --PK
    int game1;
    int game2;
    int game3;
    int userNums1;
    int userNums2;
    int userNums3;
    int userNums4;
    int userNums5;
    private int[] mainLotto = new int[5];
    private int[] lottoPlus1 = new int[5];
    private int[] lottoPlus2 = new int[5];
    private String gameType;
    private ArrayList<lotto2> lotto1;
    
    
//constructor - Asigning values to the variables and arrays --PK
    public lotto2() {
        game1 = 0;
        game2 = 0;
        game3 = 0;
        userNums1 = 0;
        userNums2 = 0;
        userNums3 = 0;
        userNums4 = 0;
        userNums5 = 0;
        mainLotto = new int[5];
        lottoPlus1 = new int[5];
        lottoPlus2 = new int[5];
    }
    
    
    
    //creates the array list object --PK
    public lotto2(ArrayList<lotto2> lotto1) {
        this.lotto1 = lotto1;

    }

    //Generates the random numbers for the main lotto gameType --PK
    public void randomNum1() {
        //generating 5 randon numbers between 1 - 40 and storing them in the array called "mainLotto" this also excludes numbers below 1 and above 40"
        for (int i = 0; i < mainLotto.length; i++) {
            mainLotto[i] = (int) Math.floor(1 + Math.random() * 40);

            // prints the 5 random numbers to the console
           // System.out.println(mainLotto[i] + ",");
        }
    }
    
    //Generates the random numbers for the lottoPlus1 gameType --PK
    public void randomNum2() {
        //generating 5 randon numbers between 1 - 40 and storing them in the array called "lottoPlus1" this also excludes numbers below 1 and above 40"
        for (int i = 0; i < lottoPlus1.length; i++) {
            lottoPlus1[i] = (int) Math.floor(1 + Math.random() * 40);

            // prints the 5 random numbers to the console
           // System.out.println(lottoPlus1[i] + ",");
        }

    }
    
    //Generates the random numbers for the lottoPlus2 gameType --PK
    public void randomNum3() {
        //generating 5 randon numbers between 1 - 40 and storing them in the array called "lottoPlus1" this also excludes numbers below 1 and above 40"
        for (int i = 0; i < lottoPlus2.length; i++) {
            lottoPlus2[i] = (int) Math.floor(1 + Math.random() * 40);

            // prints the 5 random numbers to the console
           // System.out.println(lottoPlus2[i] + ",");
        }

    }
    
    
    //compares the userNums against the contents of the gameType array list --PK
  
    public void compute() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                lotto2 l;//Added
                l = lotto1.get(i);//Added
                if (l.getGameType().equals("mainLotto")) {
                    if (mainLotto[j] == l.getUserNums1() || mainLotto[j] == l.getUserNums2() || mainLotto[j] == l.getUserNums3() || mainLotto[j] == l.getUserNums4() || mainLotto[j] == l.getUserNums5()) {
                        game1++;

                    }

                }
                

                if (l.getGameType().equals("lottoPlus1")) {
                    if (lottoPlus1[j] == l.getUserNums1() || lottoPlus1[j] == l.getUserNums2() || lottoPlus1[j] == l.getUserNums3() || lottoPlus1[j] == l.getUserNums4() || lottoPlus1[j] == l.getUserNums5()) {
                        game2++;

                    }

                }

                if (l.getGameType().equals("lottoPlus2")) {
                    if (lottoPlus2[j] == l.getUserNums1() || lottoPlus2[j] == l.getUserNums2() || lottoPlus2[j] == l.getUserNums3() || lottoPlus2[j] == l.getUserNums4() || lottoPlus2[j] == l.getUserNums5()) {
                        game3++;

                    }

                }

            }
        }

    }

    public int getUserNums1() {
        return userNums1;
    }

    public void setUserNums1(int userNums1) {
        this.userNums1 = userNums1;
    }

    public int getUserNums2() {
        return userNums2;
    }

    public void setUserNums2(int userNums2) {
        this.userNums2 = userNums2;
    }

    public int getUserNums3() {
        return userNums3;
    }

    public void setUserNums3(int userNums3) {
        this.userNums3 = userNums3;
    }

    public int getUserNums4() {
        return userNums4;
    }

    public void setUserNums4(int userNums4) {
        this.userNums4 = userNums4;
    }

    public int getUserNums5() {
        return userNums5;
    }

    public void setUserNums5(int userNums5) {
        this.userNums5 = userNums5;
    }

    public int[] getMainLotto() {
        return mainLotto;
    }

    public void setMainLotto(int[] mainLotto) {
        this.mainLotto = mainLotto;
    }

    public int[] getLottoPlus1() {
        return lottoPlus1;
    }

    public void setLottoPlus1(int[] lottoPlus1) {
        this.lottoPlus1 = lottoPlus1;
    }

    public int[] getLottoPlus2() {
        return lottoPlus2;
    }

    public void setLottoPlus2(int[] lottoPlus2) {
        this.lottoPlus2 = lottoPlus2;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public ArrayList<lotto2> getLotto1() {
        return lotto1;
    }

    public void setLotto1(ArrayList<lotto2> lotto1) {
        this.lotto1 = lotto1;
    }

    public int getGame1() {
        return game1;
    }

    public void setGame1(int game1) {
        this.game1 = game1;
    }

    public int getGame2() {
        return game2;
    }

    public void setGame2(int game2) {
        this.game2 = game2;
    }

    public int getGame3() {
        return game3;
    }

    public void setGame3(int game3) {
        this.game3 = game3;
    }
    
    

}
