package object.day5;

import java.util.Arrays;

public class B03ScoreMain {
    public static void main(String[] args) {



        //학생 4명의 성적을 저장해보세요.
        //1학년 2명(모모,다현) 3과목 2학년 2명(나연,쯔위 4과목)    
        //점수는 임의로 (마음대로) 저장하세요.


        Score sc1 = new Score();
        Score 모모 = new Score();
        Score 다현 = new Score();
        Score 나연 = new Score();
        Score 쯔위 = new Score();

        

        모모.setName("모모");
        모모.setGrade(1);
        모모.setJumsues(90);






        System.out.println("sc1.name :"+sc1.getName());  //String
        System.out.println("sc1.grade :"+sc1.getGrade());  //int
        System.out.println("sc1.jumsues :"+sc1.getJumsues());  //double 배열


       




        
        

}}
