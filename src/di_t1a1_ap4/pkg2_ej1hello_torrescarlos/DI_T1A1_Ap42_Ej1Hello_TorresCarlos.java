/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a1_ap4.pkg2_ej1hello_torrescarlos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Carlos Torres Liñán
 */
public class DI_T1A1_Ap42_Ej1Hello_TorresCarlos extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Introducimos el botón
        Button btn = new Button();
        //Le damos un texto al botón
        btn.setText("Say 'Hello World'");
        //Introducimos un evento en el botón al pulsarlo
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            //Método relacionado con el evento
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        //Introducimos un layout de tipo StackPane
        StackPane root = new StackPane();
        //Añadimos el botón al layout que acabamos de introducir
        root.getChildren().add(btn);
        
        //Añadimos la escena enlazada al layout y con unas medidas.
        Scene scene = new Scene(root, 300, 250);
        
        //Le damos título a la Stage
        primaryStage.setTitle("Hello World!");
        //Escogemos la escena creada en el Stage
        primaryStage.setScene(scene);
        //Mostramos la Stage
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
