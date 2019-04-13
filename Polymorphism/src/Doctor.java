public class Doctor extends HospitalEmployee {

    protected String speciality;

    Doctor () {

    }

    Doctor(String name, int number, String speciality) {
        super(name, number);
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return this.name + "    " + this.number + "    " + this.speciality;
    }

    @Override
    public void work() {
//        super.work();
        // because of new line character
        System.out.print(this.name + " works for the hospital. ");

        System.out.println(this.name + " is a(n) " + this.speciality + " doctor.");
    }
}
