import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private List<String> createList(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void testEveryStatement(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "0", "#", "#", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
        List<String> test = createList("2", "#", "2", "#", "4", "#", "2", "#", "2");
        assertEquals(test, SILab2.function(createList("0", "#", "0", "#", "0", "#", "0", "#", "0")));
    }

    @Test
    void testEveryBranch(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "0", "#", "#", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
        List<String> test = createList("2", "#", "2", "0", "#", "4", "#", "1", "3", "#", "3", "1", "#", "#", "#", "#");
        assertEquals(test, SILab2.function(createList("0", "#", "0", "0", "#", "0", "#", "0", "0", "#", "0", "0", "#",
                "#", "#", "#")));
    }
}
