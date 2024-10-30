module fr.univartois.butinfo.samuel_tittelein.carcassone {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.univartois.butinfo.samuel_tittelein.carcassone to javafx.fxml;
    exports fr.univartois.butinfo.samuel_tittelein.carcassone;
}