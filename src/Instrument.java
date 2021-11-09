import java.util.concurrent.ThreadLocalRandom;

abstract public class Instrument {
    abstract void play();

}
class Piano extends Instrument{

    @Override
    void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}
class Flute extends Instrument{

    @Override
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument{

    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}
class S1Main{
    public static void main(String[] args) {
        Instrument[] arr=new Instrument[10];
        for(int i=0;i<10;i++){
            int compartment = ThreadLocalRandom.current().nextInt(1,4);
            if(compartment == 1){
               arr[i]=new Piano();
            }
            if(compartment == 2){
               arr[i]=new Flute();
            }
            if(compartment == 3){
                arr[i]=new Guitar();
            }

        }
        for(int i=0;i<10;i++){
           arr[i].play();
        }

    }
}
