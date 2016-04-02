package ru.kpfu.itis.java2k.ss; /**
 * Created by salavatshirgaleev on 07.12.15.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.PrintWriter;

public class Dots extends JFrame {
    private int counter = 0;
    private int counterS = 0;
    private int step;
    private PrintWriter pw;
    private Rectangle[][] dots = new Rectangle[7][7];
    public int[][] status = new int[7][7];
    int blue = 0;
    int red = 0;

    public Dots(final PrintWriter pw, final int step, final String name) {

        setTitle(name);
        setLocation(new Point(500, 200));
        setSize(500, 400);
        setResizable(false);

        this.pw = pw;
        this.step = step;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                dots[i][j] = new Rectangle(40 + 70 * i, 70 + 40 * j, 11, 11);
                status[i][j] = 0;
            }
        }

        addMouseListener(new MouseListener() {
                             public void mouseClicked(MouseEvent e) {
                                 if (e.getButton() == MouseEvent.BUTTON1) {
                                     Point pointMouse = e.getPoint();
                                     for (int i = 0; i < 7; i++) {
                                         for (int j = 0; j < 7; j++) {

                                             if (dots[i][j].contains(pointMouse) && (status[i][j] == 0)) {
                                                 if (counter % 2 == step) {
                                                     status[i][j] = step + 1;
                                                     pw.println(i + ":" + j);
                                                     counter++;
                                                 }

                                                 repaint();
                                             }

                                             if (end()) {
                                                 reds();
                                                 JOptionPane.showMessageDialog(null, "Игра окончена");
                                                 if (JOptionPane.showConfirmDialog(null, "Счет игры:" + red + blue) == JOptionPane.YES_OPTION) {


                                                     new Dots(pw, step, name);

                                                 } else {
                                                     System.exit(0);
                                                 }

                                             }
                                         }

                                     }
                                 }


                             }

                             @Override
                             public void mousePressed(MouseEvent e) {

                             }

                             @Override
                             public void mouseReleased(MouseEvent e) {

                             }

                             @Override
                             public void mouseEntered(MouseEvent e) {

                             }

                             @Override
                             public void mouseExited(MouseEvent e) {

                             }
                         }

        );

        addWindowListener(new WindowCatcher()

        );

        setVisible(true);
    }

    public boolean end() {
        int s = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (status[i][j] != 0) {
                    s++;
                }
            }
        }
        if (s == 49) {
            return true;
        } else return false;
    }

    private void reds() {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                int st = status[i][j];
                if (st != 0) {
                    if (i == 0 && j == 0 && status[i + 1][j] != st && status[i][j + 1] != st && status[i + 1][j + 1] != st) {
                        if (st == 1) {
                            red++;
                        } else blue++;
                    } else {
                        if (i == 6 && j == 0 && status[i - 1][j] != st && status[i][j + 1] != st && status[i - 1][j + 1] != st) {
                            if (st == 1) {
                                red++;
                            } else blue++;
                        } else {
                            if (i == 0 && j == 6 && status[i + 1][j] != st && status[i][j - 1] != st && status[i + 1][j - 1] != st) {
                                if (st == 1) {
                                    red++;
                                } else blue++;
                            } else {
                                if (i == 6 && j == 6 && status[i - 1][j] != st && status[i][j - 1] != st && status[i - 1][j - 1] != st) {
                                    if (st == 1) {
                                        red++;
                                    } else blue++;
                                } else {
                                    if (i > 0 && i < 6 && j == 0 && status[i][j + 1] != st && status[i][j - 1] != st && status[i + 1][j] != st) {
                                        if (st == 1) {
                                            red++;
                                        } else blue++;
                                    } else {
                                        if (i > 0 && i < 6 && j == 6 && status[i][j + 1] != st && status[i][j - 1] != st && status[i - 1][j] != st) {
                                            if (st == 1) {
                                                red++;
                                            } else blue++;
                                        } else {
                                            if (i == 0 && j > 0 && j < 6 && status[i - 1][j] != st && status[i + 1][j] != st && status[i][j - 1] != st) {
                                                if (st == 1) {
                                                    red++;
                                                } else blue++;
                                            } else {

                                                if (i == 6 && j > 0 && j < 6 && status[i - 1][j] != st && status[i + 1][j] != st && status[i][j + 1] != st) {
                                                    if (st == 1) {
                                                        red++;
                                                    } else blue++;
                                                } else {
                                                    if (status[i + 1][j + 1] != st && status[i + 1][j - 1] != st && status[i - 1][j - 1] != st && status[i - 1][j + 1] != st) {
                                                        if (st == 1) {
                                                            red++;
                                                        } else blue++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

            }
        }

    }


    public void paint(Graphics g) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (status[i][j] == 3) {
                    g.setColor(Color.cyan);
                } else {
                    if (status[i][j] == 4) {
                        g.setColor(Color.green);
                    } else {
                        if (status[i][j] == 0) {
                            g.setColor(Color.black);

                        } else {
                            if (status[i][j] == 1) {
                                g.setColor(Color.red);
                            } else {
                                g.setColor(Color.blue);
                            }
                        }
                    }
                }

                g.fillRect(dots[i][j].x, dots[i][j].y, dots[i][j].width, dots[i][j].height);

            }
        }
    }


    public void updateData(String message, int statusNumber) {
        int i = Integer.parseInt(message.split(":")[0]);
        int j = Integer.parseInt(message.split(":")[1]);
        status[i][j] = statusNumber;
        repaint();
        counter++;
    }

    class WindowCatcher extends WindowAdapter {
        public void windowClosing(WindowEvent event) {
            event.getWindow().dispose();
            System.exit(0);
        }
    }

}