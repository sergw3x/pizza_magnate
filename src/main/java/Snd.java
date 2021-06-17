import com.nokia.mid.sound.Sound;
import java.io.InputStream;

public class Snd {
    private static final boolean var_boolean_a;
    private static Sound b;
    private Sound var_com_nokia_mid_sound_Sound_a = null;

    public Snd(String string, long l) {
        try {
            this.a(string, l);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        Thread.yield();
    }

    public synchronized void a(String string, long l) {
        try {
            InputStream inputStream = this.getClass().getResourceAsStream(string);
            byte[] byArray = new byte[28000];
            inputStream.read(byArray);
            this.var_com_nokia_mid_sound_Sound_a = new Sound(byArray, 5);
            this.var_com_nokia_mid_sound_Sound_a.play(1);
            this.var_com_nokia_mid_sound_Sound_a.stop();
        } catch (Exception exception) {
            // empty catch block
        }
    }

    public synchronized void a() {
        if (this.var_com_nokia_mid_sound_Sound_a == null || !var_boolean_a) {
            return;
        }
        Snd.b();
        try {
            this.var_com_nokia_mid_sound_Sound_a.play(1);
            b = this.var_com_nokia_mid_sound_Sound_a;
        } catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
        }
    }

    private static synchronized void b() {
        try {
            if (b != null) {
                b.stop();
                b = null;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static {
        var_boolean_a = true;
        b = null;
    }
}
