public class break2{//name of class
    public static void main(String arg[]){
        for(int i=1;i<=7;i++)//initialization by using for first loop
        {
            if(i==3)//if the value of i equal 3 loop terminate for first
            {
                break;
            }

            for(int j=1;j<=5;j++)//initialization by using for secong loop
            {
                if(j==3)//if the value of i equal 3 loop terminate for second
                {
                    break;
                }
                System.out.println("i="+i + "; j="+j);//this line will print the value of first and second
            }
        }
    }
    
}