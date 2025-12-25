package JavaBasicsLab1.Question6;

public class Result extends Test{
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.getMathMarks()+this.getScienceMarks();
    }
}
