package drawing;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

public class shapeAdapter implements Ishape{
    public Shape s;

    public shapeAdapter(Shape f){
        s=f;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public void setSelected(boolean selected) {

    }

    @Override
    public boolean isOn(double x, double y) {
        return false;
    }

    @Override
    public void offset(double x, double y) {
        s.setTranslateX(s.getTranslateX()+x);
        s.setTranslateY(s.getTranslateY()+y);

    }

    @Override
    public void addShapeToPane(Pane pane) {
        pane.getChildren().add(s);
    }

    @Override
    public void removeShapeFromPane(Pane pane) {

    }
}
