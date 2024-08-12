module at.asec.javafx.javafx02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.asec.javafx.javafx02 to javafx.fxml;
    exports at.asec.javafx.javafx02;
}