package com.xwintop.xJavaFxTool.view.debugTools;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class RdbmsSyncToolView implements Initializable {
    @FXML
    protected TextField hostText1;
    @FXML
    protected TextField portText1;
    @FXML
    protected TextField dbNameText1;
    @FXML
    protected ChoiceBox<String> dbTypeText1;
    @FXML
    protected TextField userNameText1;
    @FXML
    protected PasswordField pwdText1;
    @FXML
    protected TextField jdbcUrlField1;
    @FXML
    protected Button connectButton1;
    @FXML
    protected TextField hostText2;
    @FXML
    protected TextField portText2;
    @FXML
    protected TextField dbNameText2;
    @FXML
    protected ChoiceBox<String> dbTypeText2;
    @FXML
    protected TextField userNameText2;
    @FXML
    protected PasswordField pwdText2;
    @FXML
    protected TextField jdbcUrlField2;
    @FXML
    protected Button connectButton2;
    @FXML
    protected TreeView<String> tableTreeView1;
    @FXML
    protected TreeView<String> tableTreeView2;
    @FXML
    protected Spinner<Integer> syncDataNumberSpinner;
    @FXML
    protected Button showSqlButton;
    @FXML
    protected CheckBox isShowCheckBox;
    @FXML
    protected TextField querySqlTextField;
    @FXML
    protected ComboBox<String> jsonNameSuffixComboBox;
    @FXML
    protected ComboBox<String> outputPathComboBox;
    @FXML
    protected StackPane loadingStackPane;
    @FXML
    protected TextField schemaTextField;
    @FXML
    protected TextField ignoreTableNameTextField;
    @FXML
    protected TextField cronTextField;
    @FXML
    protected ChoiceBox<String> quartzChoiceBox;
    @FXML
    protected AnchorPane simpleScheduleAnchorPane;
    @FXML
    protected Spinner<Integer> intervalSpinner;
    @FXML
    protected Spinner<Integer> repeatCountSpinner;
    @FXML
    protected ChoiceBox<String> tableTypeChoiceBox;
    @FXML
    protected ChoiceBox<String> dataSourceTypeChoiceBox;
}
