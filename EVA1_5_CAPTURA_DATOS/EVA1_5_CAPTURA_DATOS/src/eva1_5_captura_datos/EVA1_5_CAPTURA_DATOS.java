/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_captura_datos;

import java.util.Scanner;
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
public class EVA1_5_CAPTURA_DATOS extends Application {
   
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
      //TODO code application logic here
      //DECLARAR NUESTRAS VARIABLES 
      String nombre;
      int edad;
      System.out.println("Introduce tu Nombre:");
      //CREAR NUESTRO SCANNER
      Scanner captura = new Scanner (System.in);
      //CAPTURA
      nombre = captura.nextLine();
      System.out.println("Introduce tu edad");
      edad = captura.nextInt();
          System.out.println("Tu nombre es:");
          System.out.println(nombre);
          System.out.println("Tu edad es:");
          System.out.println(edad);
   }
   
}
