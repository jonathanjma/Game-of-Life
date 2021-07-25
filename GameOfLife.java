import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GameOfLife extends Application {

    private BorderPane mainPane = new BorderPane();
    private Thread animatorThread;
    private BoardAnimator animator;

    private final int size = 1000;

    // preset library: https://conwaylife.appspot.com/library

    @Override
    public void start(Stage primaryStage) {

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
        primaryStage.setOnCloseRequest(e -> {
            if (animatorThread != null) {animator.setStopped(true);}
        });
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

        Scene scene = new Scene(mainPane, size, size);
        primaryStage.setTitle("Life");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void loadAllPresets() {
        try {
            animator.loadPreset(Preset.gosperGliderGun(30, 50, 0));
            animator.loadPreset(Preset.gosperGliderGun(45, 43, 1));
            animator.loadPreset(Preset.gosperGliderGun(37, 13, 2));
            animator.loadPreset(Preset.gosperGliderGun(20, 21, 3));
        } catch (IndexOutOfBoundsException ex) {ex.printStackTrace();}
    }
}