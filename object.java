public class object{
    public static void main(String[] args) {
        interest myInterest=new interest();//object myInterest
        myInterest.object(); //calling method  
    }

}
class interest{
    public  void object(){//method
        float p=100000,r=5,t=5,simpleinterest;
        simpleinterest=(p*r*t)/100;
        System.out.println("the interest is:" +simpleinterest);
    }
}