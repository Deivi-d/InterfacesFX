module com.mycompany.interfacesfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.interfacesfx to javafx.fxml;
    exports com.mycompany.interfacesfx;
}
