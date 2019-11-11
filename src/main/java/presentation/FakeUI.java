package presentation;

/**
 *
 * @author TM
 */
public class FakeUI implements UI {

    @Override
    public String getInput() {
        return "";
    }

    @Override
    public void println(String msg) {
        // do nothing so far
    }
    
}
