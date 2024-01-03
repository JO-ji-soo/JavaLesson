package basic.day2;

public class A11StringMethod {
    public static void main(String[] args) {
        //메소드는 메소드이름 뒤에 괄호가 따라옵니다.
        //그리고, 괄호안의 값들은 메소드 처리에 필요한 입력데이터 -> 메소드의 '인자'라고 합니다.
        //        메소드가 처리한 결과는 출력 데이터 -> 메소드의 '리턴(반환)값'이라고 합니다.
        
        //자바 string의 중요한 메소드 7가지씩 조사해서 테스트 해보기

        String message = "Hello, World~";
        //1. 메소드 괄호안에 아무것도 없는 것 : length, isEmpty, toUpperCase, toLowerCase
        System.out.println("message.length():"+message.length());
        System.out.println("message.toUpperCase():+"+message.toUpperCase());
        System.out.println("message.toLowerCase():"+message.toLowerCase());
        System.out.println("message.isEmpty():"+message.isEmpty());
 
        //2. 메소드 괄호안에 정수 1개를 쓰는 것 : charAt, split
        //문자의 문자열은 0부터 순서대로 문자에게 번호를 매깁니다. -> index
        System.out.println("message.charAt(0):"+message.charAt(0));
        System.out.println("message.charAt(3):"+message.charAt(3));
        //현재 message에서 마지막 인덱스는 얼마인가하면...length-1

        //3. 메소드 괄호안에 문자열 1개를 쓰는 것 : concat, equals, startsWith, endsWith, indexOF
        System.out.println("message.concat(\"~짱짱\") :"+message.concat("~짱짱"));
        System.out.println("message.startsWith(\"hello\") :"+message.startsWith("hello"));
        System.out.println("message.startsWith(\"Hello\") :"+message.startsWith("Hello"));
        System.out.println("message.endsWith(\"Hello\") : "+message.endsWith("~"));
        //indexOF는 문자열안에서 원하는 단어의 위치를 찾기 -> 시작위치 index값을 리턴, 단어가 없으면 -1을 리턴
         System.out.println("message.indexOF(\"World\") :"+message.indexOf("World"));
         System.out.println("message.indexOF(\"world\") :"+message.indexOf("world"));


        //4. 메소드 괄호안에 정수 2개를 쓰는 것 : substring (문자열 부분 추출: 시작인덱스,마지막인덱스값을 인자로 주기)
        System.out.println("message.substring(0,4) : "+message.substring(0,4)); 
        System.out.println("message.substring(2,4) : "+message.substring(2,4));
        //추출할 때 마지막 인덱스 4는 포함 안함. 결국 추출하는 문자개수는 endIndex-beginIndex 공식이 성립합니다.

        message="hello";
        System.out.println("message.equals(\"Hello\") : "+message.equals("Hello"));
        System.out.println("message.equals(\"hello\") : "+message.equals("hello"));

        //5. 메소드 괄호안에 문자 또는 문자열 2개를 쓰는 것 : replace (문자열 바꾸기)
         System.out.println(message.replace("11","****"));

         //질문에 공유
         // 1)메소드의 리턴타입에 따라 결과를 저장할 변수를 일치하는 형식으로 선언하기
         String temp = message. toUpperCase().substring(3,5); 
         //                             2) 문자열리턴값으로 또 메소드 실행할 수 있음
         System.out.println("message.toUpperCase().substring(3,5):"+message.toUpperCase().substring(0));
         int length=message.length();
                 message.charAt(5);

         // ****** 리턴값 형식을 기준으로 정리하기 ******
         //  boolean : equals, isEmpty, startsWith, endsWith, isBlank
         //  Strting : replace, substring, toUpperCase, toLowerCase, concat
         //  int : length, indexOF
         //  char : charAt

         //* 입력 --> 출력 --> 처리 의 과정을 항상 생각하라.
         //* 문자열 메소드에도 입력,출력을 생각해 볼 수 있습니다. 입력은 메소드의 인자, 출력은 메소드의 리턴
         //     단, message.charAt(1) 를 예시로 하면 message는 메소드의 실행 주체(주인). 
         //     그리고, 리턴이 없는 메소드가 있을 수 있으며 그 때는 void로 표현됩니다.*/


    }
}
