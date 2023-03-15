package chap_01;

public class _05_Variablenaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자, 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능 (숫자로 시작 불가)
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자로 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, void, int 등등)


        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "소영"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "2001-12-31"; // 생년월일
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE657"; // 항공 편명
        String _flightNo = "KE657"; // 밑줄 시작
        String flight_no_2 = "KE657"; // 밑줄과 숫자 포함
        // String -flightNo = "Ke657";  ( '-'로는 시작 불가)
        
        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        String item1 = "시계";
        String item2 = "가방";
        // String 3item = "신발"; (숫자로는 시작 불가)

        int i = 0;
        String s = "";
        String str = "";
        // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 때)

        // 절대 변하지 않는 상수는 모두 대문자로 (final)
        final String CODE = "KR";
        // CODE = "US"; (상수이므로 KR만 가능)





    }
}