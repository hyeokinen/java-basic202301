//package org.example.java8.anonymous;
//
//public class Main {
//
//    public static class SubCalculator implements Calculator {
//
//        @Override
//        public int operate(int n1, int n2) {
//            return n1 - n2;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        // 덧셈기능을 구현한 계산기 객체를 생성
//        Calculator addCal = new AddCalculator();
//        System.out.println(addCal.operate(10, 20));
//
//        // 뺄셈기능을 ~~~ (내부 클래스)
//        Calculator subCal = new SubCalculator();
//        System.out.println(subCal.operate(100, 20));
//
//        // 곱셈기능을 ~~~ (익명 클래스)
//        Calculator multiCal = new Calculator() {
//            @Override
//            public int operate(int n1, int n2) {
//                return n1 * n2;
//            }
//        };
//
//        System.out.println(multiCal.operate(20, 5));
//
//
//        // 나눗셈의 몫을 구하는 ~~~  (람다)
//        Calculator divCal = (n1, n2) -> n1 / n2;
//        System.out.println(divCal.operate(100, 50));
//
//    }
//}