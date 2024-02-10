/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_identificadores;

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
public class EVA1_2_IDENTIFICADORES extends Application {
   
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
      //TODO code aplication logic here
      //Varibales
      //TIPO DE DATO + NOMBRE DEL IDENTIFICADOR
      //short int byte long ---> numeros enteros
      //Float double --> numeros con decimal
      //char --> character --> caracteres 
      //bolean --> verdadero o falso
      //string --> cadena de texto
      int edad;
      String NombrePropio;
      double salario;
      //ASIGNACION DE VALORES;
      // INDENTIFICADORES = VALOR;
      //SE COLOCA EL VALOR 50 DENTRO DE LA VARIABLE EDAD
      edad = 50;
      NombrePropio = "Adrian Fernando Morales Rodriguez";
     salario = 777.777;
     //COMO LOS USAMOS;
     System.out.println(NombrePropio);
     System.out.println(edad);
     System.out.println(salario);
   }
   
}
