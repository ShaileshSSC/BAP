import javafx.application.*;
import java.util.Scanner;
import javafx.stage.Stage;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.paint.Color;

import javafx.scene.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.geometry.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
//event listener import
import javafx.event.*;
import javafx.scene.input.*;



      public class Character extends Application
        {


                private Rectangle2D rect = new Rectangle2D(50,50,20,20);

                private static Stage stage;

                public static Stage getStage() {
                  return stage;
                }
                Text enemyHealth = new Text();
                Text health = new Text();
                int leven = 100;
                int enemyLeven;

                EventHandler<KeyEvent> refOnKeyPressedChoose = this::OnKeyPressedChoose;
                EventHandler<KeyEvent> refOnKeyPressed = this::OnKeyPressed;

                String musicFile = "Infinity.mp3";
                String musicFileKlik = "klik.wav";     // For example

                Media soundklik = new Media(new File(musicFileKlik).toURI().toString());
                Media sound = new Media(new File(musicFile).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(sound);
                MediaPlayer mediaPlayerKlik = new MediaPlayer(soundklik);

                Scanner scanner = new Scanner(System.in);

                Pane myPane = new Pane();
                Pane myPane2 = new Pane();
                Pane myPane3 = new Pane();
                Scene myScene = new Scene(myPane, 1900, 1080);
                Scene myScene2 = new Scene(myPane2, 1900, 1080);
                Scene myScene3 = new Scene(myPane3, 1900, 1080);


                Image level1 = new Image("level1.jpg");
                Image choose = new Image("choose.jpg");
                Image background = new Image("pred.jpg");
                ImageView bcView;

                Image img = new Image("c1.png");
                ImageView imgView;

                Image img2 = new Image("c2.png");
                ImageView imgView2;

                Image imgB = new Image("c12.png");

                Image imgC = new Image("c22.png");

                //Choose

                Image select = new Image("idle.gif");
                ImageView selectView;

                Image main2 = new Image("main2.png");
                Image main = new Image("main.png");
                ImageView mainView;


                Image shai2 = new Image("frame2.png");
                Image shai = new Image("frame.png");
                ImageView shaiView;


                Image player = new Image("player.png");
                ImageView playerView;

                Image walk = new Image("walk.gif");
                ImageView spelerView;

                Image enemy = new Image("monster1.gif");
                ImageView enemyView;

                boolean selector = true;


                public static void main(String[] args)
                {
                  launch(args);
                }

                @Override
                public void start(Stage primaryStage) throws Exception
                {
                  stage = primaryStage;
                  myPane.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
                  Menu();
                }



                public void Menu()
                {
                  selector = true;
                  this.getStage().setFullScreen(false);
                  this.getStage().setTitle("Adventure");
                  this.getStage().setScene(myScene);
                  this.getStage().setFullScreen(true);
                  this.getStage().show();

                  bcView = new ImageView(background);
                  imgView = new ImageView(imgB);
                  imgView2 = new ImageView(img2);

                  imgView.setX(700);
                  imgView.setY(300);

                  imgView2.setX(700);
                  imgView2.setY(500);


                  myPane.getChildren().addAll(bcView, imgView, imgView2);

                  myPane.addEventHandler(KeyEvent.KEY_PRESSED, refOnKeyPressed);
                  myPane.requestFocus();
                  mediaPlayer.play();

                }

                public void OnKeyPressed(KeyEvent event)
                {

                  if(event.getCode() == KeyCode.UP)
                  {
                  //  myPane.getChildren().removeAll(imgView, imgViewB, imgViewC, imgViewD);
                  //  myPane.getChildren().add(imgViewB);
                    imgView.setImage(imgB);
                    imgView2.setImage(img2);
                    selector = true;
                  }
                  else if (event.getCode() == KeyCode.DOWN)
                  {
                  //  myPane.getChildren().removeAll(imgView, imgViewB, imgViewC, imgViewD);
                  //  myPane.getChildren().add(imgViewC);
                  imgView.setImage(img);
                  imgView2.setImage(imgC);
                  selector = false;
                  }
                  //start game
                  if (selector == true && (event.getCode() == KeyCode.ENTER)){
                    myPane.getChildren().removeAll(imgView, imgView2, bcView);
                    myPane.getChildren().remove(mediaPlayer);
                    myPane.removeEventHandler(KeyEvent.KEY_PRESSED, refOnKeyPressed);
                    Choose();
                  }
                  else if (selector == false && (event.getCode() == KeyCode.ENTER)){
                    System.exit(0);
                  }
                }













                public void Choose()
                {

                  selector = true;

                  playerView = new ImageView(player);
                  selectView = new ImageView(select);
                  shaiView = new ImageView(shai);
                  mainView = new ImageView(main);

                  selectView.setX(700);
                  selectView.setY(100);

                  playerView.setX(700);
                  playerView.setY(0);

                  shaiView.setX(700);
                  shaiView.setY(130);
                  shaiView.setScaleX(0.7);
                  shaiView.setScaleY(0.7);

                  mainView.setX(700);
                  mainView.setY(600);


                  myPane2.getChildren().addAll(bcView, playerView, selectView, shaiView, mainView);
                  bcView.setImage(choose);
                  this.getStage().setFullScreen(false);
                  this.getStage().setScene(myScene2);
                  this.getStage().setFullScreen(true);
                  this.getStage().show();


                  //myPane2.getChildren().removeAll(selectView, bcView, playerView, shaiView, mainView);

                  myPane2.addEventHandler(KeyEvent.KEY_PRESSED, refOnKeyPressedChoose);
                  myPane2.requestFocus();


                }

                public void OnKeyPressedChoose(KeyEvent event)
                {

                  if(event.getCode() == KeyCode.UP)
                  {
                  //  myPane.getChildren().removeAll(imgView, imgViewB, imgViewC, imgViewD);
                  //  myPane.getChildren().add(imgViewB);
                   shaiView.setImage(shai);
                    mainView.setImage(main);
                    selector = true;
                  }
                  else if (event.getCode() == KeyCode.DOWN)
                  {
                  //  myPane.getChildren().removeAll(imgView, imgViewB, imgViewC, imgViewD);
                  //  myPane.getChildren().add(imgViewC);
                  shaiView.setImage(shai2);
                 mainView.setImage(main2);
                  selector = false;
                  }
                  if (selector == true && (event.getCode() == KeyCode.ENTER)){
                    myPane2.getChildren().removeAll(bcView, playerView, selectView, shaiView, mainView);
                    myPane2.removeEventHandler(KeyEvent.KEY_PRESSED, refOnKeyPressedChoose);
                    mediaPlayer.stop();
                    Game();
                  //  myPane2.getChildren().removeAll(imgView, imgView2, bcView);
                  //  myPane2.getChildren().remove(mediaPlayer);
                  //  myPane.removeEventHandler(KeyEvent.KEY_PRESSED, refOnKeyPressed);
                  //  Choose();
                  }
                  else if (selector == false && (event.getCode() == KeyCode.ENTER)){
                    myPane2.getChildren().removeAll(bcView, playerView, selectView, shaiView, mainView);
                    myPane2.removeEventHandler(KeyEvent.KEY_PRESSED, refOnKeyPressedChoose);
                    Menu();
                  }
                }









                //game
                public void Game()
                {
                  enemyView = new ImageView(enemy);
                  spelerView = new ImageView(select);

                  enemyView.setX(500);
                  enemyView.setY(700);
                  spelerView.setX(50);
                  spelerView.setY(600);
                  enemyView.setScaleX(0.5);
                  enemyView.setScaleY(0.5);
                  spelerView.setScaleX(0.5);
                  spelerView.setScaleY(0.5);
                  health.setX(250);
                  health.setY(770);
                  health.setText(Integer.toString(leven));
                  health.setFont(Font.font("bold", FontPosture.ITALIC, 60));
                  health.setFill(Color.GREEN);

                  enemyLeven = 5;
                  enemyHealth.setText(Integer.toString(enemyLeven));
                  enemyHealth.setFont(Font.font("bold", FontPosture.ITALIC, 60));
                  enemyHealth.setFill(Color.GREEN);
                  enemyHealth.setX(680);
                  enemyHealth.setY(820);

                  myPane3.getChildren().addAll(bcView, spelerView, health, enemyView, enemyHealth);
                  bcView.setImage(level1);
                  this.getStage().setFullScreen(false);
                  this.getStage().setScene(myScene3);
                  this.getStage().setFullScreen(true);
                  this.getStage().show();

                  myPane3.addEventHandler(KeyEvent.KEY_RELEASED, refOnKeyReleasedMove);
                  myPane3.addEventHandler(KeyEvent.KEY_PRESSED, refOnKeyPressedMove);
                  myPane3.requestFocus();



                }
                public static boolean getRandomBoolean() {
                  return Math.random() < 0.5;
                }


                EventHandler<KeyEvent> refOnKeyReleasedMove = this::OnKeyReleasedMove;
                EventHandler<KeyEvent> refOnKeyPressedMove = this::OnKeyPressedMove;
                public void OnKeyPressedMove(KeyEvent event){
                  boolean dead = false;
                  if (spelerView.getScaleX() >= 0.6) {
                    spelerView.setScaleX(spelerView.getScaleX() - 0.01);
                    spelerView.setScaleY(spelerView.getScaleY() - 0.01);
                    health.setY(health.getY() - 5);
                    spelerView.setY(spelerView.getY() - 5);
                  }
                  if (spelerView.getScaleX() == 0.5) {
                    spelerView.setScaleX(spelerView.getScaleX() + 0.01);
                    spelerView.setScaleY(spelerView.getScaleY() + 0.01);
                    health.setY(health.getY() + 5);
                    spelerView.setY(spelerView.getY() + 5);
                  }
                  if (spelerView.getX() == 300) {
                    health.setX(health.getX() - 10);
                    spelerView.setX(spelerView.getX() - 10);
                  }
                  if (spelerView.getX() == -210) {
                    health.setX(health.getX() + 10);
                    spelerView.setX(spelerView.getX() + 10);
                  }
                  if(event.getCode() == KeyCode.RIGHT)
                  {
                  //  System.out.println(test);
                  //  System.out.println(spelerView.getX());
                    health.setX(health.getX() + 10);
                    spelerView.setX(spelerView.getX() + 10);
                    spelerView.setImage(walk);
                  }
                  if(event.getCode() == KeyCode.LEFT)
                  {
                  //  System.out.println(spelerView.getX());
                    health.setX(health.getX() - 10);
                    spelerView.setX(spelerView.getX() - 10);
                  }
                  if(event.getCode() == KeyCode.UP)
                  {
                    health.setY(health.getY() - 5);
                    spelerView.setY(spelerView.getY() - 5);
                    spelerView.setScaleY(spelerView.getScaleY() - 0.01);
                    spelerView.setScaleX(spelerView.getScaleX() - 0.01);
                    spelerView.setImage(walk);
                  }
                  if(event.getCode() == KeyCode.DOWN)
                  {
                    health.setY(health.getY() + 5);
                    spelerView.setY(spelerView.getY() + 5);
                    spelerView.setScaleY(spelerView.getScaleY() + 0.01);
                    spelerView.setScaleX(spelerView.getScaleX() + 0.01);
                    spelerView.setImage(walk);
                  }
                  if (spelerView.getX() > 250)
                  {
                    if(event.getCode() == KeyCode.SPACE)
                    {
                      if (enemyLeven > 0) {
                        if (getRandomBoolean()) {
                          leven--;
                        }
                      }
                      if (leven > 0 && enemyLeven > 0) {
                        enemyLeven--;
                          health.setText(Integer.toString(leven));
                          enemyHealth.setText(Integer.toString(enemyLeven));
                      }
                    }
                  }
                  if (enemyLeven == 0) {
                    myPane3.getChildren().removeAll(enemyView, enemyHealth);
                  }
                  if (leven > 60) {
                    health.setFill(Color.GREEN);
                  }
                  if (leven < 61) {
                    health.setFill(Color.ORANGE);
                  }
                  if (leven < 30) {
                    health.setFill(Color.RED);
                  }
                }


                public void OnKeyReleasedMove(KeyEvent event){
                  spelerView.setImage(select);
                }




                }
