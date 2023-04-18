public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String soname, int power, int permutation, int nobility, int honor, int bravery) {
        super(name, soname, power, permutation);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int showMePowerMagic () {
        return nobility + honor + bravery + super.getPower() + super.getPermutation();
    }
    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return getName() + " " + getSoname() + ", power=" + getPower() + ", permutation =" + getPermutation() +
                " Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
