package questions.binarytree.amazon;

public class MyBst {
    private int number;
    private int listNum;
    private MyBst small;
    private MyBst large;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getListNum() {
        return listNum;
    }

    public void setListNum(int listNum) {
        this.listNum = listNum;
    }

    public MyBst getSmall() {
        return small;
    }

    public void setSmall(MyBst small) {
        this.small = small;
    }

    public MyBst getLarge() {
        return large;
    }

    public void setLarge(MyBst large) {
        this.large = large;
    }

    MyBst(int number) {
        this.number = number;
    }

    public MyBst() {
        
    }

    public MyBst(Integer number, int listsCount) {
    }

    public MyBst getSmallest() {
        // return smallest leaf in tree
        // update the tree
        
        return null;
    }

    public void updateTree() {
    }
}
