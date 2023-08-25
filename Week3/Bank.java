package Week3;

public class Bank  extends  Info implements  Interface1,Interface2{

    public void accountNo(int accountNo){
        System.out.println("Your account no is:"+ accountNo);
    }
    public void interest(){
        System.out.println("your interest is 8%");
    }
    public void interest(int a){
        System.out.println("your interest is :"+a+"%");

    }
    public static void main(String[]args){
        Bank b= new Bank();
        b.accountNo(12345678);
        b.interest();
        b.interest(13);
        b.Bankinfo("SBI Bank","Udaipur",313001);
        b.customerInfo("XYZ","Udaipur");


    }
}

interface  Interface1{
   public void accountNo(int accountNo);
   public void interest();

}
interface Interface2{
    public void accountNo(int accountNo);
    public void interest(int a);


}
class Info{
    public void Bankinfo(String s ,String s1,int pincode){
        System.out.println("Bank name is:" +s +", Branch name is:"
                + s1+" and pincode is:" +pincode);
    }
    public void customerInfo(String s,String s1){
        System.out.println("Name of customer is:"+ s +" and address is:"+s1 );
    }

}