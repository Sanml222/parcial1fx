module co.edu.uniquindio.parcial1fx.empresartransporteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1fx.empresartransporteapp to javafx.fxml;
    exports co.edu.uniquindio.parcial1fx.empresartransporteapp;
}