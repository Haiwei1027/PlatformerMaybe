package me.haiwei;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Renderer extends JFrame implements Runnable{

    private int targetFPS = 60;
    public JPanel pane;

    @Override
    public void run() {
        long frameTime;
        while (true){
            frameTime = System.nanoTime();

            pane.repaint();
            repaint();

            frameTime = System.nanoTime()-frameTime;
            try{
                long targetFrameTime = 1000/targetFPS;
                long sleepDuration = targetFrameTime-frameTime;
                if (sleepDuration > 0){
                    Thread.sleep(sleepDuration);
                }
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    class RenderPane extends JPanel {

        public RenderPane(){
            super();
        }
        @Override
        public void paintComponent(Graphics g){
            Main.world.drawAll(g);
        }
    }

    public Renderer(String title, Vector size,Color bgColor){
        super(title);
        pane = new RenderPane();
        setContentPane(pane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int)size.x,(int)size.y);
        setResizable(false);
        setBackground(bgColor);
        setVisible(true);
    }
}
