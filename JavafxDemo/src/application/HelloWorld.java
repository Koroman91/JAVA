package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
public class HelloWorld extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Click Me");
        Button exit = new Button("Exit");
       
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                
            }
        });
   
        //layout- stackpane, verticalbox, horizontalbox
        VBox root = new VBox();
        root.getChildren().add(btn);//adding button to layout
        //creating scene object
        Scene scene = new Scene(root,500,300);
        primaryStage.setTitle("Application");

        primaryStage.getIcons().add( new Image(HelloWorld.class.getResourceAsStream("Coffee.png")));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}