import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Ricsko on 2017. 05. 04..
 */
public class Singleton {
    /*
    final metódussal a legegyszerübb a szálkezelés maitt nem lesz lassú
     */
    private  final static Singleton INSTANCE = new Singleton();

    String[] scabble= {"a","b","c","a","c","d","e","g"};
    private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scabble));
    private String cica = "szia";

    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }

//    public synchronized static Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    public LinkedList<String> getLetterList(){
        return INSTANCE.letterList;
    }

    public LinkedList<String > getTitles(int howmanytitles){
        LinkedList<String > titles = new LinkedList<>();

        for(int i = 0; i <= howmanytitles;i++){
            titles.add(INSTANCE.letterList.remove(0));
        }
        return titles;
    }

    public void doNameChange(String name){
        INSTANCE.cica = name;
    }

    public String toString(){
        return cica;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public Object readResolve(){
        return INSTANCE;
    }
}
