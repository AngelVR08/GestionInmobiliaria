package org.example.sistemadeventas.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.example.sistemadeventas.HelloApplication;
import org.example.sistemadeventas.models.Inmueble;

public class GestionInmuebleController {
    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField ubicacionTxt;
    @FXML
    private TextField cuartosTxt;
    @FXML
    private TextField eliminarTxt;
    @FXML
    private Button guardarBtn;
    @FXML
    private Button eliminarBtn;

    @FXML
    void guardarBtnClick(){
        String nombre = nombreTxt.getText();
        String ubicacion = ubicacionTxt.getText();
        int cuartos = Integer.parseInt(cuartosTxt.getText());

        Inmueble inmueble = new Inmueble(nombre, ubicacion, cuartos);
        HelloApplication.getHotel().agregarInmueble(inmueble);
    }
    @FXML
    void eliminarBtnClick(){
        String eliminar = eliminarTxt.getText();
        HelloApplication.getHotel().eliminarInmueble(eliminar);
    }
}
