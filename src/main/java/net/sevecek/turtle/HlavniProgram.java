package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
        Turtle zofka;


    public void main(String[] args) {

        zofka = new Turtle();

        posunZofkyDoStreduPole();
        nakresliPrasatko();

        zofka.penUp();
        zofka.move(300);
        zofka.penDown();

        nakresliOsmiuhelnik();

        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        zofka.turnRight(90);

        nakresliKolecko();

        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        zofka.turnRight(90);

        nakresliSlunicko();
    }

    public void nakresliSlunicko() {
        for (int i = 0; i < 20; i++) {
            zofka.move(18);
            zofka.turnRight(90);
            zofka.move(10);
            zofka.turnLeft(180);
            zofka.move(10);
            zofka.turnRight(90);
            zofka.turnLeft(18);
        }
    }

    public void nakresliKolecko() {
        for (int i = 0; i < 20; i++) {
            zofka.move(18);
            zofka.turnLeft(18);
        }
    }

    public void nakresliOsmiuhelnik() {
        for (int i = 0; i < 8; i++) {
            zofka.move(40);
            zofka.turnLeft(45);
        }
    }

    public void posunZofkyDoStreduPole() {
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public void nakresliPrasatko() {
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

    public void nakresliNozicky() {
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

    public void nakresliObdelnik() {
        for (int i = 0; i < 2; i++) {
            zofka.move(50);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
        }
    }

    public void nakresliTrojuhelnik() {
        zofka.turnLeft(30);
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.turnLeft(30);
    }

}
