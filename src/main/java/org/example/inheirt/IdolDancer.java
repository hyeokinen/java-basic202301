package org.example.inheirt;

import org.example.basic.Dancer;


// 부모에 기본생성자가 없으면 오류가난다.
public class IdolDancer extends Dancer {

    private int numberOfFan; // 팬의 수

    // 생성자를 하나도 선언하지 않으면 기본 생성자가 자동으로 만들어진다.
    public IdolDancer(String creName, String myName){
        super(creName, myName);
        this.numberOfFan = 10;
        System.out.println("idol dancer ");
    }

    // 오버라이딩: 부모의 메서드를 재정의
    // 부모의 메서드 시그니처(이름, 리턴타입, 파라미터)를 똑같이 맞춰야함
    @Override
    public void dance(){
        super.dance(); // 부모의 댄스를 이어받는다.
        wink(); // 그리고 거기에 wink를 추가한다.
    }


    private void wink(){
        System.out.println("윙크를 하다");
    }

}
