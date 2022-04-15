package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
        Turtle zofka;
        Color cernaBarva;
        Color cervenaBarva;
        Color ruzovaBarva;
        Color zlutaBarva;
        Color modraBarva;


    public void main(String[] args) {

        zofka = new Turtle();
        cernaBarva = new Color(0x131315);
        cervenaBarva = new Color(0xBA0E34);
        ruzovaBarva = new Color(0xFA0AA7);
        zlutaBarva = new Color(0xE2C816);
        modraBarva = new Color(0x8585EA);

        zofka.setLocation(600,450);
        nakresliPrasatko();

        zofka.setLocation(600,100);
        //nakresliOsmiuhelnik();

        zofka.setLocation(500,100);
        //nakresliKolecko();

        zofka.setLocation(400,100);
        nakresliSlunicko();

        zofka.turnRight(90);
        zofka.setLocation(270, 450);
        nakresliDomecek();

        zofka.setLocation(270,290);
        nakresliDomeckovouKolonii();

        zofka.setLocation(670,450);
        nakresliDomecek();

        zofka.setLocation(270,630);
        zofka.turnLeft(90);

        nakresliL();
        nakresliE();
        nakresliN();
        nakresliK();
        nakresliA();
    }

    public void nakresliA() {
        zofka.setPenColor(modraBarva);
        zofka.turnRight(15);
        zofka.move(82.462);
        zofka.turnRight(150);
        zofka.move(82.462);
        zofka.turnLeft(180);
        zofka.move(41.231);
        zofka.turnLeft(75);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnRight(75);
        zofka.move(41.231);
        zofka.turnLeft(75);
        zofka.penUp();
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    public void nakresliN() {
        zofka.setPenColor(modraBarva);
        zofka.move(80);
        zofka.turnRight(153.435);
        zofka.move(89.443);//80
        zofka.turnLeft(153.435);
        zofka.move(80);
        zofka.turnRight(180);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    public void nakresliK() {
        zofka.setPenColor(modraBarva);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(135);
        zofka.move(56.569);
        zofka.turnLeft(180);
        zofka.move(56.569);
        zofka.turnLeft(90);
        zofka.move(56.569);
        zofka.turnLeft(45);
        zofka.penUp();
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    public void nakresliE() {
        zofka.setPenColor(modraBarva);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.penUp();
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    public void nakresliL() {
        zofka.setPenColor(modraBarva);
        zofka.move(80);
        zofka.turnRight(180);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.penUp();
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    public void nakresliDomeckovouKolonii() {
        for (int i = 0; i < 5; i++) {
            nakresliDomecek();
            zofka.penUp();
            zofka.move(50);
            zofka.penDown();
        }
    }

    public void nakresliDomecek() {
        zofka.setPenColor(cernaBarva);
        nakresliObdelnik();
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(80);//100
        zofka.setPenColor(cervenaBarva);
        nakresliTrojuhelnik();
        zofka.setPenColor(cernaBarva);
        zofka.move(80);//100
        zofka.turnLeft(90);
        zofka.move(50);
    }

    public void nakresliSlunicko() {
        zofka.setPenColor(zlutaBarva);
        for (int i = 0; i < 20; i++) {
            zofka.move(10);//18
            zofka.turnRight(90);
            zofka.move(8);//10
            zofka.turnLeft(180);
            zofka.move(8);//10
            zofka.turnRight(90);
            zofka.turnLeft(18);
        }
    }

    public void nakresliKolecko() {
        for (int i = 0; i < 20; i++) {
            zofka.move(10);
            zofka.turnLeft(18);
        }
    }

    public void nakresliOsmiuhelnik() {
        for (int i = 0; i < 8; i++) {
            zofka.move(25);
            zofka.turnLeft(45);
        }
    }

    public void nakresliPrasatko() {
        zofka.setPenColor(ruzovaBarva);
        nakresliNozicky();
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(150);//190
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.penDown();

        nakresliObdelnik();

        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(80);//100

        nakresliTrojuhelnik();
        zofka.move(80);//100
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
            zofka.move(60);//80
            zofka.penDown();
            zofka.turnRight(90);
        }
    }

    public void nakresliObdelnik() {
        for (int i = 0; i < 2; i++) {
            zofka.move(50);
            zofka.turnLeft(90);
            zofka.move(80);//100
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
