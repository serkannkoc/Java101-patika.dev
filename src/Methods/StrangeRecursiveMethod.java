package Methods;

public class StrangeRecursiveMethod {
    public static void main(String[] args) {
    method(17);
    }
//    This one is hard actually second part is missing i need to figure it out.
    static int method(int number){
        if(number<=0){
            return -1;
        }else {
            System.out.print(number+" ");
            return method(number - 5);
        }
    }
}
