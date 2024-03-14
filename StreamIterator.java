import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int count;

    private final List<StudentGroup> studentGroupList;

    public StreamIterator(List<StudentGroup> studentGroupList) {
        this.count = 0;
        this.studentGroupList = studentGroupList;
    }

    @Override
    public boolean hasNext() {
        return count < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
//        if (!hasNext()){
//            return null;
//        }
//        count++;
        return studentGroupList.get(count++);
    }
}
