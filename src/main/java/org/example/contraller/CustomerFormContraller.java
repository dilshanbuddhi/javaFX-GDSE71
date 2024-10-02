package org.example.contraller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.example.model.Customer;
import org.example.repo.CustomerRepo;

public class CustomerFormContraller {

    @FXML
    private TextField addresstxt;

    @FXML
    private TextField idtxt;

    @FXML
    private TextField nametxt;

    @FXML
    private TextField teltxt;

    @FXML
    void deleteOnAction(ActionEvent event) {
            String id = idtxt.getText();

            try{
                boolean isDelete = CustomerRepo.delete(id);
                if (isDelete){
                    System.out.println("delete unaaa");
                }else {
                    System.out.println("delete un na");
                }

            }catch (Exception e){
                new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
            }
    }

    @FXML
    void saveOnAction(ActionEvent event) {
        String id = idtxt.getText();
        String name = nametxt.getText();
        String address = addresstxt.getText();
        int tel = Integer.parseInt(teltxt.getText());

        Customer customer = new Customer(id, name, address, tel, "active");

        try {
            Boolean isSaved  = CustomerRepo.save(customer);
            if (isSaved){
                new Alert(Alert.AlertType.CONFIRMATION,"save una").show();
            }else {
                new Alert(Alert.AlertType.ERROR,"not saved").show();
            }

        }catch (Exception e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
            e.printStackTrace();
        }
    }

    @FXML
    void searchOnAction(ActionEvent event) {

    }

    @FXML
    void updateOnAction(ActionEvent event) {


    }

}
