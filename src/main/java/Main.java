/*
 * Decompiled with CFR 0.151.
 *
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class Main extends MIDlet implements Runnable {
    public static boolean b;
    public static boolean var_boolean_a;
    public static Main var_Main_a;

    public static void main(String [] arg){
        Main main = new Main();
    }

    public Main() {
        b = false;
        var_boolean_a = true;
        var_Main_a = this;
        C.var_int_d = 1;
        new C();
    }

    protected final void startApp() {
        Display.getDisplay(this).setCurrent(C.var_C_a);
    }

    protected final void pauseApp() {
        this.notifyPaused();
        System.gc();
    }

    protected void destroyApp(boolean bl) {
        b = true;
        this.notifyDestroyed();
    }

    public void run() {
        C.void_a(3);
    }
}
