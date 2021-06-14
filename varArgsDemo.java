public class varArgsDemo {

    public static void main(String[] args){     

        Display obj = new Display();
        obj.show(5,6,7);
        obj.show(3,8);
        obj.show();         

    }

}

class Display{

    public void show(int ... num){

        for(int i : num){

                    
        System.out.println(i);

        }

    }
}
    
