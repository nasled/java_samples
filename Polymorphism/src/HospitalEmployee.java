public class HospitalEmployee {

    protected String name;
    protected int number;

    HospitalEmployee() {

    }

    HospitalEmployee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.name + " " + this.number;
    }

    public void work() {
        System.out.println(this.name + " works for the hospital.");
    }
}
