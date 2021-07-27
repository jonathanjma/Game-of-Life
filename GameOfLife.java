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
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class GameOfLife extends Application {

    private BorderPane mainPane = new BorderPane();
    private HashMap<String, Runnable> map;
    private BST<String> bst;
    LinkedList<String> presets;

    private Thread animatorThread;
    private BoardAnimator animator;

    private final int size = 1000;

    // preset library: https://conwaylife.appspot.com/library

    @Override
    public void start(Stage primaryStage) {

        presets = new LinkedList<>(Arrays.asList("Gosper Glider Gun", "R-Pentomino", "Basic Life", "Gliders", "Acorn", "Spider", "Copperhead", "Tanner P46", "Simkin Glider Gun", "Snark", "2 Engine Cordership"));
        bst = new BST<>();
        for (String str : presets) {
            bst.insert(str);
        }
        map = new HashMap<>();
        map.put("Gosper Glider Gun", () -> {
            animator.loadPreset(Preset.gosperGliderGun(50, 50, 0));
            animator.loadPreset(Preset.gosperGliderGun(45, 30, 2));
        });
        map.put("R-Pentomino", () -> {animator.loadPreset(Preset.rPentomino(50, 50, 0));});
        map.put("Basic Life", () -> {animator.loadPreset(Preset.basicLife(20, 30, 0));});
        map.put("Gliders", () -> {animator.loadPreset(Preset.gliders(50, 30, 0));});
        map.put("Acorn", () -> {animator.loadPreset(Preset.acorn(60, 50, 0));});
        map.put("Spider", () -> {
            animator.loadPreset(Preset.spider(50, 70, 0));
            animator.loadPreset(Preset.spider(76, 70, 5));
        });
        map.put("Copperhead", () -> {animator.loadPreset(Preset.copperhead(50, 50, 0));});
        map.put("Tanner P46", () -> {animator.loadPreset(Preset.tannerP46(30, 30, 0));});
        map.put("Simkin Glider Gun", () -> {animator.loadPreset(Preset.simkinGliderGun(50, 50, 0));});
        map.put("Snark", () -> {animator.loadPreset(Preset.snark(50, 50, 0));});
        map.put("2 Engine Cordership", () -> {animator.loadPreset(Preset.twoEngineCordership(50, 45, 0));});

        home();

        Scene scene = new Scene(mainPane, size, size);
        primaryStage.setTitle("The Game of Life");
        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void home() {
        Pane startPane = new Pane();
        mainPane.setStyle("-fx-background: rgb(255,255,255);");

        VBox column = new VBox(20);
        column.setLayoutX(250); column.setLayoutY(70);
        column.setAlignment(Pos.CENTER);

        ImageView img = new ImageView(new Image("spider.png"));

        Label title = new Label("Conway's Game of Life");
        title.setFont(Font.font(50));
        Label instructions = new Label("Choose an option below to get started");
        instructions.setFont(Font.font(20));

        Button playground = new Button("Playground Mode");
        playground.setFont(Font.font(15));
        playground.setOnMouseClicked(e -> {
            startGame("");
        });

        Label or = new Label("or"); or.setFont(Font.font(20));
        Label preset = new Label("Choose a preset below:");
        preset.setFont(Font.font(20));

        ObservableList<String> presetList = FXCollections.observableArrayList();
        presetList.addAll(presets);

        ListView<String> presetsList = new ListView<>(presetList);
        presetsList.setPrefWidth(300); presetsList.setPrefHeight(300);
        presetsList.getSelectionModel().selectedItemProperty().addListener((observed_val, old_val, selected_val) -> {
            System.out.println(selected_val);
            startGame(selected_val);
        });

        column.getChildren().addAll(img, title, instructions, playground, or, preset, presetsList);
        startPane.getChildren().add(column);
        mainPane.setCenter(startPane);
        mainPane.setBottom(null);
    }

    public void startGame(String preset) {

        Pane boardPane = new Pane();
        boardPane.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
        Board board = new Board(size / BoardAnimator.pixel_length);
        animator = new BoardAnimator(board, boardPane);

        if (!preset.isEmpty()) {
            map.get(preset).run();
        }

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

        Button nextBtn = new Button("Next Stage");
        nextBtn.setOnMouseClicked(e -> animator.nextStage());
        Button resetBtn = new Button("Reset");
        resetBtn.setOnMouseClicked(e -> {
            animator.setStopped(true);
            animator.reset();
            if (!preset.isEmpty()) {
                map.get(preset).run();
            }
            startStopBtn.setText("Start");
        });

        Button homeBtn = new Button("Home");
        homeBtn.setOnMouseClicked(e -> {
            if (animatorThread != null) {
                animator.setStopped(true);
            }
            home();
        });

        infoBox.getChildren().addAll(startStopBtn, nextBtn, resetBtn, homeBtn);

        mainPane.setCenter(boardPane);
        mainPane.setBottom(infoBox);
    }

//    public LinkedList<String> insertionSort(LinkedList<String> inList) {
//
//    }
}