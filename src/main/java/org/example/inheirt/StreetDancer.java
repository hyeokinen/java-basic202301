package org.example.inheirt;

import org.example.basic.Dancer;

public class StreetDancer extends Dancer {


    // alt +Insert로 빠르게 생성자 생성가능
    public StreetDancer(String crewName, String myName) {
        super(crewName, myName);
    }

    @Override
    public void dance(){
        super.dance();
        System.out.println("비보이을 합니다.");
    }
}
