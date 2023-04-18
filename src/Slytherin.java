public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String soname, int power, int permutation, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, soname, power, permutation);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public int showMePowerMagic () {
        return cunning + determination + ambition + resourcefulness + thirstForPower + super.getPower() + super.getPermutation();
    }
    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return getName() + " " + getSoname() + ", power=" + getPower() + ", permutation =" + getPermutation() +
                " Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }
}
