import java.util.*;

public class MeetingRooms {
    public int minMeetingRooms(List<Interval> input) {
        Collections.sort(input, (a, b) -> a.start - b.start);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Interval interval : input) {
            if (!pq.isEmpty() && pq.peek() <= interval.start) {
                pq.poll();
            }
            pq.add(interval.end);
        }
        return pq.size();
    }
}

class Interval {
    public int start;
    public int end;
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}