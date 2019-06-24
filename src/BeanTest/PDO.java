package BeanTest;

public class PDO {
    private int s1;
    private String ss;

    public PDO(int s1, String ss) {
        this.s1 = s1;
        this.ss = ss;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public int getS1() {

        return s1;
    }

    public String getSs() {
        return ss;
    }
}
