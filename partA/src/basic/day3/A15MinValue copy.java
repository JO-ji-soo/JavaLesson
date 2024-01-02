package basic.day3;

public class A15MinValuecopy { //가장 작은 값 찾기
    public static void main(String[] args) {
        int n1 = 23;
        int n2 = 24;
        int n3 = 30;
        int min;

        if(n1 < n2) {
            min=n1;
        }
            
        else {      
            min=n2;
}
        if(min<n3){
           min=n3;
        }

        System.out.println("n1+"+n2 +",n2+" +n2 +",n3="+n3);
        System.out.println("최대값min"+min);

        n1=99; n2=88; n3=77;
        System.out.println("n1="+n1 +",n2="+n2+",n3="+n3);

        min =0;
        min = (n1<n2? n1:n2);
        min = (min>n3? n3:min);
        System.out.println("n1="+n1 +",n2="+n2+",n3="+n3);
        System.out.println("최대값 min="+min);





}

    @Override
    public String toString() {
        return "A15MinValue []";
    }

}
/* 
* ### 순서
* 한번만 할 것들
* git init
* git remote add origin
* git config --global user.email
* git config --global user.name

* 반복되는 작업은
* 1. vs code : staged Changes 로 커밋할 파일 선택하기
* 2. vs code : commin 하기. 메시지 꼭 작성하기
* 3. vs code : 메뉴에서 push. githug으로 소스 전송 확인하세요.

* 집에가서 한번만 할 것
* 1. git clone 원격주소
* 2. git config --global user.email
* 3. git config --global user.name
* 4. clone 으로 생긴 프로젝트를 bs clone 열기

* 집에가서 반복할 작업은
* 1. vs code : 메뉴에서 pull. githug에 있는 소스를 받아오기(동기화)
* 2. 새로 작성한 연습 코드 소스 파일은 stage - commit - push
*/