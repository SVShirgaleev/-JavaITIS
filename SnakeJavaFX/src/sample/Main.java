package sample;

import javafx.animation.Animation;
import javafx.animation.FillTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    private enum Direction {
        UP, DOWN, RIGHT, LEFT;
    }

    private static final int block_size = 40;
    private static final int weight = 20 * block_size;
    private static final int height = 15 * block_size;
    private Direction direction = Direction.RIGHT;
    public int count = 0;
    private boolean moved = false;
    private boolean running = false;

    private Timeline timeline = new Timeline();
    private ObservableList<Node> snake;


    private Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(weight, height);

        Group snakeBody = new Group();
        snake = snakeBody.getChildren();

        Rectangle food = new Rectangle(block_size, block_size);
        food.setFill(Color.RED);
        food.setTranslateX((int) (Math.random() * weight - block_size) / (block_size * block_size));
        food.setTranslateY((int) (Math.random() * weight - block_size) /( block_size * block_size));

        KeyFrame frame = new KeyFrame(Duration.seconds(0.3), event -> {
            if (!running) return;
            boolean toRemove = snake.size() > 1;
            Node tail = toRemove ? snake.remove(snake.size() - 1) : snake.get(0);

            double tailX = tail.getTranslateX();
            double tailY = tail.getTranslateY();


            switch (direction) {
                case UP:
                    tail.setTranslateX(snake.get(0).getTranslateX());
                    tail.setTranslateY(snake.get(0).getTranslateY() - block_size);
                    break;


                case RIGHT:
                    tail.setTranslateX(snake.get(0).getTranslateX() + block_size);
                    tail.setTranslateY(snake.get(0).getTranslateY());

                    break;
                case LEFT:
                    tail.setTranslateX(snake.get(0).getTranslateX() - block_size);
                    tail.setTranslateY(snake.get(0).getTranslateY());

                    break;
                case DOWN:
                    tail.setTranslateX(snake.get(0).getTranslateX() );
                    tail.setTranslateY(snake.get(0).getTranslateY() + block_size);
                    break;

            }

            moved = true;


            if (toRemove) {
                snake.add(0, tail);
            }

            for (Node n : snake) {
                if (n != tail && tail.getTranslateX
                        () == n.getTranslateX() && tail.getTranslateY() == n.getTranslateY()) {
                    restartGame();
                    break;

                }
            }


            if (tail.getTranslateX() < 0 || tail.getTranslateX() == weight ||
                    tail.getTranslateY() < 0 || tail.getTranslateY() == height) {
                restartGame();
            }


            if (tail.getTranslateX() == food.getTranslateX()) {
                if (tail.getTranslateY() == food.getTranslateY()) {
                    food.setTranslateX((int) (Math.random() * weight - block_size) / block_size * block_size);
                    food.setTranslateY((int) (Math.random() * weight - block_size) / block_size * block_size);
                    Rectangle rectangle = new Rectangle(block_size, block_size);
                    rectangle.setTranslateX(tailX);
                    rectangle.setTranslateY(tailY);


                    snake.add(rectangle);
                    count++;
                    System.out.println(count);

                }
            }
        });

        timeline.getKeyFrames().add(frame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        root.getChildren().addAll(food, snakeBody);



        //Pane pane  = new Pane();
        Image image=new Image(getClass().getResourceAsStream("snake_skin_01.jpg"));
        ImageView view = new ImageView(image);
        view.setFitHeight(600);
        view.setFitWidth(800);
        root.getChildren().add(view);

        MenuItem newGame = new MenuItem("НОВАЯ ИГРА");
        MenuItem settings = new MenuItem("НАСТРОЙКИ");
        MenuItem records = new MenuItem("РЕКОРДЫ");
        SubMenu mainMenu = new SubMenu(newGame,settings,records);
        MenuBox menuBox = new MenuBox(mainMenu);
        newGame.setOnMouseClicked(event -> startGame());
        root.getChildren().addAll(menuBox);
        return root;
    }


    private void restartGame() {
        stopGame();
        startGame();

    }


    private void stopGame() {
        timeline.stop();
        running = false;

        snake.clear();
    }


    private void startGame() {
        direction = Direction.RIGHT;
        Rectangle head = new Rectangle(block_size, block_size);
        snake.add(head);
        timeline.play();
        running = true;
        count=0;
    }

    /*private void update(){
     if(isPressed(KeyCode))
    }*/

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());

        scene.setOnKeyPressed(event -> {
            if (!moved) return;
            switch (event.getCode()) {
                case DOWN:
                    if (direction != Direction.UP) {
                        direction = Direction.DOWN;
                    }
                    break;

                case RIGHT:
                    if (direction != Direction.LEFT) {
                        direction = Direction.RIGHT;
                    }
                    break;

                case LEFT:
                    if (direction != Direction.RIGHT) {
                        direction = Direction.LEFT;
                    }
                    break;

                case UP:
                    if (direction != Direction.DOWN) {
                        direction = Direction.UP;
                   }
                    break;
            }
            moved = false;
        });
        



      /*  Pane pane  = new Pane();
        Image image=new Image(getClass().getResourceAsStream("snake_skin_01.jpg"));
        ImageView view = new ImageView(image);
        view.setFitHeight(800);
        view.setFitHeight(600);

        MenuItem newGame = new MenuItem("НОВАЯ ИГРА");
        MenuItem settings = new MenuItem("НАСТРОЙКИ");
        MenuItem records = new MenuItem("РЕКОРДЫ");
        SubMenu mainMenu = new SubMenu(newGame,settings,records);
        MenuBox menuBox = new MenuBox(mainMenu);
        pane.getChildren().addAll(menuBox);


        newGame.setOnMouseClicked(event -> startGame());


*/




        //pane.getChildren().add(view);
        primaryStage.setTitle("Slither");
        primaryStage.setScene(scene);
        primaryStage.show();
        //startGame();
    }

    private class MenuItem extends StackPane{
        public MenuItem(String name){
            Rectangle rectangle= new Rectangle(200,20,Color.WHITE);
            rectangle.setOpacity(0.5);
            Text text =new Text(name);
            text.setFill(Color.WHITE);
            text.setFont(Font.font("Helvetica", FontWeight.BOLD,11));

            this.setAlignment(Pos.CENTER);
            getChildren().addAll(rectangle,text);

            FillTransition fillTransition = new FillTransition(Duration.seconds( 0.1),rectangle);

            setOnMouseEntered(event -> {
                fillTransition.setFromValue(Color.AZURE);
                fillTransition.setToValue(Color.GREY);
                fillTransition.setCycleCount(Animation.INDEFINITE);
                fillTransition.setAutoReverse(true);

                fillTransition.play();


            });


            setOnMouseExited(event -> {
                fillTransition.stop();
                rectangle.setFill(Color.WHITE);
            });
        }


    }



    private static class SubMenu extends VBox{
        public SubMenu(MenuItem...item){
            this.setSpacing(15);
            setTranslateX(100);
            setTranslateY(50);
            for(MenuItem m:item){

                getChildren().addAll(m);
            }
        }
    }



    public static class MenuBox extends Pane{
        static SubMenu subMenu;
        public MenuBox(SubMenu subMenu){

            MenuBox.subMenu = subMenu;
            setVisible(false);

            Rectangle rectangle=new Rectangle (800,600,Color.BLUE);
            rectangle.setOpacity(0.5);
            getChildren().addAll(subMenu,rectangle);
        }

        public void setSubMenu(SubMenu subMenu){
            getChildren().remove(MenuBox.subMenu);
            MenuBox.subMenu=subMenu;
            getChildren().add(MenuBox.subMenu);
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
