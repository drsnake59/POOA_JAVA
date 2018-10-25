package drawing;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.util.Observer;


public class StatutBar extends HBox implements drawing.Observer {
    private Label labelForm;
    private DrawingPane dp;

    public StatutBar(DrawingPane drawingPane) {
        this.dp = drawingPane;
        this.labelForm = new Label(dp.getNumberShape()+"shapes(s)");
        this.getChildren().addAll(this.labelForm);
    }

    public StatutBar() {

    }

    public void update () {
        this.labelForm.setText(this.dp.getNumberShape() + " shape(s)");
    }
}