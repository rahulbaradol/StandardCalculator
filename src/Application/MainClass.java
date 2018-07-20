package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

    /**
     * @author Rahul Baradol
     * @since 14/9/2017
     */

    @Override
    public void start(Stage ps) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("/Application/Welcome.fxml"));
        ps.setTitle("Standard Calculator - Welcome");
        ps.setScene(new Scene(parent));
        ps.setResizable(false);
        ps.show();
    }

}