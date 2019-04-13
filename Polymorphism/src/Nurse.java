public class Nurse extends HospitalEmployee {

    protected int numOfPatients;

    Nurse (String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }


    @Override
    public String toString() {
        return this.name + " " + this.number + " has " + this.numOfPatients + " patients";
    }

    @Override
    public void work() {
//        super.work();
        // because of new line character
        System.out.print(this.name + " works for the hospital. ");

        System.out.println(this.name + " is a nurse with " + this.numOfPatients + " patients");
    }
}