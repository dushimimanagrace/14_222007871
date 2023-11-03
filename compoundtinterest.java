class compoundtinterest{
    public static void main(String[] args){
        interest myInterest=new interest();//object Myinterest
        myInterest.compoundinterest();
    }
}
class interest{
    public void compoundinterest(){//method
      float p=500000,r=18,t=3,n=12,ci;
      ci=p*Math.pow((1+r/100),tn);
      System.out.println("the compound interest is:"+ci);
    }
}