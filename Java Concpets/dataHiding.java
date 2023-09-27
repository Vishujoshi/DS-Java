class bank{
    private int accNo=1112;
//    private String name="vishal";
    public int getAccNo(){

        return accNo;
    }
    public void setAccNo(int a){
        this.accNo=a;
    }


}

public class dataHiding {
    public static void main(String[] args) {
        bank s=new bank();

        System.out.println(s.getAccNo());
        s.setAccNo(12);
        System.out.println(s.getAccNo());

    }
}
