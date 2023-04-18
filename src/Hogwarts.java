public class Hogwarts {
    private String name, soname;
    private int power;
    private int permutation;

    public Hogwarts(String name, String soname, int power, int permutation) {
        this.name = name;
        this.soname = soname;
        this.power = power;
        this.permutation = permutation;
    }

    public String getName() {
        return name;
    }

    public String getSoname() {
        return soname;
    }

    public int getPower() {
        return power;
    }

    public int getPermutation() {
        return permutation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoname(String soname) {
        this.soname = soname;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setPermutation(int permutation) {
        this.permutation = permutation;
    }
}
