public class Surgeon extends Doctor {

    protected boolean operating;

    Surgeon (String name, int number, String speciality, boolean operating) {
        super(name, number, speciality);
        this.operating = operating;
    }

    @Override
    public String toString() {
        return this.name + "    " + this.number + "    " + this.speciality + "Operating: " + this.operating;
    }

    @Override
    public void work() {
//        super.work();
        // because of new line character
        System.out.print(this.name + " works for the hospital. ");

        if (this.operating) {
            System.out.println(this.name + " is operating now.");
        }
    }
}
