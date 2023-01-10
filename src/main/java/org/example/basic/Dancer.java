package org.example.basic;

// 매번 함수 사용할때마다 Math.~~ Math.~~ 사용하기 힘드니 Math클래스에서 가져오는것들은 식별자를 쓰지 않고도 사용가능하다.
// out도 정적 함수이기 때문에 import static java.lang을 통해서 system을 생략할수 있다.
// 생략하고자하는 클래스를 선택하고 Alt enter 을 통해서 간단하게 처리할수 있다.
import static java.lang.Math.*;
//import static java.lang.System.*;
import static org.example.basic.DanceLevel.*;

public class Dancer extends Object {


    // 상태불변 패턴을 만들때는 생성자로 해결한다.
    private final String crewName; // 팀 이름
    private final String myName; // 내 이름



    // 정해진 값들이 있을때는 String 보다는 열거형 타입을 사용하는게 좋다.
    private DanceLevel level = PRO; // 춤 수준(전문가, 중수, 하수, 초보자)

    // 생성자: 객체가 처음 생성될 때 호출되는 메서드
    // 초기에 생성자를 통해 입력값이 불변값이 되는것이다.
    public Dancer(String crewName, String myName){
        this.crewName = crewName;
        this.myName = myName;

        Math.random();
        Math.ceil(1.1);
        random();
        ceil(1.3);

        System.out.println();
//        out.println();
    }


    // 기본 생성자
    public Dancer(){
        this("기본크루", "이름없음");
//        this.crewName = "기본크루";
//        this.myName = "이름 없음"
    }

    // 스트레칭 했는지 필드추가
    private boolean stretch;

    // 유연성 운동 했는지 필드추가
    private boolean makeFlexible;

    // 스트레칭
    private void stretch() {
        System.out.println(myName + "님이 스트레칭 합니다.");
        this.stretch = true;
    }

    // 유연성 운동
    private void makeFlexible(){
        if (!stretch){
            System.out.println("스트레칭 안해서 다쳤습니다.");
            return;
        }
        System.out.println(myName + "님이 유연성 운동을 합니다.");
        this.makeFlexible = true;
    }

    // 춤추기
    public void dance(){

        stretch();
        makeFlexible();

        if (!makeFlexible){
            System.out.println("유연성 안해서 죽었습니다.");
            return;
        }
        System.out.println(myName + "님이 춤을 춥니다");
    }


    public String getCrewName() {
        return crewName;
    }

    public String getMyName() {
        return myName;
    }
}
