package testgithub2;


public class TestGitHub2 {

 
    public static void main(String[] args) {
        try{
        foo(-1);}
        catch(CheckExc ce){
            System.out.println("Checked exception");
        }
    }
    
    public static void foo(int x) throws CheckExc{
        if(x<0){
            throw new CheckExc("Error");
        }
    
    }
    
}
