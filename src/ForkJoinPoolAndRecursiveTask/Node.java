package ForkJoinPoolAndRecursiveTask;

import java.util.Collection;
import java.util.Collections;

public interface Node {
    Collection<Node> getChildren();

    long getValue();
}
