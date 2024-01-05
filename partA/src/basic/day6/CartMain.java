package basic.day6;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class CartMain {
    public static void main(String[] args) {
        Cart momos_cart = new Cart(); //String, String[], int[] 필드는 null

        //모모의 장바구니 - 상품이름, 가격
        String[] products = {"어니언포카칩","갈아만든배","가나초콜릿","삼립호빵맨","이클립스"};
        int[] prices = {1500,2000,1000};

        //장바구니 값을 저장합니다.
        momos_cart.setUserid("momo");
        momos_cart.setProductName(products);
        momos_cart.setPrices(prices);

        Scanner sc = new Scanner(System.in);

        System.out.println(momos_cart.getUserid()+"님의 장바구니 입니다.");
        System.out.println(String.format("$s\t %20s\t %s","상품명","가격"));

        // for(int i=0;i<momos_cart.getUserid();i++)
        for(int i=0;i<products.length;i++){
            System.out.println(String.format("%d\t %20s\t %d", products[i],prices[i]));

        System.out.println("구매할 상품 번호를 선택하세요. 선택 종료는 -1입니다.");
        int sel=0;
        int[] select = new int[5]; //상품 선택 개수는 최대 5개 (편의상 정함)
        int k=0;
        while(sel!=-1 && k<select.length){
            System.out.println("상품번호 입력 ,,,");
            sel=sc.nextInt();
            //sel의 선택범위는 productNames 인덱스 범위값만
            if(sel<-1||sel>products.length-1)
            select[k++]=sel;
            
        }

        if(k==select.length)
            System.out.println("장바구니 가득채우셧군요~^^ 땡큐~♡");

        System.out.println("선택 하신 상품운"+Arrays.toString(select));
        // System.out.println(momos_cart.getUserid()+"님 이 선택하신 상품 합계 :" +momos_cart.total_Money(select));
        }

        //momos_cart.total_Money(select);
        System.out.println(momos_cart.getUserid()
                            +"님이 선택하신 상품합계 :"+momos_cart.getTotal_Money());

                            //필요에 다라서는 기존의 setter 메소드는 사용하지 않고 
                            //추가적인 비지니스로직을 구현하는 메소드를 만듭니다. =>total_Money()메소드

        //momos_cart.setTotal_Money(200000);
        //setter 메소드가 여기ㅇ서는 필요없습니다
        //total money 메소드가 대신 값을 계산해서 저장할 것입니다.]

        //System.out.println(momos_cart.getUserid()+"님 이 선택하신 상품 합계 :" +momos_cart.total_Money(select));

    }
    
}
