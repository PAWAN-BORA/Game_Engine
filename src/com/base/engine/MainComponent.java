package com.base.engine;

import org.lwjgl.glfw.GLFW;

public class MainComponent {
    public static void main(String[] args) {
        System.out.println("num");
        Window.createWindow(500, 500);
        MainComponent game = new MainComponent();
        game.start();

    }
    public void mainComponent() {

    }
    public void start() {
        run();
    }
    public void stop() {

    }
    public void run() {
        while (!Window.isClose()) {
            System.out.println("running");
            Window.update();
            Window.swapBuffer();
            render();
        }
    }
    public void render() {

    }
    public void cleanUp() {

    }


}
