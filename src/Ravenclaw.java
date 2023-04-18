public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String soname, int power, int permutation, int mind, int wisdom, int wit, int creativity) {
        super(name, soname, power, permutation);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public int showMePowerMagic () {
        return mind + wisdom + wit + creativity + super.getPower() + super.getPermutation();
    }
    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return getName() + " " + getSoname() + ", power=" + getPower() + ", permutation =" + getPermutation() +
                " Ravenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
