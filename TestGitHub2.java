package testgithub2;


public class TestGitHub2 {

  
    public static void main(String[] args){
     
//        try{
//         foo(-1);
//                 }
//        catch(RunExc re){
//            System.out.println("RE detected");
//        }

          foo(-1);
     
        
    }
    
    public static void foo(int x) throws RunExc{
        if(x < 0){
            throw new RunExc("X < 0");
        }
    
    }
    
}
