package com.base.engine;


import org.lwjgl.Version;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class Window {
    private static  long window;
    public static void createWindow(int width, int height){
        if(!GLFW.glfwInit()) {
            System.err.println("could not initialize GLFW");
        }
        Window.window = GLFW.glfwCreateWindow(width, height, "Title", 0, 0);
        GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, GLFW.GLFW_FALSE);
        if(Window.window==0) {
            System.err.println("Could not initialize the window");
            System.exit(-1);
        }
        GLFWVidMode videoMode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
        assert videoMode != null;
        GLFW.glfwSetWindowPos(Window.window, (videoMode.width()-width)/2, (videoMode.height()-height)/2);
        GLFW.glfwShowWindow(Window.window);
    }
    public static boolean isClose() {
        return  GLFW.glfwWindowShouldClose(Window.window);
    }
    public static void update() {
        GLFW.glfwPollEvents();
    }
    public static  void swapBuffer() {
        GLFW.glfwSwapBuffers(Window.window);
    }
}
