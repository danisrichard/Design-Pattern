import BuilderV2.Cica;
import BuilderV2.*;
import Factory.*;

/**
 * Created by Ricsko on 2017. 05. 04..
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        /**
         * Singleton design pattern
         */

//        Singleton.Singleton singleton = new Singleton.Singleton();
//        Singleton.Singleton singleton1 = Singleton.Singleton.getInstance();
//
//        System.out.println("Instance id: " + System.identityHashCode(singleton1));
//        System.out.println(singleton1.getLetterList());
//        LinkedList<String> playerOne = singleton1.getTitles(7);
//        System.out.println(singleton1.toString());
//        singleton1.doNameChange("valami");
//        System.out.println(singleton1.toString());
//
//
//        Singleton.Singleton singleton2 = Singleton.Singleton.getInstance();
//        System.out.println("Instance2 id: " + System.identityHashCode(singleton2));
//
//        if(singleton1.equals(singleton2)){
//            System.out.println(true);
//        }

        /**
         * Builder pattern
         */
//
//        Cica cicaBuilder = new Cica.CicaBuilder().withAge(10).build();
//
//        cicaBuilder.kiir();

        /**
         * Prototype pattern
         */
//
//        Factory factory = new Factory();
//
//        IDosomething object1 = factory.getIDosomething("macska");
//
//        IDosomething object2 = factory.getIDosomething("BENGALI");
//
//        IDosomething object3 = factory.getIDosomething("MACSKA");
//
//        object1.doing();
//        object2.doing();
//        try {
//            IDosomething objectnull = factory.getIDosomething("dsdasdas");
//            objectnull.doing();
//        }catch (NullPointerException e){
//            System.out.println("Hoppsz, nincs ilyne érték");
//        }
    }
}
