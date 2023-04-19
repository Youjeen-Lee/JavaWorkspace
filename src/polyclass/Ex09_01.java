//package polyclass;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class Ex09_01 {
//    public static void main(String[] args) {
//
//        List<String> list = new ArrayList<>(); // ArrayList 구현 방식으로 메모리에 올리기
//
//        list.add("이협건"); // List 객체에 데이터 추가하기
//        list.add("홍길동");
//        list.add("임꺽정");
//        list.add("고길동");
//
//        // List 저장된 데이터 수
//        int listSize = list.size();
//
//        System.out.println("저장된 데이터 수 : " + listSize);
////
////        System.out.println("1세대 반복문"); // 반복의 횟수를 알고있어야하는 1세대의 문제점
////
//////        for(int i = 0; 1 < listSize; i++) {
//////            System.out.println("이름 :" + list.get(i));
//////        }
//////
//////        System.out.println("2세대 반복문"); // 반복의 횟수를 알고있어야하는 1세대의 문제점을 개선함
//////
//////        for(String name : list) { // ':' == 배열 안의 연산자를 하나씩 가져와라
//////            System.out.println("이름 : " + name);
//////
//////           //  개선된 for 반복문 -- 3세대
//////           //  장점: 2세대보다 코딩해야하는 줄이 감소함, 람다식 적용
//////            System.out.println("3세대 반복문");
//////           // list.forEach(name -> System.out.println("name : " + name));
////
////            System.out.println("4세대 반복문");
////
////            list.parallelStream().forEach(name -> System.out.println("name : " + name));
//
////
////            //while 반복문 == 1.5세대 == for 반복문 1세대보다 처리 속도가 빠름
////            System.out.println("1.5세대 반복문");
////
////        Iterator<String> it = list.iterator();
////
////        while (it.hasNext())
////            String name = it.next();
////            System.out.println("이름 : " +  name);
////
////
////        }
////    }
////
