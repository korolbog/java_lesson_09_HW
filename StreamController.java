import java.util.List;

public class StreamController {
    private final StreamService streamService = new StreamService(new StreamComparator());
    public List<Stream> sortStreams(List<Stream> stream){
        return streamService.sortStreams(stream);
    }
}
