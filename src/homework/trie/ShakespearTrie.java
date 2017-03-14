package homework.trie;

import org.apache.commons.collections4.trie.PatriciaTrie;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ShakespearTrie extends PatriciaTrie {

    public void load(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);
        Scanner scanner = new Scanner(filePath);
        while (scanner.hasNext()) {
            String word = scanner.next();
            Integer value = (Integer) this.get(word);
            if (value == null) {
                this.put(word,1);
            }
            else {
                value++;
                this.put(word,value);
            }
        }
    }
}
