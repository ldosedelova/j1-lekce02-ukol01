package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
        Turtle zofka;

    public void main(String[] args) {

        zofka = new Turtle();
        posunZofkyDoStreduPole();
        nakresliPrasatko();

    }

    private void posunZofkyDoStreduPole() {
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private void nakresliPrasatko() {
        nakresliNozicky();
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(190);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.penDown();

        nakresliObdelnik();

        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(100);

        nakresliTrojuhelnik();
        zofka.move(100);
        zofka.turnLeft(90);
    }

    private void nakresliNozicky() {
        for (int i = 0; i < 2; i++) {
            zofka.turnLeft(30);
            zofka.move(20);
            zofka.turnLeft(120);
            zofka.move(20);
            zofka.turnRight(60);
            zofka.penUp();
            zofka.move(80);
            zofka.penDown();
            zofka.turnRight(90);
        }
    }

    private void nakresliObdelnik() {
        for (int i = 0; i < 2; i++) {
            zofka.move(50);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
        }
    }

    private void nakresliTrojuhelnik() {
        zofka.turnLeft(30);
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.turnLeft(30);
    }

}
