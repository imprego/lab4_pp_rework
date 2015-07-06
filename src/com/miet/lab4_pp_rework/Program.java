package com.miet.lab4_pp_rework;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Program extends JFrame {
    private JTextField x1 = new JTextField();
    private JTextField y1 = new JTextField();
    private JTextField z1 = new JTextField();
    private JTextField x2 = new JTextField();
    private JTextField y2 = new JTextField();
    private JTextField z2 = new JTextField();
    private JTextField xR = new JTextField();
    private JTextField yR = new JTextField();
    private JTextField zR = new JTextField();


    private Box createPanelViewWebPage(){
        //текст для шифрования
        x1.setFont(new Font("Monospaced",Font.BOLD, 14));
        y1.setFont(new Font("Monospaced", Font.BOLD, 14));
        z1.setFont(new Font("Monospaced", Font.BOLD, 14));
        x2.setFont(new Font("Monospaced",Font.BOLD, 14));
        y2.setFont(new Font("Monospaced", Font.BOLD, 14));
        z2.setFont(new Font("Monospaced", Font.BOLD, 14));
        xR.setFont(new Font("Monospaced",Font.BOLD, 14));
        yR.setFont(new Font("Monospaced", Font.BOLD, 14));
        zR.setFont(new Font("Monospaced", Font.BOLD, 14));

        //имя файла
        JLabel labelvect1 = new JLabel("Vector #1");
        JLabel labelvect2 = new JLabel("Vector #2");
        JLabel labelres = new JLabel("Result vector");

        JButton mulV = new JButton("multiply (vector)");
        mulV.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {

            }
        });
        JButton plus = new JButton("plus");
        plus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {

            }
        });
        JButton minus = new JButton("minus");
        minus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {

            }
        });
        JButton mulS = new JButton("multiply (scalar)");
        mulS.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {

            }
        });




        //добавление на панель
        Box boxAllWindow = Box.createVerticalBox();
        Box vect1Box = Box.createHorizontalBox();
        Box vect2Box = Box.createHorizontalBox();
        Box vectResBox = Box.createHorizontalBox();
        Box buttonsBox = Box.createHorizontalBox();

        vect1Box.add(Box.createHorizontalStrut(0));
        vect1Box.add(labelvect1);
        vect1Box.add(Box.createHorizontalStrut(20));
        vect1Box.add(x1);
        vect1Box.add(Box.createHorizontalStrut(10));
        vect1Box.add(y1);
        vect1Box.add(Box.createHorizontalStrut(10));
        vect1Box.add(z1);
        vect1Box.add(Box.createHorizontalStrut(0));

        vect2Box.add(Box.createHorizontalStrut(0));
        vect2Box.add(labelvect2);
        vect2Box.add(Box.createHorizontalStrut(20));
        vect2Box.add(x2);
        vect2Box.add(Box.createHorizontalStrut(10));
        vect2Box.add(y2);
        vect2Box.add(Box.createHorizontalStrut(10));
        vect2Box.add(z2);
        vect2Box.add(Box.createHorizontalStrut(0));

        vectResBox.add(Box.createHorizontalStrut(0));
        vectResBox.add(labelres);
        vectResBox.add(Box.createHorizontalStrut(20));
        vectResBox.add(xR);
        vectResBox.add(Box.createHorizontalStrut(10));
        vectResBox.add(yR);
        vectResBox.add(Box.createHorizontalStrut(10));
        vectResBox.add(zR);
        vectResBox.add(Box.createHorizontalStrut(0));

        buttonsBox.add(Box.createHorizontalStrut(0));
        buttonsBox.add(plus);
        buttonsBox.add(Box.createHorizontalStrut(20));
        buttonsBox.add(minus);
        buttonsBox.add(Box.createHorizontalStrut(10));
        buttonsBox.add(mulS);
        buttonsBox.add(Box.createHorizontalStrut(10));
        buttonsBox.add(mulV);
        buttonsBox.add(Box.createHorizontalStrut(0));



        boxAllWindow.add(Box.createVerticalStrut(8));
        boxAllWindow.add(vect1Box);
        boxAllWindow.add(Box.createVerticalStrut(10));
        boxAllWindow.add(vect2Box);
        boxAllWindow.add(Box.createVerticalStrut(10));
        boxAllWindow.add(vectResBox);
        boxAllWindow.add(Box.createVerticalStrut(10));
        boxAllWindow.add(buttonsBox);
        boxAllWindow.add(Box.createVerticalStrut(10));
        boxAllWindow.add(Box.createVerticalStrut(400));

        return boxAllWindow;
    }

    public void draw(){
        //JPanel pane = new JPanel();
        JTabbedPane pane = new JTabbedPane();
        pane.add("List",createPanelViewWebPage());
        this.add(pane);
    }

    public Program(){
        super ("Matrix calculator");
        this.setSize(800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Program pr = new Program();
        pr.draw();
    }
}

