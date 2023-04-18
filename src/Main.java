public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри", "Поттер", randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        Gryffindor germionaGrenger = new Gryffindor("Гермиона", "Грейнджер", randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        Gryffindor ronUisli = new Gryffindor("Рон", "Уизли", randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        Slytherin dracoMalfoi = new Slytherin("Драко", "Малфой", randomPower(), randomPower(), randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        Slytherin grehemMontegu = new Slytherin("Грэхэм", "Монтегю", randomPower(), randomPower(), randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        Slytherin gregoriGoil = new Slytherin("Грегори", "Гойл", randomPower(), randomPower(), randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        Hufflepuff zahariSmith = new Hufflepuff("Захари", "Смит", randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        Hufflepuff sedrickDigori = new Hufflepuff("Седрик", "Дигори", randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        Hufflepuff dgastinFlech = new Hufflepuff("Джастин", "Финч-Флетчли", randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        Ravenclaw cgouChang = new Ravenclaw("Чжоу", "Чанг", randomPower(), randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", randomPower(), randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        Ravenclaw marcusBelbi = new Ravenclaw("Маркус", "Белби", randomPower(), randomPower(), randomPower(), randomPower(), randomPower(), randomPower());
        System.out.println(harryPotter + " " + harryPotter.showMePowerMagic());
        System.out.println(ronUisli + " " + ronUisli.showMePowerMagic());
        System.out.println(bestInGryffindor(harryPotter, ronUisli));
        System.out.println(gregoriGoil);
        System.out.println(zahariSmith);
        System.out.println(padmaPatil);
        whatStrongerInHogwarts(harryPotter, ronUisli);
        whatStrongerInHogwarts(gregoriGoil, dgastinFlech);

    }
    public static String bestInGryffindor (Gryffindor student1, Gryffindor student2) {
        if (student1.showMePowerMagic() > student2.showMePowerMagic())
            return student1.getName() + " " +
                    student1.getSoname() + " лучший студент Гриффиндора, чем " +
                    student2.getName() + " " + student2.getSoname();
        else
            return student2.getName() + " " +
                    student2.getSoname() + " лучший студент Гриффиндора, чем " +
                student1.getName() + " " + student1.getSoname();
    }
    public static String bestInHufflepuff (Hufflepuff student1, Hufflepuff student2) {
        if (student1.showMePowerMagic() > student2.showMePowerMagic())
            return student1.getName() + " " +
                    student1.getSoname() + " лучший студент Пиффендуя, чем " +
                    student2.getName() + " " + student2.getSoname();
        else
            return student2.getName() + " " +
                    student2.getSoname() + " лучший студент Пиффендуя, чем " +
                    student1.getName() + " " + student1.getSoname();
    }
    public static String bestInRavenclaw (Ravenclaw student1, Ravenclaw student2) {
        if (student1.showMePowerMagic() > student2.showMePowerMagic())
            return student1.getName() + " " +
                    student1.getSoname() + " лучший студент Когтеврана, чем " +
                    student2.getName() + " " + student2.getSoname();
        else
            return student2.getName() + " " +
                    student2.getSoname() + " лучший студент Когтеврана, чем " +
                    student1.getName() + " " + student1.getSoname();
    }
    public static String bestInSlytherin (Slytherin student1, Slytherin student2) {
        if (student1.showMePowerMagic() > student2.showMePowerMagic())
            return student1.getName() + " " +
                    student1.getSoname() + " лучший студент Слизерина, чем " +
                    student2.getName() + " " + student2.getSoname();
        else
            return student2.getName() + " " +
                    student2.getSoname() + " лучший студент Слезерина, чем " +
                    student1.getName() + " " + student1.getSoname();
    }
    public static void whatStrongerInHogwarts (Gryffindor student1, Gryffindor student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Gryffindor student1, Hufflepuff student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Gryffindor student1, Ravenclaw student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Gryffindor student1, Slytherin student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Hufflepuff student1, Hufflepuff student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Hufflepuff student1, Gryffindor student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Hufflepuff student1, Ravenclaw student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Hufflepuff student1, Slytherin student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Ravenclaw student1, Gryffindor student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Ravenclaw student1, Hufflepuff student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Ravenclaw student1, Slytherin student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Ravenclaw student1, Ravenclaw student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Slytherin student1, Slytherin student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Slytherin student1, Gryffindor student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Slytherin student1, Hufflepuff student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static void whatStrongerInHogwarts (Slytherin student1, Ravenclaw student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей мощностью магии, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей мощностью магии, чем " +
                    student1.getName() + " " + student1.getSoname());

        if (student1.getPermutation() > student2.getPermutation())
            System.out.println(student1.getName() + " " + student1.getSoname() + " обладает большей способностью к трансгенерации, чем " +
                    student2.getName() + " " + student2.getSoname());
        else
            System.out.println(student2.getName() + " " + student2.getSoname() + " обладает большей способностью к трансгенераци, чем " +
                    student1.getName() + " " + student1.getSoname());
    }
    public static int randomPower() {
        return (int) (Math.random() * 100);
    }
}