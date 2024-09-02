package com.tejas.separate_classes_interface;

public class CdPlayer implements Music{
    @Override
    public void start() {
        System.out.println("Start the music..");
    }

    @Override
    public void stop() {
        System.out.println("Stop the music..");
    }
}
