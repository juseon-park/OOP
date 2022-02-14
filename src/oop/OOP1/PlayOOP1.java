package oop.OOP1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayOOP1 {
    private HeroInfo hero1;
    private HeroInfo hero2;
    private ArrayList<HeroInfo> players = new ArrayList<>();
    private int attacker = 0;
    private int defender = 1;

    Scanner sc = new Scanner(System.in);

    private void startGame(){
        System.out.print("이름1 입력:");
        hero1 = new HeroInfo(sc.next());
        players.add(hero1);
        System.out.print("이름2 입력:");
        hero2 = new HeroInfo(sc.next());
        players.add(hero2);
    }

    public void playGame(){
        startGame();
        while (true){
            if(attacker == 1) {
                attacker = 0;
                defender = 1;
            } else {
                attacker = 1;
                defender = 0;
            }
            System.out.print("공격) 0 or 1 선택 :");
            hit( players.get(defender) , sc.nextInt() );
            result( players.get(attacker) , players.get(defender) );
            if(players.get(defender).getHp() == 0)
                break;
        }
    }

    private void hit(HeroInfo defender,int selectNum){
        Random random = new Random();
        int correct = random.nextInt(2);
        if(correct == selectNum){
            System.out.println("성공");
            defender.setHp(defender.getHp()-10);
        }else{
            System.out.println("실패");
        }
    }

    private void result(HeroInfo attacker,HeroInfo defender){
        System.out.println("["+attacker.getName()+"] 의 펀치");
        System.out.println(defender.getName() + ":"+defender.getHp()+"/20" );
    }

}
