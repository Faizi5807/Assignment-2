import java.util.List;
import java.util.ArrayList;

public class Intervals {

    public List<int[]> intervalList;

    Intervals() {
        intervalList = new ArrayList<int[]>();
    }

    public void Merge() {
        int current = 0;
        for (int i = 0; i <= intervalList.size(); i++) {
            int[] first = intervalList.get(current);
            int[] second = intervalList.get(current + 1);
            if (first[1] >= second[0]) {
                first[1] = second[1];
                intervalList.remove(second);
            } else {
                current++;
            }
        }
    }

    public static void main(String[] args) {
        Intervals list = new Intervals();
        list.intervalList.add(new int[] { 1, 3 });
        list.intervalList.add(new int[] { 4, 6 });
        list.intervalList.add(new int[] { 5, 10 });
        list.intervalList.add(new int[] { 8, 18 });
        System.out.println("List Before Merging:");
        for (int[] interval : list.intervalList) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
        list.Merge();
        System.out.println("List After Merging:");
        for (int[] interval : list.intervalList) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
