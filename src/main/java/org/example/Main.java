package org.example;

import org.example.basic.Dancer;
import org.example.inheirt.IdolDancer;
import org.example.inheirt.StreetDancer;
import org.example.poly.PerformanceTeam;

public class Main {
    public static void main(String[] args) {


//        // 기본생성자를 없을때는 스트링 2개를 갖는걸로 만들어야 한다.
//        Dancer dancer = new Dancer("총알탄소년단", "춤신춤왕");
//
//        // 기본생성자가 있을때
//
//        dancer.dance();


//        IdolDancer idolDancer = new IdolDancer("ab6ix", "kim");

// ctrl +alt+ V로 빠르게 생성자 생성 가능
//        StreetDancer streetDancer = new StreetDancer("길거리춤꾼", "박격포");
//
//        idolDancer.dance();
//        System.out.println();
//        streetDancer.dance();



        // 다형성
        Dancer idolDancer1 = new IdolDancer("아이돌팀1", "아이돌1");
        Dancer idolDancer2 = new IdolDancer("아이돌팀2", "아이돌2");
        Dancer idolDancer3 = new IdolDancer("아이돌팀3", "아이돌3");

        Dancer streetDancer1 = new StreetDancer("스트릿팀1", "스트릿댄서1");
        Dancer streetDancer2 = new StreetDancer("스트릿팀2", "스트릿댄서2");
        Dancer streetDancer3 = new StreetDancer("스트릿팀3", "스트릿댄서3");

        PerformanceTeam team = new PerformanceTeam();

        team.joinDancer(idolDancer1);
        team.joinDancer(streetDancer3);
        team.joinDancer(streetDancer2);
        team.joinDancer(idolDancer3);

    }
}