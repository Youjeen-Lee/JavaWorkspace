package polyclass;
    class Car2 { // 이전에 class Car 생성했으면 이미 메모리에 올라가 다른 페이지라도 영향을 받으므로 클래스명 다르게 해줘야함
        private String color;
        private int speed;

        Car2(String color, int speed) {
            this.color = color; // this.를 쓰는 이유 : 인스턴스 변수와 지역변수를 구별할 수 있고 다른 사람이 봐도 자기 자신을 참조했다는걸 직관적으로 알 수 있으면 가독성이 높아짐.
            this.speed = speed;
        }
        public String getColor() {
            return color;
        }
        public int getSpeed() {
            return speed;
        }
    }

    public class Ex12_07 { // 원래는 클래스 각각 파일 만들어주고 참조하는게 좋은 코딩인데 수업을 위해 클래스 2개를 같이 쓴거임.
        public static void main(String[] args) {

            Car2 myCar1 = new Car2("빨강" , 0); // () 개수 잘봐라. (( 되어서 에러남
            Car2 myCar2 = new Car2("파랑" , 30);

            System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 "
            + myCar1.getSpeed() + "km 입니다.");

            System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");

        }
}