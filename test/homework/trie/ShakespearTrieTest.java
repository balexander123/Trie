package homework.trie;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import homework.trie.ShakespearTrie;

import java.io.IOException;


public class ShakespearTrieTest {
    @Test
    public void shouldImportWordsFromFile() {
        ShakespearTrie st = new ShakespearTrie();

        // banana, nabd, bcdef, bcfeg, aaaaaa, aaabaa
        try {
            st.load("fixtures/simple_words.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(6, st.size());

    }

}