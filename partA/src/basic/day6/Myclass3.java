package basic.day6;

//Myclass3애서 코드를 좀 더 프로페셔널하게 바꿉시다.

public class Myclass3 {
    //인스턴스 필드 : 클래스 내부에서 사용가능한 전역변수
    
    private String field1;
    private int field2;
    private double[] fiedl3;

    //생성자 만들지 않음
    
    public String getfield1(){
        return this.field1;
    } //this 는 현재 자신 객체를 나타내는 변수
      //getter 에서는 this 는 생략하고 쓰기도 함.

    public int getField2() {
        return field2;
    }

    public double[] getFiedl3() {
        return fiedl3;
    }

    public void setField1(String field1) { //인자로 쓰면 매개변수 : setfeild 메소드의 지역변수
        this.field1 = field1; //현재 객체의 field1 값에 인자 field1 대입하기
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public void setFiedl3(double[] fiedl3) {
        this.fiedl3 = fiedl3;
    }

}
