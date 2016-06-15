package comosite;

/**
 * Created by Kate on 13.06.2016.
 */
public class Element implements LectureElement{

    private String value;

    public <E> Element(E element) {
        value = (String)element;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void add(LectureElement element) {

    }

    @Override
    public String toString() {
        return value;
    }
}
