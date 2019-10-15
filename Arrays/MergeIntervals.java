import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class MergeIntervals {
    public List<Interval> merge(List<Interval> input) {
        Collections.sort(input, (a, b) -> a.start - b.start);
        List<Interval> ans = new ArrayList<>();
        for (Interval interval : input) {
            if (ans.size() != 0 && ans.get(ans.size() - 1).end > interval.start) {
                ans.get(ans.size() - 1).end = Math.max(ans.get(ans.size() - 1).end, interval.end);
            } else {
                ans.add(interval);
            }
        }
        return ans;
    } 
}

class Interval {
    int start;
    int end;
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}