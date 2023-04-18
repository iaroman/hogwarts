public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String soname, int power, int permutation, int diligence, int loyalty, int honesty) {
        super(name, soname, power, permutation);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int showMePowerMagic () {
        return diligence + loyalty + honesty + super.getPower() + super.getPermutation();
    }
    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return getName() + " " + getSoname() + ", power=" + getPower() + ", permutation =" + getPermutation() +
                " Hufflepuff{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
