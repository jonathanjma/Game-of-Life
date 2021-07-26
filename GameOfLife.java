import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GameOfLife extends Application {

    private BorderPane mainPane = new BorderPane();
    private Thread animatorThread;
    private BoardAnimator animator;

    private final int size = 1000;

    // preset library: https://conwaylife.appspot.com/library

    @Override
    public void start(Stage primaryStage) {

        Pane startPane = new Pane();
        mainPane.setStyle("-fx-background: rgb(255,255,255);");

        VBox column = new VBox(20);
        column.setLayoutX(250); column.setLayoutY(70);
        column.setAlignment(Pos.CENTER);

        Label title = new Label("Conway's Game of Life");
        title.setFont(Font.font(50));
        Label instructions = new Label("Choose an option below to get started");
        instructions.setFont(Font.font(20));

        Button playground = new Button("Playground Mode");
        playground.setFont(Font.font(15));
        playground.setOnMouseClicked(e -> {
            startGame();
        });

        Label or = new Label("or"); or.setFont(Font.font(20));
        Label preset = new Label("Choose a preset below:");
        preset.setFont(Font.font(20));

        ObservableList<String> presetList = FXCollections.observableArrayList();
        presetList.addAll("1", "2", "3", "4", "5");

        ListView<String> presets = new ListView<>(presetList);
        presets.setPrefWidth(300); presets.setPrefHeight(300);
        presets.getSelectionModel().selectedItemProperty().addListener((observed_val, old_val, selected_val) -> {
            System.out.println(selected_val);
        });

        column.getChildren().addAll(title, instructions, playground, or, preset, presets);
        startPane.getChildren().add(column);
        mainPane.setCenter(startPane);

        Scene scene = new Scene(mainPane, size, size);
        primaryStage.setTitle("The Game of Life");
        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void startGame() {

        Pane boardPane = new Pane();
        boardPane.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
        Board board = new Board(size / BoardAnimator.length);
        animator = new BoardAnimator(board, boardPane);

        loadAllPresets();

        HBox infoBox = new HBox(5);
        infoBox.setPadding(new Insets(5,5,5,5));
        infoBox.setAlignment(Pos.CENTER);

        Button startStopBtn = new Button("Start");
        startStopBtn.setOnMouseClicked(e -> {
            if (startStopBtn.getText().equals("Start")) {
                animator.setStopped(false);
                animatorThread = new Thread(animator, "Animator");
                animatorThread.start();
                startStopBtn.setText("Stop");
            } else if (startStopBtn.getText().equals("Stop")) {
                animator.setStopped(true);
                startStopBtn.setText("Start");
            }
        });
        /*primaryStage.setOnCloseRequest(e -> {
            if (animatorThread != null) {animator.setStopped(true);}
        });*/
        Button nextBtn = new Button("Next Stage");
        nextBtn.setOnMouseClicked(e -> animator.nextStage());
        Button resetBtn = new Button("Reset");
        resetBtn.setOnMouseClicked(e -> {
            animator.setStopped(true);
            animator.reset();
            loadAllPresets();
            startStopBtn.setText("Start");
        });
        infoBox.getChildren().addAll(startStopBtn,nextBtn,resetBtn);

        mainPane.setCenter(boardPane);
        mainPane.setBottom(infoBox);
    }

    public void loadAllPresets() {
        try {
//            animator.loadPreset(Preset.gosperGliderGun(50, 50, 0));
//            animator.loadPreset(Preset.gosperGliderGun(45, 30, 2));
//            animator.loadPreset(Preset.rPentomino(50, 50, 0));
//            animator.loadPreset(Preset.basicLife(20, 30, 0));
//            animator.loadPreset(Preset.gliders(50, 30, 0));
//            animator.loadPreset(Preset.acorn(60, 50, 0));
//            animator.loadPreset(Preset.spider(50, 70, 0));
//            animator.loadPreset(Preset.spider(76, 70, 5));
//            animator.loadPreset(Preset.copperhead(50, 50, 0));
//            animator.loadPreset(Preset.tannerP46(30, 30, 0));
//            animator.loadPreset(Preset.simkinGliderGun(50, 50, 0));
            animator.loadPreset(Preset.snark(50, 50, 0));
        } catch (IndexOutOfBoundsException ex) {ex.printStackTrace();}
    }
}