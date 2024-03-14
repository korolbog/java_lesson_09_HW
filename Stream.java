import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private String streamName;
    private List<StudentGroup> studentGroupList;


    public Stream(String streamName, List<StudentGroup> studentGroupList) {
        this.streamName = streamName;
        this.studentGroupList = studentGroupList;
    }
    public int getStudentGroupListSize() {
        return this.studentGroupList.size();
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public List<StudentGroup> getGroupList() {
        return studentGroupList;
    }

    public void setGroupList(List<StudentGroup> groupList) {
        this.studentGroupList = groupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(studentGroupList);
    }
}
