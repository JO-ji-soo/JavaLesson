package object.day5;

public class Score {
    
    private String name;   //학생 이름
    private int grade;     //학년
    private int[] jumsues; //점수들이 저장될 배열
                           //배열의 크기는 학년마다 다를 수 있음.

    //getter
    public String getName(){
        return name;
        }
        public int getGrade(){
        return grade;
        }
        public int[] getJumsues(){
        return jumsues;
        }
    

    //setter

    public void setName(String name){
        name = name;
    }
    public void setGrade(int grade){
        grade = grade;
    }
    public void setJumsues(int[] fj){
        jumsues = fj;
    }
    
    //점수의 합계를 리턴하는 sum()메소드
    public int sum(){
        int sum = 0;
    }

    //점수의 평균 double 리턴하는 average() 메소드

    //모든 인스턴스 필드값을 확인하는 printScore() 메소드
}
