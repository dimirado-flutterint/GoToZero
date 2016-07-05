package sample.input;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.models.menumodels.Options;
import sample.stages.CreditsStage;
import sample.stages.HelpStage;
import sample.stages.Singleplayer;

public class MenuHandler {

    private Scene scene;
    private Options menu;

    public MenuHandler(Scene scene, Options menuoptions) {
        this.scene = scene;
        this.menu = menuoptions;
    }


    public Scene getScene() {
        return this.scene;
    }


    public void processMenuInput(Stage stage, Scene scene) {

        this.menu.getItem(0).setOnMousePressed(e-> new Singleplayer(stage,scene).visualize());
        this.menu.getItem(3).setOnMousePressed(e-> new HelpStage(stage,scene).visualize());
        this.menu.getItem(4).setOnMousePressed(e-> new CreditsStage(stage,scene).visualize());
        this.menu.getItem(5).setOnMousePressed(e-> Platform.exit());
    }
}
