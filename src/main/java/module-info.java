module com.example.w23comp1008lhvideogame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w24comp1008lhvideogamerattan to javafx.fxml;
    exports com.example.w24comp1008lhvideogamerattan;
}