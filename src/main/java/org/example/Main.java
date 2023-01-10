package org.example;

import org.example.basic.Dancer;
import org.example.inheirt.IdolDancer;
import org.example.inheirt.StreetDancer;

public class Main {
    public static void main(String[] args) {


//        // 기본생성자를 없을때는 스트링 2개를 갖는걸로 만들어야 한다.
//        Dancer dancer = new Dancer("총알탄소년단", "춤신춤왕");
//
//        // 기본생성자가 있을때
//
//        dancer.dance();


        IdolDancer idolDancer = new IdolDancer("ab6ix", "kim");

// ctrl +alt+ V로 빠르게 생성자 생성 가능
        StreetDancer streetDancer = new StreetDancer("길거리춤꾼", "박격포");

        idolDancer.dance();
        System.out.println();
        streetDancer.dance();
    }
}