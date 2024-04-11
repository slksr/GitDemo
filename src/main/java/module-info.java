module nl.han.aim.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens nl.han.aim.gitdemo to javafx.fxml;
    exports nl.han.aim.gitdemo;
}