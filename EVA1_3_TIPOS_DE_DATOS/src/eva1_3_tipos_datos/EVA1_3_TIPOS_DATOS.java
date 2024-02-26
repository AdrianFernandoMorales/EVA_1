/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_tipos_datos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author invitado
 */
public class EVA1_3_TIPOS_DATOS extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        byte pruebaByte;
        pruebaByte = 127;
        pruebaByte = -127;//ACEPTA de -128 a 127;
        pruebaByte = -128;
        short pruebaShort;
        pruebaShort = 20000;
        pruebaShort = -32768;
        pruebaShort = 32767;
        System.out.println(pruebaShort);//IMPRIME la variable pruebaShort;
        pruebaShort++;//++ ES UN OPERADOR, SUMA UNO AL CONTENIDO;
        System.out.println(pruebaShort);
    }
    
}
