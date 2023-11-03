class ifelseexample{//class name called ifelseexamples
    public static void main(String arg[]){//main method
        int age=50;//initialization of valiable age
        if(age<18){// cheking if age is greathe than 18 
            System.out.println("child");//the line will print word child
        }else if(age>18 && age<25){//cheking if age is between 18 and 25
            System.out.println("young");//the line will print word young
        }else if(age>25 && age<35){//cheking if age is between 25 and 35
            System.out.println("youth");//the line will print word youth
        }else if(age>35 && age<50){//cheking if age is between 356 and 50
            System.out.println("adult");//the line will print word adult
        }else{
            System.out.println("not mentioned");//the line will print word not mentioned
        }

        }

    }