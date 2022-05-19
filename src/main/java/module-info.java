module com.schmutterer.pomagaju {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.schmutterer.pomagaju to javafx.fxml;
    exports com.schmutterer.pomagaju;
    exports com.schmutterer.pomagaju.controllers;
    opens com.schmutterer.pomagaju.controllers to javafx.fxml;
}