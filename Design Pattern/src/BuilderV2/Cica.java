package BuilderV2;

/**
 * Created by Ricsko on 2017. 05. 06..
 */
public class Cica {
    private String name;
    private String szin;
    private boolean dorombol;
    private int age;
    private int attackNumber;


    public static final class CicaBuilder {
        private String name;
        private String szin;
        private boolean dorombol;
        private int age;
        private int attackNumber;

        public CicaBuilder() {
        }

        public static CicaBuilder aCica() {
            return new CicaBuilder();
        }

        public CicaBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CicaBuilder withSzin(String szin) {
            this.szin = szin;
            return this;
        }

        public CicaBuilder withDorombol(boolean dorombol) {
            this.dorombol = dorombol;
            return this;
        }

        public CicaBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public CicaBuilder withAttackNumber(int attackNumber) {
            this.attackNumber = attackNumber;
            return this;
        }

        public CicaBuilder but() {
            return aCica().withName(name).withSzin(szin).withDorombol(dorombol).withAge(age).withAttackNumber(attackNumber);
        }

        public Cica build() {
            Cica cica = new Cica();
            cica.name = this.name;
            cica.dorombol = this.dorombol;
            cica.attackNumber = this.attackNumber;
            cica.szin = this.szin;
            cica.age = this.age;
            return cica;
        }
    }

    public void kiir(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cica{" +
                "name='" + name + '\'' +
                ", szin='" + szin + '\'' +
                ", dorombol=" + dorombol +
                ", age=" + age +
                ", attackNumber=" + attackNumber +
                '}';
    }
}
