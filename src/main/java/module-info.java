module com.jargal.snake {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jargal.snake to javafx.fxml;
    exports com.jargal.snake;
}
