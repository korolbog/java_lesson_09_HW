import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private StreamComparator streamComparator;

    public StreamService(StreamComparator streamComparator) {
        this.streamComparator = streamComparator;
    }
    public List<Stream> sortStreams(List<Stream> stream){
        List<Stream> newStream = new ArrayList<>(stream);
        newStream.sort(streamComparator);
        return newStream;
    }
}
