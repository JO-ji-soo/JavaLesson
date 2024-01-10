package object.day9;

import java.util.Arrays;

public class C22MySortTest {
  public static void main(String[] args) {
    int[] ms = {67,34,65,89,54};
    System.out.println("초기numbers:"+Arrays.toString(ms));
    for(int i=0;i<ms.length-1;i++){
      for(int j=i+1;j<ms.length;j++){
        //오름 차순은 number[j](오른쪽)이 numbers[i](왼쪽)값보다 작아야 합니다
        //그렇지 않으면 numbers[j]와 numbers[i]를 교환하기 => 교환조건???
        if(ms[i]>ms[j]){  //왼쪽값>오른쪽값
          int temp = ms[i];
          ms[i]=ms[j];
          ms[j]=temp;
          System.out.println(Arrays.toString(ms));
            //비교 조건과 맞지 않으면 numbers[i]와 numbers[j]를 교환하기
        }
      }
    }
      System.out.println("오름차순 정렬 ="+Arrays.toString(ms));

    /*
    for(int i=0;i<ms.length;i++){
      Arrays.sort(ms);
      System.out.println("오름차순 정렬 ="+Arrays.toString(ms));
    }
     */
      System.out.println("\n내림차순 정렬 전="+Arrays.toString(ms));
     for(int i=0;i<ms.length-1;i++){
      for(int j=i+1;j<ms.length;j++){
        //내림 차순은 number[j](오른쪽)이 numbers[i](왼쪽)값보다 크거나 같아야 합니다
        //그렇지 않으면 numbers[j]와 numbers[i]를 교환하기 => 교환조건???
        if(ms[i]<ms[j]){  //왼쪽값<오른쪽값
          int temp = ms[i];
          ms[i]=ms[j];
          ms[j]=temp;
          System.out.println(Arrays.toString(ms));
            //비교 조건과 맞지 않으면 numbers[i]와 numbers[j]를 교환하기
        }
      }
    }
    System.out.println("\n내림차순 정렬 후="+Arrays.toString(ms));
  }
}
