package day0613;
// 배열
// 배열이란? 똑같은 데이터 타입이고 똑같은 목적을 가진 변수를
// 여러 개가 필요할 때, 굳이 각각의 변수를 따로 만드는 것이 아니라
// 하나의 이름으로 묶어서 제어할 수 있게 만들어주는 데이터 타입이다.
// 참조형 데이터 타입, 반드시 new 로 초기화 해주어야함.

// 배열은 우리가 사용할 때 총 몇 개의 변수(= 길이)를 저장할지 명시해주어야 하고,
// 똑같은 데이터 타입만 묶어줄 수 있다.

// 배열의 선언과 초기화
// 데이터타입[] 배열이름 = new 데이터타입[길이]

// 기본형 데이터타입의 배열은 각 칸이 0으로 초기화된다.
// 참조형 데이터타입의 배열은 각 칸이 null로 초기화된다.

//


public class Ex01Array {
    public static void main (String [] args) {
        String str = null;
        System.out.println(str);
    }
}
