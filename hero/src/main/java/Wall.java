import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Wall extends Element {
    //fields
    //private Position position;
    //functions

    public Wall(int x,int y)
    {
        super(x,y);
    }

    /*
    public Position getPosition()
    {
        return position;
    }

    public void setPosition(Position position)
    {
        this.position=position;
    }

     */

    public void draw(TextGraphics graphics)
    {
        graphics.setForegroundColor(TextColor.Factory.fromString("#ffffff"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "+");
    }
}
