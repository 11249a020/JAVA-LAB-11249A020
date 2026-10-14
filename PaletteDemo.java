
import java.awt.*;
import java.applet.*;

public class PaletteDemo extends Applet1 {
    public void init() {
        setLayout(new FlowLayout());

        Panel p = new Panel();
        p.setBackground(Color.YELLOW);

        p.add(new Button("Red"));
        p.add(new Button("Green"));
        p.add(new Button("Blue"));

        add(p);
    }
}
