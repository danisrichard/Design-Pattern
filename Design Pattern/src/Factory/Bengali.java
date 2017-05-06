package Factory;

/**
 * Created by Ricsko on 2017. 05. 06..
 */
public class Bengali implements IDosomething {
    @Override
    public void doing() {
        System.out.println(getClass().getName() + " én ezt csinálom");
    }
}
