package com.tejas.separate_classes_interface;

public class Car {
    private Engine engine;
    private Music player;
    public Car(){
        engine = new PowerEngine();
        player = new CdPlayer();
    }

    public Car(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public Car(Music player){
        this.player = player;
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }

}
