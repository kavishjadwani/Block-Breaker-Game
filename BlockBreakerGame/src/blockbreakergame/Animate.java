/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blockbreakergame;

/**
 *
 * @author Monika
 */
public class Animate implements Runnable {

    BlockBreakerPanel bp;

    Animate(BlockBreakerPanel b) {
        bp = b;
    }

    public void run() {
        while (true) {
            bp.update();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}
