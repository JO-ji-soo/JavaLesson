package basic.day6;

public class Cart {

    private String userid;
    private String[] productName;
    private int total_Money;
    private int[] prices;

    //추가적인 인스턴스 메소드 : 해결방법을 생각하고 만들어야 함.
    private void total_Money(int[]select){
        int sum=0;
        for(int i=0;i<select.length;i++){
        int temp = select[i];
        if(temp == -1) break;
        sum+=prices[temp];
    }
     this.total_Money=sum;

     /*public void setTotal_Money(int total_Money) {
        this.total_Money = total_Money;
    } */

    public int getTotal_Money() {
        return total_Money;
    }

    public String getUserid() {
        return userid;
    }
    public String[] getProductName() {
        return productName;
    }
    // public int getTotal_Money() {
    //    return total_Money;
    //}

    public int[] getPrices() {
        return prices;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    public void setProductName(String[] productName) {
        this.productName = productName;
    }
    public void setTotal_Money(int total_Money) {
        this.total_Money = total_Money;
    }
    public void setPrices(int[] prices) {
        this.prices = prices;
    }


}
