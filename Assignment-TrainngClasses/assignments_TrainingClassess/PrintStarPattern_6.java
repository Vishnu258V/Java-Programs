package assignments_TrainingClassess;

interface AB{
	void show();
}

interface BC extends AB{
	public int display();
    public char display(int a,int b);
}

abstract class CD implements AB,BC{
    
	public void show() {
        System.out.println("show");
    }
    public int display() {
        return 1;
    }  
}

public class PrintStarPattern_6 extends CD{
    
    public int display(){
        int a=1;
        int b=5;
        int c=a+b;
        return c;
    }
    public char display(int a,int b) {
        char result=(a>b)?'a':'b';
        return result;
    }
	
    public static void main(String[] args) {
    	PrintStarPattern_6 ia=new PrintStarPattern_6();
	    ia.show();
	    int a=ia.display();
	    char c=ia.display(1, 2);
	    System.out.println(a);
	    System.out.println(c);
 
    }
}
