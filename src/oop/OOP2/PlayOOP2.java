package oop.OOP2;

import oop.OOP2.Voong.Cream;
import oop.OOP2.Voong.Hot;
import oop.OOP2.Voong.Pat;
import oop.OOP2.Voong.Voong;

import java.util.Scanner;

public class PlayOOP2 {
    Scanner sc = new Scanner(System.in);
    SonNeem son = new SonNeem();
    JangSu jang = new JangSu();

//    1. 돈을 지불하고 붕어빵 구매 ( 돈이 없을 때 구매하면 어떤 일이 벌어지는지? )
//    2. 내가 갖고 있는 붕어빵의 목록 출력
//        a. 붕어빵 먹기 ( 출력 : “아이 맛있다~ XX 맛이네~ + 개수”) , 번호를 눌러서
//    3. 판매 중인 붕어빵 목록, 가격 출력
//    4. 나의 소지금 확인
//    5. 붕어빵 장수의 금고에 있는 돈 확인
    public void startOOP2 () {
        while (true) {
            System.out.println(
                    "1.붕어빵 구매 \n" +
                            "2.내가 갖고 있는 붕어빵 목록\n" +
                            "3.판매 중인 붕어빵 목록, 가격\n" +
                            "4.나의 소지금\n" +
                            "5.붕어빵 장수의 금고 돈 확인\n"
            );
            switch (sc.next()) {
                case "1": {
                    buyVoong();
                    System.out.println("===============================");
                    break;
                }
                case "2": {
                    sonVoongList();
                    System.out.println("===============================");
                    break;
                }
                case "3": {
                    jangVoongList();
                    System.out.println("===============================");
                    break;
                }
                case "4": {
                   System.out.println(son.getMoney());
                   System.out.println("===============================");
                   break;
                }
                case "5": {
                    System.out.println(jang.getSafe().getMoney());
                    System.out.println("===============================");
                    break;
                }
                default:
                    System.out.println("없는 번호: " + sc.next());
            }
            if(son.getMoney()<0){
                System.out.println("파산");
                break;
            }

        }
    }

    private void buyVoong(){
        System.out.println("구매선택 0,1,2 :");
        int selectNum = sc.nextInt();
        switch (selectNum){
            case 0:{
                son.getCream().setCount(1);
                son.setMoney(son.getCream().getPrice());
                son.getVoongs().add(new Cream());
                jang.getSafe().setMoney(son.getCream().getPrice());
                break;
            }
            case 1:{
                son.getHot().setCount(1);
                son.setMoney(son.getHot().getPrice());
                son.getVoongs().add(new Hot());
                jang.getSafe().setMoney(son.getHot().getPrice());
                break;
            }
            case 2:{
                son.getPat().setCount(1);
                son.setMoney(son.getPat().getPrice());
                son.getVoongs().add(new Pat());
                jang.getSafe().setMoney(son.getPat().getPrice());
                break;
            }
            default:
                System.out.println("없는 번호: " + sc.next());
        }

        //손님 : 수량 + 돈 - 붕어빵 +
        //장수 : 돈 + -> 금고
    }

    private void sonVoongList(){
        son.getVoongs().clear();
        son.getVoongs().add(0,son.getCream());
        son.getVoongs().add(1,son.getHot());
        son.getVoongs().add(2,son.getPat());
        int i = 0;
            if(!son.getVoongs().isEmpty()) {
                for (Voong voong : son.getVoongs()) {
                    if(voong.getCount()>0) {
                        i += 1;
                        System.out.println(son.getVoongs().indexOf(voong)+"."+voong.getName());
                    }
                }
            }else System.out.println("붕어빵 없음");
        if(i>0) eatVoong();

    }

    private void jangVoongList() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "." + jang.getVoongs().get(i).getName()
                    + ":" + jang.getVoongs().get(i).getPrice());
        }
    }

    private void eatVoong(){
        System.out.println("먹을 붕어빵 선택 :");
        int selectNum = sc.nextInt();
            switch (selectNum){
                case 0: {
                    son.getCream().setCount(-1);
                    System.out.println("맛있다 " +son.getCream().getName() + " 맛이네 " + son.getCream().getCount()+"개 남았네");
                    break;
                }
                case 1: {
                    son.getHot().setCount(-1);
                    System.out.println("맛있다" +son.getHot().getName() + "맛이네" + son.getHot().getCount()+"개 남았네");
                    break;
                }
                case 2: {
                    son.getPat().setCount(-1);
                    System.out.println("맛있다" +son.getPat().getName() + "맛이네" + son.getPat().getCount()+"개 남았네");
                    break;
                }
                default:
                    System.out.println("없는 번호: " + sc.next());

            }
        }

    }
