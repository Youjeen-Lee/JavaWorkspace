package polyclass;

import java.util.*;

public class Ex09_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 최종 저장되는 list 구조
        List<Map<String, String>> list = new ArrayList<>();

        // List 구조 안에 저장될 Map 객체
        Map<String, String> map = null;

        for(int i = 0; i < 3; i++) {
            System.out.print("이름 : ");
            String name = sc.next(); // 이름 입력받기

            System.out.print("이메일 : ");
            String email = sc.next();

            System.out.print("부서 : ");
            String dept = sc.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            list.add(map);

            map = null;
        }
        // List 저장된 데이터 수
        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);
        System.out.println("1세대 반복뮨");

        for(int i = 0; i < listSize; i++) {
            Map<String, String> rMap = list.get(i);

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept :" +rMap.get("dept"));

            rMap = null; // 다 사용하면 메모리 비우기

        }
    }
}