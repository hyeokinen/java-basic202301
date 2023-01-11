package org.example.java8.lambda;

import java.util.List;

import static org.example.java8.lambda.Color.*;

public class Main {

    public static void main(String[] args) {

        // 사과바구니 생성
        List<Apple> appleList = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
        );

        List<Apple> greenApples
                = FilteringApple.filterGreenApples(appleList);

        System.out.println("===== 녹색 사과 필터링 =====");
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

    }
}