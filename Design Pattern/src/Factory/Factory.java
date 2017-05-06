package Factory;

/**
 * Created by Ricsko on 2017. 05. 04..
 */
public class Factory {
    /**
     * ez a "segítő osztály" kb. ez segít létrehozni majd a objektumot
     */

    public IDosomething getIDosomething(String cicType) {
        if (cicType == null) {
            return null;
        }

        if (cicType.equalsIgnoreCase("CICA")) {
            return new Cica();
        } else if (cicType.equalsIgnoreCase("MACSKA")) {
            return new Macska();
        } else if (cicType.equalsIgnoreCase("BENGALI")) {
            return new Bengali();
        }
        return null;
    }
}