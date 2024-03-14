import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StudentGroup> studentGroupListA = new ArrayList<>();
        studentGroupListA.add(new StudentGroup(("A1")));
//        studentGroupListA.add(new StudentGroup(("A2")));
        Stream streamA = new Stream("Stream A", studentGroupListA);

        List<StudentGroup> studentGroupListB = new ArrayList<>();
        studentGroupListB.add(new StudentGroup(("B1")));
        studentGroupListB.add(new StudentGroup(("B2")));
        Stream streamB = new Stream("Stream B",studentGroupListB);

        List<StudentGroup> studentGroupListC = new ArrayList<>();
        studentGroupListC.add(new StudentGroup(("C1")));
        studentGroupListC.add(new StudentGroup(("C2")));
        studentGroupListC.add(new StudentGroup(("C2")));
        Stream streamC = new Stream("Stream C",studentGroupListC);

        StreamComparator streamComparator = new StreamComparator();

       //streamA и streamB должны быть равны, в выводе ноль
       // System.out.println(streamComparator.compare(streamA, streamB));

      //streamA и streamC должны неравны, в выводе не ноль
       // System.out.println(streamComparator.compare(streamA, streamC));

//        Iterator<StudentGroup> iterator = streamA.iterator();
//        while (iterator.hasNext()) {
//            StudentGroup studentGroup = iterator.next();
//            System.out.println(studentGroup.getName());
//        }
        // StreamService streamService = new StreamService(streamComparator);
        List<Stream> streamList = new ArrayList<>();
        streamList.add(streamC);
        streamList.add(streamB);
        streamList.add(streamA);

        // выведем изначальный порядок стримов - C B A.
        streamList.forEach((stream) -> System.out.println(stream.getStreamName()));
        // List<Stream> sortedStream = streamService.sortStreams(streamList);
        StreamController streamController = new StreamController();
        List<Stream> sortedStream = streamController.sortStreams(streamList);
        // выведем отсортированный список от меньшего к большему - A B C.
        sortedStream.forEach((stream) -> System.out.println(stream.getStreamName()));
    }
}