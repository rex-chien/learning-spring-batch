package rex.chien.learning.springbatch.inputinterfaces.reader;

import org.springframework.batch.item.ItemReader;

import java.util.Iterator;
import java.util.List;

/**
 * @author Rex Chien
 */
public class StatelessItemReader implements ItemReader<String> {

    private final Iterator<String> data;

    public StatelessItemReader(List<String> data) {
        this.data = data.iterator();
    }

    @Override
    public String read() throws Exception {
        if (this.data.hasNext()) {
            return this.data.next();
        } else {
            return null;
        }
    }
}
