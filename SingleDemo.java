public class SingleDemo {

    private int num;
    private static SingleDemo s = new SingleDemo();
    private SingleDemo() {
    }
    public static SingleDemo getInstance() {
        return s;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
}

class SingleTest {
    public static void main(String[] args) {

        SingleDemo t1 = SingleDemo.getInstance();
        SingleDemo t2 = SingleDemo.getInstance();
        System.out.println(t1 + "," + t2);
        t1.setNum(100);
        t2.setNum(200);
        System.out.println("num" + t1.getNum());
        System.out.println("num" + t2.getNum());
    }

}

