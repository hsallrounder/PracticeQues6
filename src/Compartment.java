import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}
class FirstClass extends Compartment{
    @Override
    public String notice() {
        return "First Class";
    }
}
class Ladies extends Compartment{
    @Override
    public String notice() {
        return "Ladies compartment";
    }
}
class General extends Compartment{
    @Override
    public String notice() {
        return "General";
    }
}
class Luggage extends Compartment{
    @Override
    public String notice() {
        return "Luggage";
    }
}

class TestCompartment{
    public static void main(String[] args) {
        Compartment[] arr = new Compartment[10];
        Random rand = new Random();
        int n = rand.nextInt(1,5);
        System.out.println("n = "+n);
        if(n==1){
            arr[0] = new Luggage();
            arr[1] = new FirstClass();
            arr[2] = new General();
            arr[3] = new Ladies();
        }
        else if(n==2){
            arr[0] = new FirstClass();
            arr[1] = new General();
            arr[2] = new Ladies();
            arr[3] = new Luggage();
        }
        else if(n==3){
            arr[0] = new General();
            arr[1] = new Ladies();
            arr[2] = new Luggage();
            arr[3] = new FirstClass();
        }
        else if(n==4){
            arr[0] = new Ladies();
            arr[1] = new Luggage();
            arr[2] = new FirstClass();
            arr[3] = new General();
        }

        for(int i=0;i<4;i++){
                System.out.println(arr[i].notice());
        }
    }
}