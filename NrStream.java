import java.util.HashMap;

import java.util.LinkedHashSet;

import java.util.Map;

public class NrStream {
    public Map<Character, Integer> mapStream;
    public LinkedHashSet<Character> nrStream;

    public NrStream() {
        mapStream = new HashMap<>();
        nrStream = new LinkedHashSet<>();
    }

    public void add(char character) {
        mapStream.put(character, mapStream.getOrDefault(character, 0) + 1);
        // int valueToPut=0;

        boolean check = (mapStream.get(character) > 1);
        if (!check) {
            nrStream.add(character);
        } else {
            nrStream.remove(character);
            return;
        }
    }

    public char getFirstNonRepeating() {
        char firstNonRepeating = '-';
        for (char firstOnly : nrStream) {
            firstNonRepeating = firstOnly;
            break;
        }
        return firstNonRepeating;
    }

    public static void main(String[] args) {
        NrStream stream = new NrStream();
        stream.add('a');
        stream.add('b');
        stream.add('c');
        stream.add('d');
        stream.add('a');
        stream.add('b');
        // stream.add('c');
        System.out.println(stream.nrStream);
        System.out.println(stream.mapStream);
        System.out.println(stream.getFirstNonRepeating());
    }
}
