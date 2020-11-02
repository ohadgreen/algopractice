package questions.binarytree.amazon;

import java.util.Objects;

public class MyNumber implements Comparable<MyNumber> {
    private Integer number;
    private Integer fromList;
    private Integer index;

    public MyNumber(Integer number, Integer fromList, Integer index) {
        this.number = number;
        this.fromList = fromList;
        this.index = index;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getFromList() {
        return fromList;
    }

    public void setFromList(Integer fromList) {
        this.fromList = fromList;
    }


    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyNumber myNumber = (MyNumber) o;
        return number.equals(myNumber.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public int compareTo(MyNumber o) {
        return this.number > o.getNumber() ? 1 : -1;
    }
}
