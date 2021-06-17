///*
// * Decompiled with CFR 0.151.
// *
// * Could not load the following classes:
// *  com.nokia.mid.ui.FullCanvas
// *  javax.microedition.lcdui.Graphics
// *  javax.microedition.lcdui.Image
// *  javax.microedition.rms.RecordStore
// *  javax.microedition.rms.RecordStoreException
// */
//
//import com.nokia.mid.ui.FullCanvas;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.Random;
//import java.util.Vector;
//import javax.microedition.lcdui.Graphics;
//import javax.microedition.lcdui.Image;
//import javax.microedition.rms.RecordStore;
//import javax.microedition.rms.RecordStoreException;
//
//public final class C extends FullCanvas implements Runnable {
//    private static int var_int_x;
//    private static int var_int_i;
//    private static int var_int_g;
//    private static int var_int_C;
//    private static Snd var_sound_start_mission;
//    private static Snd var_sound_lost_mision;
//    private static Snd var_sound_complited_mission;
//    private static Snd var_sound_upgrade_floor;
//    private static Snd var_sound_select;
//    public static C var_C_a;
//    public static boolean var_boolean_s;
//    public static byte var_byte_g;
//    public static byte var_byte_e;
//    private static int var_int_a;
//    private static int[] var_int_arr_i;
//    private static byte[][] var_byte_arr_arr_a;
//    private static byte var_byte_k;
//    public static int L;
//    public static byte var_byte_b;
//    public static byte var_byte_w;
//    public static byte var_byte_y;
//    private static final int[] var_int_arr_o;
//    private static int var_int_z;
//    public static int N;
//    private static short var_short_g;
//    private static byte[] var_byte_arr_e;
//    private static final byte[] var_byte_arr_n;
//    public static RecordStore var_javax_microedition_rms_RecordStore_a;
//    private static Image var_javax_microedition_lcdui_Image_e;
//    private static Image var_javax_microedition_lcdui_Image_b;
//    public static boolean[] var_boolean_arr_b;
//    public static boolean[] var_boolean_arr_f;
//    public static byte var_byte_C;
//    public static int var_int_o;
//    public static int R;
//    public static int S;
//    public static int var_int_t;
//    public static int F;
//    public static byte var_byte_c;
//    public static int M;
//    public static boolean var_boolean_l;
//    private static byte[][] var_byte_arr_arr_i;
//    private static short var_short_k;
//    private static short var_short_j;
//    private static short var_short_h;
//    private static int var_int_v;
//    public static byte var_byte_p;
//    private static short var_short_b;
//    private static short var_short_l;
//    private static short var_short_r;
//    private static short var_short_p;
//    private static short var_short_o;
//    private static short var_short_e;
//    private static short var_short_n;
//    private static short var_short_d;
//    private static boolean var_boolean_m;
//    private static boolean var_boolean_t;
//    private static boolean var_boolean_i;
//    public static boolean var_boolean_c;
//    public static byte var_byte_q;
//    private static boolean var_boolean_n;
//    private static boolean var_boolean_h;
//    private static boolean var_boolean_o;
//    private static boolean var_boolean_d;
//    private static boolean var_boolean_e;
//    private static boolean var_boolean_q;
//    private static short var_short_m;
//    private static byte var_byte_h;
//    private static long var_long_e;
//    private static long var_long_f;
//    private static byte var_byte_s;
//    private static byte var_byte_x;
//    private static byte var_byte_z;
//    private static byte var_byte_B;
//    private static boolean var_boolean_w;
//    private static short var_short_a;
//    private static boolean var_boolean_b;
//    private static byte var_byte_E;
//    private static byte[] var_byte_arr_g;
//    private static byte[] var_byte_arr_k;
//    private static byte var_byte_a;
//    public static byte var_byte_v;
//    private static short var_short_f;
//    private static int var_int_m;
//    private static int var_int_u;
//    private static int P;
//    private static int var_int_j;
//    private static int[] var_int_arr_m;
//    private static boolean var_boolean_v;
//    private static byte var_byte_D;
//    public static int var_int_r;
//    public static int I;
//    private static byte var_byte_l;
//    private static byte var_byte_t;
//    private static Vector var_java_util_Vector_a;
//    private static Vector var_java_util_Vector_b;
//    private static Vector var_java_util_Vector_f;
//    private static byte[] var_byte_arr_h;
//    private static short[] var_short_arr_m;
//    private static short[] var_short_arr_a;
//    private static boolean[] var_boolean_arr_j;
//    public static short[] var_short_arr_n;
//    public static short[] var_short_arr_b;
//    public static short[] var_short_arr_d;
//    public static short[] var_short_arr_k;
//    public static short[] var_short_arr_s;
//    private static short[] var_short_arr_v;
//    public static boolean[] var_boolean_arr_e;
//    public static boolean[] var_boolean_arr_g;
//    private static final int K;
//    private static final int[] var_int_arr_b;
//    public static final int[] var_int_arr_l;
//    public static final int[] var_int_arr_j;
//    private static final int H;
//    private static long var_long_b;
//    private static Image var_javax_microedition_lcdui_Image_d;
//    public static Graphics var_javax_microedition_lcdui_Graphics_a;
//    public static boolean var_boolean_k;
//    public static boolean var_boolean_u;
//    public static boolean var_boolean_x;
//    public static boolean var_boolean_r;
//    public static int var_int_c;
//    public static int var_int_d;
//    public static long var_long_d;
//    public static int var_int_b;
//    public static int var_int_l;
//    public static int var_int_e;
//    public static int var_int_k;
//    public static int var_int_A;
//    public static int var_int_s;
//    public static long var_long_a;
//    public static int var_int_n;
//    public static byte var_byte_n;
//    public static byte[] var_byte_arr_l;
//    public static boolean var_boolean_p;
//    public static short var_short_c;
//    public static Vector var_java_util_Vector_g;
//    private static Vector var_java_util_Vector_e;
//    private static Vector var_java_util_Vector_c;
//    private static boolean[] var_boolean_arr_d;
//    private static byte[][] var_byte_arr_arr_b;
//    private static boolean[] var_boolean_arr_k;
//    public static short var_short_i;
//    public static int G;
//    public static Vector var_java_util_Vector_d;
//    public static byte var_byte_A;
//    private static final byte[][] var_byte_arr_arr_c;
//    private static boolean[][] var_boolean_arr_arr_a;
//    private static boolean[][] var_boolean_arr_arr_b;
//    private static boolean[] var_boolean_arr_a;
//    private static boolean var_boolean_g;
//    public static short var_short_s;
//    public static short var_short_q;
//    public static byte[] var_byte_arr_o;
//    public static byte var_byte_i;
//    public static byte var_byte_m;
//    public static byte var_byte_d;
//    public static int var_int_B;
//    public static Random var_java_util_Random_a;
//    public static final char[] var_char_arr_b;
//    public static final char[] var_char_arr_a;
//    public static byte[][] var_byte_arr_arr_d;
//    public static byte[][] var_byte_arr_arr_h;
//    public static byte var_byte_f;
//    public static byte var_byte_r;
//    public static byte var_byte_j;
//    public static byte var_byte_u;
//    public static byte var_byte_o;
//    public static byte[] var_byte_arr_i;
//    public static byte[] var_byte_arr_m;
//    public static byte[] var_byte_arr_c;
//    public static Image var_javax_microedition_lcdui_Image_a;
//    protected static final Image[] var_javax_microedition_lcdui_Image_arr_a;
//    public static Image var_javax_microedition_lcdui_Image_c;
//    public static Image var_javax_microedition_lcdui_Image_f;
//    public static int[] var_int_arr_f;
//    public static boolean var_boolean_a;
//    public static int var_int_E;
//    public static long var_long_c;
//    private static boolean var_boolean_f;
//    public static int var_int_h;
//    public static int var_int_q;
//    public static boolean var_boolean_j;
//    public static int var_int_y;
//    public static short[] var_short_arr_c;
//    public static short[] var_short_arr_h;
//    public static int J;
//    public static int Q;
//    public static int var_int_D;
//    public static int O;
//    public static int var_int_w;
//    public static int var_int_p;
//    public static int var_int_f;
//    public static final short[] var_short_arr_l;
//    public static final int[] var_int_arr_e;
//    public static final int[] var_int_arr_q;
//    public static final int[] var_int_arr_c;
//    public static final int[] var_int_arr_n;
//    public static final int[] var_int_arr_k;
//    public static final int[] var_int_arr_d;
//    public static final short[] var_short_arr_p;
//    public static final int[][] var_int_arr_arr_b;
//    public static final int[] var_int_arr_g;
//    public static final String[] var_java_lang_String_arr_a;
//    public static final short[] var_short_arr_w;
//    public static final boolean[] var_boolean_arr_c;
//    public static final short[] var_short_arr_j;
//    public static final short[] var_short_arr_q;
//    public static final short[] var_short_arr_f;
//    public static final short[] var_short_arr_u;
//    public static final byte[] var_byte_arr_f;
//    public static final byte[] var_byte_arr_d;
//    public static final byte[] var_byte_arr_j;
//    public static final byte[] var_byte_arr_b;
//    public static final short[][] var_short_arr_arr_a;
//    public static final byte[] var_byte_arr_a;
//    public static final short[] var_short_arr_o;
//    public static final short[][] var_short_arr_arr_b;
//    public static final byte[][] var_byte_arr_arr_f;
//    public static final byte[][] var_byte_arr_arr_e;
//    public static final short[] var_short_arr_g;
//    public static final boolean[] var_boolean_arr_i;
//    public static final byte[][] var_byte_arr_arr_g;
//    public static final short[] var_short_arr_e;
//    public static final boolean[] var_boolean_arr_h;
//    public static final short[] var_short_arr_r;
//    public static final short[] var_short_arr_t;
//    public static final int[][] var_int_arr_arr_a;
//    public static final short[] var_short_arr_i;
//    public static final int[] var_int_arr_h;
//    public static final int[] var_int_arr_a;
//    public static final int[] var_int_arr_p;
//
//    public C() {
//        var_C_a = this;
//        try {
//            C.O();
//            C.D();
//            C.r();
//            C.a(var_byte_arr_f);
//            C.a(var_byte_arr_d);
//            C.a(var_byte_arr_j);
//            C.a(var_byte_arr_b);
//            C.ar();
//            C.au();
//            var_byte_m = (byte) (183 / (var_byte_f + 2));
//            var_byte_d = (byte) ((183 - var_byte_m * (var_byte_f + 2)) / 2);
//            var_int_B = C.int_a(C.byte_arr_a("100%"), 3);
//            var_javax_microedition_lcdui_Image_e = C.javax_microedition_lcdui_Image_a("map");
//            var_javax_microedition_lcdui_Image_b = C.javax_microedition_lcdui_Image_a("houses");
//        } catch (Exception exception) {
//            exception.printStackTrace();
//            Main.var_Main_a.notifyDestroyed();
//        }
//        var_sound_start_mission = new Snd("start_mission.amr", 4934L);
//        var_sound_lost_mision = new Snd("lost_mission.amr", 5094L);
//        var_sound_complited_mission = new Snd("mission_completed.amr", 4038L);
//        var_sound_upgrade_floor = new Snd("upgrade_floor.amr", 3494L);
//        var_sound_select = new Snd("select.amr", 454L);
//        if (C.boolean_a("PMSAVEGAME")) {
//            var_boolean_j = true;
//        }
//        C.ar();
//        var_javax_microedition_lcdui_Image_d = Image.createImage((int) 176, (int) 208);
//        var_javax_microedition_lcdui_Graphics_a = var_javax_microedition_lcdui_Image_d.getGraphics();
//        new Thread(this).start();
//    }
//
//    protected final void showNotify() {
//        Main.var_boolean_a = false;
//        var_boolean_k = true;
//    }
//
//    protected final void hideNotify() {
//        Main.var_boolean_a = true;
//        var_byte_p = 0;
//    }
//
//    protected final void keyPressed(int n) {
//        if ((C.boolean_b(n, 9) || C.boolean_b(n, 10) || C.boolean_b(n, 11)) && System.currentTimeMillis() - var_long_b < (long) H) {
//            return;
//        }
//        var_long_b = System.currentTimeMillis();
//        var_int_b = n;
//        var_int_n = n;
//        if (Main.var_boolean_a) {
//            return;
//        }
//        if (var_int_c == 20) {
//            C.d(n);
//        } else if (var_int_c == 6) {
//            C.e(n);
//            if (n == -7) {
//                var_int_d = 3;
//            }
//        } else if (var_int_c == 8) {
//            if (C.boolean_b(n, 0)) {
//                if ((var_byte_s = (byte) (var_byte_s - 1)) < 0) {
//                    var_byte_s = (byte) 6;
//                }
//            } else if (C.boolean_b(n, 1)) {
//                if ((var_byte_s = (byte) (var_byte_s + 1)) >= 7) {
//                    var_byte_s = 0;
//                }
//            } else if (C.boolean_b(n, 2)) {
//                if ((var_byte_x = (byte) (var_byte_x - 1)) < 0) {
//                    var_byte_x = (byte) (var_byte_i - 1);
//                }
//            } else if (C.boolean_b(n, 3)) {
//                if ((var_byte_x = (byte) (var_byte_x + 1)) >= var_byte_i) {
//                    var_byte_x = 0;
//                }
//            } else if (C.boolean_b(n, 9)) {
//                byte by = (byte) (var_byte_x * 7 + var_byte_s);
//                int n2 = var_byte_arr_e.length;
//                if (by < 7 * var_byte_i - 1) {
//                    if (n2 < 8) {
//                        C.var_byte_arr_n[n2] = var_byte_arr_o[by];
//                        var_byte_arr_e = C.a(var_byte_arr_n, 0, (int) ((short) (n2 + 1)));
//                    }
//                } else if (n2 > 0) {
//                    var_byte_arr_e = C.a(var_byte_arr_e, 0, (int) ((short) (n2 - 1)));
//                }
//            } else if (C.boolean_b(n, 10)) {
//                C.void_a(4);
//                var_int_d = 10;
//            } else if (C.boolean_b(n, 11)) {
//                var_int_d = 3;
//            }
//            if (var_byte_s != var_byte_z || var_byte_x != var_byte_B) {
//                var_boolean_w = true;
//            }
//        } else if (var_int_c == 5) {
//            if (C.boolean_b(n, 2)) {
//                if ((var_byte_a = (byte) (var_byte_a - 1)) < 0) {
//                    var_byte_a = (byte) 2;
//                }
//            } else if (C.boolean_b(n, 3)) {
//                if ((var_byte_a = (byte) (var_byte_a + 1)) >= 3) {
//                    var_byte_a = 0;
//                }
//            } else if (C.boolean_b(n, 9) || C.boolean_b(n, 10)) {
//                if (var_byte_a == 0) {
//                    if ((var_byte_v = (byte) (var_byte_v + 1)) > 2) {
//                        var_byte_v = 0;
//                    }
//                } else if (var_byte_a == 1) {
//                    var_boolean_s = !var_boolean_s;
//                } else if (var_byte_a == 2) {
//                    var_boolean_t = !var_boolean_t;
//                }
//                var_boolean_k = true;
//            } else if (C.boolean_b(n, 11)) {
//                C.ag();
//                var_int_d = 3;
//            }
//            var_boolean_w = true;
//        } else if (var_int_c == 7) {
//            if (C.boolean_b(n, 11)) {
//                var_int_d = 3;
//            }
//        } else if (var_int_c == 10) {
//            if (C.boolean_b(n, 0)) {
//                var_boolean_i = !var_boolean_i;
//                var_boolean_w = true;
//            } else if (C.boolean_b(n, 1)) {
//                var_boolean_i = !var_boolean_i;
//                var_boolean_w = true;
//            } else if (C.boolean_b(n, 10) || C.boolean_b(n, 9)) {
//                C.void_a(4);
//                var_int_d = 11;
//            } else if (C.boolean_b(n, 11)) {
//                var_int_d = 3;
//            }
//        } else if (var_int_c == 11) {
//            if (C.boolean_b(n, 2)) {
//                if (var_short_d > 0) {
//                    if ((var_short_r = (short) (var_short_r - 1)) < 0) {
//                        var_short_r = var_short_d;
//                    }
//                    var_boolean_w = true;
//                }
//            } else if (C.boolean_b(n, 3)) {
//                if (var_short_d > 0) {
//                    if ((var_short_r = (short) (var_short_r + 1)) > var_short_d) {
//                        var_short_r = 0;
//                    }
//                    var_boolean_w = true;
//                }
//            } else if (C.boolean_b(n, 9) || C.boolean_b(n, 10)) {
//                C.void_a(4);
//                var_byte_C = (byte) var_short_r;
//                var_int_d = 13;
//            } else if (C.boolean_b(n, 11)) {
//                var_int_d = 10;
//            }
//        } else if (var_int_c == 12) {
//            if (C.boolean_b(n, 10) || C.boolean_b(n, 9)) {
//                C.void_a(4);
//                var_int_d = 11;
//            }
//        } else if (var_int_c == 13) {
//            if (C.boolean_b(n, 10) || C.boolean_b(n, 9)) {
//                C.void_a(4);
//                var_int_d = 20;
//                var_boolean_l = false;
//            } else if (C.boolean_b(n, 11)) {
//                var_int_d = 11;
//            }
//        }
//        switch (var_int_c) {
//            case 3: {
//                C.void_b(n);
//            }
//        }
//    }
//
//    protected final void keyReleased(int n) {
//        if (Main.var_boolean_a) {
//            return;
//        }
//        switch (var_int_c) {
//            case 20: {
//                C.f(n);
//                break;
//            }
//            case 6: {
//                var_byte_h = 0;
//            }
//        }
//    }
//
//    protected final void keyRepeated(int n) {
//        if (Main.var_boolean_a) {
//            return;
//        }
//    }
//
//    public static final void void_a(long l) {
//        var_int_A = 0;
//        var_int_n = 0;
//        var_long_a = l;
//    }
//
//    public static final void c(long l) {
//        var_int_s = var_int_A;
//        C.void_a(l);
//    }
//
//    protected final void paint(Graphics graphics) {
//        long l = C.long_a();
//        boolean bl = false;
//        boolean bl2 = false;
//        if (!Main.var_boolean_a) {
//            boolean bl3 = bl = var_int_d != 0;
//            if (bl) {
//                if (var_int_d == -2) {
//                    C.m();
//                    Main.var_Main_a.destroyApp(false);
//                    return;
//                }
//                if (var_int_c == 20) {
//                    C.m();
//                } else if (var_int_c == 6) {
//                    var_byte_arr_arr_i = null;
//                }
//                this.M();
//                var_boolean_k = true;
//                var_int_c = var_int_d;
//                var_int_d = 0;
//                var_int_b = 0;
//                var_long_d = l;
//                var_int_s = 0;
//                C.void_a(l);
//            } else {
//                boolean bl4 = bl2 = var_int_A != 0;
//                if (bl2) {
//                    C.c(l);
//                }
//            }
//        }
//        try {
//            switch (var_int_c) {
//                case 1: {
//                    if (bl) {
//                        C.i();
//                    }
//                    if (!Main.var_boolean_a) {
//                        C.b(l);
//                    }
//                    C.T(graphics);
//                    break;
//                }
//                case 2: {
//                    if (bl) {
//                        C.j();
//                    }
//                    if (!Main.var_boolean_a) {
//                        C.E();
//                    }
//                    C.W(graphics);
//                    break;
//                }
//                case 3: {
//                    if (bl) {
//                        C.d();
//                    }
//                    if (bl2) {
//                        C.aq();
//                    }
//                    C.a(graphics);
//                    break;
//                }
//                case 6: {
//                    if (bl) {
//                        C.u();
//                    }
//                    if (!Main.var_boolean_a) {
//                        C.g();
//                    }
//                    C.q(graphics);
//                    break;
//                }
//                case 8: {
//                    if (bl) {
//                        C.an();
//                    }
//                    C.o(graphics);
//                    break;
//                }
//                case 5: {
//                    C.b(graphics);
//                    break;
//                }
//                case 7: {
//                    C.A(graphics);
//                    break;
//                }
//                case 20: {
//                    if (bl) {
//                        C.R();
//                    }
//                    C.z(graphics);
//                    break;
//                }
//                case 9: {
//                    if (bl) {
//                        C.at();
//                    }
//                    if (!Main.var_boolean_a) {
//                        C.w();
//                    }
//                    C.V(graphics);
//                    break;
//                }
//                case 10: {
//                    if (bl) {
//                        C.ao();
//                    }
//                    C.B(graphics);
//                    break;
//                }
//                case 11: {
//                    if (bl) {
//                        C.aa();
//                    }
//                    if (!Main.var_boolean_a) {
//                        C.ax();
//                    }
//                    C.E(graphics);
//                    break;
//                }
//                case 12: {
//                    if (bl) {
//                        C.L();
//                    }
//                    C.e(graphics);
//                    break;
//                }
//                case 13: {
//                    if (bl) {
//                        C.t();
//                    }
//                    C.S(graphics);
//                }
//            }
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//        this.repaint();
//    }
//
//    public final void M() {
//        C.am();
//        System.gc();
//    }
//
//    public static final void Y() {
//        try {
//            var_int_h = 0;
//            var_int_q = 100;
//            var_int_h = 100;
//        } catch (Exception exception) {
//            var_int_d = -100;
//            exception.printStackTrace();
//        }
//    }
//
//    public static final void S() {
//        var_javax_microedition_lcdui_Image_c = null;
//        var_javax_microedition_lcdui_Image_f = null;
//        var_boolean_a = false;
//    }
//
//    public static final void i() {
//        C.S();
//        Thread thread = new Thread(Main.var_Main_a);
//        thread.setPriority(10);
//        thread.start();
//    }
//
//    public static final void am() {
//        C.S();
//    }
//
//    public static final boolean boolean_a(long l) {
//        int n = var_int_s - 1;
//        return n < 0 || var_short_arr_w[n] != -1 && l >= (long) var_short_arr_w[n] || var_boolean_arr_c[n] && var_int_n != 0;
//    }
//
//    public static final void b(long l) throws Exception {
//        long l2 = l - var_long_a;
//        if (var_boolean_a) {
//            if (var_int_E == 1) {
//                if (l - var_long_c > 500L) {
//                    var_int_E = 2;
//                    var_long_c = l;
//                }
//            } else if (var_int_E == 3 && l - var_long_c > 200L) {
//                var_int_E = 0;
//                var_long_c = l;
//            }
//        }
//        if (var_int_s < var_java_lang_String_arr_a.length) {
//            if (var_javax_microedition_lcdui_Image_f == null) {
//                // empty if block
//            }
//            if (C.boolean_a(l2)) {
//                var_javax_microedition_lcdui_Image_c = null;
//                var_javax_microedition_lcdui_Image_f = null;
//                var_javax_microedition_lcdui_Image_c = var_javax_microedition_lcdui_Image_f = Image.createImage((String) var_java_lang_String_arr_a[var_int_s]);
//                var_int_arr_f = null;
//                var_boolean_a = var_boolean_arr_c[var_int_s];
//                var_int_E = 0;
//                var_long_c = l;
//                var_int_A = var_int_s + 1;
//                C.c(l);
//            }
//        } else if (C.boolean_a(l2)) {
//            var_int_d = var_int_h < var_int_q ? 2 : 3;
//        }
//    }
//
//    public static final void b(Graphics graphics, int[] nArray) {
//        C.a(graphics, nArray);
//        graphics.drawImage(var_javax_microedition_lcdui_Image_c, 0, 0, 0);
//    }
//
//    public static final void T(Graphics graphics) {
//        if (var_javax_microedition_lcdui_Image_c != null && (var_int_E & 1) == 0) {
//            int[] nArray = var_int_arr_f == null ? var_int_arr_e : var_int_arr_f;
//            C.b(graphics, nArray);
//            if (var_boolean_a) {
//                ++var_int_E;
//            } else {
//                var_javax_microedition_lcdui_Image_c = null;
//            }
//        }
//    }
//
//    public static final void j() throws Exception {
//        if (var_javax_microedition_lcdui_Image_c == null) {
//            var_javax_microedition_lcdui_Image_c = Image.createImage((String) "/intro.png");
//        }
//    }
//
//    public static final void E() {
//        if (var_int_h >= var_int_q) {
//            var_int_d = 3;
//        }
//    }
//
//    public static final void W(Graphics graphics) {
//        if (var_int_s == 0) {
//            C.b(graphics, var_int_arr_e);
//            ++var_int_s;
//            graphics.setColor(0x808050);
//            graphics.setClip(40, 194, 106, 13);
//            graphics.fillRect(0, 0, 176, 208);
//        }
//        graphics.setColor(0xFFFFA0);
//        graphics.setClip(41, 195, 104 * var_int_h / var_int_q, 11);
//        graphics.fillRect(0, 0, 176, 208);
//        byte[] byArray = C.byte_arr_a("" + 100 * var_int_h / var_int_q + " %");
//        C.a(graphics, byArray, 3, 93, 200, 3, var_int_arr_e);
//    }
//
//    public static final void d() throws Exception {
//        int n;
//        J = 0;
//        Q = 0;
//        int n2 = var_short_arr_j.length;
//        var_int_y = 0;
//        var_short_arr_c = new short[n2];
//        var_short_arr_h = new short[n2];
//        block3:
//        for (n = 0; n < n2; ++n) {
//            switch (n) {
//                case 0: {
//                    if (!var_boolean_j) continue block3;
//                }
//                default: {
//                    C.var_short_arr_c[C.var_int_y] = var_short_arr_j[n];
//                    C.var_short_arr_h[C.var_int_y] = var_short_arr_q[n];
//                    ++var_int_y;
//                }
//            }
//        }
//        var_int_f = var_byte_f + 2 + var_byte_o;
//        var_int_w = 0;
//        for (n = 0; n < var_int_y; ++n) {
//            var_int_w = Math.max(var_int_w, C.int_a(var_byte_arr_arr_d[var_short_arr_c[n]], 1));
//        }
//        var_int_p = var_int_y * var_int_f;
//        var_int_D = 176 - var_int_w - 12 - 5;
//        O = 60;
//        if (var_javax_microedition_lcdui_Image_c == null) {
//            var_javax_microedition_lcdui_Image_c = Image.createImage((String) "/intro.png");
//        }
//    }
//
//    public static final void aq() {
//        var_javax_microedition_lcdui_Image_c = null;
//    }
//
//    public static final void void_b(int n) {
//        if (C.boolean_b(n, 2)) {
//            Q = Q > 0 ? --Q : var_int_y - 1;
//        } else if (C.boolean_b(n, 3)) {
//            Q = (Q + 1) % var_int_y;
//        } else if (C.boolean_b(n, 9) || C.boolean_b(n, 10)) {
//            short s = var_short_arr_h[Q];
//            C.void_a(4);
//            if (s == 101) {
//                var_int_d = 20;
//                var_boolean_l = true;
//            } else {
//                var_int_d = var_short_arr_h[Q];
//                var_boolean_l = false;
//            }
//        }
//        var_int_b = 0;
//    }
//
//    public static final void a(Graphics graphics, int n, boolean bl) {
//        int n2 = O + n * 23;
//        C.i(graphics);
//        if (n == Q) {
//            graphics.setColor(6391768);
//        } else {
//            graphics.setColor(5337265);
//        }
//        graphics.fillRect(10, n2, 156, 20);
//        graphics.setColor(0);
//        graphics.drawLine(11, n2 + 18 + 1, 166, n2 + 18 + 1);
//        graphics.drawLine(166, n2 + 1, 166, n2 + 18 + 1);
//        int n3 = var_boolean_j ? 0 : 1;
//        C.c(graphics, 1098 + n + n3, 13, n2 + 1, 0, var_int_arr_e);
//        C.a(graphics, (int) var_short_arr_c[n], 1, 60, n2 + 10, 2, var_int_arr_e);
//        if (bl) {
//            C.b(graphics, 3, 163, n2 + 18 - 2, 8, var_int_arr_e);
//        }
//    }
//
//    public static final void a(Graphics graphics) {
//        if (var_int_s == 0) {
//            C.D(var_javax_microedition_lcdui_Graphics_a);
//            C.b(var_javax_microedition_lcdui_Graphics_a, 24, 88, 5, 1, var_int_arr_e);
//            Q = -1;
//            for (int i = 0; i < var_int_y; ++i) {
//                C.a(var_javax_microedition_lcdui_Graphics_a, i, false);
//            }
//            ++var_int_s;
//            Q = 0;
//            J = -1;
//        }
//        if (Q != J) {
//            graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 0, 0);
//            C.a(graphics, Q, true);
//            J = Q;
//        }
//    }
//
//    private static final void M(Graphics graphics) {
//        graphics.setClip(0, 30, 175, 75);
//        graphics.setColor(0);
//        graphics.drawRect(0, 30, 175, 75);
//        int n = var_int_arr_arr_b[var_int_l - 22][0];
//        int n2 = var_int_arr_arr_b[var_int_l - 22][1];
//        graphics.setColor(n);
//        graphics.fillRect(1, 31, 174, 74);
//        if (var_int_l == 31) {
//            if (var_short_e > 0) {
//                if (var_short_d >= 0) {
//                    int n3 = var_short_arr_m[var_short_r] - 132;
//                    byte by = var_byte_arr_g[n3];
//                    byte by2 = var_byte_arr_k[n3];
//                    C.i(graphics);
//                    C.a(graphics, 52, 65 - var_byte_f, 114, (int) var_byte_f, 0, n2);
//                    C.a(graphics, 52, 69, 114, (int) var_byte_f, 0, n2);
//                    C.a(graphics, 162, 3, 62, 65, 32, var_int_arr_e);
//                    C.a(graphics, C.byte_arr_a(Integer.toString(by2)), 3, 156, 65, 41, var_int_arr_e);
//                    C.a(graphics, 161, 3, 62, 69, 0, var_int_arr_e);
//                    C.a(graphics, C.byte_arr_a(Integer.toString(by)), 3, 156, 69, 9, var_int_arr_e);
//                    C.i(graphics);
//                    graphics.setColor(10092276);
//                    graphics.fillRect(5, 51, 32, 32);
//                    C.c(graphics, 1079 + var_short_o, 5, 51, 0, var_int_arr_e);
//                } else {
//                    byte[][] byArray = null;
//                    byArray = var_boolean_m ? C.byte_arr_arr_a(303, 166) : C.byte_arr_arr_a(304, 166);
//                    int n4 = 67 - byArray.length * var_byte_f / 2;
//                    for (int i = 0; i < byArray.length; ++i) {
//                        C.a(graphics, byArray[i], 3, 88, n4, 1, var_int_arr_e);
//                        n4 += var_byte_f;
//                    }
//                }
//            } else {
//                graphics.setColor(2187916);
//                graphics.fillRect(1, 31, 174, 74);
//                C.a(graphics, 40, 67 - var_byte_f / 2, 96, (int) var_byte_f, 0, 7438237);
//                C.a(graphics, 119 + var_short_o, 3, 88, 67 - var_byte_f / 2, 1, var_int_arr_e);
//            }
//        } else {
//            int n5;
//            int n6 = 0;
//            int n7 = 0;
//            int n8 = 88;
//            byte[][] byArray = null;
//            byte[][] byArray2 = null;
//            short s = 0;
//            switch (var_int_l) {
//                case 22: {
//                    byte[][] byArray3;
//                    n7 = 37;
//                    if (var_boolean_m) {
//                        if (var_short_d < 0) {
//                            byArray2 = C.byte_arr_arr_a(290, 166);
//                        } else {
//                            n6 = var_short_arr_m[var_short_r] - 74;
//                            s = var_short_arr_g[n6];
//                            byArray = C.byte_arr_arr_a(254 + n6, 125);
//                            n8 = 109;
//                        }
//                    } else if (var_short_d < 0) {
//                        byArray2 = C.byte_arr_arr_a(291, 166);
//                    } else {
//                        n6 = var_short_arr_m[var_short_r] - 42;
//                        s = var_short_arr_o[n6];
//                        byArray3 = C.byte_arr_arr_a(n6);
//                        n5 = byArray3.length / 2;
//                        for (int i = 0; i < n5; ++i) {
//                            C.a(graphics, byArray3[2 * i], 3, 50, 31 + i * var_byte_f, 0, var_int_arr_e);
//                            C.a(graphics, C.byte_arr_a(Integer.toString(byArray3[2 * i + 1][0])), 3, 173, 31 + i * var_byte_f, 8, var_int_arr_e);
//                        }
//                    }
//                    if (byArray2 != null) break;
//                    C.a(graphics, 5, 49, 35, 35, n2, 0);
//                    C.c(graphics, 1218, 5, 67, 2, var_int_arr_e);
//                    break;
//                }
//                case 23: {
//                    if (var_short_d < 0) {
//                        if (var_boolean_m) {
//                            byArray2 = C.byte_arr_arr_a(291, 166);
//                            break;
//                        }
//                        byArray2 = C.byte_arr_arr_a(294, 166);
//                        break;
//                    }
//                    n7 = 37;
//                    s = var_short_arr_o[var_short_arr_m[var_short_r] - 42];
//                    n6 = var_short_arr_m[var_short_r] - 42;
//                    byte[][] byArray3 = C.byte_arr_arr_a(n6);
//                    C.a(graphics, 5, 49, 35, 35, n2, 0);
//                    int n9 = byArray3.length / 2;
//                    C.c(graphics, 1219, 5, 67, 2, var_int_arr_e);
//                    for (int i = 0; i < n9; ++i) {
//                        C.a(graphics, byArray3[2 * i], 3, 50, 31 + i * var_byte_f, 0, var_int_arr_e);
//                        C.a(graphics, C.byte_arr_a(Integer.toString(byArray3[2 * i + 1][0])), 3, 173, 31 + i * var_byte_f, 8, var_int_arr_e);
//                    }
//                    break;
//                }
//                case 24: {
//                    n7 = 37;
//                    if (var_boolean_m) {
//                        if (var_short_d < 0) {
//                            byArray2 = C.byte_arr_arr_a(293, 166);
//                        } else {
//                            n6 = var_short_arr_v[var_short_r] - 52;
//                        }
//                    } else if (var_short_d < 0) {
//                        byArray2 = C.byte_arr_arr_a(295, 166);
//                    } else {
//                        n6 = (Short) var_java_util_Vector_f.elementAt(var_short_r) - 52;
//                    }
//                    if (byArray2 != null) break;
//                    s = var_byte_arr_a[n6];
//                    C.a(graphics, 5, 49, 35, 35, n2, 0);
//                    C.c(graphics, 1220, 5, 67, 2, var_int_arr_e);
//                    byArray = C.byte_arr_arr_a(232 + n6, 125);
//                    n8 = 109;
//                    break;
//                }
//                case 25: {
//                    n7 = 37;
//                    if (var_short_d < 0) {
//                        if (var_boolean_m) {
//                            byArray2 = C.byte_arr_arr_a(292, 166);
//                            break;
//                        }
//                        byArray2 = C.byte_arr_arr_a(296, 166);
//                        break;
//                    }
//                    n6 = var_short_arr_m[var_short_r] - 74;
//                    s = var_short_arr_g[n6];
//                    C.a(graphics, 5, 49, 35, 35, n2, 0);
//                    C.c(graphics, 1221, 5, 67, 2, var_int_arr_e);
//                    byArray = C.byte_arr_arr_a(254 + n6, 125);
//                    n8 = 109;
//                    break;
//                }
//                case 26: {
//                    n7 = 39;
//                    if (var_boolean_m) {
//                        if (var_short_d < 0) {
//                            byArray2 = C.byte_arr_arr_a(297, 166);
//                        } else {
//                            s = var_short_arr_r[var_short_arr_m[var_short_r] - 212];
//                        }
//                    } else if (var_short_d < 0) {
//                        byArray2 = C.byte_arr_arr_a(298, 166);
//                    } else {
//                        s = var_short_arr_a[var_short_r];
//                    }
//                    if (byArray2 != null) break;
//                    C.a(graphics, 5, 49, 35, 35, n2, 0);
//                    C.c(graphics, 1222, 5, 67, 2, var_int_arr_e);
//                    byArray = C.byte_arr_arr_a(279 + (var_short_arr_m[var_short_r] - 212), 125);
//                    n8 = 109;
//                    break;
//                }
//                case 29: {
//                    n7 = 38;
//                    if (var_boolean_m) {
//                        if (var_short_d < 0) {
//                            byArray2 = C.byte_arr_arr_a(299, 166);
//                        } else {
//                            s = var_short_arr_l[var_short_arr_m[var_short_r] - 152];
//                        }
//                    } else if (var_short_d < 0) {
//                        byArray2 = C.byte_arr_arr_a(300, 166);
//                    } else {
//                        s = var_short_arr_a[var_short_r];
//                    }
//                    if (byArray2 != null) break;
//                    C.a(graphics, 5, 49, 35, 35, n2, 0);
//                    C.c(graphics, 1223, 5, 67, 2, var_int_arr_e);
//                    byArray = C.byte_arr_arr_a(266 + (var_short_arr_m[var_short_r] - 152), 125);
//                    n8 = 109;
//                    break;
//                }
//                case 30: {
//                    n7 = 38;
//                    if (var_boolean_m) {
//                        if (var_short_d < 0) {
//                            byArray2 = C.byte_arr_arr_a(301, 166);
//                        } else {
//                            s = var_short_arr_e[var_short_arr_m[var_short_r] - 109];
//                        }
//                    } else if (var_short_d < 0) {
//                        byArray2 = C.byte_arr_arr_a(302, 125);
//                    } else {
//                        s = var_short_arr_a[var_short_r];
//                    }
//                    if (byArray2 != null) break;
//                    C.a(graphics, 2, 49, 26, 35, n2, 0);
//                    C.c(graphics, 1074 + var_short_arr_m[var_short_r] - 109, 6, 67, 2, var_int_arr_e);
//                    byArray = C.byte_arr_arr_a(273 + (var_short_arr_m[var_short_r] - 109), 136);
//                    n8 = 103;
//                }
//            }
//            if (byArray2 != null) {
//                int n10 = 67 - byArray2.length * var_byte_f / 2 - 2;
//                for (n5 = 0; n5 < byArray2.length; ++n5) {
//                    C.a(graphics, byArray2[n5], 3, 88, n10, 1, var_int_arr_e);
//                    n10 += var_byte_f;
//                }
//            } else {
//                if (n7 > 0) {
//                    C.a(graphics, n7, 3, 2, 105, 32, var_int_arr_e);
//                    C.a(graphics, C.byte_arr_a(Integer.toString(s) + " $"), 3, 175, 105, 40, var_int_arr_e);
//                }
//                if (byArray != null) {
//                    int n11 = 67 - byArray.length * var_byte_f / 2 - 2;
//                    for (n5 = 0; n5 < byArray.length; ++n5) {
//                        C.a(graphics, byArray[n5], 3, n8, n11, 1, var_int_arr_e);
//                        n11 += var_byte_f;
//                    }
//                }
//            }
//        }
//        var_boolean_u = false;
//    }
//
//    private static final void s(Graphics graphics) {
//        graphics.setClip(0, 0, 176, 208);
//        int n = var_int_l - 22;
//        int n2 = var_int_arr_arr_b[n][0];
//        graphics.setClip(0, 116, 176, 67);
//        graphics.setColor(0);
//        graphics.drawRect(0, 116, 176, 67);
//        graphics.setColor(n2);
//        graphics.fillRect(1, 117, 168, 66);
//        for (short s = 0; s < 6 && s <= var_short_d; s = (short) ((byte) (s + 1))) {
//            C.a(graphics, var_short_n, s, (byte) 0);
//        }
//        graphics.setClip(0, 17, 176, 178);
//        graphics.setColor(5079272);
//        graphics.fillRect(170, 116, 6, 67);
//        graphics.setColor(0);
//        graphics.drawRect(169, 116, 7, 67);
//        graphics.drawLine(169, 123, 176, 123);
//        graphics.drawLine(169, 176, 176, 176);
//        var_boolean_x = false;
//    }
//
//    private static final void a(Graphics graphics, short s, short s2, byte by) {
//        int n;
//        short s3;
//        short s4 = 0;
//        boolean bl = true;
//        if (!var_boolean_m && var_int_l == 24) {
//            s3 = (Short) var_java_util_Vector_a.elementAt(s2 + s);
//            s4 = var_short_arr_a[s2 + s];
//        } else {
//            s3 = var_short_arr_m[s2 + s];
//            if (var_short_arr_a == null) {
//                bl = false;
//            } else {
//                s4 = var_short_arr_a[s2 + s];
//            }
//        }
//        int n2 = 116 + s2 * 11 + 1;
//        int n3 = n2 + 10 + 1;
//        int n4 = var_int_l - 22;
//        int n5 = var_int_arr_arr_b[n4][2];
//        int n6 = var_int_arr_arr_b[n4][1];
//        graphics.setClip(0, n2, 169, n3 - n2 + 1);
//        if (by == 1) {
//            graphics.setColor(n6);
//            graphics.fillRect(1, n2, 169, n3 - n2);
//            graphics.setColor(n5);
//        } else {
//            if (by == 2) {
//                n = var_int_arr_arr_b[n4][0];
//                graphics.setColor(n);
//                graphics.fillRect(80, n2, 88, var_byte_f - 1);
//            }
//            graphics.setColor(n5);
//        }
//        graphics.drawLine(1, n2, 168, n2);
//        graphics.drawLine(1, n3, 168, n3);
//        n = var_byte_f;
//        C.a(graphics, C.byte_arr_a(Integer.toString(s2 + s + 1)), 3, 1 + n, n2, 8, var_int_arr_e);
//        C.a(graphics, (int) s3, 3, 1 + n + 2, n2, 0, var_int_arr_e);
//        if (bl) {
//            C.a(graphics, C.byte_arr_a(Integer.toString(s4)), 3, 168, n2, 8, var_int_arr_e);
//        }
//    }
//
//    private static final void u(Graphics graphics) {
//        int n;
//        int n2;
//        int n3;
//        int n4;
//        C.i(graphics);
//        graphics.setColor(2039738);
//        graphics.setClip(0, 183, 176, 12);
//        graphics.fillRect(0, 183, 176, 12);
//        int n5 = var_int_l - 22;
//        if (n5 < 0) {
//            if (var_boolean_m) {
//                n4 = 3287678;
//                n3 = 4469481;
//            } else {
//                n4 = 4469481;
//                n3 = 3287678;
//            }
//        } else if (var_boolean_m) {
//            n4 = var_int_arr_arr_b[n5][2];
//            n3 = var_int_arr_arr_b[n5][1];
//        } else {
//            n4 = var_int_arr_arr_b[n5][1];
//            n3 = var_int_arr_arr_b[n5][2];
//        }
//        graphics.setColor(n4);
//        graphics.fillRoundRect(2, 183, 84, 12, 6, 6);
//        graphics.setColor(n3);
//        graphics.fillRoundRect(90, 183, 84, 12, 6, 6);
//        graphics.setColor(5128649);
//        graphics.drawRoundRect(1, 183, 85, 12, 8, 8);
//        graphics.drawRoundRect(89, 183, 85, 12, 8, 8);
//        switch (var_int_l) {
//            case 22: {
//                n2 = 91;
//                n = 92;
//                break;
//            }
//            case 23: {
//                n2 = 93;
//                n = 94;
//                break;
//            }
//            case 24:
//            case 25: {
//                n2 = 95;
//                n = 96;
//                break;
//            }
//            case 26: {
//                n2 = 101;
//                n = 102;
//                break;
//            }
//            case 27: {
//                n2 = 103;
//                n = 104;
//                break;
//            }
//            case 29: {
//                n2 = 105;
//                n = 106;
//                break;
//            }
//            case 30: {
//                n2 = 105;
//                n = 106;
//                break;
//            }
//            case 31: {
//                n2 = 98;
//                n = 97;
//                break;
//            }
//            default: {
//                n2 = 33;
//                n = 33;
//            }
//        }
//        C.a(graphics, n2, 3, 44, 189, 3, var_int_arr_e);
//        C.a(graphics, n, 3, 132, 189, 3, var_int_arr_e);
//    }
//
//    private static final void P(Graphics graphics) {
//        C.i(graphics);
//        if (var_boolean_k || var_int_v > 0) {
//            var_int_v = 15;
//        }
//        if (var_int_v <= 0) {
//            return;
//        }
//        C.b(graphics, 27, 0, 0, 0, var_int_arr_e);
//        if ((var_int_v & 1) > 0) {
//            C.c(graphics, 1018 + var_byte_p, 25, 9, 3, var_int_arr_e);
//        }
//        if ((var_int_v & 2) > 0) {
//            C.i(graphics);
//            C.a(graphics, C.byte_arr_a(Integer.toString(var_byte_D + 1)), 3, 48, 8, 3, var_int_arr_e);
//        }
//        if ((var_int_v & 4) > 0) {
//            C.i(graphics);
//            String string = Integer.toString(var_byte_t);
//            if (string.length() < 2) {
//                string = "0" + string;
//            }
//            String string2 = string + ":";
//            string = Integer.toString(var_byte_l);
//            if (string.length() < 2) {
//                string = "0" + string;
//            }
//            C.a(graphics, C.byte_arr_a(string2 + string), 3, 77, 8, 3, var_int_arr_e);
//        }
//        if ((var_int_v & 8) > 0) {
//            C.i(graphics);
//            C.a(graphics, C.byte_arr_a(Integer.toString(var_int_r)), 3, 107, 8, 2, var_int_arr_e);
//        }
//        var_int_v = 0;
//        var_boolean_w = true;
//    }
//
//    private static final void C(Graphics graphics) {
//        C.i(graphics);
//        graphics.setColor(1987001);
//        graphics.fillRect(158, 17, 18, 179);
//        graphics.setColor(-1);
//        for (int i = 0; i < 10; ++i) {
//            C.i(graphics);
//            graphics.fillRect(159, var_short_arr_p[i] + 1, 16, 14);
//            C.c(graphics, 1008 + i, 159, var_short_arr_p[i] + 1, 0, var_int_arr_e);
//        }
//    }
//
//    private static final void Q(Graphics graphics) {
//        int n;
//        int n2;
//        if (var_boolean_r) {
//            n2 = 32;
//            n = var_int_l == 31 && var_short_e > 0 && var_byte_k <= C.int_b((int) var_short_o) && !var_boolean_m ? 0 : 41;
//        } else {
//            var_boolean_f = true;
//            if (G == 0 && var_byte_D == 0 && var_int_l == 27) {
//                n2 = -1;
//                n = 34;
//            } else {
//                switch (var_int_l) {
//                    case 21: {
//                        n2 = 999;
//                        break;
//                    }
//                    case 22: {
//                        n2 = 999;
//                        break;
//                    }
//                    case 23: {
//                        n2 = 999;
//                        break;
//                    }
//                    case 24:
//                    case 25: {
//                        n2 = 999;
//                        break;
//                    }
//                    case 26: {
//                        n2 = 999;
//                        break;
//                    }
//                    case 27: {
//                        n2 = 999;
//                        break;
//                    }
//                    case 28: {
//                        n2 = 0;
//                        break;
//                    }
//                    case 29:
//                    case 30: {
//                        n2 = 999;
//                        break;
//                    }
//                    case 31: {
//                        if (var_short_e == 0) {
//                            n2 = 160;
//                            break;
//                        }
//                        n2 = 999;
//                        break;
//                    }
//                    case 70: {
//                        n2 = 160;
//                        break;
//                    }
//                    case 60: {
//                        n2 = 160;
//                        break;
//                    }
//                    default: {
//                        n2 = 33;
//                    }
//                }
//                n = var_int_l == 21 ? 159 : 33;
//            }
//        }
//        C.i(graphics);
//        C.b(graphics, 22, 0, 187, 0, var_int_arr_a);
//        C.b(graphics, 22, 0, 198, 0, var_int_arr_a);
//        if (n2 == 999) {
//            C.b(graphics, 30, 2, 206, 32, var_int_arr_e);
//        } else if (n2 > 0) {
//            C.a(graphics, n2, 3, 2, 207, 32, var_int_arr_e);
//        }
//        if (var_boolean_f) {
//            C.a(graphics, n, 3, 174, 207, 40, var_int_arr_e);
//        }
//        if (!var_boolean_r && var_int_l >= 21 && var_int_l <= 31) {
//            C.b(graphics, 4, 88, 208, 33, var_int_arr_e);
//        }
//    }
//
//    private static final void u() {
//        var_boolean_k = true;
//        var_short_f = (short) 14;
//        var_byte_arr_arr_i = K == 1 ? C.byte_arr_arr_a(C.byte_arr_a(57), 163) : C.byte_arr_arr_a(C.byte_arr_a(5), 163);
//        var_short_j = (short) (var_short_s + 15 * var_byte_f);
//        var_short_k = var_short_q;
//        var_short_h = (short) 14;
//        var_short_m = 0;
//    }
//
//    private static final void g() {
//        C.X();
//    }
//
//    private static final void q(Graphics graphics) {
//        C.a(graphics, var_byte_arr_arr_i, (short) 40, (short) 33);
//        if (var_boolean_k || var_boolean_w) {
//            short s = (short) (14 - var_short_m);
//            s = (short) (s + var_short_k);
//            for (int i = 0; i < 8; ++i) {
//                short s2 = (short) (s + 2 * i * var_byte_f);
//                if (s2 + 2 * var_byte_f <= var_int_m || s2 - var_byte_f > var_int_u) continue;
//                C.a(var_javax_microedition_lcdui_Graphics_a, i, var_int_j + s2 - var_int_u, var_int_arr_m);
//            }
//        }
//        C.v(graphics);
//    }
//
//    private static final void j(Graphics graphics) {
//        graphics.setClip(0, 0, 176, 208);
//        graphics.setColor(5079272);
//        graphics.fillRect(167, 14, 6, 179);
//        graphics.setColor(0);
//        graphics.drawRect(166, 14, 7, 179);
//        graphics.drawLine(166, 21, 173, 21);
//        graphics.drawLine(166, 186, 173, 186);
//        if (var_short_j > 0) {
//            graphics.setColor(255);
//            graphics.fillRect(167, 22 + 144 * var_short_m / var_short_j, 6, 20);
//        }
//        int n = var_short_m > 0 ? 1084 : 1088;
//        int n2 = var_short_m < var_short_j ? 1085 : 1089;
//        C.c(graphics, n, 167, 15, 0, var_int_arr_e);
//        C.c(graphics, n2, 167, 187, 0, var_int_arr_e);
//    }
//
//    private static final void a(Graphics graphics, int n, int n2, int[] nArray) {
//        C.a(graphics, nArray);
//        graphics.setColor(64 - (n + 1) * 7, 71 + (n + 1) * 12, 226 - (n + 1) * 16);
//        graphics.fillRect(nArray[0], n2 - var_byte_f, nArray[2] - nArray[0], 2 * var_byte_f);
//        C.c(graphics, 1000 + n, 4, n2, 2, nArray);
//        C.a(graphics, (int) var_short_arr_i[n * 2], 3, 91, n2, 33, nArray);
//        C.a(graphics, (int) var_short_arr_i[n * 2 + 1], 3, 91, n2, 17, nArray);
//    }
//
//    private static final void an() {
//        var_byte_s = 0;
//        var_byte_x = 0;
//        var_byte_arr_arr_i = C.byte_arr_arr_a(231, 166);
//    }
//
//    private static final void o(Graphics graphics) {
//        int n;
//        int n2;
//        int n3 = var_byte_f + 2;
//        int n4 = n3 >> 1;
//        int n5 = var_byte_i <= 4 ? n4 : 0;
//        int n6 = (var_byte_i - 1) * (n3 + 1 + n4) + n5;
//        int n7 = n3;
//        int n8 = 12 + n7 + 10 + 10 + n3 / 2;
//        int n9 = 4 + var_byte_s * 24 + 12;
//        int n10 = n8 + var_byte_x * (n3 + 1);
//        int n11 = 4 + var_byte_z * 24 + 12;
//        int n12 = n8 + var_byte_B * (n3 + 1);
//        if (var_boolean_k) {
//            C.a(graphics, var_int_arr_e);
//            C.D(graphics);
//            C.a(graphics, (short) 17);
//            C.a(graphics, (short) 35, (short) 33);
//            graphics.setClip(0, 0, 176, 208);
//            graphics.setColor(930438);
//            graphics.fillRoundRect(n9 - n4 + 1, n10 - 1, n3 - 1, n3 + 1, 4, 4);
//            graphics.setColor(0);
//            graphics.drawRoundRect(n9 - n4, n10 - 1, n3, n3 + 1, 6, 6);
//            graphics.setColor(3692969);
//            graphics.fillRect(5, n8 - n4, 166, n6);
//            graphics.setColor(667268);
//            graphics.drawRect(5, n8 - n4, 166, n6);
//            C.b(graphics, 3, n8 - n4 + n6 + 10, 169, 30, 3692969, 0);
//            n2 = n8 - n4 + n6 + 10 + 15 - var_byte_f * var_byte_arr_arr_i.length / 2;
//            for (n = 0; n < var_byte_arr_arr_i.length; ++n) {
//                C.a(graphics, var_byte_arr_arr_i[n], 3, 88, n2, 1, var_int_arr_e);
//                n2 += var_byte_f;
//            }
//            for (n = 0; n < 7; n = (byte) (n + 1)) {
//                for (byte by = 0; by < var_byte_i; by = (byte) (by + 1)) {
//                    int n13 = 4 + n * 24 + 12;
//                    int n14 = n8 + by * (n3 + 1) + n4;
//                    byte by2 = (byte) (by * 7 + n);
//                    byte by3 = var_byte_arr_o[by2];
//                    if (by3 < 0) continue;
//                    C.a(graphics, by3, 3, n13, n14, 3, var_int_arr_e);
//                }
//            }
//            var_boolean_k = false;
//            var_boolean_w = true;
//        }
//        if (var_boolean_w) {
//            C.i(graphics);
//            graphics.setColor(3692969);
//            graphics.fillRoundRect(n11 - n4 + 1, n12 - 1, n3 - 1, n3 + 1, 4, 4);
//            graphics.drawRoundRect(n11 - n4, n12 - 1, n3, n3 + 1, 6, 6);
//            graphics.setColor(930438);
//            graphics.fillRoundRect(n9 - n4 + 1, n10 - 1, n3 - 1, n3 + 1, 4, 4);
//            graphics.setColor(0);
//            graphics.drawRoundRect(n9 - n4, n10 - 1, n3, n3 + 1, 6, 6);
//            n2 = (byte) (var_byte_B * 7 + var_byte_z);
//            n = var_byte_arr_o[n2];
//            if (n >= 0) {
//                C.a(graphics, (byte) n, 3, n11, n12 + n4, 3, var_int_arr_e);
//            }
//            if ((n = var_byte_arr_o[n2 = (int) ((byte) (var_byte_x * 7 + var_byte_s))]) >= 0) {
//                C.a(graphics, (byte) n, 3, n9, n10 + n4, 3, var_int_arr_e);
//            }
//            var_byte_z = var_byte_s;
//            var_byte_B = var_byte_x;
//            var_boolean_w = false;
//        }
//        graphics.setColor(3692969);
//        graphics.fillRect(25, 17, 126, n7 + 10);
//        graphics.setColor(667268);
//        graphics.drawRect(25, 17, 126, n7 + 10);
//        graphics.setColor(0x8888C9);
//        graphics.fillRect(30, 22, 116, n7);
//        C.a(graphics, var_byte_arr_e, 3, 88, 22 + (n7 >> 1), 3, var_int_arr_e);
//        byte by = var_byte_E;
//        var_byte_E = (byte) (by + 1);
//        if (by > 10) {
//            graphics.setClip(0, 0, 176, 208);
//            graphics.setColor(-1);
//            n2 = 88 + C.int_a(var_byte_arr_e, 3) / 2 + 2;
//            graphics.drawLine(n2, 23, n2, 22 + n7 - 2);
//        }
//        if (var_byte_E > 20) {
//            var_byte_E = 0;
//        }
//        Thread.yield();
//    }
//
//    private static final void a(Graphics graphics, short s) {
//        graphics.setClip(0, 0, 176, 12);
//        C.b(graphics, 26, 0, 0, 0, var_int_arr_e);
//        C.a(graphics, var_byte_arr_arr_d[s], 3, 88, 6, 3, var_int_arr_e);
//    }
//
//    private static final void a(Graphics graphics, short s, short s2) {
//        graphics.setClip(0, 195, 176, 13);
//        C.b(graphics, 22, 0, 187, 0, var_int_arr_e);
//        C.b(graphics, 22, 0, 198, 0, var_int_arr_e);
//        C.a(graphics, var_byte_arr_arr_d[s], 3, 2, 208, 32, var_int_arr_e);
//        C.a(graphics, var_byte_arr_arr_d[s2], 3, 174, 208, 40, var_int_arr_e);
//    }
//
//    private static final void b(Graphics graphics) {
//        int n = var_byte_f + 5;
//        if (var_boolean_k) {
//            C.a(var_javax_microedition_lcdui_Graphics_a, var_int_arr_e);
//            var_javax_microedition_lcdui_Graphics_a.setColor(3692969);
//            var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 176, 208);
//            C.a(var_javax_microedition_lcdui_Graphics_a, (short) 13);
//            C.a(var_javax_microedition_lcdui_Graphics_a, (short) 160, (short) 33);
//            C.a(var_javax_microedition_lcdui_Graphics_a, 19, 20 + var_byte_v, 104 - 3 * n / 2, false);
//            C.a(var_javax_microedition_lcdui_Graphics_a, 23, 24 + (var_boolean_s ? 0 : 1), 104 - n / 2, false);
//            C.a(var_javax_microedition_lcdui_Graphics_a, 227, 24 + (var_boolean_t ? 0 : 1), 104 + n / 2, false);
//            var_boolean_k = false;
//            var_boolean_w = true;
//        }
//        if (var_boolean_w) {
//            int n2;
//            int n3;
//            int n4;
//            graphics.setClip(0, 0, 176, 208);
//            graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 0, 0);
//            if (var_byte_a == 0) {
//                n4 = 19;
//                n3 = 20 + var_byte_v;
//                n2 = 104 - 3 * n / 2;
//            } else if (var_byte_a == 1) {
//                n4 = 23;
//                n3 = 24 + (var_boolean_s ? 0 : 1);
//                n2 = 104 - n / 2;
//            } else {
//                n4 = 227;
//                n3 = 24 + (var_boolean_t ? 0 : 1);
//                n2 = 104 + n / 2;
//            }
//            C.a(graphics, n4, n3, n2, true);
//            var_boolean_w = false;
//        }
//    }
//
//    private static final void A(Graphics graphics) {
//        if (var_boolean_k) {
//            C.a(graphics, var_int_arr_e);
//            graphics.setColor(3692969);
//            graphics.fillRect(0, 0, 176, 208);
//            int n = var_byte_f + 2;
//            C.a(graphics, (short) 15);
//            C.a(graphics, (short) 40, (short) 33);
//            int n2 = 93;
//            C.a(graphics, 31, 3, 88, n2, 33, var_int_arr_e);
//            C.a(graphics, 30, 3, 88, n2 -= n, 33, var_int_arr_e);
//            C.a(graphics, 29, 3, 88, n2 -= n, 33, var_int_arr_e);
//            n2 = 115;
//            C.a(graphics, 26, 3, 88, n2, 1, var_int_arr_e);
//            C.a(graphics, 27, 3, 88, n2 += n, 1, var_int_arr_e);
//            C.a(graphics, 28, 3, 88, n2 += n, 1, var_int_arr_e);
//            var_boolean_k = false;
//        }
//    }
//
//    private static final void at() {
//        var_short_f = (short) 14;
//        var_byte_arr_arr_i = null;
//        int n = var_int_k - 22;
//        C.c(var_int_k);
//        if (var_int_k == 60) {
//            var_byte_arr_arr_i = C.byte_arr_arr_a(C.byte_arr_a(5), 163);
//            var_short_j = (short) (var_short_s + 15 * var_byte_f);
//            var_short_k = var_short_q;
//        } else if (n == -1) {
//            var_byte_arr_arr_i = C.byte_arr_arr_a(C.byte_arr_a(6 + n + 1, 56), 163);
//            var_short_j = (short) (var_short_s + 15 * var_byte_f);
//            var_short_k = var_short_q;
//        } else {
//            int n2 = K == 1 && n == 0 ? 59 : (K == 1 && n == 2 ? 60 : (K == 1 && n == 3 ? 61 : 6 + n + 1));
//            var_byte_arr_arr_i = n >= 0 && var_boolean_arr_f[n] ? C.byte_arr_arr_a(C.byte_arr_a(17 + n, n2), 163) : C.byte_arr_arr_a(C.byte_arr_a(n2), 163);
//            var_short_j = var_short_s;
//        }
//        var_short_h = (short) 14;
//        var_short_m = 0;
//    }
//
//    private static final void w() {
//        C.X();
//    }
//
//    private static final void V(Graphics graphics) {
//        C.a(graphics, var_byte_arr_arr_i, (short) 40, (short) 33);
//        if (var_int_k == 60 || var_int_k == 21 && (var_boolean_k || var_boolean_w)) {
//            short s = (short) (14 - var_short_m);
//            s = (short) (s + var_short_k);
//            for (int i = 0; i < 8; ++i) {
//                short s2 = (short) (s + 2 * i * var_byte_f);
//                if (s2 + 2 * var_byte_f <= var_int_m || s2 - var_byte_f > var_int_u) continue;
//                C.a(var_javax_microedition_lcdui_Graphics_a, i, var_int_j + s2 - var_int_u, var_int_arr_m);
//            }
//        }
//        C.v(graphics);
//    }
//
//    private static final void m() {
//        var_byte_arr_h = null;
//        var_boolean_arr_b = null;
//        var_boolean_arr_g = null;
//        var_java_util_Vector_a = null;
//        var_java_util_Vector_b = null;
//        var_java_util_Vector_f = null;
//        var_boolean_arr_j = null;
//        var_short_arr_n = null;
//        var_short_arr_k = null;
//        var_boolean_arr_j = null;
//        var_short_arr_n = null;
//        var_short_arr_b = null;
//        var_short_arr_d = null;
//        var_short_arr_s = null;
//        var_short_arr_v = null;
//        var_boolean_arr_e = null;
//        var_short_arr_m = null;
//        var_short_arr_a = null;
//        var_java_util_Vector_a = null;
//        var_byte_arr_arr_i = null;
//        C.A();
//        C.C();
//        System.gc();
//    }
//
//    private static final void R() {
//        C.W();
//        C.F();
//        if (var_boolean_l) {
//            C.B();
//            var_int_e = 21;
//        } else {
//            C.void_a(1);
//            var_int_e = 120;
//            for (int i = 0; i < var_byte_arr_arr_f[var_byte_C].length; ++i) {
//                var_java_util_Vector_b.addElement(new Short((byte) (42 + var_byte_arr_arr_f[var_byte_C][i])));
//            }
//            C.Z();
//            var_byte_b = (byte) (var_int_arr_arr_a[var_byte_C][7] - 5 * var_byte_v);
//            var_int_r = var_int_arr_arr_a[var_byte_C][0];
//            var_int_o = var_int_arr_arr_a[var_byte_C][1];
//            var_int_t = var_int_arr_arr_a[var_byte_C][3];
//            F = var_int_arr_arr_a[var_byte_C][5];
//            var_byte_w = (byte) var_int_arr_arr_a[var_byte_C][4];
//            var_byte_y = (byte) var_int_arr_arr_a[var_byte_C][6];
//            R = var_int_o;
//            S = var_int_r;
//            M = var_int_arr_arr_a[var_byte_C][18];
//            var_byte_g = (byte) (9 + var_byte_C / 5);
//            C.void_a();
//        }
//    }
//
//    private static final void d(int n) {
//        if (var_boolean_r) {
//            if (C.boolean_b(n, 10) || C.boolean_b(n, 9)) {
//                if (var_boolean_f) {
//                    C.P();
//                }
//                var_byte_arr_arr_i = null;
//                var_boolean_r = false;
//                var_boolean_w = true;
//                return;
//            }
//            if (C.boolean_b(n, 11)) {
//                if (var_boolean_f) {
//                    var_byte_arr_arr_i = null;
//                    var_boolean_r = false;
//                    var_boolean_w = true;
//                    if (var_int_l == 60) {
//                        var_int_l = var_int_k;
//                    }
//                }
//                return;
//            }
//        } else {
//            if (n == var_int_arr_o[var_int_z]) {
//                if (var_int_arr_o.length == var_int_z + 1) {
//                    var_int_r += 100000;
//                    var_int_z = 0;
//                } else {
//                    ++var_int_z;
//                }
//            } else {
//                var_int_z = 0;
//            }
//            switch (var_int_l) {
//                case 21: {
//                    if (C.boolean_b(n, 2)) {
//                        if ((var_short_b = (short) (var_short_b - 1)) < 0) {
//                            var_short_b = (short) 9;
//                        }
//                        var_boolean_w = true;
//                        var_long_d = System.currentTimeMillis();
//                        var_boolean_b = false;
//                        break;
//                    }
//                    if (C.boolean_b(n, 3)) {
//                        if ((var_short_b = (short) (var_short_b + 1)) >= 10) {
//                            var_short_b = 0;
//                        }
//                        var_boolean_w = true;
//                        var_long_d = System.currentTimeMillis();
//                        var_boolean_b = false;
//                        break;
//                    }
//                    if (C.boolean_b(n, 9)) {
//                        C.void_a(4);
//                        var_int_e = 22 + var_short_b;
//                        break;
//                    }
//                    if (C.boolean_b(n, 10)) {
//                        var_boolean_c = !var_boolean_c;
//                        var_boolean_k = true;
//                        var_boolean_o = true;
//                        break;
//                    }
//                    if (C.boolean_b(n, 11)) {
//                        var_int_k = var_int_l;
//                        var_int_e = 60;
//                        break;
//                    }
//                    if (C.boolean_b(n, 7)) {
//                        if ((var_byte_p = (byte) (var_byte_p - 1)) < 0) {
//                            var_byte_p = (byte) 3;
//                        }
//                        var_int_v |= 1;
//                        break;
//                    }
//                    if (C.boolean_b(n, 8)) {
//                        var_byte_p = (byte) (var_byte_p + 1);
//                        var_int_v |= 1;
//                        if (var_byte_p <= 3) break;
//                        var_byte_p = 0;
//                        break;
//                    }
//                    if (!C.boolean_b(n, 6)) break;
//                    var_int_k = var_int_l;
//                    var_int_e = 40;
//                    break;
//                }
//                case 22:
//                case 23:
//                case 24:
//                case 25:
//                case 26:
//                case 27:
//                case 28:
//                case 29:
//                case 30:
//                case 31: {
//                    if (C.boolean_b(n, 2)) {
//                        if (var_short_d <= 0) break;
//                        if (var_boolean_h) {
//                            var_short_a = var_short_r;
//                        }
//                        if ((var_short_r = (short) (var_short_r - 1)) < 0) {
//                            var_short_r = var_short_d;
//                        }
//                        var_boolean_w = true;
//                        break;
//                    }
//                    if (C.boolean_b(n, 3)) {
//                        if (var_short_d <= 0) break;
//                        if (var_boolean_h) {
//                            var_short_a = var_short_r;
//                        }
//                        if ((var_short_r = (short) (var_short_r + 1)) > var_short_d) {
//                            var_short_r = 0;
//                        }
//                        var_boolean_w = true;
//                        break;
//                    }
//                    if (C.boolean_b(n, 0)) {
//                        if (var_short_d < 0 && (var_int_l != 31 || var_short_e != 0)) break;
//                        C.c(true);
//                        break;
//                    }
//                    if (C.boolean_b(n, 1)) {
//                        if (var_short_d < 0 && (var_int_l != 31 || var_short_e != 0)) break;
//                        C.a(true);
//                        break;
//                    }
//                    if (C.boolean_b(n, 4)) {
//                        if (var_short_d < 0) break;
//                        C.c(false);
//                        break;
//                    }
//                    if (C.boolean_b(n, 5)) {
//                        if (var_short_d < 0) break;
//                        C.a(false);
//                        break;
//                    }
//                    if (C.boolean_b(n, 9)) {
//                        if (var_int_l == 31 && var_short_e == 0) {
//                            var_short_e = (short) (var_short_o + 1);
//                            var_boolean_q = true;
//                            break;
//                        }
//                        if (var_short_d < 0) break;
//                        if (var_int_l == 22 || var_int_l == 24 && var_boolean_m || var_int_l == 25 && var_boolean_m) {
//                            var_int_k = var_int_l;
//                            var_int_e = 70;
//                            break;
//                        }
//                        C.H();
//                        break;
//                    }
//                    if (C.boolean_b(n, 10)) {
//                        if (var_int_l == 31 && var_short_e == 0) {
//                            var_short_e = (short) (var_short_o + 1);
//                            var_boolean_q = true;
//                            break;
//                        }
//                        if (G == 0 && var_byte_D == 0 && var_int_l == 27) break;
//                        if (var_boolean_n) {
//                            C.k();
//                        }
//                        var_boolean_m = !var_boolean_m;
//                        var_boolean_e = true;
//                        break;
//                    }
//                    if (C.boolean_b(n, 11)) {
//                        if (var_int_l == 31 && var_short_e > 0) {
//                            var_short_e = 0;
//                            var_boolean_q = true;
//                            break;
//                        }
//                        if (var_byte_D == 0 && G == 0) {
//                            G = 1;
//                        }
//                        if (var_boolean_n) {
//                            C.k();
//                        }
//                        var_int_e = 21;
//                        C.c(var_int_l);
//                        break;
//                    }
//                    if (!C.boolean_b(n, 6)) break;
//                    var_int_k = var_int_l;
//                    var_int_e = 40;
//                    break;
//                }
//                case 40: {
//                    C.e(n);
//                    if (!C.boolean_b(n, 11)) break;
//                    if (var_int_k == 60) {
//                        var_int_e = 21;
//                        break;
//                    }
//                    var_int_e = var_int_k;
//                    break;
//                }
//                case 60: {
//                    if (C.boolean_b(n, 2)) {
//                        if (Q > 0) {
//                            --Q;
//                            break;
//                        }
//                        Q = var_int_y - 1;
//                        break;
//                    }
//                    if (C.boolean_b(n, 3)) {
//                        Q = (Q + 1) % var_int_y;
//                        break;
//                    }
//                    if (C.boolean_b(n, 10) || C.boolean_b(n, 9)) {
//                        switch (var_short_arr_h[Q]) {
//                            case 61: {
//                                var_int_l = var_int_k;
//                                break;
//                            }
//                            case 62: {
//                                C.af();
//                                var_int_l = var_int_k;
//                                var_boolean_j = true;
//                                break;
//                            }
//                            case 63: {
//                                C.F();
//                                C.W();
//                                C.B();
//                                var_int_l = var_int_k;
//                                break;
//                            }
//                            case 64: {
//                                var_int_k = 21;
//                                var_int_e = 14;
//                                break;
//                            }
//                            case 65: {
//                                var_byte_p = 0;
//                                var_int_k = var_int_l;
//                                var_int_e = 120;
//                                break;
//                            }
//                            case 66: {
//                                var_byte_p = 0;
//                                var_int_k = var_int_l;
//                                var_int_e = 40;
//                                break;
//                            }
//                            case 67: {
//                                C.H();
//                                break;
//                            }
//                            case 68: {
//                                C.H();
//                            }
//                        }
//                        break;
//                    }
//                    if (!C.boolean_b(n, 11)) break;
//                    var_int_l = var_int_k;
//                    break;
//                }
//                case 70: {
//                    if (C.boolean_b(n, 0)) {
//                        if ((var_short_p = (short) (var_short_p - 1)) < 0) {
//                            var_short_p = (short) 3;
//                        }
//                        var_boolean_w = true;
//                        break;
//                    }
//                    if (C.boolean_b(n, 1)) {
//                        if ((var_short_p = (short) (var_short_p + 1)) >= 4) {
//                            var_short_p = 0;
//                        }
//                        var_boolean_w = true;
//                        break;
//                    }
//                    if (C.boolean_b(n, 9) || C.boolean_b(n, 10)) {
//                        C.c();
//                        break;
//                    }
//                    if (!C.boolean_b(n, 11)) break;
//                    C.var_short_arr_a[C.var_short_r] = var_short_g;
//                    var_int_e = var_int_k;
//                    var_boolean_w = true;
//                    var_boolean_h = true;
//                    var_int_k = 9999;
//                    break;
//                }
//                case 120: {
//                    if (C.boolean_b(n, 10) || C.boolean_b(n, 9)) {
//                        C.void_a(4);
//                        var_short_l = (short) (var_short_l + 1);
//                        var_boolean_u = true;
//                        var_boolean_k = true;
//                        if (var_short_l < 16) break;
//                        var_short_l = 0;
//                        break;
//                    }
//                    if (C.boolean_b(n, 11)) {
//                        if (var_byte_D == 0 && G == 0) {
//                            var_int_e = 27;
//                            break;
//                        }
//                        var_int_e = 21;
//                        break;
//                    }
//                    C.e(n);
//                    break;
//                }
//                case 14: {
//                    if (C.boolean_b(n, 2)) {
//                        if ((var_byte_a = (byte) (var_byte_a - 1)) < 0) {
//                            var_byte_a = 1;
//                        }
//                        var_boolean_w = true;
//                        break;
//                    }
//                    if (C.boolean_b(n, 3)) {
//                        if ((var_byte_a = (byte) (var_byte_a + 1)) >= 2) {
//                            var_byte_a = 0;
//                        }
//                        var_boolean_w = true;
//                        break;
//                    }
//                    if (C.boolean_b(n, 9) || C.boolean_b(n, 10)) {
//                        if (var_byte_a == 0) {
//                            var_boolean_s = !var_boolean_s;
//                        } else if (var_byte_a == 1) {
//                            var_boolean_t = !var_boolean_t;
//                        }
//                        var_boolean_k = true;
//                        break;
//                    }
//                    if (!C.boolean_b(n, 11)) break;
//                    C.ag();
//                    var_int_l = var_int_k;
//                    var_boolean_k = true;
//                    var_byte_p = 0;
//                }
//            }
//        }
//    }
//
//    private static final void f(int n) {
//        switch (var_int_l) {
//            case 40:
//            case 120: {
//                var_byte_h = 0;
//            }
//        }
//    }
//
//    private static final void z(Graphics graphics) {
//        boolean bl;
//        if (var_boolean_r) {
//            C.Y(graphics);
//            return;
//        }
//        boolean bl2 = bl = var_int_e != 0;
//        if (!Main.var_boolean_a && bl) {
//            switch (var_int_l) {
//                case 21: {
//                    if (var_int_e == 60) break;
//                    C.C();
//                    break;
//                }
//                case 31: {
//                    C.aj();
//                    break;
//                }
//                case 28: {
//                    break;
//                }
//                case 40: {
//                    var_byte_arr_arr_i = null;
//                }
//            }
//            var_boolean_k = true;
//            var_int_l = var_int_e;
//            var_int_e = 0;
//            var_long_d = System.currentTimeMillis();
//        }
//        switch (var_int_l) {
//            case 21: {
//                if (bl) {
//                    C.ap();
//                }
//                if (!Main.var_boolean_a) {
//                    C.ad();
//                }
//                C.g(graphics);
//                break;
//            }
//            case 22: {
//                if (bl) {
//                    C.ay();
//                }
//                if (!Main.var_boolean_a) {
//                    C.ak();
//                }
//                C.l(graphics);
//                break;
//            }
//            case 23: {
//                if (bl) {
//                    C.s();
//                }
//                if (!Main.var_boolean_a) {
//                    C.az();
//                }
//                C.n(graphics);
//                break;
//            }
//            case 24: {
//                if (bl) {
//                    C.T();
//                }
//                if (!Main.var_boolean_a) {
//                    C.e();
//                }
//                C.w(graphics);
//                break;
//            }
//            case 25: {
//                if (bl) {
//                    C.ac();
//                }
//                if (!Main.var_boolean_a) {
//                    C.U();
//                }
//                C.L(graphics);
//                break;
//            }
//            case 26: {
//                if (bl) {
//                    C.void_b();
//                }
//                if (!Main.var_boolean_a) {
//                    C.p();
//                }
//                C.R(graphics);
//                break;
//            }
//            case 27: {
//                if (!Main.var_boolean_a) {
//                    C.f();
//                }
//                C.p(graphics);
//                break;
//            }
//            case 28: {
//                if (bl) {
//                    C.al();
//                }
//                C.m(graphics);
//                break;
//            }
//            case 29: {
//                if (bl) {
//                    C.v();
//                }
//                if (!Main.var_boolean_a) {
//                    C.ab();
//                }
//                C.r(graphics);
//                break;
//            }
//            case 30: {
//                if (bl) {
//                    C.V();
//                }
//                if (!Main.var_boolean_a) {
//                    C.x();
//                }
//                C.G(graphics);
//                break;
//            }
//            case 31: {
//                if (bl) {
//                    C.J();
//                }
//                if (!Main.var_boolean_a) {
//                    C.ah();
//                }
//                C.O(graphics);
//                break;
//            }
//            case 40: {
//                if (bl) {
//                    C.at();
//                }
//                if (!Main.var_boolean_a) {
//                    C.w();
//                }
//                C.V(graphics);
//                break;
//            }
//            case 60: {
//                if (bl) {
//                    C.K();
//                }
//                C.X(graphics);
//                break;
//            }
//            case 70: {
//                if (bl) {
//                    C.q();
//                }
//                C.d(graphics);
//                break;
//            }
//            case 120: {
//                if (bl) {
//                    C.y();
//                }
//                if (!Main.var_boolean_a) {
//                    C.aw();
//                }
//                C.x(graphics);
//                break;
//            }
//            case 14: {
//                if (bl) {
//                    C.l();
//                }
//                C.k(graphics);
//            }
//        }
//    }
//
//    private static final void ay() {
//        if (!var_boolean_n) {
//            int n = 0;
//            short[] sArray = new short[12];
//            short[] sArray2 = new short[12];
//            if (var_boolean_m) {
//                for (int i = 0; i < 12; ++i) {
//                    if (var_short_arr_d[i] <= 0) continue;
//                    sArray[n] = (short) (i + 74);
//                    sArray2[n++] = var_short_arr_d[i];
//                }
//            } else {
//                for (int i = 0; i < 10; ++i) {
//                    if (var_short_arr_s[i] <= 0) continue;
//                    sArray[n] = (short) (i + 42);
//                    sArray2[n++] = var_short_arr_s[i];
//                }
//            }
//            sArray = C.a(sArray, 0, n);
//            sArray2 = C.a(sArray2, 0, n);
//            C.a(sArray, sArray2);
//            var_short_d = (short) (n - 1);
//            var_short_r = 0;
//            var_short_n = 0;
//        }
//    }
//
//    private static final void ak() {
//        if (var_boolean_e) {
//            C.ay();
//            var_boolean_e = false;
//            var_boolean_k = true;
//        }
//        C.as();
//    }
//
//    private static final void l(Graphics graphics) {
//        C.y(graphics);
//    }
//
//    private static final void C() {
//    }
//
//    private static final void ap() {
//        var_boolean_b = false;
//    }
//
//    private static final void ad() {
//        if (System.currentTimeMillis() - var_long_d > 600L) {
//            var_boolean_b = true;
//        }
//        C.N();
//        C.o();
//    }
//
//    private static final void g(Graphics graphics) {
//        int n;
//        if (var_boolean_k || var_int_v > 0) {
//            C.P(var_javax_microedition_lcdui_Graphics_a);
//            if (var_boolean_k) {
//                var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 176, 208);
//                C.C(var_javax_microedition_lcdui_Graphics_a);
//                var_boolean_w = true;
//                var_boolean_o = true;
//            }
//            if (var_boolean_o) {
//                C.h(var_javax_microedition_lcdui_Graphics_a);
//                C.Q(var_javax_microedition_lcdui_Graphics_a);
//                var_boolean_o = false;
//            }
//        }
//        if (var_boolean_k) {
//            if (var_boolean_c) {
//                C.F(var_javax_microedition_lcdui_Graphics_a);
//            } else {
//                C.N(var_javax_microedition_lcdui_Graphics_a);
//            }
//            var_boolean_k = false;
//        }
//        if (var_boolean_w) {
//            graphics.setClip(0, 0, 176, 208);
//            graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 0, 0);
//            graphics.setColor(16721968);
//            for (n = 0; n < 10; ++n) {
//                if (!var_boolean_arr_f[n] || n == var_short_b) continue;
//                C.i(graphics);
//                graphics.fillRect(159, var_short_arr_p[n] + 1, 16, 14);
//                C.c(graphics, 1008 + n, 159, var_short_arr_p[n] + 1, 0, var_int_arr_e);
//            }
//            C.i(graphics);
//            n = var_short_arr_p[var_short_b] + 1;
//            if (var_boolean_arr_f[var_short_b]) {
//                graphics.setColor(9512591);
//            } else {
//                graphics.setColor(16757760);
//            }
//            graphics.fillRect(159, n, 16, 14);
//            C.c(graphics, 1008 + var_short_b, 159, n, 0, var_int_arr_e);
//            C.b(graphics, 3, 175, var_short_arr_p[var_short_b] + 14 - 1, 8, var_int_arr_e);
//            var_boolean_w = false;
//        }
//        C.K(graphics);
//        if (var_boolean_b && var_boolean_t) {
//            switch (var_short_b) {
//                case 0: {
//                    n = 115;
//                    break;
//                }
//                case 1: {
//                    n = 116;
//                    break;
//                }
//                case 2: {
//                    n = 117;
//                    break;
//                }
//                case 3: {
//                    n = 124;
//                    break;
//                }
//                case 4: {
//                    n = 125;
//                    break;
//                }
//                case 5: {
//                    n = 126;
//                    break;
//                }
//                case 6: {
//                    n = 127;
//                    break;
//                }
//                case 7: {
//                    n = 128;
//                    break;
//                }
//                case 8: {
//                    n = 129;
//                    break;
//                }
//                case 9: {
//                    n = 118;
//                    break;
//                }
//                default: {
//                    n = -1;
//                }
//            }
//            if (n > 0) {
//                short s = var_short_arr_p[var_short_b];
//                int n2 = C.int_a(var_byte_arr_arr_d[n], 3);
//                byte by = var_byte_f;
//                int n3 = s + 8 - by / 2;
//                if (var_short_b == 0) {
//                    n3 += 10;
//                }
//                C.i(graphics);
//                graphics.setColor(0);
//                graphics.fillRect(158 - n2 - 6, n3, n2 + 4, (int) by);
//                C.a(graphics, n, 3, 154, n3, 8, var_int_arr_e);
//            }
//            var_long_d = System.currentTimeMillis() + 1000L;
//        }
//    }
//
//    private static final void s() {
//        int n = 0;
//        short[] sArray = new short[10];
//        short[] sArray2 = new short[10];
//        if (var_boolean_m) {
//            for (int i = 0; i < var_byte_arr_arr_f[var_byte_C].length; ++i) {
//                byte by = var_byte_arr_arr_f[var_byte_C][i];
//                if (var_short_arr_s[by] <= 0) continue;
//                sArray[n] = (short) (by + 42);
//                sArray2[n++] = var_short_arr_n[by];
//            }
//        } else {
//            for (int i = 0; i < var_byte_arr_arr_f[var_byte_C].length; ++i) {
//                byte by = var_byte_arr_arr_f[var_byte_C][i];
//                if (var_short_arr_s[by] != 0) continue;
//                sArray[n] = (short) (by + 42);
//                sArray2[n++] = (short) (100 * var_short_arr_o[by]);
//            }
//        }
//        C.a(sArray, sArray2);
//        var_short_d = (short) (n - 1);
//        var_short_r = 0;
//        var_short_n = 0;
//    }
//
//    private static final void az() {
//        if (var_boolean_e) {
//            C.s();
//            var_boolean_e = false;
//            var_boolean_k = true;
//        }
//        C.as();
//    }
//
//    private static final void n(Graphics graphics) {
//        C.y(graphics);
//    }
//
//    private static final void h(Graphics graphics) {
//        int n;
//        int n2;
//        if (var_int_l == 21) {
//            C.b(graphics, 26, 0, 17, 0, var_int_arr_c);
//        } else {
//            C.b(graphics, 26, 0, 17, 0, var_int_arr_e);
//        }
//        int n3 = var_int_l - 22;
//        if (n3 >= 0) {
//            C.i(graphics);
//            graphics.setColor(-1);
//            graphics.fillRect(1, 17, 16, 14);
//            C.c(graphics, 1008 + n3, 1, 16, 0, var_int_arr_p);
//            n2 = 97;
//            switch (var_int_l) {
//                case 22: {
//                    n = 115;
//                    break;
//                }
//                case 23: {
//                    n = 116;
//                    break;
//                }
//                case 24: {
//                    n = 117;
//                    break;
//                }
//                case 25: {
//                    n = 124;
//                    break;
//                }
//                case 26: {
//                    n = 125;
//                    break;
//                }
//                case 27: {
//                    n = 126;
//                    break;
//                }
//                case 28: {
//                    n = 127;
//                    break;
//                }
//                case 29: {
//                    n = 128;
//                    break;
//                }
//                case 30: {
//                    n = 129;
//                    break;
//                }
//                case 31: {
//                    n = 118 + var_short_e;
//                    break;
//                }
//                default: {
//                    n = 9;
//                    break;
//                }
//            }
//        } else {
//            n2 = 79;
//            n = var_boolean_c ? 130 : 131;
//        }
//        C.a(graphics, n, 3, n2, 23, 3, var_int_arr_e);
//        if (n3 >= 0 && var_int_l != 28 && var_int_l != 27) {
//            int n4;
//            int n5;
//            graphics.setClip(0, 0, 176, 208);
//            graphics.setColor(5128649);
//            graphics.fillRect(0, 105, 177, 11);
//            switch (var_int_l) {
//                case 22: {
//                    n5 = 86;
//                    n4 = 87;
//                    break;
//                }
//                case 23:
//                case 24:
//                case 25: {
//                    n5 = 86;
//                    if (!var_boolean_m) {
//                        n4 = 87;
//                        break;
//                    }
//                    n4 = 88;
//                    break;
//                }
//                case 26:
//                case 29:
//                case 30: {
//                    n5 = 86;
//                    if (!var_boolean_m) {
//                        n4 = 87;
//                        break;
//                    }
//                    n4 = -1;
//                    break;
//                }
//                case 31: {
//                    if (var_short_e > 0) {
//                        n5 = 89;
//                        n4 = 90;
//                        break;
//                    }
//                    n5 = -1;
//                    n4 = -1;
//                    break;
//                }
//                default: {
//                    n5 = -1;
//                    n4 = -1;
//                }
//            }
//            if (n5 > 0) {
//                C.a(graphics, n5, 3, (int) var_byte_f, 116, 32, var_int_arr_e);
//            }
//            if (n4 > 0) {
//                C.a(graphics, n4, 3, 167, 116, 40, var_int_arr_e);
//            }
//        }
//    }
//
//    private static final void o() {
//        var_byte_c = (byte) ((M + var_int_o) / 19000);
//        if (var_byte_p > 0) {
//            for (var_int_a = var_byte_p == 3 ? 8 : (var_byte_p == 2 ? 1 : 1); var_int_a > 0; --var_int_a) {
//                C.G();
//            }
//            var_boolean_w = true;
//        }
//    }
//
//    private static final void G() {
//        var_short_i = (short) (var_short_i + 1);
//        ++G;
//        if (var_short_i >= 10) {
//            var_int_v |= 4;
//            var_byte_l = (byte) (var_byte_l + 1);
//            if (!var_boolean_l && G >= 4350 && G <= 12150) {
//                var_boolean_l = true;
//                if (var_boolean_c) {
//                    C.t(var_javax_microedition_lcdui_Graphics_a);
//                }
//            }
//            var_short_i = (short) (var_short_i - 10);
//            if (var_byte_l >= 60) {
//                var_byte_t = (byte) (var_byte_t + 1);
//                var_byte_l = (byte) (var_byte_l - 60);
//                C.void_a();
//                if (var_byte_t >= 24) {
//                    var_int_v |= 2;
//                    var_byte_t = (byte) (var_byte_t - 24);
//                }
//            }
//        }
//        C.ai();
//        C.h();
//        C.av();
//        if (var_int_r != I) {
//            I = var_int_r;
//            var_int_v |= 8;
//        }
//        if (G == 12150 && (var_int_r -= N) < 0) {
//            var_int_d = 12;
//            var_byte_q = (byte) 2;
//        }
//        if (G == 14400) {
//            var_java_util_Vector_g = null;
//            var_java_util_Vector_g = new Vector();
//            var_boolean_l = false;
//            if (var_boolean_c) {
//                C.t(var_javax_microedition_lcdui_Graphics_a);
//            }
//            G = 0;
//            var_short_i = 0;
//            var_boolean_p = false;
//            var_int_x = 0;
//            var_int_i = 0;
//            var_int_g = 0;
//            var_int_C = 0;
//            var_java_util_Vector_d = null;
//            var_java_util_Vector_d = new Vector();
//            for (int i = 0; i < var_byte_arr_h.length; ++i) {
//                if (var_byte_arr_h[i] >= 20) continue;
//                short[] sArray = new short[]{(short) (var_byte_arr_h[i] + 1), var_boolean_arr_h[i] ? (short) C.int_b(0, 2) : (short) C.int_b(3, 5), 0};
//                var_java_util_Vector_d.addElement(sArray);
//                var_byte_A = (byte) (var_byte_A + 1);
//            }
//            var_byte_A = (byte) var_java_util_Vector_d.size();
//            var_int_r -= L;
//            var_byte_D = (byte) (var_byte_D + 1);
//            if (var_int_arr_arr_a[var_byte_C][19] == 1) {
//                if (var_byte_D == var_int_arr_arr_a[var_byte_C][2]) {
//                    if (var_int_o >= var_int_arr_arr_a[var_byte_C][17]) {
//                        var_int_d = 12;
//                        var_byte_q = 0;
//                    } else {
//                        var_int_d = 12;
//                        var_byte_q = (byte) 3;
//                    }
//                }
//            } else if (var_int_r >= var_int_arr_arr_a[var_byte_C][16] && var_int_o >= var_int_arr_arr_a[var_byte_C][17]) {
//                var_int_d = 12;
//                var_byte_q = 0;
//            } else if (var_byte_D >= var_int_arr_arr_a[var_byte_C][2]) {
//                var_int_d = 12;
//                var_byte_q = 1;
//            } else if (var_int_r < 0) {
//                var_int_d = 12;
//                var_byte_q = (byte) 2;
//            }
//            S = var_int_r;
//            R = var_int_o;
//        }
//    }
//
//    private static final void K(Graphics graphics) {
//        int n;
//        C.a(graphics, var_int_arr_n);
//        if (var_boolean_c) {
//            C.c(graphics);
//        } else {
//            C.U(graphics);
//        }
//        switch (var_byte_p) {
//            case 3: {
//                n = 0;
//                break;
//            }
//            case 2: {
//                n = 0;
//                break;
//            }
//            default: {
//                n = 30;
//            }
//        }
//        if (n > 0) {
//            try {
//                Thread.sleep(n);
//            } catch (InterruptedException interruptedException) {
//                interruptedException.printStackTrace();
//            }
//        }
//    }
//
//    private static final void a(Vector vector, short[] sArray) {
//        var_java_util_Vector_a = null;
//        var_short_arr_m = null;
//        var_short_arr_a = null;
//        var_java_util_Vector_a = vector;
//        var_short_arr_a = sArray;
//    }
//
//    private static final void a(short[] sArray, short[] sArray2) {
//        var_short_arr_m = null;
//        var_short_arr_a = null;
//        var_java_util_Vector_a = null;
//        var_short_arr_m = sArray;
//        var_short_arr_a = sArray2;
//    }
//
//    private static final void W() {
//        var_int_x = 0;
//        var_int_i = 0;
//        var_int_g = 0;
//        var_int_C = 0;
//        var_short_b = 0;
//        N = 0;
//        var_byte_D = 0;
//        var_byte_t = 0;
//        var_byte_l = 0;
//        var_boolean_o = true;
//        var_boolean_r = false;
//        L = 0;
//        var_byte_arr_h = new byte[20];
//        var_boolean_arr_g = new boolean[7];
//        var_boolean_arr_b = new boolean[10];
//        var_boolean_arr_f = new boolean[10];
//        var_java_util_Vector_a = new Vector();
//        var_java_util_Vector_b = new Vector();
//        var_java_util_Vector_f = new Vector();
//        var_boolean_arr_j = new boolean[22];
//        var_short_arr_n = new short[10];
//        var_short_arr_k = new short[12];
//        var_boolean_arr_j = new boolean[22];
//        var_short_arr_n = new short[10];
//        var_short_arr_b = new short[52];
//        var_short_arr_d = new short[12];
//        var_short_arr_s = new short[10];
//        var_short_arr_v = new short[0];
//        var_boolean_arr_e = new boolean[5];
//        var_short_arr_m = null;
//        var_short_arr_a = null;
//        var_java_util_Vector_a = null;
//        var_byte_p = 1;
//        var_boolean_m = false;
//        var_boolean_c = false;
//        var_byte_arr_g = new byte[20];
//        var_byte_arr_k = new byte[20];
//        var_byte_a = 0;
//        var_byte_k = 1;
//        C.var_boolean_arr_f[7] = true;
//        C.var_boolean_arr_f[9] = true;
//        System.gc();
//    }
//
//    private static final void H() {
//        int n = -1;
//        switch (var_int_l) {
//            case 23: {
//                if (var_boolean_m) break;
//                if (var_int_r >= var_short_arr_a[var_short_r]) {
//                    n = 33;
//                    break;
//                }
//                n = 27;
//                break;
//            }
//            case 24: {
//                if (var_boolean_m) break;
//                if (var_int_r < var_short_arr_a[var_short_r]) {
//                    n = 27;
//                    break;
//                }
//                n = 34;
//                break;
//            }
//            case 25: {
//                if (var_boolean_m) break;
//                if (var_int_r < var_short_arr_a[var_short_r]) {
//                    n = 27;
//                    break;
//                }
//                n = 35;
//                break;
//            }
//            case 26: {
//                if (var_boolean_m) {
//                    n = 37;
//                    break;
//                }
//                n = 36;
//                break;
//            }
//            case 29: {
//                if (var_boolean_m) break;
//                if (var_int_r < var_short_arr_a[var_short_r]) {
//                    n = 27;
//                    break;
//                }
//                n = 38;
//                break;
//            }
//            case 30: {
//                if (!var_boolean_m) {
//                    if (var_int_r < var_short_arr_a[var_short_r]) {
//                        n = 27;
//                        break;
//                    }
//                    n = 28;
//                    break;
//                }
//                n = 39;
//                break;
//            }
//            case 31: {
//                if (var_boolean_m) {
//                    int n2 = var_short_arr_m[var_short_r] - 132;
//                    if (var_int_r >= 7 * (var_byte_arr_g[n2] * var_byte_arr_g[n2] * 37 + var_byte_arr_k[n2] * var_byte_arr_k[n2] * 43)) {
//                        n = 31;
//                        break;
//                    }
//                    n = 32;
//                    break;
//                }
//                if (var_byte_k > C.int_b((int) var_short_o)) {
//                    n = 30;
//                    break;
//                }
//                n = 29;
//                break;
//            }
//            case 60: {
//                n = var_short_arr_h[Q] == 67 ? 55 : 54;
//            }
//        }
//        var_boolean_f = n != 27 && n != 29 && n != 32;
//        if (n == -1) {
//            var_byte_arr_arr_i = new byte[0][0];
//        } else {
//            var_byte_arr_arr_i = C.byte_arr_arr_a(C.byte_arr_a(n), 172);
//            var_boolean_r = true;
//        }
//        C.void_a(4);
//        var_boolean_k = true;
//    }
//
//    private static final void Y(Graphics graphics) {
//        if (var_boolean_k) {
//            int n;
//            int n2;
//            C.i(graphics);
//            graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 0, 0);
//            C.i(graphics);
//            graphics.setColor(4482992);
//            boolean bl = true;
//            if (71 + var_byte_arr_arr_i.length * var_byte_f > 179) {
//                bl = false;
//            }
//            graphics.fillRect(0, 17, 176, 179);
//            if (bl) {
//                n2 = 0;
//                if (!var_boolean_i) {
//                    n2 = 1;
//                }
//                C.a(graphics, 58, 23, 60, 62, 2787268, 0);
//                C.c(graphics, 1104 + n2, 88, 22, 1, var_int_arr_e);
//                n = 141 - var_short_q / 2;
//            } else {
//                n = 104 - var_short_q / 2;
//            }
//            for (n2 = 0; n2 < var_byte_arr_arr_i.length; ++n2) {
//                C.a(graphics, var_byte_arr_arr_i[n2], 3, 88, n, 1, var_int_arr_e);
//                n += var_byte_f;
//            }
//            C.Q(graphics);
//            var_boolean_k = false;
//        }
//    }
//
//    private static final void P() {
//        switch (var_int_l) {
//            case 23: {
//                if (var_boolean_m) break;
//                int n = var_short_arr_m[var_short_r] - 42;
//                var_int_r -= 100 * var_short_arr_o[n];
//                M += 100 * var_short_arr_o[n] / 2;
//                C.b(true);
//                for (int i = 0; i < var_short_arr_arr_b[n].length; ++i) {
//                    short s = var_short_arr_arr_b[n][i];
//                    int n2 = s + 52;
//                    if (var_boolean_arr_j[s]) continue;
//                    boolean bl = true;
//                    for (int j = 0; j < var_java_util_Vector_f.size(); ++j) {
//                        if ((Short) var_java_util_Vector_f.elementAt(j) != n2) continue;
//                        bl = false;
//                        break;
//                    }
//                    if (!bl) continue;
//                    C.var_boolean_arr_f[2] = true;
//                    var_java_util_Vector_f.addElement(new Short((short) n2));
//                }
//                C.var_short_arr_s[n] = var_short_arr_o[n];
//                var_int_v |= 8;
//                C.var_boolean_arr_f[0] = true;
//                break;
//            }
//            case 24: {
//                if (var_boolean_m) break;
//                int n = (Short) var_java_util_Vector_a.elementAt(var_short_r) - 52;
//                var_int_r -= 100 * var_byte_arr_a[n];
//                M += 100 * var_byte_arr_a[n] / 2;
//                C.I();
//                C.var_boolean_arr_j[n] = true;
//                short[] sArray = new short[22];
//                int n3 = 0;
//                for (int i = 0; i < 22; ++i) {
//                    if (!var_boolean_arr_j[i]) continue;
//                    sArray[n3++] = (short) (i + 52);
//                }
//                var_int_v |= 8;
//                var_short_arr_v = null;
//                var_short_arr_v = C.a(sArray, 0, n3);
//                break;
//            }
//            case 25: {
//                if (var_boolean_m) break;
//                int n = var_short_arr_m[var_short_r] - 74;
//                var_int_r -= 100 * var_short_arr_g[n];
//                M += 100 * var_short_arr_g[n] / 2;
//                C.b(true);
//                C.var_short_arr_d[n] = var_short_arr_g[n];
//                var_int_v |= 8;
//                C.var_boolean_arr_f[0] = true;
//                break;
//            }
//            case 26: {
//                if (!var_boolean_m) {
//                    int n = var_short_arr_m[var_short_r] - 212;
//                    C.var_boolean_arr_b[n] = true;
//                    L += var_short_arr_a[var_short_r];
//                    M += 2 * var_short_arr_a[var_short_r];
//                    C.b(true);
//                    break;
//                }
//                int n = var_short_arr_m[var_short_r] - 212;
//                C.var_boolean_arr_b[n] = false;
//                var_int_v |= 8;
//                M -= 2 * var_short_arr_r[n];
//                C.b(false);
//                L -= var_short_arr_r[n];
//                var_int_r -= var_short_arr_r[n];
//                break;
//            }
//            case 29: {
//                if (var_boolean_m) break;
//                short s = var_short_arr_m[var_short_r];
//                var_int_r -= var_short_arr_a[var_short_r];
//                C.var_boolean_arr_g[s - 152] = true;
//                if (s - 152 == 0) {
//                    var_byte_k = (byte) 2;
//                    C.c(31);
//                } else if (s - 152 == 6) {
//                    C.var_boolean_arr_f[7] = false;
//                }
//                M = s - 152 == 0 ? (M += var_short_arr_l[s - 152]) : (M += var_short_arr_a[var_short_r] / 2);
//                C.b(true);
//                var_int_v |= 8;
//                break;
//            }
//            case 30: {
//                if (!var_boolean_m) {
//                    short s = var_short_arr_m[var_short_r];
//                    var_int_r -= var_short_arr_a[var_short_r];
//                    M += var_short_arr_a[var_short_r] / 2;
//                    C.var_boolean_arr_e[s - 109] = true;
//                    var_int_v |= 8;
//                    C.b(true);
//                    break;
//                }
//                int n = var_short_arr_m[var_short_r] - 109;
//                var_int_r += var_short_arr_e[n] / 2;
//                M -= var_short_arr_e[n] / 2;
//                C.var_boolean_arr_e[n] = false;
//                var_int_v |= 8;
//                C.b(false);
//                break;
//            }
//            case 31: {
//                short s;
//                int n;
//                if (!var_boolean_m) {
//                    int n4;
//                    if (var_byte_k <= C.int_b((int) var_short_o)) break;
//                    int n5 = n4 = var_short_arr_m[var_short_r] - 132;
//                    var_byte_arr_h[n5] = (byte) (var_byte_arr_h[n5] - 20);
//                    C.b(true);
//                    if (G >= 12000) break;
//                    short[] sArray = new short[3];
//                    sArray[0] = (short) (var_short_o + 1);
//                    sArray[1] = var_boolean_arr_h[n4] ? (short) C.int_b(0, 2) : (short) C.int_b(3, 5);
//                    var_java_util_Vector_d.addElement(sArray);
//                    var_byte_A = (byte) (var_byte_A + 1);
//                    break;
//                }
//                int n6 = n = var_short_arr_m[var_short_r] - 132;
//                var_byte_arr_h[n6] = (byte) (var_byte_arr_h[n6] + 20);
//                var_int_r -= 7 * (var_byte_arr_g[n] * var_byte_arr_g[n] * 37 + var_byte_arr_k[n] * var_byte_arr_k[n] * 43);
//                var_int_v |= 8;
//                switch (var_short_o + 1) {
//                    case 1: {
//                        s = 12;
//                        break;
//                    }
//                    case 2: {
//                        s = 11;
//                        break;
//                    }
//                    case 4: {
//                        s = 13;
//                        break;
//                    }
//                    case 5: {
//                        s = 14;
//                        break;
//                    }
//                    default: {
//                        s = 0;
//                    }
//                }
//                if (s > 0) {
//                    for (int i = 0; i < var_java_util_Vector_g.size(); ++i) {
//                        short[] sArray = (short[]) var_java_util_Vector_g.elementAt(i);
//                        if (sArray[7] != s) continue;
//                        sArray[20] = 9990;
//                    }
//                }
//                C.b(true);
//                break;
//            }
//            case 60: {
//                C.m();
//                var_int_d = var_short_arr_h[Q] == 67 ? 3 : -2;
//            }
//        }
//        var_boolean_k = true;
//    }
//
//    private static final void as() {
//        if (var_boolean_k) {
//            var_boolean_d = false;
//            var_boolean_u = true;
//            var_boolean_x = true;
//            var_short_a = var_short_r;
//        }
//        if (var_short_r - var_short_n < 0 && var_short_r >= 0) {
//            if (var_short_r == 0) {
//                var_short_n = 0;
//            } else {
//                var_short_n = (short) (var_short_n - 6);
//                if (var_short_n < 0) {
//                    var_short_n = 0;
//                }
//            }
//            var_boolean_x = true;
//        }
//        if (var_short_r - var_short_n >= 6) {
//            if (var_short_r == var_short_d) {
//                var_short_n = (short) (var_short_d - 5);
//            } else {
//                var_short_n = (short) (var_short_n + 6);
//                if (var_short_d - var_short_n < 5) {
//                    var_short_n = (short) (var_short_d - 5);
//                }
//            }
//            var_boolean_x = true;
//        }
//        if (var_short_d - var_short_n < 5 && var_short_d >= 5) {
//            var_short_n = (short) (var_short_d - 5);
//            var_boolean_x = true;
//        }
//        if (!var_boolean_h) {
//            var_short_a = var_short_r;
//        }
//    }
//
//    private static final void y(Graphics graphics) {
//        byte by;
//        if (var_boolean_u || var_boolean_w) {
//            C.M(var_javax_microedition_lcdui_Graphics_a);
//        }
//        if (var_boolean_x) {
//            C.s(var_javax_microedition_lcdui_Graphics_a);
//            C.c(var_javax_microedition_lcdui_Graphics_a, 1084, 170, 117, 0, var_int_arr_e);
//            C.c(var_javax_microedition_lcdui_Graphics_a, 1085, 170, 183, 32, var_int_arr_e);
//            var_short_a = var_short_r;
//            var_boolean_h = false;
//        }
//        if (var_boolean_k || var_int_v > 0) {
//            C.P(var_javax_microedition_lcdui_Graphics_a);
//        }
//        if (var_boolean_k) {
//            C.h(var_javax_microedition_lcdui_Graphics_a);
//            C.Q(var_javax_microedition_lcdui_Graphics_a);
//            C.u(var_javax_microedition_lcdui_Graphics_a);
//            var_boolean_k = false;
//            var_boolean_w = true;
//        }
//        if (var_boolean_h && var_short_a != var_short_r) {
//            by = (byte) (var_short_a - var_short_n);
//            if (var_short_d >= 0) {
//                C.a(var_javax_microedition_lcdui_Graphics_a, var_short_n, (short) by, (byte) 2);
//            }
//            var_short_a = var_short_r;
//            var_boolean_h = false;
//        }
//        if (var_boolean_w) {
//            C.i(graphics);
//            graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 0, 0);
//            if (var_short_d > 0) {
//                C.i(graphics);
//                graphics.setColor(255);
//                graphics.fillRect(170, 124 + 42 * var_short_r / var_short_d, 6, 10);
//            }
//            if (var_short_r <= 0) {
//                C.c(graphics, 1088, 170, 117, 0, var_int_arr_e);
//            }
//            if (var_short_r >= var_short_d) {
//                C.c(graphics, 1089, 170, 183, 32, var_int_arr_e);
//            }
//        }
//        if ((var_boolean_d || var_boolean_w) && var_short_d >= 0) {
//            by = (byte) (var_short_r - var_short_n);
//            if (var_short_d >= 0) {
//                C.a(graphics, var_short_n, (short) by, (byte) 1);
//            }
//            var_boolean_d = false;
//            var_boolean_w = false;
//        }
//    }
//
//    private static final void T() {
//        if (var_boolean_m) {
//            if (!var_boolean_n) {
//                int n = var_short_arr_v.length;
//                short[] sArray = new short[n];
//                for (int i = 0; i < n; ++i) {
//                    sArray[i] = var_short_arr_b[var_short_arr_v[i] - 52];
//                }
//                C.a(var_short_arr_v, sArray);
//                var_short_d = (short) (n - 1);
//                var_short_r = 0;
//                var_short_n = 0;
//            }
//        } else {
//            int n = var_java_util_Vector_f.size();
//            short[] sArray = new short[n];
//            for (int i = 0; i < n; ++i) {
//                sArray[i] = (short) (100 * var_byte_arr_a[(Short) var_java_util_Vector_f.elementAt(i) - 52]);
//            }
//            C.a(var_java_util_Vector_f, sArray);
//            var_short_d = (short) (var_java_util_Vector_f.size() - 1);
//            var_short_r = 0;
//            var_short_n = 0;
//        }
//    }
//
//    private static final void e() {
//        if (var_boolean_e) {
//            C.T();
//            var_boolean_e = false;
//            var_boolean_k = true;
//        }
//        C.as();
//    }
//
//    private static final void w(Graphics graphics) {
//        C.y(graphics);
//    }
//
//    private static final void ac() {
//        if (!var_boolean_n) {
//            int n = var_byte_arr_arr_g[var_byte_C].length;
//            int n2 = 0;
//            short[] sArray = new short[n];
//            short[] sArray2 = new short[n];
//            if (var_boolean_m) {
//                for (int i = 0; i < n; ++i) {
//                    short s = var_byte_arr_arr_g[var_byte_C][i];
//                    if (var_short_arr_d[s] <= 0) continue;
//                    sArray[n2] = (short) (s + 74);
//                    sArray2[n2++] = var_short_arr_k[s];
//                }
//            } else {
//                for (int i = 0; i < n; ++i) {
//                    short s = var_byte_arr_arr_g[var_byte_C][i];
//                    if (var_short_arr_d[s] != 0) continue;
//                    sArray[n2] = (short) (s + 74);
//                    sArray2[n2++] = (short) (100 * var_short_arr_g[s]);
//                }
//            }
//            sArray = C.a(sArray, 0, n2);
//            sArray2 = C.a(sArray2, 0, n2);
//            C.a(sArray, sArray2);
//            var_short_d = (short) (n2 - 1);
//            var_short_r = 0;
//            var_short_n = 0;
//        }
//    }
//
//    private static final void U() {
//        if (var_boolean_e) {
//            C.ac();
//            var_boolean_e = false;
//            var_boolean_k = true;
//        }
//        C.as();
//    }
//
//    private static final void L(Graphics graphics) {
//        C.y(graphics);
//    }
//
//    private static final void f() {
//        if (var_boolean_e) {
//            var_boolean_k = true;
//            var_boolean_e = false;
//        }
//    }
//
//    private static final void p(Graphics graphics) {
//        if (var_boolean_k) {
//            C.h(graphics);
//            C.P(graphics);
//            C.Q(graphics);
//            C.u(graphics);
//            C.i(graphics);
//            int n = 31;
//            int n2 = var_int_arr_arr_b[5][0];
//            graphics.setColor(n2);
//            graphics.fillRect(0, 30, 176, 153);
//            int n3 = var_byte_f - 1;
//            if (var_boolean_m) {
//                graphics.setColor(255);
//                int n4 = 3 * n3 + 4;
//                graphics.fillRect(3, n += var_byte_f, 170, n4);
//                graphics.setColor(0);
//                graphics.drawLine(3, n + n4, 173, n + n4);
//                graphics.drawLine(173, n, 173, n + n4);
//                graphics.setColor(0x808080);
//                graphics.fillRect(5, n + 2, 166 - var_int_B, n4 - 4);
//                graphics.setColor(0);
//                graphics.drawLine(5, n + 2, 171 - var_int_B - 1, n + 2);
//                graphics.drawLine(5, n + 2, 5, n + n4 - 2 - 1);
//                graphics.setColor(255);
//                graphics.fillRect(3, n + n4 + 2, 170, 183 - n - n4 - 4);
//                graphics.setColor(0);
//                graphics.drawLine(3, 181, 173, 181);
//                graphics.drawLine(173, n + n4 + 2, 173, 181);
//                int n5 = n + n4 + 2;
//                int n6 = 166 - var_int_B - 1;
//                C.a(graphics, var_int_t, n += 3, n3, n6, var_int_arr_arr_a[var_byte_C][14]);
//                C.a(graphics, F, n += n3, n3, n6, var_int_arr_arr_a[var_byte_C][15]);
//                C.a(graphics, var_int_o, n += n3, n3, n6, 0);
//                n = n5;
//                C.a(graphics, (short) 181, Integer.toString(var_int_r - S), 4, n);
//                C.a(graphics, (short) 182, Integer.toString(N), 4, n += var_byte_f);
//                C.a(graphics, (short) 310, Integer.toString(var_int_x), 4, n += var_byte_f);
//                C.a(graphics, (short) 311, Integer.toString(var_int_i), 4, n += var_byte_f);
//                C.a(graphics, (short) 313, Integer.toString(var_int_g), 4, n += var_byte_f);
//                C.a(graphics, (short) 312, Integer.toString(var_int_C), 4, n += var_byte_f);
//                C.a(graphics, (short) 183, Integer.toString(L), 4, n += var_byte_f);
//                n += var_byte_f;
//                int n7 = (var_int_o - R) / 10;
//                String string = Integer.toString(Math.abs(n7));
//                while (string.length() < 3) {
//                    string = "0" + string;
//                }
//                string = string.substring(0, string.length() - 2) + "." + string.substring(string.length() - 2, string.length());
//                if (n7 < 0) {
//                    string = "-" + string;
//                } else if (n7 > 0) {
//                    string = "+" + string;
//                }
//                C.a(graphics, (short) 184, string + "%", 4, n);
//                C.a(graphics, 180, 3, 4, 31, 0, var_int_arr_e);
//                C.a(graphics, C.byte_arr_a(Integer.toString(100 - var_byte_b) + "%"), 3, 172, 31, 8, var_int_arr_e);
//            } else if (var_int_arr_arr_a[var_byte_C][19] == 1) {
//                n = 104 - 2 * var_byte_f - var_byte_f / 2;
//                C.a(graphics, Integer.toString(var_int_arr_arr_a[var_byte_C][2]), (short) 226, n);
//                C.a(graphics, Integer.toString(var_int_arr_arr_a[var_byte_C][17] / 1000) + "%", (short) 187, n += 2 * var_byte_f + var_byte_f / 2);
//            } else {
//                C.a(graphics, Integer.toString(var_int_arr_arr_a[var_byte_C][16]), (short) 185, n += 3 * var_byte_f);
//                C.a(graphics, Integer.toString(var_int_arr_arr_a[var_byte_C][17] / 1000) + "%", (short) 187, n += 2 * var_byte_f + var_byte_f / 2);
//                C.a(graphics, Integer.toString(var_int_arr_arr_a[var_byte_C][2]), (short) 186, n += 2 * var_byte_f + var_byte_f / 2);
//            }
//            var_boolean_k = false;
//        }
//    }
//
//    private static final void b(boolean bl) {
//        int n = var_short_arr_m.length;
//        short[] sArray = new short[n - 1];
//        short[] sArray2 = new short[n - 1];
//        int n2 = 0;
//        for (int i = 0; i < n; ++i) {
//            if (i == var_short_r) continue;
//            sArray[n2] = var_short_arr_m[i];
//            if (bl) {
//                sArray2[n2] = var_short_arr_a[i];
//            }
//            ++n2;
//        }
//        var_short_arr_m = sArray;
//        if (bl) {
//            var_short_arr_a = sArray2;
//        }
//        if (var_short_n % 6 == 1 && var_short_n > 0) {
//            var_short_n = (short) (var_short_n - 6);
//        }
//        var_short_d = (short) (var_short_d - 1);
//        if ((var_short_r = (short) (var_short_r - 1)) < 0) {
//            var_short_r = 0;
//        }
//        if (var_short_r > var_short_d) {
//            var_short_r = var_short_d;
//        }
//        var_boolean_x = true;
//        var_boolean_u = true;
//    }
//
//    private static final void a(boolean bl) {
//        int n = 0;
//        if (var_short_arr_a != null && var_short_arr_a.length > var_short_r && (n = 32000 - var_short_arr_a[var_short_r]) < 0) {
//            n = 0;
//        }
//        switch (var_int_l) {
//            case 22: {
//                if (bl) {
//                    short s = var_short_r;
//                    var_short_arr_a[s] = (short) (var_short_arr_a[s] + 1);
//                } else {
//                    short s = var_short_r;
//                    var_short_arr_a[s] = (short) (var_short_arr_a[s] + 10);
//                }
//                if (var_short_arr_a[var_short_r] > 32000) {
//                    C.var_short_arr_a[C.var_short_r] = 32000;
//                }
//                var_boolean_n = true;
//                var_boolean_h = true;
//                break;
//            }
//            case 24: {
//                if (!var_boolean_m || var_int_r <= 0) break;
//                int n2 = var_short_arr_m[var_short_r] - 52;
//                int n3 = bl ? Math.min(100, n) : Math.min(1000, n);
//                C.b(var_byte_arr_a[n2], var_short_arr_b[n2], n3);
//                var_boolean_n = true;
//                var_boolean_h = true;
//                break;
//            }
//            case 25: {
//                if (!var_boolean_m || var_int_r <= 0) break;
//                int n4 = var_short_arr_m[var_short_r] - 74;
//                int n5 = bl ? Math.min(10, n) : Math.min(100, n);
//                C.b(var_short_arr_g[n4], var_short_arr_k[n4], n5);
//                var_boolean_n = true;
//                var_boolean_h = true;
//                break;
//            }
//            case 31: {
//                if (var_short_e != 0) break;
//                if ((var_short_o = (short) (var_short_o + 1)) >= 5) {
//                    var_short_o = 0;
//                }
//                var_boolean_w = true;
//            }
//        }
//        var_boolean_d = true;
//    }
//
//    private static final void c(boolean bl) {
//        switch (var_int_l) {
//            case 22: {
//                short s = var_boolean_m ? var_short_arr_g[var_short_arr_m[var_short_r] - 74] : var_short_arr_o[var_short_arr_m[var_short_r] - 42];
//                if (s >= var_short_arr_a[var_short_r]) break;
//                if (bl) {
//                    short s2 = var_short_r;
//                    var_short_arr_a[s2] = (short) (var_short_arr_a[s2] - 1);
//                } else {
//                    short s3 = var_short_r;
//                    var_short_arr_a[s3] = (short) (var_short_arr_a[s3] - 10);
//                    if (s > var_short_arr_a[var_short_r]) {
//                        C.var_short_arr_a[C.var_short_r] = s;
//                    }
//                }
//                var_boolean_n = true;
//                var_boolean_h = true;
//                break;
//            }
//            case 24: {
//                if (!var_boolean_m) break;
//                int n = var_short_arr_m[var_short_r] - 52;
//                int n2 = bl ? 100 : 1000;
//                C.a(var_byte_arr_a[n], var_short_arr_b[n], n2);
//                var_boolean_n = true;
//                var_boolean_h = true;
//                break;
//            }
//            case 25: {
//                int n = var_short_arr_m[var_short_r] - 74;
//                int n3 = bl ? 10 : 100;
//                C.a(var_short_arr_g[n], var_short_arr_k[n], n3);
//                var_boolean_n = true;
//                var_boolean_h = true;
//                break;
//            }
//            case 31: {
//                System.out.println("dis");
//                if (var_short_e != 0) break;
//                if ((var_short_o = (short) (var_short_o - 1)) < 0) {
//                    var_short_o = (short) 4;
//                }
//                var_boolean_w = true;
//            }
//        }
//        var_boolean_d = true;
//    }
//
//    private static final void k() {
//        switch (var_int_l) {
//            case 22: {
//                if (var_boolean_m) {
//                    for (int i = 0; i < var_short_arr_m.length; ++i) {
//                        int n = var_short_arr_m[i] - 74;
//                        int n2 = var_short_arr_a[i] - var_short_arr_d[n];
//                        if (n2 == 0) continue;
//                        C.var_short_arr_d[n] = var_short_arr_a[i];
//                    }
//                } else {
//                    for (int i = 0; i < var_short_arr_m.length; ++i) {
//                        int n = var_short_arr_m[i] - 42;
//                        int n3 = var_short_arr_a[i] - var_short_arr_s[n];
//                        if (n3 == 0) continue;
//                        C.var_short_arr_s[n] = var_short_arr_a[i];
//                    }
//                }
//                break;
//            }
//            case 24: {
//                if (!var_boolean_m) break;
//                for (int i = 0; i < var_short_arr_m.length; ++i) {
//                    int n = var_short_arr_m[i] - 52;
//                    int n4 = var_short_arr_a[i] - var_short_arr_b[n];
//                    if (n4 == 0) continue;
//                    C.var_short_arr_b[n] = var_short_arr_a[i];
//                }
//                break;
//            }
//            case 25: {
//                if (!var_boolean_m) break;
//                for (int i = 0; i < var_short_arr_m.length; ++i) {
//                    int n = var_short_arr_m[i] - 74;
//                    int n5 = var_short_arr_a[i] - var_short_arr_k[n];
//                    if (n5 == 0) continue;
//                    C.var_short_arr_k[n] = var_short_arr_a[i];
//                }
//                break;
//            }
//        }
//        var_boolean_n = false;
//    }
//
//    private static final void J() {
//        if (var_short_e > 0) {
//            int n = 0;
//            short[] sArray = new short[20];
//            short[] sArray2 = new short[20];
//            int n2 = var_boolean_m ? 0 : 20;
//            for (int i = 0; i < 20; ++i) {
//                if (var_byte_arr_h[i] - n2 != var_short_e - 1) continue;
//                sArray[n] = (short) (i + 132);
//                sArray2[n++] = (short) (var_byte_arr_g[i] * var_byte_arr_g[i] * 37 + var_byte_arr_k[i] * var_byte_arr_k[i] * 43);
//            }
//            sArray = C.a(sArray, 0, n);
//            sArray2 = C.a(sArray2, 0, n);
//            C.a(sArray, sArray2);
//            var_short_d = (short) (n - 1);
//            var_short_r = 0;
//            var_short_n = 0;
//        }
//        var_boolean_k = true;
//    }
//
//    private static final void ah() {
//        if (var_boolean_e || var_boolean_q) {
//            C.J();
//            var_boolean_e = false;
//            var_boolean_q = false;
//        }
//        C.as();
//    }
//
//    private static final void O(Graphics graphics) {
//        if (var_short_e == 0) {
//            int n;
//            if (var_boolean_u || var_boolean_w) {
//                C.M(var_javax_microedition_lcdui_Graphics_a);
//            }
//            if (var_boolean_x) {
//                C.i(var_javax_microedition_lcdui_Graphics_a);
//                var_javax_microedition_lcdui_Graphics_a.setColor(0);
//                var_javax_microedition_lcdui_Graphics_a.drawRect(0, 116, 176, 79);
//                var_javax_microedition_lcdui_Graphics_a.setColor(2187916);
//                var_javax_microedition_lcdui_Graphics_a.fillRect(1, 117, 176, 78);
//                n = 3;
//                for (int i = 0; i < 5; ++i) {
//                    C.i(var_javax_microedition_lcdui_Graphics_a);
//                    var_javax_microedition_lcdui_Graphics_a.setColor(29116);
//                    var_javax_microedition_lcdui_Graphics_a.fillRect(n, 133, 32, 32);
//                    C.c(var_javax_microedition_lcdui_Graphics_a, 1079 + i, n, 133, 0, var_int_arr_e);
//                    n += 34;
//                }
//                var_boolean_x = false;
//            }
//            if (var_boolean_k) {
//                C.h(var_javax_microedition_lcdui_Graphics_a);
//                C.P(var_javax_microedition_lcdui_Graphics_a);
//                C.Q(var_javax_microedition_lcdui_Graphics_a);
//                var_boolean_k = false;
//                var_boolean_w = true;
//            }
//            if (var_boolean_w) {
//                C.i(graphics);
//                graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 0, 0);
//                n = 3 + var_short_o * 34;
//                graphics.setColor(10092276);
//                graphics.fillRect(n, 133, 32, 32);
//                C.c(graphics, 1079 + var_short_o, 3 + var_short_o * 34, 133, 0, var_int_arr_e);
//                var_boolean_w = false;
//            }
//        } else {
//            C.y(graphics);
//        }
//    }
//
//    public static final void V() {
//        int n = 0;
//        if (var_boolean_m) {
//            short[] sArray = new short[5];
//            for (int i = 0; i < 5; ++i) {
//                if (!var_boolean_arr_e[i]) continue;
//                sArray[n++] = (short) (i + 109);
//            }
//            sArray = C.a(sArray, 0, n);
//            C.a(sArray, null);
//        } else {
//            short[] sArray = new short[5];
//            short[] sArray2 = new short[5];
//            for (int i = 0; i < 5; ++i) {
//                if (var_boolean_arr_e[i]) continue;
//                sArray[n] = (short) (i + 109);
//                sArray2[n++] = var_short_arr_e[i];
//            }
//            sArray = C.a(sArray, 0, n);
//            sArray2 = C.a(sArray2, 0, n);
//            C.a(sArray, sArray2);
//        }
//        var_short_d = (short) (n - 1);
//        var_short_r = 0;
//        var_short_n = 0;
//    }
//
//    public static final void x() {
//        if (var_boolean_e) {
//            C.V();
//            var_boolean_e = false;
//            var_boolean_k = true;
//        }
//        C.as();
//    }
//
//    public static final void G(Graphics graphics) {
//        C.y(graphics);
//    }
//
//    private static final void Z() {
//        boolean[] blArray = new boolean[20];
//        int n = -1;
//        int n2 = -1;
//        int[] nArray = new int[5];
//        for (int i = 0; i < 20; ++i) {
//            int n3;
//            int n4;
//            do {
//                n4 = C.int_b(1 + var_byte_C / 4, 5);
//                n3 = C.int_b(1 + var_byte_C / 4, 5);
//            } while (n4 == n && n3 == n2);
//            n = n4;
//            n2 = n3;
//            int n5 = C.int_b(0, 19);
//            while (blArray[n5]) {
//                if (++n5 < 20) continue;
//                n5 = 0;
//            }
//            blArray[n5] = true;
//            int n6 = C.int_b(0, 4);
//            if (nArray[n6] > 3) {
//                for (int j = 0; j < 5; ++j) {
//                    if (nArray[j] >= 3) continue;
//                    n6 = j;
//                    break;
//                }
//            }
//            C.var_byte_arr_h[n5] = (byte) (n6 + 20);
//            int n7 = n6;
//            nArray[n7] = nArray[n7] + 1;
//            C.var_byte_arr_g[n5] = (byte) n4;
//            C.var_byte_arr_k[n5] = (byte) n3;
//        }
//    }
//
//    private static final void v() {
//        int n = 0;
//        if (var_boolean_m) {
//            short[] sArray = new short[7];
//            for (int i = 0; i < 7; ++i) {
//                if (!var_boolean_arr_g[i]) continue;
//                sArray[n++] = (short) (i + 152);
//            }
//            sArray = C.a(sArray, 0, n);
//            C.a(sArray, null);
//        } else {
//            short[] sArray = new short[7];
//            short[] sArray2 = new short[7];
//            for (int i = 0; i < 7; ++i) {
//                if (var_boolean_arr_g[i]) continue;
//                sArray[n] = (short) (i + 152);
//                sArray2[n++] = var_short_arr_l[i];
//            }
//            sArray = C.a(sArray, 0, n);
//            sArray2 = C.a(sArray2, 0, n);
//            C.a(sArray, sArray2);
//        }
//        var_short_d = (short) (n - 1);
//        var_short_r = 0;
//        var_short_n = 0;
//    }
//
//    private static final void ab() {
//        if (var_boolean_e) {
//            C.v();
//            var_boolean_e = false;
//            var_boolean_k = true;
//        }
//        C.as();
//    }
//
//    private static final void r(Graphics graphics) {
//        C.y(graphics);
//    }
//
//    private static final void I() {
//        var_java_util_Vector_a.removeElementAt(var_short_r);
//        if (var_short_arr_a != null) {
//            int n = var_short_arr_a.length;
//            int n2 = 0;
//            short[] sArray = new short[n - 1];
//            for (int i = 0; i < n; ++i) {
//                if (i == var_short_r) continue;
//                sArray[n2++] = var_short_arr_a[i];
//            }
//            var_short_arr_a = sArray;
//        }
//        if (var_short_n % 6 == 1 && var_short_n > 0) {
//            var_short_n = (short) (var_short_n - 6);
//        }
//        var_short_d = (short) (var_short_d - 1);
//        if ((var_short_r = (short) (var_short_r - 1)) < 0) {
//            var_short_r = 0;
//        }
//        if (var_short_r > var_short_d) {
//            var_short_r = var_short_d;
//        }
//        var_boolean_x = true;
//        var_boolean_u = true;
//    }
//
//    private static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
//        C.i(graphics);
//        graphics.setColor(var_int_arr_g[n5]);
//        graphics.fillRect(6, n2, n4 * n / 100000, n3 - 1);
//        if (n5 == 0) {
//            graphics.setColor(var_int_arr_g[var_int_arr_g.length - 1]);
//            graphics.drawRect(6, n2, n4 * n / 100000 - 1, n3 - 1 - 1);
//        }
//        C.a(graphics, C.byte_arr_a(n / 1000 + "%"), 3, 173, n2 - 1, 8, var_int_arr_e);
//    }
//
//    private static final void e(int n) {
//        if (C.boolean_b(n, 2)) {
//            var_byte_h = (byte) -1;
//            var_long_e = System.currentTimeMillis();
//            var_boolean_v = true;
//        } else if (C.boolean_b(n, 3)) {
//            var_byte_h = 1;
//            var_long_e = System.currentTimeMillis();
//            var_boolean_v = true;
//        }
//    }
//
//    private static final void X() {
//        if (var_byte_h != 0 && !var_boolean_w && !var_boolean_k) {
//            if (!var_boolean_v) {
//                long l = System.currentTimeMillis();
//                if (l - var_long_e > 500L && (l - var_long_e > 5000L || l - var_long_e > 2000L && l - var_long_f > 40L || l - var_long_f > 80L)) {
//                    var_long_f = System.currentTimeMillis();
//                    C.ae();
//                }
//            } else {
//                C.ae();
//                var_boolean_v = false;
//            }
//            if (var_short_f > 194) {
//                var_short_f = (short) (14 + var_byte_f);
//            }
//            if (var_short_f < 14) {
//                var_short_f = (short) (194 - var_byte_f);
//            }
//        }
//    }
//
//    private static final void a(Graphics graphics, byte[][] byArray, short s, short s2) {
//        block5:
//        {
//            byte by;
//            short s3;
//            block4:
//            {
//                s3 = (short) (14 - var_short_m);
//                by = var_byte_f;
//                if (!var_boolean_k) break block4;
//                C.i(graphics);
//                graphics.setColor(3692969);
//                graphics.fillRect(0, 0, 176, 208);
//                C.a(graphics, var_short_h);
//                C.a(graphics, s, s2);
//                C.a(var_javax_microedition_lcdui_Graphics_a, var_int_arr_q);
//                var_javax_microedition_lcdui_Graphics_a.setColor(3885026);
//                var_javax_microedition_lcdui_Graphics_a.fillRect(2, 14, 172, 180);
//                for (int i = 0; i < byArray.length; ++i) {
//                    short s4 = (short) (s3 + i * by);
//                    if (s4 < 14 - by || s4 > 194) continue;
//                    C.a(var_javax_microedition_lcdui_Graphics_a, byArray[i], 84, (int) s4, var_int_arr_q);
//                }
//                break block5;
//            }
//            if (!var_boolean_w) break block5;
//            if (var_byte_h == 1) {
//                var_int_m = 194 - by;
//                var_int_u = 194;
//                P = var_short_f - by;
//                var_int_j = var_short_f;
//            } else {
//                var_int_m = 14;
//                var_int_u = 14 + by;
//                P = var_short_f;
//                var_int_j = var_short_f + by;
//            }
//            var_javax_microedition_lcdui_Graphics_a.setClip(2, P, 172, (int) by);
//            var_javax_microedition_lcdui_Graphics_a.setColor(3885026);
//            var_javax_microedition_lcdui_Graphics_a.fillRect(2, P, 172, (int) by);
//            var_int_arr_m = new int[]{2, P, 172, var_int_j};
//            for (int i = 0; i < byArray.length; ++i) {
//                short s5 = (short) (s3 + i * by);
//                if (s5 <= var_int_m - by || s5 > var_int_u) continue;
//                C.a(var_javax_microedition_lcdui_Graphics_a, byArray[i], 84, var_int_j + s5 - var_int_u, var_int_arr_m);
//            }
//        }
//    }
//
//    private static final void v(Graphics graphics) {
//        if (var_boolean_k) {
//            C.a(graphics, var_int_arr_q);
//            graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 0, 0);
//            graphics.setColor(0);
//            graphics.drawRect(2, 14, 172, 180);
//            C.j(graphics);
//            var_boolean_k = false;
//        } else if (var_boolean_w) {
//            if (var_short_f == 14 || var_short_f == 194) {
//                C.a(graphics, var_int_arr_q);
//                graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 0, 0);
//            } else {
//                graphics.setClip(2, 14, 172, 194 - var_short_f);
//                graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, -(var_short_f - 14), 0);
//                graphics.setClip(2, 194 - (var_short_f - 14), 172, var_short_f - 14);
//                graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 180 - (var_short_f - 14), 0);
//            }
//            C.a(graphics, var_int_arr_q);
//            graphics.setColor(0);
//            graphics.drawRect(2, 14, 172, 180);
//            C.j(graphics);
//            var_boolean_w = false;
//        }
//    }
//
//    private static final void ae() {
//        if (var_byte_h == -1) {
//            if ((var_short_m = (short) (var_short_m - var_byte_f)) < 0) {
//                var_short_m = 0;
//            } else {
//                var_short_f = (short) (var_short_f - var_byte_f);
//                var_boolean_w = true;
//            }
//        } else if (var_byte_h == 1) {
//            if ((var_short_m = (short) (var_short_m + var_byte_f)) > var_short_j) {
//                var_short_m = var_short_j;
//            } else {
//                var_short_f = (short) (var_short_f + var_byte_f);
//                var_boolean_w = true;
//            }
//        }
//    }
//
//    private static final void K() {
//        int n;
//        var_int_s = 0;
//        J = 0;
//        Q = 0;
//        int n2 = var_short_arr_f.length;
//        var_int_y = 0;
//        var_short_arr_c = new short[n2];
//        var_short_arr_h = new short[n2];
//        block3:
//        for (n = 0; n < n2; ++n) {
//            switch (n) {
//                case 2: {
//                    if (!var_boolean_j) continue block3;
//                }
//                default: {
//                    C.var_short_arr_c[C.var_int_y] = var_short_arr_f[n];
//                    C.var_short_arr_h[C.var_int_y] = var_short_arr_u[n];
//                    ++var_int_y;
//                }
//            }
//        }
//        var_int_f = var_byte_f + 2 + var_byte_o;
//        var_int_w = 0;
//        for (n = 0; n < var_int_y; ++n) {
//            var_int_w = Math.max(var_int_w, C.int_a(var_byte_arr_arr_d[var_short_arr_c[n]], 1));
//        }
//        var_int_p = var_int_y * var_int_f;
//        var_int_D = 88 - var_int_w / 2;
//        O = 104 - var_int_y * var_byte_f / 2;
//    }
//
//    private static final void X(Graphics graphics) {
//        if (var_int_s == 0) {
//            for (int i = 0; i < var_int_y; ++i) {
//                C.a(graphics, i);
//            }
//            ++var_int_s;
//            C.H(graphics);
//        } else if (Q != J) {
//            C.a(graphics, J);
//            C.a(graphics, Q);
//            J = Q;
//            C.H(graphics);
//        }
//    }
//
//    private static final void a(Graphics graphics, int n) {
//        int n2 = O + n * var_int_f;
//        int[] nArray = new int[]{var_int_D - 12 + 2, n2, var_int_D + var_int_w + 12 - 2, n2 + var_int_f};
//        C.a(graphics, nArray);
//        if (n == Q) {
//            graphics.setColor(-1878644885);
//        } else {
//            graphics.setColor(-1874565200);
//        }
//        graphics.fillRect(var_int_D - 12 + 2, n2, var_int_w + 24 - 4, var_int_f);
//        C.a(graphics, (int) var_short_arr_c[n], 1, var_int_D + var_int_w / 2, n2, 1, var_int_arr_e);
//    }
//
//    public static final void af() {
//        C.void_a("PMSAVEGAME");
//        try {
//            var_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore((String) "PMSAVEGAME", (boolean) true);
//            try {
//                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
//                C.a(dataOutputStream);
//                C.b(dataOutputStream);
//                dataOutputStream.writeByte(var_byte_C);
//                dataOutputStream.writeInt(var_int_o);
//                dataOutputStream.writeInt(var_int_r);
//                dataOutputStream.writeInt(R);
//                dataOutputStream.writeInt(S);
//                dataOutputStream.writeInt(var_int_t);
//                dataOutputStream.writeInt(F);
//                dataOutputStream.writeByte(var_byte_c);
//                dataOutputStream.writeInt(M);
//                dataOutputStream.writeBoolean(var_boolean_l);
//                dataOutputStream.writeByte(var_byte_p);
//                dataOutputStream.writeBoolean(var_boolean_i);
//                ((OutputStream) dataOutputStream).write(var_byte_arr_g);
//                ((OutputStream) dataOutputStream).write(var_byte_arr_k);
//                dataOutputStream.writeByte(var_byte_v);
//                dataOutputStream.writeByte(var_byte_b);
//                dataOutputStream.writeByte(var_byte_l);
//                dataOutputStream.writeByte(var_byte_t);
//                dataOutputStream.writeByte(var_byte_D);
//                dataOutputStream.writeInt(var_int_x);
//                dataOutputStream.writeInt(var_int_i);
//                dataOutputStream.writeInt(var_int_g);
//                dataOutputStream.writeInt(var_int_C);
//                byte[] byArray = byteArrayOutputStream.toByteArray();
//                var_javax_microedition_rms_RecordStore_a.addRecord(byArray, 0, byArray.length);
//            } catch (Exception exception) {
//                exception.printStackTrace();
//            }
//            var_javax_microedition_rms_RecordStore_a.closeRecordStore();
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//    }
//
//    private static final void B() {
//        try {
//            var_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore((String) "PMSAVEGAME", (boolean) false);
//            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(var_javax_microedition_rms_RecordStore_a.getRecord(1));
//            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
//            try {
//                C.void_a(dataInputStream);
//                C.void_b(dataInputStream);
//                var_byte_C = dataInputStream.readByte();
//                var_int_o = dataInputStream.readInt();
//                var_int_r = dataInputStream.readInt();
//                R = dataInputStream.readInt();
//                S = dataInputStream.readInt();
//                var_int_t = dataInputStream.readInt();
//                F = dataInputStream.readInt();
//                var_byte_c = dataInputStream.readByte();
//                M = dataInputStream.readInt();
//                var_boolean_l = dataInputStream.readBoolean();
//                var_byte_p = dataInputStream.readByte();
//                var_boolean_i = dataInputStream.readBoolean();
//                dataInputStream.read(var_byte_arr_g);
//                dataInputStream.read(var_byte_arr_k);
//                var_byte_v = dataInputStream.readByte();
//                var_byte_b = dataInputStream.readByte();
//                var_byte_l = dataInputStream.readByte();
//                var_byte_t = dataInputStream.readByte();
//                var_byte_D = dataInputStream.readByte();
//                var_int_x = dataInputStream.readInt();
//                var_int_i = dataInputStream.readInt();
//                var_int_g = dataInputStream.readInt();
//                var_int_C = dataInputStream.readInt();
//            } catch (IOException iOException) {
//                iOException.printStackTrace();
//            }
//            var_javax_microedition_rms_RecordStore_a.closeRecordStore();
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//        var_byte_k = var_boolean_arr_g[0] ? (byte) 2 : (byte) 1;
//        C.aj();
//        for (int i = 0; i < 10; ++i) {
//            if (!var_boolean_arr_b[i]) continue;
//            L += var_short_arr_r[i];
//        }
//        var_byte_w = (byte) var_int_arr_arr_a[var_byte_C][4];
//        var_byte_y = (byte) var_int_arr_arr_a[var_byte_C][6];
//        var_byte_g = (byte) (9 + var_byte_C / 5);
//        C.void_a();
//    }
//
//    private static final void b(DataOutputStream dataOutputStream) throws IOException {
//        C.a(dataOutputStream, var_boolean_arr_b, (short) 10);
//        C.a(dataOutputStream, var_java_util_Vector_b);
//        C.a(dataOutputStream, var_java_util_Vector_f);
//        ((OutputStream) dataOutputStream).write(var_byte_arr_h);
//        C.a(dataOutputStream, var_boolean_arr_j, (short) 22);
//        C.a(dataOutputStream, var_short_arr_n, (short) 10);
//        C.a(dataOutputStream, var_short_arr_k, (short) 12);
//        C.a(dataOutputStream, var_boolean_arr_j, (short) 22);
//        C.a(dataOutputStream, var_short_arr_n, (short) 10);
//        C.a(dataOutputStream, var_short_arr_b, (short) 52);
//        C.a(dataOutputStream, var_short_arr_d, (short) 12);
//        C.b(dataOutputStream, var_short_arr_s);
//        C.b(dataOutputStream, var_short_arr_v);
//        C.a(dataOutputStream, var_boolean_arr_e, (short) 5);
//        C.a(dataOutputStream, var_boolean_arr_f, (short) 10);
//        C.a(dataOutputStream, var_boolean_arr_g, (short) 7);
//        byte by = (byte) var_byte_arr_e.length;
//        dataOutputStream.writeByte(by);
//        if (by > 0) {
//            ((OutputStream) dataOutputStream).write(var_byte_arr_e);
//        }
//        ((OutputStream) dataOutputStream).write(var_byte_arr_g);
//        ((OutputStream) dataOutputStream).write(var_byte_arr_k);
//    }
//
//    private static final void void_b(DataInputStream dataInputStream) throws IOException {
//        var_boolean_arr_b = C.boolean_arr_a(dataInputStream, (short) 10);
//        C.a(dataInputStream, var_java_util_Vector_b);
//        C.a(dataInputStream, var_java_util_Vector_f);
//        dataInputStream.read(var_byte_arr_h);
//        var_boolean_arr_j = C.boolean_arr_a(dataInputStream, (short) 22);
//        var_short_arr_n = C.short_arr_a(dataInputStream, (short) 10);
//        var_short_arr_k = C.short_arr_a(dataInputStream, (short) 12);
//        var_boolean_arr_j = C.boolean_arr_a(dataInputStream, (short) 22);
//        var_short_arr_n = C.short_arr_a(dataInputStream, (short) 10);
//        var_short_arr_b = C.short_arr_a(dataInputStream, (short) 52);
//        var_short_arr_d = C.short_arr_a(dataInputStream, (short) 12);
//        var_short_arr_s = C.short_arr_a(dataInputStream);
//        var_short_arr_v = C.short_arr_a(dataInputStream);
//        var_boolean_arr_e = C.boolean_arr_a(dataInputStream, (short) 5);
//        var_boolean_arr_f = C.boolean_arr_a(dataInputStream, (short) 10);
//        var_boolean_arr_g = C.boolean_arr_a(dataInputStream, (short) 7);
//        byte by = dataInputStream.readByte();
//        var_byte_arr_e = new byte[by];
//        if (by > 0) {
//            dataInputStream.read(var_byte_arr_e);
//        }
//        dataInputStream.read(var_byte_arr_g);
//        dataInputStream.read(var_byte_arr_k);
//    }
//
//    private static final void b(DataOutputStream dataOutputStream, short[] sArray) throws IOException {
//        if (sArray == null) {
//            dataOutputStream.writeByte(-1);
//        } else {
//            int n = sArray.length;
//            dataOutputStream.writeByte(n);
//            for (int i = 0; i < n; ++i) {
//                dataOutputStream.writeShort(sArray[i]);
//            }
//        }
//    }
//
//    public static final void a(DataOutputStream dataOutputStream, short[] sArray, short n) throws IOException {
//        for (int i = 0; i < n; ++i) {
//            dataOutputStream.writeShort(sArray[i]);
//        }
//    }
//
//    public static final void a(DataOutputStream dataOutputStream, Vector vector) throws IOException {
//        if (vector == null) {
//            dataOutputStream.writeByte(-1);
//        } else {
//            int n = vector.size();
//            dataOutputStream.writeByte(n);
//            for (int i = 0; i < n; ++i) {
//                dataOutputStream.writeShort(((Short) vector.elementAt(i)).shortValue());
//            }
//        }
//    }
//
//    private static final void a(DataOutputStream dataOutputStream, boolean[] blArray, short n) throws IOException {
//        for (int i = 0; i < n; ++i) {
//            dataOutputStream.writeBoolean(blArray[i]);
//        }
//    }
//
//    private static final short[] short_arr_a(DataInputStream dataInputStream) throws IOException {
//        short[] sArray = null;
//        int n = dataInputStream.readByte();
//        if (n >= 0) {
//            sArray = new short[n];
//            for (int i = 0; i < n; ++i) {
//                sArray[i] = dataInputStream.readShort();
//            }
//        }
//        return sArray;
//    }
//
//    public static final short[] short_arr_a(DataInputStream dataInputStream, short n) throws IOException {
//        short[] sArray = new short[n];
//        for (int i = 0; i < n; ++i) {
//            sArray[i] = dataInputStream.readShort();
//        }
//        return sArray;
//    }
//
//    public static final void a(DataInputStream dataInputStream, Vector vector) throws IOException {
//        int n = dataInputStream.readByte();
//        if (n >= 0) {
//            for (int i = 0; i < n; ++i) {
//                vector.addElement(new Short(dataInputStream.readShort()));
//            }
//        }
//    }
//
//    private static final boolean[] boolean_arr_a(DataInputStream dataInputStream, short n) throws IOException {
//        boolean[] blArray = new boolean[n];
//        for (int i = 0; i < n; ++i) {
//            blArray[i] = dataInputStream.readBoolean();
//        }
//        return blArray;
//    }
//
//    private static final void q() {
//        var_short_g = var_short_arr_a[var_short_r];
//        if (var_int_k == 22) {
//            var_byte_arr_arr_i = C.byte_arr_arr_a(308, 166);
//            var_short_k = var_short_q;
//        } else if (var_int_k == 24) {
//            var_byte_arr_arr_i = C.byte_arr_arr_a(307, 166);
//            var_short_k = var_short_q;
//        } else if (var_int_k == 25) {
//            var_byte_arr_arr_i = C.byte_arr_arr_a(309, 166);
//            var_short_k = var_short_q;
//        }
//    }
//
//    private static final void d(Graphics graphics) {
//        int n;
//        int n2;
//        int n3;
//        if (var_boolean_k) {
//            C.a(graphics, var_int_arr_k);
//            graphics.setColor(9655206);
//            graphics.fillRect(0, 30, 176, 165);
//            graphics.setColor(6563446);
//            graphics.fillRect(5, 35, 166, (int) var_byte_f);
//            graphics.setColor(0);
//            graphics.drawLine(6, 35 + var_byte_f, 171, 35 + var_byte_f);
//            graphics.drawLine(171, 35, 171, 35 + var_byte_f);
//            n3 = 5 + var_byte_f + 15;
//            graphics.setColor(6563446);
//            graphics.fillRect(15, 30 + n3, 146, (int) var_byte_f);
//            graphics.setColor(0);
//            graphics.drawLine(16, 30 + n3 + var_byte_f, 161, 30 + n3 + var_byte_f);
//            graphics.drawLine(161, 30 + n3, 161, 30 + n3 + var_byte_f);
//            n3 += var_byte_f + 1;
//            C.b(graphics, 5, 138, 166, 30, 6563446, 0);
//            C.Q(graphics);
//            if (var_short_d >= 0) {
//                short s;
//                if (var_int_k == 22) {
//                    n2 = 37;
//                    n = 211;
//                    s = var_boolean_m ? var_short_arr_g[var_short_arr_m[var_short_r] - 74] : var_short_arr_o[var_short_arr_m[var_short_r] - 42];
//                } else {
//                    s = var_int_k == 24 ? var_byte_arr_a[var_short_arr_m[var_short_r] - 52] : var_short_arr_g[var_short_arr_m[var_short_r] - 74];
//                    n = 88;
//                    n2 = 210;
//                }
//                C.a(graphics, n2, 3, 7, 35, 0, var_int_arr_k);
//                C.a(graphics, C.byte_arr_a(Integer.toString(s)), 3, 169, 35, 8, var_int_arr_k);
//                C.a(graphics, n, 3, 88, 35 + var_byte_f + 15, 1, var_int_arr_k);
//                C.a(graphics, var_byte_arr_arr_i[0], 3, 88, 152, 33, var_int_arr_k);
//                C.a(graphics, var_byte_arr_arr_i[1], 3, 88, 154, 1, var_int_arr_k);
//            }
//            var_boolean_k = false;
//            var_boolean_w = true;
//        }
//        if (var_boolean_w) {
//            C.P(graphics);
//            C.a(graphics, var_int_arr_k);
//            n3 = 5 + var_byte_f + 15 + (var_byte_f + 1);
//            graphics.setColor(6563446);
//            graphics.fillRect(15, 30 + n3, 146, (int) var_byte_f);
//            graphics.setColor(0);
//            graphics.drawLine(16, 30 + n3 + var_byte_f, 161, 30 + n3 + var_byte_f);
//            graphics.drawLine(161, 30 + n3, 161, 30 + n3 + var_byte_f);
//            C.a(graphics, C.byte_arr_a(Integer.toString(var_short_g)), 3, 88, 30 + n3, 1, var_int_arr_k);
//            C.a(graphics, var_int_arr_k);
//            graphics.setColor(9655206);
//            graphics.fillRect(0, 30 + (n3 += 2 * var_byte_f + 5) + 17, 176, 13);
//            n2 = 22;
//            for (n = 0; n < 4; ++n) {
//                C.c(graphics, 1090 + n, n2, 30 + n3, 0, var_int_arr_k);
//                n2 += 38;
//            }
//            n2 = 22 + var_short_p * 38 + 17 - 3;
//            C.a(graphics, 3, n2 - 1, 30 + n3 + 17 - 3, 0, var_int_arr_k);
//            var_boolean_w = false;
//        }
//    }
//
//    private static final void c() {
//        int n = 0;
//        if (var_short_arr_a != null && var_short_arr_a.length > var_short_r && (n = 32000 - var_short_arr_a[var_short_r]) < 0) {
//            n = 0;
//        }
//        int n2 = 0;
//        switch (var_short_p) {
//            case 0: {
//                n2 = 10;
//                break;
//            }
//            case 1: {
//                n2 = 1;
//                break;
//            }
//            case 2: {
//                n2 = -1;
//                break;
//            }
//            case 3: {
//                n2 = -10;
//            }
//        }
//        switch (var_int_k) {
//            case 22: {
//                short s = var_boolean_m ? var_short_arr_g[var_short_arr_m[var_short_r] - 74] : var_short_arr_o[var_short_arr_m[var_short_r] - 42];
//                var_short_g = n2 + var_short_g < s ? (short) s : (short) (var_short_g + n2);
//                if (var_short_g > 32000) {
//                    var_short_g = (short) 32000;
//                }
//                var_int_v |= 8;
//                var_boolean_n = true;
//                var_boolean_w = true;
//                break;
//            }
//            case 24: {
//                if (!var_boolean_m) break;
//                int n3 = 100 * n2;
//                int n4 = var_short_arr_m[var_short_r] - 52;
//                var_short_g = n3 > 0 ? (short) (var_short_g + C.b(var_byte_arr_a[n4], var_short_arr_b[n4], Math.min(n, n3))) : (short) (var_short_g - C.a(var_byte_arr_a[n4], var_short_arr_b[n4], Math.abs(n3)));
//                var_boolean_n = true;
//                var_boolean_w = true;
//                break;
//            }
//            case 25: {
//                if (!var_boolean_m) break;
//                int n5 = 10 * n2;
//                int n6 = var_short_arr_m[var_short_r] - 74;
//                var_short_g = n5 > 0 ? (short) (var_short_g + C.b(var_short_arr_g[n6], var_short_arr_k[n6], Math.min(n, n5))) : (short) (var_short_g - C.a(var_short_arr_g[n6], var_short_arr_k[n6], Math.abs(n5)));
//                var_boolean_n = true;
//                var_boolean_w = true;
//            }
//        }
//    }
//
//    private static final void void_b() {
//        int n = 0;
//        short[] sArray = new short[var_byte_C + 1];
//        short[] sArray2 = null;
//        if (var_boolean_m) {
//            for (int i = 9 - var_byte_C; i < 10; ++i) {
//                if (!var_boolean_arr_b[i]) continue;
//                sArray[n++] = (short) (i + 212);
//            }
//        } else {
//            sArray2 = new short[var_byte_C + 1];
//            for (int i = 9 - var_byte_C; i < 10; ++i) {
//                if (var_boolean_arr_b[i]) continue;
//                sArray[n] = (short) (i + 212);
//                sArray2[n++] = var_short_arr_r[i];
//            }
//            sArray2 = C.a(sArray2, 0, n);
//        }
//        sArray = C.a(sArray, 0, n);
//        C.a(sArray, sArray2);
//        var_short_d = (short) (n - 1);
//        var_short_r = 0;
//        var_short_n = 0;
//    }
//
//    private static final void p() {
//        if (var_boolean_e) {
//            C.void_b();
//            var_boolean_e = false;
//            var_boolean_k = true;
//        }
//        C.as();
//    }
//
//    private static final void R(Graphics graphics) {
//        C.y(graphics);
//    }
//
//    private static final void c(int n) {
//        block0:
//        switch (n) {
//            case 22: {
//                int n2;
//                C.var_boolean_arr_f[0] = false;
//                for (n2 = 0; n2 < 12; ++n2) {
//                    if (var_short_arr_d[n2] <= 0 || var_short_arr_d[n2] > var_short_arr_g[n2]) continue;
//                    C.var_boolean_arr_f[0] = true;
//                    break;
//                }
//                for (n2 = 0; n2 < 10; ++n2) {
//                    if (var_short_arr_s[n2] <= 0 || var_short_arr_s[n2] > var_short_arr_o[n2]) continue;
//                    C.var_boolean_arr_f[0] = true;
//                    break block0;
//                }
//                break;
//            }
//            case 23: {
//                break;
//            }
//            case 24: {
//                C.var_boolean_arr_f[2] = false;
//                for (int i = 0; i < var_byte_arr_arr_f[var_byte_C].length; ++i) {
//                    byte by = var_byte_arr_arr_f[var_byte_C][i];
//                    for (int j = 0; j < var_short_arr_arr_b[by].length; ++j) {
//                        if (var_byte_arr_arr_e[by][j] <= var_short_arr_b[var_short_arr_arr_b[by][j]]) continue;
//                        C.var_boolean_arr_f[2] = true;
//                        return;
//                    }
//                }
//                if (var_java_util_Vector_f.size() <= 0) break;
//                C.var_boolean_arr_f[2] = true;
//                break;
//            }
//            case 25: {
//                C.var_boolean_arr_f[3] = false;
//                for (int i = 0; i < 12; ++i) {
//                    if (var_short_arr_d[i] <= 0 || var_short_arr_k[i] > 0) continue;
//                    C.var_boolean_arr_f[3] = true;
//                    break block0;
//                }
//                break;
//            }
//            case 26: {
//                break;
//            }
//            case 27: {
//                break;
//            }
//            case 28: {
//                break;
//            }
//            case 29: {
//                break;
//            }
//            case 30: {
//                break;
//            }
//            case 31: {
//                C.var_boolean_arr_f[9] = false;
//                for (int i = 0; i < 5; ++i) {
//                    if (var_byte_k <= C.int_b(i)) continue;
//                    C.var_boolean_arr_f[9] = true;
//                    return;
//                }
//                break;
//            }
//        }
//    }
//
//    private static final void ao() {
//        var_byte_arr_arr_i = null;
//        var_byte_arr_arr_i = C.byte_arr_arr_a(230, 166);
//    }
//
//    private static final void B(Graphics graphics) {
//        if (var_boolean_k) {
//            C.D(var_javax_microedition_lcdui_Graphics_a);
//            C.a(var_javax_microedition_lcdui_Graphics_a, (short) 163);
//            C.a(var_javax_microedition_lcdui_Graphics_a, (short) 35, (short) 159);
//            C.b(var_javax_microedition_lcdui_Graphics_a, 3, 138, 169, 40, 3692969, 0);
//            int n = 158 - var_byte_f * var_byte_arr_arr_i.length / 2;
//            for (int i = 0; i < var_byte_arr_arr_i.length; ++i) {
//                C.a(var_javax_microedition_lcdui_Graphics_a, var_byte_arr_arr_i[i], 3, 88, n, 1, var_int_arr_e);
//                n += var_byte_f;
//            }
//            var_boolean_k = false;
//            var_boolean_w = true;
//        }
//        if (var_boolean_w) {
//            int n;
//            int n2;
//            int n3;
//            C.i(graphics);
//            graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 0, 0);
//            C.a(graphics, var_int_arr_d);
//            if (var_boolean_i) {
//                n3 = 2697632;
//                n2 = 5789879;
//                n = 75;
//            } else {
//                n3 = 5789879;
//                n2 = 2697632;
//                n = 161;
//            }
//            graphics.setColor(n3);
//            graphics.fillRect(10, 20, 70, 85);
//            graphics.setColor(n2);
//            graphics.fillRect(96, 20, 70, 85);
//            graphics.setColor(0);
//            graphics.drawLine(11, 105, 79, 105);
//            graphics.drawLine(97, 105, 166, 105);
//            graphics.drawLine(79, 21, 79, 105);
//            graphics.drawLine(166, 21, 166, 105);
//            C.a(graphics, var_int_arr_d);
//            C.a(graphics, 306, 3, 45, 102, 33, var_int_arr_e);
//            C.a(graphics, var_int_arr_d);
//            C.c(graphics, 1104, 45, 62 - var_byte_f, 3, var_int_arr_e);
//            C.a(graphics, var_int_arr_d);
//            C.a(graphics, 305, 3, 131, 102, 33, var_int_arr_e);
//            C.a(graphics, var_int_arr_d);
//            C.c(graphics, 1105, 131, 62 - var_byte_f, 3, var_int_arr_e);
//            C.b(graphics, 3, n, 101, 0, var_int_arr_e);
//            var_boolean_w = false;
//        }
//    }
//
//    private static final void aa() {
//        if (var_javax_microedition_lcdui_Image_d == null) {
//            var_javax_microedition_lcdui_Image_d = Image.createImage((int) 176, (int) 208);
//            var_javax_microedition_lcdui_Graphics_a = var_javax_microedition_lcdui_Image_d.getGraphics();
//        }
//        if (var_boolean_i) {
//            short[] sArray = new short[var_int_arr_i.length];
//            int n = 0;
//            for (int i = 0; i < var_int_arr_i.length && var_int_arr_i[i] != 0; i += 2) {
//                sArray[n++] = (short) (167 + i);
//            }
//            sArray = C.a(sArray, 0, n);
//            C.a(sArray, null);
//            var_short_d = (short) (sArray.length - 1);
//        } else {
//            C.a(var_short_arr_t, null);
//            var_short_d = (short) (var_short_arr_t.length - 1);
//        }
//        var_short_r = 0;
//        var_short_n = 0;
//    }
//
//    private static final void ax() {
//        if (var_short_r - var_short_n < 0 && var_short_r >= 0) {
//            if (var_short_r == 0) {
//                var_short_n = 0;
//            } else {
//                var_short_n = (short) (var_short_n - 6);
//                if (var_short_n < 0) {
//                    var_short_n = 0;
//                }
//            }
//            var_boolean_k = true;
//        }
//        if (var_short_r - var_short_n >= 6) {
//            if (var_short_r == var_short_d) {
//                var_short_n = (short) (var_short_d - 5);
//            } else {
//                var_short_n = (short) (var_short_n + 6);
//                if (var_short_d - var_short_n < 5) {
//                    var_short_n = (short) (var_short_d - 5);
//                }
//            }
//            var_boolean_k = true;
//        }
//    }
//
//    private static final void E(Graphics graphics) {
//        int n;
//        int n2;
//        if (var_boolean_k) {
//            C.i(var_javax_microedition_lcdui_Graphics_a);
//            n2 = var_boolean_i ? 2586170 : 0x242EEE;
//            C.a(var_javax_microedition_lcdui_Graphics_a, var_boolean_i ? (short) 166 : 165);
//            C.a(var_javax_microedition_lcdui_Graphics_a, (short) 35, (short) 33);
//            var_javax_microedition_lcdui_Graphics_a.setClip(0, 12, 176, 112);
//            var_javax_microedition_lcdui_Graphics_a.setColor(4409518);
//            var_javax_microedition_lcdui_Graphics_a.fillRect(0, 12, 176, 112);
//            var_javax_microedition_lcdui_Graphics_a.setClip(0, 124, 176, 72);
//            var_javax_microedition_lcdui_Graphics_a.setColor(0);
//            var_javax_microedition_lcdui_Graphics_a.drawRect(0, 124, 176, 72);
//            var_javax_microedition_lcdui_Graphics_a.setColor(n2);
//            var_javax_microedition_lcdui_Graphics_a.fillRect(1, 125, 168, 71);
//            n = 1104;
//            if (!var_boolean_i) {
//                ++n;
//            }
//            C.a(var_javax_microedition_lcdui_Graphics_a, 58, 60, 60, 62, 2787268, 0);
//            C.c(var_javax_microedition_lcdui_Graphics_a, n, 88, 122, 33, var_int_arr_e);
//            for (short s = 0; s < 6 && s <= var_short_d; s = (short) ((byte) (s + 1))) {
//                C.a(var_javax_microedition_lcdui_Graphics_a, var_short_n, s, false);
//            }
//            C.i(var_javax_microedition_lcdui_Graphics_a);
//            var_javax_microedition_lcdui_Graphics_a.setColor(5079272);
//            var_javax_microedition_lcdui_Graphics_a.fillRect(170, 124, 6, 72);
//            var_javax_microedition_lcdui_Graphics_a.setColor(0);
//            var_javax_microedition_lcdui_Graphics_a.drawRect(169, 124, 7, 72);
//            var_javax_microedition_lcdui_Graphics_a.drawLine(169, 131, 176, 131);
//            var_javax_microedition_lcdui_Graphics_a.drawLine(169, 189, 176, 189);
//            C.c(var_javax_microedition_lcdui_Graphics_a, 1088, 170, 125, 0, var_int_arr_e);
//            C.c(var_javax_microedition_lcdui_Graphics_a, 1089, 170, 196, 32, var_int_arr_e);
//            int n3 = 12;
//            short[] sArray = var_boolean_i ? new short[]{204, 207, 205, 206} : new short[]{222, 223, 224, 225};
//            C.a(var_javax_microedition_lcdui_Graphics_a, (int) sArray[0], 3, 88, n3, 1, var_int_arr_e);
//            for (int i = 1; i < 4; ++i) {
//                C.a(var_javax_microedition_lcdui_Graphics_a, (int) sArray[i], 3, 2, n3 += var_byte_f, 4, var_int_arr_e);
//            }
//            var_boolean_k = false;
//            var_boolean_w = true;
//        }
//        if (var_boolean_w) {
//            C.i(graphics);
//            graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 0, 0);
//            n2 = 12 + var_byte_f;
//            if (var_boolean_i) {
//                if (var_int_arr_i[2 * var_short_r] > 0) {
//                    C.a(graphics, var_byte_arr_arr_a[var_short_r], 3, 174, n2, 8, var_int_arr_e);
//                    C.a(graphics, C.byte_arr_a(Integer.toString(var_int_arr_i[2 * var_short_r])), 3, 174, n2 += var_byte_f, 8, var_int_arr_e);
//                    C.a(graphics, C.byte_arr_a(Integer.toString(var_int_arr_i[2 * var_short_r + 1])), 3, 174, n2 += var_byte_f, 8, var_int_arr_e);
//                }
//            } else {
//                C.a(graphics, C.byte_arr_a(Integer.toString(var_int_arr_arr_a[var_short_r][0])), 3, 174, n2, 8, var_int_arr_e);
//                C.a(graphics, C.byte_arr_a(Integer.toString(var_int_arr_arr_a[var_short_r][1] / 1000) + "%"), 3, 174, n2 += var_byte_f, 8, var_int_arr_e);
//                C.a(graphics, C.byte_arr_a(Integer.toString(var_int_arr_arr_a[var_short_r][2])), 3, 174, n2 += var_byte_f, 8, var_int_arr_e);
//            }
//            if (var_short_d >= 0) {
//                n = var_short_r - var_short_n;
//                C.a(graphics, var_short_n, (short) n, true);
//                var_boolean_w = false;
//                int n4 = 124 + n * 12 + 1 + 10 + 1 - 3;
//                C.a(graphics, 3, 151, n4, 0, var_int_arr_e);
//                if (var_short_d > 0) {
//                    C.i(graphics);
//                    graphics.setColor(255);
//                    graphics.fillRect(170, 132 + 47 * var_short_r / var_short_d, 6, 10);
//                    if (var_short_r > 0) {
//                        C.c(graphics, 1084, 170, 125, 0, var_int_arr_e);
//                    }
//                    if (var_short_r < var_short_d) {
//                        C.c(graphics, 1085, 170, 196, 32, var_int_arr_e);
//                    }
//                }
//            }
//        }
//    }
//
//    private static final void a(Graphics graphics, short s, short s2, boolean bl) {
//        int n;
//        int n2;
//        short s3 = 0;
//        if (var_boolean_i) {
//            n2 = 5158503;
//            n = 7330696;
//        } else {
//            n2 = 67725;
//            n = 7567849;
//        }
//        s3 = var_short_arr_m[s2 + s];
//        int n3 = 124 + s2 * 12 + 1;
//        int n4 = n3 + 11;
//        if (bl) {
//            graphics.setClip(0, n3 - 1, 169, n4 - n3 + 2);
//            graphics.setColor(n2);
//            graphics.fillRect(1, n3, 169, n4 - n3);
//            graphics.setColor(n);
//            graphics.drawLine(1, n3 - 1, 168, n3 - 1);
//        } else {
//            graphics.setClip(0, n3, 169, n4 - n3 + 1);
//            graphics.setColor(n);
//        }
//        graphics.drawLine(1, n4, 168, n4);
//        byte by = var_byte_f;
//        C.a(graphics, C.byte_arr_a(Integer.toString(s2 + s + 1)), 3, 1 + by, n3, 8, var_int_arr_e);
//        C.a(graphics, (int) s3, 3, 1 + by + 2, n3, 0, var_int_arr_e);
//    }
//
//    private static final short b(short s, short s2, int n) {
//        n = Math.min(var_int_r / s, n);
//        int n2 = var_short_arr_a[var_short_r] - s2;
//        if (n > 0) {
//            if (n2 >= 0) {
//                var_int_r -= n * s;
//            } else if (n <= -n2) {
//                var_int_r -= n * s / 2;
//            } else {
//                var_int_r -= -n2 * s / 2;
//                var_int_r -= (n + n2) * s / 2;
//            }
//        }
//        short s3 = var_short_r;
//        var_short_arr_a[s3] = (short) (var_short_arr_a[s3] + n);
//        var_int_v |= 8;
//        return (short) n;
//    }
//
//    private static final short a(short s, short s2, int n) {
//        n = Math.min(var_short_arr_a[var_short_r], n);
//        int n2 = var_short_arr_a[var_short_r] - s2;
//        if (n > 0) {
//            if (n2 <= 0) {
//                var_int_r += n * s / 2;
//            } else {
//                n2 = Math.min(n2, n);
//                var_int_r += n2 * s;
//                if (n > n2) {
//                    var_int_r += (n - n2) * s / 2;
//                }
//            }
//        }
//        short s3 = var_short_r;
//        var_short_arr_a[s3] = (short) (var_short_arr_a[s3] - n);
//        var_int_v |= 8;
//        return (short) n;
//    }
//
//    private static final void al() {
//    }
//
//    private static final void m(Graphics graphics) {
//        if (var_boolean_k) {
//            C.P(graphics);
//            C.h(graphics);
//            C.Q(graphics);
//            graphics.setClip(0, 31, 176, 164);
//            graphics.drawImage(var_javax_microedition_lcdui_Image_e, 0, 30, 0);
//            C.b(graphics, var_int_arr_arr_a[var_byte_C][8], var_int_arr_arr_a[var_byte_C][9], 0, true);
//            if (var_int_t > 10000) {
//                C.b(graphics, var_int_arr_arr_a[var_byte_C][10], var_int_arr_arr_a[var_byte_C][11], var_int_arr_arr_a[var_byte_C][14], false);
//            }
//            if (F > 10000) {
//                C.b(graphics, var_int_arr_arr_a[var_byte_C][12], var_int_arr_arr_a[var_byte_C][13], var_int_arr_arr_a[var_byte_C][15], false);
//            }
//            var_boolean_k = false;
//        }
//    }
//
//    private static final void L() {
//        if (var_byte_q <= 0) {
//            C.void_a(0);
//            if (var_boolean_i && (var_int_arr_i[2 * var_byte_C] <= 0 || var_byte_D < var_int_arr_i[2 * var_byte_C] || var_byte_D == var_int_arr_i[2 * var_byte_C] && var_int_arr_i[2 * var_byte_C + 1] < var_int_r)) {
//                C.var_int_arr_i[2 * C.var_byte_C] = var_byte_D;
//                C.var_int_arr_i[2 * C.var_byte_C + 1] = var_int_r;
//                C.var_byte_arr_arr_a[C.var_byte_C] = var_byte_arr_e;
//                if (var_byte_C + 1 < 10) {
//                    C.var_int_arr_i[2 * (C.var_byte_C + 1)] = -1;
//                }
//                C.Q();
//            }
//            var_byte_arr_arr_i = C.byte_arr_arr_a(C.byte_arr_a(50), 163);
//            var_short_h = (short) 177;
//        } else {
//            C.void_a(2);
//            var_byte_arr_arr_i = C.byte_arr_arr_a(C.byte_arr_a(51 + var_byte_q - 1), 163);
//            var_short_h = (short) 178;
//        }
//    }
//
//    private static final void e(Graphics graphics) {
//        if (var_boolean_k) {
//            C.i(graphics);
//            if (var_byte_q <= 0) {
//                graphics.setColor(4159463);
//            } else {
//                graphics.setColor(1338481);
//            }
//            graphics.fillRect(0, 12, 176, 183);
//            C.a(graphics, var_short_h);
//            C.a(graphics, (short) 34, (short) 40);
//            int n = 104 - var_short_q / 2;
//            for (int i = 0; i < var_byte_arr_arr_i.length; ++i) {
//                C.a(graphics, var_byte_arr_arr_i[i], 3, 88, n, 1, var_int_arr_d);
//                n += var_byte_f;
//            }
//        }
//    }
//
//    private static final void b(Graphics graphics, int n, int n2, int n3, boolean bl) {
//        try {
//            int n4 = var_javax_microedition_lcdui_Image_b.getHeight();
//            graphics.setClip(n, n2 - n4, 17, n4);
//            graphics.drawImage(var_javax_microedition_lcdui_Image_b, -n3 * 17 + n, n2 - n4, 0);
//            if (bl) {
//                graphics.setClip(n - 1, n2 - n4, 19, n4);
//                graphics.drawImage(var_javax_microedition_lcdui_Image_b, -85 + n - 1, n2 - n4, 0);
//                int n5 = C.int_a(var_byte_arr_e, 3);
//                int n6 = n + 8 - n5 / 2;
//                if (n6 + n5 >= 174) {
//                    n6 = 176 - n5 - 3;
//                } else if (n6 < 1) {
//                    n6 = 2;
//                }
//                C.i(graphics);
//                C.a(graphics, var_byte_arr_e, 3, n6, n2 - var_javax_microedition_lcdui_Image_b.getHeight() - 1, 32, var_int_arr_e);
//            }
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//    }
//
//    private static final void aj() {
//        int n;
//        short[] sArray = new short[5];
//        short[] sArray2 = new short[5];
//        N = 0;
//        for (n = 0; n < var_byte_arr_h.length; ++n) {
//            if (var_byte_arr_h[n] >= 20) continue;
//            byte by = var_byte_arr_h[n];
//            sArray[by] = (short) (sArray[by] + var_byte_arr_k[n]);
//            byte by2 = var_byte_arr_h[n];
//            sArray2[by2] = (short) (sArray2[by2] + var_byte_arr_g[n]);
//            N += var_byte_arr_g[n] * var_byte_arr_g[n] * 37 + var_byte_arr_k[n] * var_byte_arr_k[n] * 43;
//        }
//        for (n = 0; n < 5; ++n) {
//            C.var_byte_arr_l[2 * n] = (byte) sArray[n];
//            C.var_byte_arr_l[2 * n + 1] = (byte) sArray2[n];
//        }
//    }
//
//    private static final void Q() {
//        C.void_a("PMSAVERESULTS3");
//        try {
//            var_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore((String) "PMSAVERESULTS3", (boolean) true);
//            try {
//                int n;
//                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1000);
//                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
//                for (n = 0; n < var_int_arr_i.length; ++n) {
//                    dataOutputStream.writeInt(var_int_arr_i[n]);
//                }
//                for (n = 0; n < var_byte_arr_arr_a.length; ++n) {
//                    dataOutputStream.writeByte(var_byte_arr_arr_a[n].length);
//                    ((OutputStream) dataOutputStream).write(var_byte_arr_arr_a[n]);
//                }
//                byte[] byArray = byteArrayOutputStream.toByteArray();
//                var_javax_microedition_rms_RecordStore_a.addRecord(byArray, 0, byArray.length);
//            } catch (Exception exception) {
//                exception.printStackTrace();
//            }
//            var_javax_microedition_rms_RecordStore_a.closeRecordStore();
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//    }
//
//    public static final void ar() {
//        if (C.boolean_a("PMSAVERESULTS3")) {
//            try {
//                var_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore((String) "PMSAVERESULTS3", (boolean) false);
//                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(var_javax_microedition_rms_RecordStore_a.getRecord(1));
//                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
//                try {
//                    int n;
//                    for (n = 0; n < var_int_arr_i.length; ++n) {
//                        C.var_int_arr_i[n] = dataInputStream.readInt();
//                    }
//                    for (n = 0; n < var_byte_arr_arr_a.length; ++n) {
//                        byte by = dataInputStream.readByte();
//                        C.var_byte_arr_arr_a[n] = new byte[by];
//                        dataInputStream.read(var_byte_arr_arr_a[n]);
//                    }
//                } catch (IOException iOException) {
//                    iOException.printStackTrace();
//                }
//                var_javax_microedition_rms_RecordStore_a.closeRecordStore();
//            } catch (Exception exception) {
//                exception.printStackTrace();
//            }
//        } else {
//            C.var_int_arr_i[0] = -1;
//        }
//    }
//
//    private static final void t() {
//        var_byte_arr_arr_i = C.byte_arr_arr_a(C.byte_arr_a(40 + var_byte_C), 172);
//        var_short_h = (short) 179;
//    }
//
//    private static final void S(Graphics graphics) {
//        if (var_boolean_k) {
//            C.i(graphics);
//            graphics.setColor(8626136);
//            graphics.fillRect(0, 12, 176, 183);
//            C.a(graphics, var_short_h);
//            C.a(graphics, (short) 34, (short) 33);
//            int n = 104 - var_short_q / 2;
//            for (int i = 0; i < var_byte_arr_arr_i.length; ++i) {
//                C.a(graphics, var_byte_arr_arr_i[i], 3, 88, n, 1, var_int_arr_d);
//                n += var_byte_f;
//            }
//        }
//    }
//
//    private static final void a(Graphics graphics, String string, short s, int n) {
//        C.a(graphics, (int) s, 3, 88, n, 1, var_int_arr_e);
//        C.a(graphics, C.byte_arr_a(string), 3, 88, n + var_byte_f, 1, var_int_arr_e);
//    }
//
//    private static final void a(Graphics graphics, byte[] byArray, int n, int n2, int[] nArray) {
//        int[] nArray2 = new int[]{nArray[0], nArray[1], nArray[2], nArray[3] + 3};
//        if (byArray.length > 0) {
//            if (byArray[0] == 125) {
//                if (byArray[1] == 0) {
//                    C.a(graphics, (int) byArray[2], n, n2, 1, nArray2);
//                } else {
//                    int n3 = byArray[1] * 10 + byArray[2];
//                    if (n3 >= 1008 && n3 <= 1018) {
//                        C.a(graphics, nArray2);
//                        graphics.setColor(-1);
//                        graphics.fillRect(n - 8, n2, 16, 14);
//                    }
//                    C.c(graphics, n3, n, n2, 1, nArray2);
//                }
//            } else {
//                C.a(graphics, byArray, 3, n, n2, 1, nArray);
//            }
//        }
//    }
//
//    private static final void y() {
//        var_short_l = var_int_k == 60 ? (short) 5 : (short) 0;
//        var_boolean_u = true;
//        var_short_h = (short) 229;
//    }
//
//    private static final void aw() {
//        if (var_boolean_u) {
//            var_short_f = (short) 14;
//            int n = var_short_l < 5 ? (K == 1 && var_short_l == 0 ? 58 : 0 + var_short_l) : (K == 1 && var_short_l == 6 ? 59 : (K == 1 && var_short_l == 8 ? 60 : (K == 1 && var_short_l == 9 ? 61 : 0 + var_short_l + 1)));
//            var_byte_arr_arr_i = C.byte_arr_arr_a(C.byte_arr_a(n), 163);
//            var_short_j = var_short_s;
//            var_short_m = 0;
//            var_boolean_u = false;
//        }
//        C.X();
//    }
//
//    private static final void x(Graphics graphics) {
//        if (var_byte_D == 0 && G == 0) {
//            C.a(graphics, var_byte_arr_arr_i, (short) 34, (short) 35);
//        } else {
//            C.a(graphics, var_byte_arr_arr_i, (short) 34, (short) 33);
//        }
//        C.v(graphics);
//    }
//
//    public static final int int_b(int n) {
//        int n2 = 0;
//        for (int i = 0; i < 20; ++i) {
//            if (var_byte_arr_h[i] != n) continue;
//            ++n2;
//        }
//        return n2;
//    }
//
//    public static final int int_a(int n) {
//        int n2 = -1;
//        for (int i = 0; i < 20; ++i) {
//            if (var_byte_arr_h[i] >= 20 || var_byte_arr_h[i] != n) continue;
//            n2 = i;
//        }
//        return n2;
//    }
//
//    public static final void void_a() {
//        var_byte_e = G < 3000 ? (byte) 0 : (G <= 4200 || G >= 12600 ? (byte) 3 : (G <= 5400 || G >= 11400 ? (byte) 9 : (byte) (10 + var_byte_C / 3)));
//    }
//
//    private static final void a(Graphics graphics, short s, String string, int n, int n2) {
//        C.a(graphics, (int) s, 3, n, n2, 0, var_int_arr_e);
//        C.a(graphics, C.byte_arr_a(string), 3, 176 - n, n2, 8, var_int_arr_e);
//    }
//
//    public static final void au() {
//        if (C.boolean_a("PMSAVESETTING")) {
//            try {
//                var_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore((String) "PMSAVESETTING", (boolean) false);
//                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(var_javax_microedition_rms_RecordStore_a.getRecord(1));
//                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
//                try {
//                    var_byte_v = dataInputStream.readByte();
//                    var_boolean_s = dataInputStream.readBoolean();
//                    var_boolean_t = dataInputStream.readBoolean();
//                } catch (IOException iOException) {
//                    iOException.printStackTrace();
//                }
//                var_javax_microedition_rms_RecordStore_a.closeRecordStore();
//            } catch (Exception exception) {
//                exception.printStackTrace();
//            }
//        }
//    }
//
//    private static final void ag() {
//        C.void_a("PMSAVESETTING");
//        try {
//            var_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore((String) "PMSAVESETTING", (boolean) true);
//            try {
//                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1000);
//                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
//                dataOutputStream.writeByte(var_byte_v);
//                dataOutputStream.writeBoolean(var_boolean_s);
//                dataOutputStream.writeBoolean(var_boolean_t);
//                byte[] byArray = byteArrayOutputStream.toByteArray();
//                var_javax_microedition_rms_RecordStore_a.addRecord(byArray, 0, byArray.length);
//            } catch (Exception exception) {
//                exception.printStackTrace();
//            }
//            var_javax_microedition_rms_RecordStore_a.closeRecordStore();
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//    }
//
//    private static final void a(Graphics graphics, int n, int n2, int n3, boolean bl) {
//        int n4;
//        C.i(graphics);
//        int n5 = var_byte_f + 2;
//        int n6 = -1;
//        if (bl) {
//            n4 = 2697632;
//            n6 = 0;
//        } else {
//            n4 = 5789879;
//        }
//        graphics.setColor(n4);
//        graphics.fillRect(8, n3, 161, n5 - 1);
//        if (bl) {
//            graphics.setColor(n6);
//            graphics.drawRect(7, n3, 161, n5 - 1);
//        }
//        C.a(graphics, n, 3, 8, n3, 4, var_int_arr_e);
//        C.a(graphics, n2, 3, 168, n3, 8, var_int_arr_e);
//    }
//
//    public static final void void_a(int n) {
//        if (var_boolean_s) {
//            switch (n) {
//                case 0: {
//                    var_sound_complited_mission.a();
//                    break;
//                }
//                case 1: {
//                    var_sound_lost_mision.a();
//                    break;
//                }
//                case 2: {
//                    var_sound_upgrade_floor.a();
//                    break;
//                }
//                case 3: {
//                    var_sound_start_mission.a();
//                    break;
//                }
//                case 4: {
//                    var_sound_select.a();
//                }
//            }
//        }
//    }
//
//    public final void run() {
//        Thread.currentThread().setPriority(1);
//        C.Y();
//    }
//
//    public static final void F() {
//        G = 0;
//        var_short_i = 0;
//        var_java_util_Vector_d = new Vector();
//        var_java_util_Vector_g = new Vector();
//        var_java_util_Vector_e = new Vector();
//        var_java_util_Vector_c = new Vector();
//        var_byte_arr_l = new byte[10];
//        var_boolean_arr_arr_a = new boolean[var_byte_arr_arr_c.length][3];
//        var_boolean_arr_arr_b = new boolean[var_byte_arr_arr_c.length][3];
//        var_boolean_arr_a = new boolean[3];
//        var_boolean_arr_k = new boolean[11];
//        var_boolean_arr_d = new boolean[5];
//        var_byte_arr_arr_b = new byte[15][0];
//        for (int i = 0; i < 5; ++i) {
//            C.var_boolean_arr_d[i] = true;
//        }
//        var_byte_A = 0;
//        var_boolean_p = false;
//    }
//
//    public static final void A() {
//        var_byte_arr_l = null;
//        var_java_util_Vector_d = null;
//        var_java_util_Vector_g = null;
//        var_java_util_Vector_e = null;
//        var_java_util_Vector_c = null;
//        var_boolean_arr_arr_a = null;
//        var_boolean_arr_arr_b = null;
//        var_boolean_arr_a = null;
//        var_boolean_arr_k = null;
//        var_boolean_arr_d = null;
//        var_byte_arr_arr_b = null;
//    }
//
//    public static final void N(Graphics graphics) {
//        C.a(graphics, var_int_arr_n);
//        graphics.setColor(7242419);
//        graphics.fillRect(0, 30, 158, 165);
//        C.b(graphics, 6, 0, 30, 0, var_int_arr_n);
//        if (var_boolean_arr_g[4]) {
//            C.b(graphics, 35, 5, 192, 32, var_int_arr_n);
//            C.b(graphics, 35, 153, 192, 40, var_int_arr_n);
//        }
//        if (var_boolean_arr_g[6]) {
//            for (int i = 0; i < var_byte_arr_arr_c.length; ++i) {
//                byte by = var_byte_arr_arr_c[i][0];
//                byte by2 = var_byte_arr_arr_c[i][1];
//                C.b(graphics, 7, 96 + (by - by2) * 18, 62 + (by + by2) * 9, 1, var_int_arr_n);
//            }
//        }
//        if (var_boolean_arr_g[3]) {
//            C.a(graphics, 17, 116, 74, 40, var_int_arr_n);
//        }
//        C.I(graphics);
//    }
//
//    public static final void U(Graphics graphics) {
//        int n;
//        int n2;
//        int n3;
//        C.i(graphics);
//        if (var_java_util_Vector_e.size() > 0) {
//            for (n3 = 0; n3 < var_java_util_Vector_e.size(); ++n3) {
//                short[] sArray = (short[]) var_java_util_Vector_e.elementAt(n3);
//                n2 = 96 + (sArray[0] - sArray[1]) * 18;
//                n = 62 + (sArray[0] + sArray[1] + 1) * 9;
//                C.c(graphics, 1043 + sArray[2], n2, n, 3, var_int_arr_n);
//            }
//        }
//        if ((n3 = var_java_util_Vector_g.size()) > 0) {
//            n2 = (--n3 + 1) / 2;
//            do {
//                n = n2;
//                do {
//                    int n4 = n - n2;
//                    boolean bl = true;
//                    do {
//                        if (((short[]) var_java_util_Vector_g.elementAt(n4))[1] <= ((short[]) var_java_util_Vector_g.elementAt(n4 + n2))[1]) {
//                            bl = false;
//                            continue;
//                        }
//                        short[] sArray = (short[]) var_java_util_Vector_g.elementAt(n4);
//                        short[] sArray2 = (short[]) var_java_util_Vector_g.elementAt(n4 + n2);
//                        var_java_util_Vector_g.removeElementAt(n4 + n2);
//                        var_java_util_Vector_g.removeElementAt(n4);
//                        var_java_util_Vector_g.insertElementAt(sArray2, n4);
//                        var_java_util_Vector_g.insertElementAt(sArray, n4 + n2);
//                    } while (--n4 >= 0 && bl);
//                } while (++n <= n3);
//            } while ((n2 /= 2) > 0);
//        }
//        C.J(graphics);
//    }
//
//    private static final void J(Graphics graphics) {
//        C.a(graphics, var_int_arr_n);
//        for (int i = 0; i < var_java_util_Vector_g.size(); ++i) {
//            int n;
//            short[] sArray = (short[]) var_java_util_Vector_g.elementAt(i);
//            short s = sArray[7];
//            if (s == 11) {
//                C.c(graphics, sArray);
//                continue;
//            }
//            if (s == 12) {
//                C.b(graphics, sArray);
//                continue;
//            }
//            if (s == 13) {
//                C.d(graphics, sArray);
//                continue;
//            }
//            if (s == 14) {
//                C.a(graphics, sArray);
//                continue;
//            }
//            C.c(graphics, sArray[21] + sArray[2] * 4 + sArray[10], sArray[0], sArray[1], 33, var_int_arr_n);
//            short s2 = sArray[20];
//            if (s2 <= 0 || s2 == 20 || s2 == 30) continue;
//            if (s2 >= 100) {
//                n = sArray[1] - 20 - (s2 - 100) / 3;
//                C.b(graphics, 29, sArray[0], n, 33, var_int_arr_n);
//                continue;
//            }
//            n = sArray[1] - 20;
//            C.c(graphics, 1000 + s2 - 1, sArray[0], n, 33, var_int_arr_n);
//        }
//    }
//
//    public static final void void_a(short s) {
//        if (var_java_util_Vector_g.size() < var_byte_g) {
//            int n;
//            int n2;
//            short[] sArray = new short[22];
//            sArray[21] = s;
//            sArray[11] = 0;
//            sArray[12] = 9;
//            int n3 = 0;
//            int n4 = 100;
//            int n5 = var_java_util_Vector_e.size() - 4;
//            int n6 = n5 = n5 > 0 ? n5 * n5 : 0;
//            if (n5 > 0 && C.int_b(1, 100) <= n5) {
//                do {
//                    n = C.int_b(0, 1);
//                } while ((n2 = C.int_b(5, 6)) == 6 && n == 0);
//                sArray[20] = 30;
//            } else if (C.int_b(1, 100) > 20) {
//                if (!var_boolean_arr_g[6]) {
//                    do {
//                        n = C.int_b(0, 1);
//                    } while ((n2 = C.int_b(5, 6)) == 6 && n == 0);
//                    sArray[20] = 20;
//                } else {
//                    while (var_boolean_arr_arr_a[n4 = C.int_b(0, var_byte_arr_arr_c.length - 1)][0] && var_boolean_arr_arr_a[n4][1] && var_boolean_arr_arr_a[n4][2]) {
//                    }
//                    while (var_boolean_arr_arr_a[n4][n3 = C.int_b(0, 2)]) {
//                    }
//                    C.var_boolean_arr_arr_a[n4][n3] = true;
//                    if (n3 == 0) {
//                        n = var_byte_arr_arr_c[n4][0] - 1;
//                        n2 = var_byte_arr_arr_c[n4][1];
//                    } else if (n3 == 1) {
//                        n = var_byte_arr_arr_c[n4][0];
//                        n2 = var_byte_arr_arr_c[n4][1] + 1;
//                    } else {
//                        n = var_byte_arr_arr_c[n4][0] + 1;
//                        n2 = var_byte_arr_arr_c[n4][1];
//                    }
//                }
//            } else {
//                n2 = C.int_b();
//                if (n2 == -1) {
//                    n = 0;
//                    n2 = C.int_b(0, 5);
//                    sArray[20] = 20;
//                } else {
//                    n3 = 2;
//                    n4 += n2 + 1;
//                    C.var_boolean_arr_d[n2] = false;
//                    n = 0;
//                }
//            }
//            if (n4 < var_byte_arr_arr_c.length) {
//                ++n4;
//            }
//            sArray[19] = (short) n4;
//            sArray[15] = (short) n;
//            sArray[16] = (short) n2;
//            sArray[8] = (short) n3;
//            sArray[0] = -12;
//            sArray[1] = 116;
//            sArray[4] = sArray[0];
//            sArray[5] = sArray[1];
//            short s2 = 0;
//            for (short s3 = 0; s3 < var_byte_g; s3 = (short) (s3 + 1)) {
//                if (var_boolean_arr_k[s3]) continue;
//                C.var_boolean_arr_k[s3] = true;
//                s2 = s3;
//                break;
//            }
//            sArray[7] = s2;
//            sArray[17] = 0;
//            sArray[18] = 6;
//            var_java_util_Vector_g.addElement(sArray);
//        }
//    }
//
//    public static final void n() {
//        int n = 0;
//        int n2 = var_java_util_Vector_g.size();
//        while (n < n2) {
//            int n3;
//            short[] sArray = (short[]) var_java_util_Vector_g.elementAt(n);
//            short s = sArray[7];
//            int n4 = 0;
//            if (s == 11) {
//                n4 = C.int_a(sArray);
//                if (n4 == 2 && G < 12150 && C.int_b(1) > 0 && (n3 = C.int_a(1)) >= 0) {
//                    var_java_util_Vector_g.addElement(C.d((short) (sArray[n3] + 1110)));
//                    ++n2;
//                }
//            } else if (s == 12) {
//                n4 = C.int_c(sArray);
//                if (n4 == 2 && G < 12150 && C.int_b(0) > 0 && (n3 = C.int_a(0)) >= 0) {
//                    var_java_util_Vector_g.addElement(C.c((short) (sArray[21] + 1110)));
//                    ++n2;
//                }
//            } else if (s == 13) {
//                n4 = C.int_d(sArray);
//                if (n4 == 2 && G < 12150 && C.int_b(3) > 0 && (n3 = C.int_a(3)) >= 0) {
//                    var_java_util_Vector_g.addElement(C.short_arr_a((short) (sArray[21] + 1110)));
//                    ++n2;
//                }
//            } else if (s == 14 && (n4 = C.int_b(sArray)) == 2 && G < 12150 && C.int_b(4) > 0 && (n3 = C.int_a(4)) >= 0) {
//                var_java_util_Vector_g.addElement(C.b((short) (sArray[21] + 1110)));
//                ++n2;
//            }
//            if (n4 > 0) {
//                if (n4 == 1) {
//                    ++n;
//                    continue;
//                }
//                var_java_util_Vector_g.removeElementAt(n);
//                --n2;
//                if (!var_boolean_l || G < 12150 || C.boolean_a(11) || C.boolean_a(12) || C.boolean_a(13)) continue;
//                var_boolean_l = false;
//                if (!var_boolean_c) continue;
//                C.t(var_javax_microedition_lcdui_Graphics_a);
//                continue;
//            }
//            if (sArray[20] >= 100) {
//                sArray[20] = (short) (sArray[20] + 1);
//                if (sArray[20] > 125) {
//                    sArray[20] = 0;
//                }
//            }
//            if (sArray[6] > 0) {
//                sArray[6] = (short) (sArray[6] - 1);
//            }
//            if (sArray[3] == 0) {
//                C.var_byte_arr_arr_b[s] = C.a((byte) sArray[17], (byte) sArray[18], (int) sArray[15], (int) sArray[16], sArray);
//                sArray[3] = 1;
//            }
//            if (sArray[3] >= 2 && sArray[3] <= 5) {
//                if (sArray[0] == sArray[4] && sArray[1] == sArray[5]) {
//                    sArray[3] = 1;
//                    sArray[9] = (short) (sArray[9] + 2);
//                    if (sArray[9] < var_byte_arr_arr_b[s].length && sArray[20] != 7 && sArray[20] != 30 && (n3 = C.int_a()) >= 0) {
//                        var_java_util_Vector_e.addElement(new short[]{var_byte_arr_arr_b[s][sArray[9]], var_byte_arr_arr_b[s][sArray[9] + 1], (short) n3});
//                    }
//                } else {
//                    sArray[2] = (short) (sArray[2] + 1);
//                    if (sArray[2] > 2) {
//                        sArray[2] = 1;
//                    }
//                }
//            }
//            if (sArray[3] == 1) {
//                C.void_a(sArray);
//            }
//            if (sArray[3] == 111) {
//                n3 = 0;
//                int n5 = var_byte_w + var_byte_y + var_byte_v;
//                switch (sArray[20]) {
//                    case 1: {
//                        n3 += 61;
//                        break;
//                    }
//                    case 2: {
//                        n3 -= 10 * n5;
//                        break;
//                    }
//                    case 3: {
//                        n3 -= 3 * n5;
//                        break;
//                    }
//                    case 4: {
//                        n3 -= 5 * n5;
//                        break;
//                    }
//                    case 5: {
//                        n3 -= 60 * n5;
//                        break;
//                    }
//                    case 6: {
//                        n3 -= 80 * n5;
//                        break;
//                    }
//                    case 7: {
//                        n3 -= 50 * n5;
//                        break;
//                    }
//                    case 8: {
//                        n3 -= 15 * n5;
//                    }
//                }
//                if (var_int_t > 0 || F > 0) {
//                    int n6;
//                    n3 = (n3 * var_byte_c + 1) / 2;
//                    var_int_o += n3;
//                    if (var_int_t > 0 && F <= 0) {
//                        var_int_t -= n3;
//                    } else if (F > 0 && var_int_t <= 0) {
//                        F -= n3;
//                    } else if (C.int_b(1, 2) == 1) {
//                        var_int_t -= n3;
//                    } else {
//                        F -= n3;
//                    }
//                    if (var_int_o < 10000) {
//                        var_int_d = 12;
//                        var_byte_q = (byte) 3;
//                    }
//                    if (var_int_t > 0 && var_int_t < 10000) {
//                        if (F <= 0) {
//                            var_int_t = 0;
//                            var_int_o = 100000;
//                        } else {
//                            n6 = 0;
//                            n6 = var_int_t / 2;
//                            F += var_int_t - n6;
//                            var_int_t = 0;
//                            var_int_o += n6;
//                        }
//                    } else if (F > 0 && F < 10000) {
//                        if (var_int_t <= 0) {
//                            F = 0;
//                            var_int_o = 100000;
//                        } else {
//                            n6 = 0;
//                            n6 = F / 2;
//                            var_int_t += F - n6;
//                            F = 0;
//                            var_int_o += n6;
//                        }
//                    }
//                }
//                C.a((int) sArray[21], 100, (int) sArray[20]);
//                var_java_util_Vector_g.removeElementAt(n);
//                C.var_boolean_arr_k[s] = false;
//                --n2;
//                continue;
//            }
//            ++n;
//            if (sArray[3] == 3) {
//                C.void_d(sArray);
//                C.void_b(sArray);
//            } else if (sArray[3] == 4) {
//                C.void_d(sArray);
//                C.e(sArray);
//            } else if (sArray[3] == 2) {
//                C.void_c(sArray);
//                C.e(sArray);
//            } else if (sArray[3] == 5) {
//                C.void_c(sArray);
//                C.void_b(sArray);
//            }
//            if (sArray[3] >= 10 && sArray[3] <= 15 && sArray[6] <= 0) {
//                if (sArray[3] == 10) {
//                    sArray[20] = 1;
//                } else if (sArray[3] == 12) {
//                    sArray[20] = 4;
//                } else if (sArray[3] == 11) {
//                    sArray[20] = 3;
//                } else if (sArray[3] == 13) {
//                    sArray[20] = 2;
//                } else if (sArray[3] == 15) {
//                    sArray[20] = 5;
//                } else if (sArray[3] == 14) {
//                    sArray[20] = 6;
//                }
//                C.var_boolean_arr_arr_b[sArray[19] - 1][sArray[8]] = false;
//                C.var_boolean_arr_arr_a[sArray[19] - 1][sArray[8]] = false;
//                sArray[19] = 0;
//                sArray[3] = 1;
//                C.var_byte_arr_arr_b[s] = C.a((byte) sArray[15], (byte) sArray[16], 0, 6, sArray);
//                sArray[11] = (short) (sArray[0] - (96 + (var_byte_arr_arr_b[s][0] - var_byte_arr_arr_b[s][1]) * 18));
//                sArray[12] = (short) (sArray[1] - (62 + (var_byte_arr_arr_b[s][1] + var_byte_arr_arr_b[s][0]) * 9));
//            }
//            if (sArray[3] != 9 || sArray[6] > 0) continue;
//            if (sArray[20] == 30) {
//                sArray[20] = 7;
//            } else if (sArray[20] == 20) {
//                sArray[20] = 8;
//            } else if (sArray[19] > 100) {
//                C.var_boolean_arr_d[sArray[19] - 101] = true;
//                sArray[20] = 0;
//            } else {
//                sArray[20] = 8;
//                C.var_boolean_arr_arr_b[sArray[19] - 1][sArray[8]] = false;
//                C.var_boolean_arr_arr_a[sArray[19] - 1][sArray[8]] = false;
//                sArray[19] = 0;
//            }
//            sArray[3] = 1;
//            C.var_byte_arr_arr_b[s] = C.a((byte) sArray[15], (byte) sArray[16], 0, 6, sArray);
//            sArray[11] = (short) (sArray[0] - (96 + (var_byte_arr_arr_b[s][0] - var_byte_arr_arr_b[s][1]) * 18));
//            sArray[12] = (short) (sArray[1] - (62 + (var_byte_arr_arr_b[s][1] + var_byte_arr_arr_b[s][0]) * 9));
//        }
//    }
//
//    private static final void void_a(short[] sArray) {
//        short s = sArray[9];
//        short s2 = sArray[7];
//        if (sArray[9] == var_byte_arr_arr_b[s2].length) {
//            if (sArray[8] == 14) {
//                sArray[3] = 21;
//            } else if (s2 < 11) {
//                sArray[3] = 9;
//                if (sArray[20] == 30) {
//                    sArray[6] = 2;
//                } else if (sArray[19] > 100) {
//                    sArray[6] = 20;
//                    sArray[20] = 100;
//                    var_int_r += var_byte_c * var_byte_b * C.int_b(1, 3) * var_short_arr_e[sArray[19] - 101] / 5000;
//                    var_int_C += var_byte_c * var_byte_b * C.int_b(1, 3) * var_short_arr_e[sArray[19] - 101] / 5000;
//                } else if (sArray[20] == 20) {
//                    sArray[6] = 20;
//                } else {
//                    sArray[6] = 300;
//                    C.var_boolean_arr_arr_b[sArray[19] - 1][sArray[8]] = true;
//                }
//            }
//        } else if (sArray[9] + 2 == var_byte_arr_arr_b[s2].length) {
//            if (sArray[15] == 0 && sArray[16] == 6) {
//                sArray[3] = 111;
//                return;
//            }
//            if (s2 < 11 || sArray[20] == 9991) {
//                int n = 0;
//                int n2 = 0;
//                sArray[13] = sArray[0];
//                sArray[14] = sArray[1];
//                if (sArray[20] == 9991) {
//                    n = 9;
//                    n2 = 4;
//                    sArray[3] = 4;
//                    sArray[10] = 3;
//                } else if (sArray[8] == 0) {
//                    n = 5;
//                    n2 = 15;
//                    sArray[3] = 3;
//                    sArray[10] = 2;
//                } else if (sArray[8] == 1) {
//                    n = 9;
//                    n2 = 9;
//                    sArray[3] = 4;
//                    sArray[10] = 3;
//                } else if (sArray[8] == 2) {
//                    n = -9;
//                    n2 = 9;
//                    sArray[3] = 2;
//                    sArray[10] = 0;
//                }
//                sArray[4] = (short) (96 + (var_byte_arr_arr_b[s2][s] - var_byte_arr_arr_b[s2][s + 1]) * 18 + n);
//                sArray[5] = (short) (62 + (var_byte_arr_arr_b[s2][s + 1] + var_byte_arr_arr_b[s2][s]) * 9 + n2);
//            } else if (s2 < 12) {
//                if (sArray[8] > 0) {
//                    sArray[10] = sArray[8] == 22 ? (short) 3 : (short) 1;
//                }
//                if (sArray[8] == 20) {
//                    short s3 = sArray[19];
//                    boolean bl = false;
//                    for (int i = 0; i < 3; ++i) {
//                        if (!var_boolean_arr_arr_b[s3][i]) continue;
//                        for (int j = 0; j < var_java_util_Vector_g.size(); ++j) {
//                            short[] sArray2 = (short[]) var_java_util_Vector_g.elementAt(j);
//                            if (sArray2[7] >= 11 || sArray2[19] - 1 != s3 || sArray2[3] != 9) continue;
//                            int n = var_byte_arr_arr_f[var_byte_C].length;
//                            byte by = var_byte_arr_arr_f[var_byte_C][C.int_b(0, n - 1)];
//                            if (var_short_arr_n[by] <= 0) {
//                                sArray2[6] = 1;
//                                sArray2[3] = 9;
//                                continue;
//                            }
//                            int n3 = 180 - 20 * (var_short_arr_s[by] * var_short_arr_s[by]) / (var_short_arr_o[by] * var_short_arr_o[by]);
//                            if (n3 >= 99 || C.int_b(1, 100) < n3) {
//                                sArray2[6] = 150;
//                                bl = true;
//                                C.var_boolean_arr_a[i] = true;
//                                continue;
//                            }
//                            sArray2[6] = 1;
//                            sArray2[3] = 13;
//                        }
//                    }
//                    if (!bl) {
//                        sArray[3] = 21;
//                    }
//                } else if (sArray[8] == 23) {
//                    short s4 = sArray[19];
//                    for (int i = 0; i < var_java_util_Vector_g.size(); ++i) {
//                        byte by;
//                        short[] sArray3 = (short[]) var_java_util_Vector_g.elementAt(i);
//                        short s5 = sArray3[8];
//                        int n = sArray3[19] - 1;
//                        if (sArray3[7] >= 11 || n != s4 || s5 >= 3 || !var_boolean_arr_a[s5] || sArray3[20] != 0)
//                            continue;
//                        C.var_boolean_arr_a[s5] = false;
//                        C.var_boolean_arr_arr_b[n][s5] = false;
//                        int n4 = 0;
//                        int n5 = var_byte_arr_arr_f[var_byte_C].length;
//                        while ((n4 = C.int_b(0, n5 + 1)) == 0 || n4 == n5 + 1) {
//                        }
//                        if (var_short_arr_n[by = var_byte_arr_arr_f[var_byte_C][--n4]] > 0) {
//                            int n6;
//                            int n7;
//                            int n8 = var_byte_c * C.int_b(1, (var_byte_arr_l[2] + var_byte_arr_l[3]) / 2);
//                            if (n8 > var_short_arr_n[by]) {
//                                n8 = var_short_arr_n[by];
//                            }
//                            byte by2 = by;
//                            var_short_arr_n[by2] = (short) (var_short_arr_n[by2] - n8);
//                            var_int_r += var_byte_b * n8 * var_short_arr_s[by] / 100;
//                            var_int_x += var_byte_b * n8 * var_short_arr_s[by] / 100;
//                            boolean bl = true;
//                            boolean bl2 = false;
//                            int n9 = 0;
//                            while (C.int_b(1, 100) <= 80) {
//                                n4 = 0;
//                                n5 = var_byte_arr_arr_g[var_byte_C].length;
//                                while (n9 == (n4 = C.int_b(0, n5 + 1)) || n4 == 0 || n4 == n5 + 1) {
//                                }
//                                n9 = n4--;
//                                n7 = var_byte_arr_arr_g[var_byte_C][n4];
//                                if (var_short_arr_k[n7] > 0) {
//                                    n6 = 200 - 20 * (var_short_arr_d[n7] * var_short_arr_d[n7]) / (var_short_arr_g[n7] * var_short_arr_g[n7]);
//                                    if (C.int_b(1, 100) > n6) break;
//                                    n8 = var_byte_c * C.int_b(1, (var_byte_arr_l[2] + var_byte_arr_l[3]) / 4);
//                                    if (n8 >= var_short_arr_k[n7]) {
//                                        n8 = var_short_arr_k[n7];
//                                        C.var_boolean_arr_f[3] = true;
//                                    }
//                                    int n10 = n7;
//                                    var_short_arr_k[n10] = (short) (var_short_arr_k[n10] - n8);
//                                    var_int_r += var_byte_b * n8 * var_short_arr_d[n7] / 100;
//                                    var_int_i += var_byte_b * n8 * var_short_arr_d[n7] / 100;
//                                    if (!var_boolean_arr_i[n7]) continue;
//                                    bl2 = true;
//                                    continue;
//                                }
//                                if (var_short_arr_d[n7] > 0) {
//                                    if (var_byte_v == 0 && !var_boolean_arr_f[3]) {
//                                        var_int_v |= 1;
//                                        var_byte_p = 0;
//                                    }
//                                    C.var_boolean_arr_f[3] = true;
//                                }
//                                bl = false;
//                                break;
//                            }
//                            if ((n7 = C.int_b(0)) > 0 && C.int_b(1, 100) <= 5 - var_byte_arr_l[0] / n7) {
//                                sArray3[3] = 14;
//                            } else {
//                                sArray3[3] = bl ? (short) 10 : (short) 11;
//                                n6 = C.int_b(4);
//                                int n11 = 0;
//                                if (n6 > 0) {
//                                    n11 = 25 - 3 * (var_byte_arr_l[8] + var_byte_arr_l[9]) / C.int_b(4);
//                                }
//                                if (bl2 && C.int_b(1, 100) <= n11) {
//                                    sArray3[3] = 15;
//                                }
//                            }
//                            sArray3[6] = (short) C.int_b(40, 100);
//                            sArray3[20] = 100;
//                            continue;
//                        }
//                        sArray3[3] = 12;
//                        sArray3[6] = 1;
//                    }
//                    sArray[3] = 21;
//                }
//            }
//        } else {
//            if (var_byte_arr_arr_b[s2][s] - var_byte_arr_arr_b[s2][s + 2] < 0) {
//                sArray[3] = 3;
//                sArray[10] = 2;
//            } else if (var_byte_arr_arr_b[s2][s] - var_byte_arr_arr_b[s2][s + 2] > 0) {
//                sArray[3] = 2;
//                sArray[10] = 0;
//            } else if (var_byte_arr_arr_b[s2][s + 1] - var_byte_arr_arr_b[s2][s + 3] > 0) {
//                sArray[3] = 4;
//                sArray[10] = 3;
//            } else {
//                sArray[3] = 5;
//                sArray[10] = 1;
//            }
//            sArray[4] = (short) (96 + (var_byte_arr_arr_b[s2][s + 2] - var_byte_arr_arr_b[s2][s + 3]) * 18 + sArray[11]);
//            sArray[5] = (short) (62 + (var_byte_arr_arr_b[s2][s + 3] + var_byte_arr_arr_b[s2][s + 2]) * 9 + sArray[12]);
//            sArray[13] = sArray[0];
//            sArray[14] = sArray[1];
//        }
//    }
//
//    public static final int int_a(short[] sArray) {
//        int n;
//        int n2;
//        short s = sArray[7];
//        if (sArray[6] > 0) {
//            sArray[6] = (short) (sArray[6] - 1);
//        }
//        if (sArray[3] == 0) {
//            C.var_byte_arr_arr_b[s] = C.a((byte) sArray[17], (byte) sArray[18], 0, 0, sArray);
//            sArray[3] = 1;
//        }
//        if (sArray[3] == 9) {
//            if (sArray[8] >= 20 && sArray[8] <= 23) {
//                if (sArray[6] <= 0) {
//                    n2 = 0;
//                    n = 0;
//                    int n3 = 0;
//                    short s2 = 0;
//                    int n4 = 0;
//                    if (sArray[8] == 20) {
//                        n4 = 22;
//                        n2 = sArray[15];
//                        n = sArray[16];
//                        n3 = 2;
//                        s2 = 0;
//                    } else if (sArray[8] == 22) {
//                        n4 = 23;
//                        n2 = 2;
//                        n = 0;
//                        n3 = sArray[17];
//                        s2 = sArray[18];
//                    }
//                    if (sArray[8] == 23) {
//                        sArray[3] = 21;
//                    } else {
//                        C.var_byte_arr_arr_b[s] = C.a((byte) n2, (byte) n, n3, (int) s2, sArray);
//                        sArray[8] = (short) n4;
//                        sArray[3] = 1;
//                    }
//                }
//            } else if (sArray[6] <= 0) {
//                sArray[3] = 5;
//                sArray[10] = 1;
//                sArray[8] = sArray[8] == 15 ? (short) 16 : (short) 12;
//                sArray[9] = 0;
//                sArray[11] = -6;
//                sArray[12] = 13;
//                sArray[4] = (short) (96 + sArray[11]);
//                sArray[5] = (short) (62 + sArray[12]);
//            }
//        }
//        if (sArray[3] == 21) {
//            if (sArray[20] == 9990) {
//                C.var_byte_arr_arr_b[s] = C.a((byte) sArray[15], (byte) sArray[16], 0, 0, sArray);
//                sArray[3] = 1;
//                sArray[20] = 9991;
//            } else {
//                if (sArray[15] != 2 || sArray[16] != 0) {
//                    for (n2 = 0; n2 < 3; ++n2) {
//                        if (!var_boolean_arr_arr_b[sArray[19]][n2]) continue;
//                        sArray[3] = 1;
//                        sArray[8] = 20;
//                        C.void_a(sArray);
//                        return 1;
//                    }
//                }
//                for (n2 = 0; n2 < var_boolean_arr_arr_a.length; ++n2) {
//                    for (n = 0; n < 3; ++n) {
//                        if (!var_boolean_arr_arr_b[n2][n]) continue;
//                        sArray[3] = 1;
//                        sArray[19] = (short) n2;
//                        if (sArray[15] != var_byte_arr_arr_c[n2][0] || sArray[16] != var_byte_arr_arr_c[n2][1] - 1) {
//                            C.var_byte_arr_arr_b[s] = C.a((byte) sArray[15], (byte) sArray[16], (int) var_byte_arr_arr_c[n2][0], var_byte_arr_arr_c[n2][1] - 1, sArray);
//                        }
//                        sArray[8] = 20;
//                        return 1;
//                    }
//                }
//                if (sArray[15] != 2 || sArray[16] != 0) {
//                    sArray[3] = 1;
//                    C.var_byte_arr_arr_b[s] = C.a((byte) sArray[15], (byte) sArray[16], 2, 0, sArray);
//                }
//            }
//        }
//        if (sArray[9] + 2 == var_byte_arr_arr_b[s].length) {
//            if (sArray[20] == 9991) {
//                sArray[8] = 15;
//                sArray[6] = 50;
//                sArray[3] = 9;
//                sArray[20] = 0;
//            } else {
//                if (sArray[8] == 17) {
//                    C.a((int) sArray[21], 100, 0);
//                    return 2;
//                }
//                if (sArray[8] == 13) {
//                    sArray[3] = 21;
//                } else if (sArray[3] == 1) {
//                    if (sArray[8] == 0) {
//                        sArray[8] = 11;
//                        sArray[6] = 50;
//                        sArray[3] = 9;
//                    } else if (sArray[8] != 24) {
//                        sArray[6] = 1;
//                        sArray[3] = 9;
//                    }
//                }
//            }
//        }
//        if (sArray[3] >= 2 && sArray[3] <= 5) {
//            if (sArray[0] == sArray[4] && sArray[1] == sArray[5]) {
//                sArray[3] = 1;
//                sArray[9] = (short) (sArray[9] + 2);
//                if (sArray[8] == 12) {
//                    C.var_byte_arr_arr_b[s] = C.a((byte) sArray[15], (byte) sArray[16], 2, 0, sArray);
//                    sArray[8] = 13;
//                } else if (sArray[8] == 16) {
//                    C.var_byte_arr_arr_b[s] = C.a((byte) sArray[15], (byte) sArray[16], 0, 6, sArray);
//                    sArray[8] = 17;
//                }
//            } else {
//                sArray[2] = (short) (sArray[2] + 1);
//                if (sArray[2] > 2) {
//                    sArray[2] = 1;
//                }
//            }
//        }
//        if (sArray[3] == 1) {
//            C.void_a(sArray);
//        }
//        if (sArray[3] == 3) {
//            C.void_d(sArray);
//            C.void_b(sArray);
//        } else if (sArray[3] == 4) {
//            C.void_d(sArray);
//            C.e(sArray);
//        } else if (sArray[3] == 2) {
//            C.void_c(sArray);
//            C.e(sArray);
//        } else if (sArray[3] == 5) {
//            C.void_c(sArray);
//            C.void_b(sArray);
//        }
//        return 1;
//    }
//
//    private static final short[] d(short s) {
//        short[] sArray = new short[22];
//        sArray[21] = s;
//        sArray[11] = 9;
//        sArray[12] = 4;
//        sArray[3] = 0;
//        sArray[0] = -12;
//        sArray[1] = 116;
//        sArray[7] = 11;
//        sArray[17] = 0;
//        sArray[18] = 6;
//        return sArray;
//    }
//
//    private static final void c(Graphics graphics, short[] sArray) {
//        if (sArray == null) {
//            return;
//        }
//        C.a(graphics, var_int_arr_n);
//        if (sArray[8] != 11 && sArray[8] != 15) {
//            int n = sArray[8] == 0 || sArray[8] == 17 || sArray[8] == 16 ? sArray[21] : 1047;
//            C.c(graphics, n + sArray[2] * 4 + sArray[10], sArray[0], sArray[1], 33, var_int_arr_n);
//        }
//    }
//
//    public static final byte[] a(byte by, byte by2, int n, int n2, short[] sArray) {
//        byte[] byArray = new byte[28];
//        int n3 = 0;
//        C.a(byArray, by, by2, n3);
//        n3 += 2;
//        sArray[17] = by;
//        sArray[18] = by2;
//        sArray[15] = (short) n;
//        sArray[16] = (short) n2;
//        sArray[9] = 0;
//        if (by == n && by2 == n2) {
//            return byArray;
//        }
//        do {
//            int n4;
//            if (by >= n && by2 <= n2) {
//                if (by2 < 6 && C.boolean_a((int) by, by2 + 1)) {
//                    by = (byte) (by - 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                if (by > 0 && C.boolean_a(by - 1, (int) by2)) {
//                    by2 = (byte) (by2 + 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                n4 = by - n - (n2 - by2);
//                if (n4 > 0) {
//                    by = (byte) (by - 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                if (n4 < 0) {
//                    by2 = (byte) (by2 + 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                if (var_java_util_Random_a.nextInt() > 0) {
//                    by = (byte) (by - 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                by2 = (byte) (by2 + 1);
//                C.a(byArray, by, by2, n3);
//                n3 += 2;
//                continue;
//            }
//            if (by <= n && by2 <= n2) {
//                if (by2 < 6 && C.boolean_a((int) by, by2 + 1)) {
//                    by = (byte) (by + 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                if (by < 6 && C.boolean_a(by + 1, (int) by2)) {
//                    by2 = (byte) (by2 + 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                n4 = n - by - (n2 - by2);
//                if (n4 > 0) {
//                    by = (byte) (by + 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                if (n4 < 0) {
//                    by2 = (byte) (by2 + 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                if (var_java_util_Random_a.nextInt() > 0) {
//                    by = (byte) (by + 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                by2 = (byte) (by2 + 1);
//                C.a(byArray, by, by2, n3);
//                n3 += 2;
//                continue;
//            }
//            if (by <= n && by2 >= n2) {
//                if (by2 > 0 && C.boolean_a((int) by, by2 - 1)) {
//                    by = (byte) (by + 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                if (by < 6 && C.boolean_a(by + 1, (int) by2)) {
//                    by2 = (byte) (by2 - 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                n4 = n - by - (by2 - n2);
//                if (n4 > 0) {
//                    by = (byte) (by + 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                if (n4 < 0) {
//                    by2 = (byte) (by2 - 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                if (var_java_util_Random_a.nextInt() > 0) {
//                    by = (byte) (by + 1);
//                    C.a(byArray, by, by2, n3);
//                    n3 += 2;
//                    continue;
//                }
//                by2 = (byte) (by2 - 1);
//                C.a(byArray, by, by2, n3);
//                n3 += 2;
//                continue;
//            }
//            if (by2 > 0 && C.boolean_a((int) by, by2 - 1)) {
//                by = (byte) (by - 1);
//                C.a(byArray, by, by2, n3);
//                n3 += 2;
//                continue;
//            }
//            if (by > 0 && C.boolean_a(by - 1, (int) by2)) {
//                by2 = (byte) (by2 - 1);
//                C.a(byArray, by, by2, n3);
//                n3 += 2;
//                continue;
//            }
//            n4 = by - n - (by2 - n2);
//            if (n4 > 0) {
//                by = (byte) (by - 1);
//                C.a(byArray, by, by2, n3);
//                n3 += 2;
//                continue;
//            }
//            if (n4 < 0) {
//                by2 = (byte) (by2 - 1);
//                C.a(byArray, by, by2, n3);
//                n3 += 2;
//                continue;
//            }
//            if (var_java_util_Random_a.nextInt() > 0) {
//                by = (byte) (by - 1);
//                C.a(byArray, by, by2, n3);
//                n3 += 2;
//                continue;
//            }
//            by2 = (byte) (by2 - 1);
//            C.a(byArray, by, by2, n3);
//            n3 += 2;
//        } while (n != by || n2 != by2);
//        return C.a(byArray, 0, n3);
//    }
//
//    public static final void h() {
//        if (G >= 12150 && !var_boolean_p) {
//            for (int i = 0; i < var_java_util_Vector_g.size(); ++i) {
//                short[] sArray = (short[]) var_java_util_Vector_g.elementAt(i);
//                short s = sArray[7];
//                if (s != 11 && s != 12 && s != 13 && s != 14) continue;
//                sArray[20] = 9990;
//            }
//            var_boolean_p = true;
//        }
//        C.n();
//    }
//
//    private static final int int_c(short[] sArray) {
//        int n;
//        int n2;
//        int n3;
//        short s = sArray[7];
//        if (sArray[6] > 0) {
//            sArray[6] = (short) (sArray[6] - 1);
//        }
//        if (sArray[3] == 0) {
//            C.var_byte_arr_arr_b[s] = C.a((byte) sArray[17], (byte) sArray[18], 0, 0, sArray);
//            sArray[3] = 1;
//        }
//        if (sArray[9] + 2 == var_byte_arr_arr_b[s].length) {
//            if (sArray[3] >= 22) {
//                if (sArray[8] == 16) {
//                    C.a((int) sArray[21], 100, 0);
//                    return 2;
//                }
//            } else if (sArray[8] == 30) {
//                sArray[3] = 22;
//                sArray[0] = 130;
//            } else if (sArray[3] == 1) {
//                sArray[6] = 50;
//                sArray[3] = 9;
//                sArray[8] = 11;
//            }
//        }
//        if (sArray[3] == 22) {
//            if (sArray[20] >= 9990) {
//                sArray[20] = 0;
//                sArray[3] = 27;
//                sArray[10] = 0;
//            } else {
//                n3 = C.int_b(130, 160);
//                if (n3 > sArray[0]) {
//                    sArray[10] = 2;
//                    sArray[3] = 25;
//                } else if (n3 < sArray[0]) {
//                    sArray[3] = 23;
//                    sArray[10] = 0;
//                }
//                sArray[4] = (short) n3;
//            }
//        }
//        if ((n3 = sArray[3]) >= 23 && n3 <= 25) {
//            n2 = n3 - 25 + 1;
//            sArray[0] = (short) (sArray[0] + n2);
//            n = sArray[0] - 96;
//            sArray[1] = (short) (62 + n / 2 - 15);
//            if (sArray[4] == sArray[0]) {
//                sArray[3] = 26;
//                sArray[10] = 1;
//                sArray[6] = (short) C.int_b(5, 10);
//            }
//        } else if (n3 == 27) {
//            sArray[0] = (short) (sArray[0] - 1);
//            n2 = sArray[0] - 96;
//            sArray[1] = (short) (62 + n2 / 2 - 15);
//            if (sArray[0] <= 130) {
//                sArray[3] = 9;
//                sArray[8] = 31;
//                sArray[6] = 50;
//            }
//        }
//        if (sArray[3] == 26 && sArray[6] <= 0) {
//            int n4;
//            int n5;
//            int n6;
//            sArray[3] = 22;
//            n2 = Integer.MAX_VALUE;
//            n = -1;
//            int n7 = 0;
//            for (n6 = 0; n6 < var_byte_arr_arr_f[var_byte_C].length; ++n6) {
//                n5 = var_byte_arr_arr_f[var_byte_C][n6];
//                n4 = var_short_arr_n[n5];
//                if (var_short_arr_s[n5] <= 0 || n4 >= 30 + 3 * var_byte_C) continue;
//                int n8 = var_byte_arr_l[1] * 5;
//                for (int i = 0; i < var_short_arr_arr_b[n5].length; ++i) {
//                    n8 = Math.min(var_short_arr_b[var_short_arr_arr_b[n5][i]] / var_byte_arr_arr_e[n5][i], n8);
//                }
//                if (n8 <= 0) {
//                    if (var_byte_v == 0 && !var_boolean_arr_f[2]) {
//                        var_byte_p = 0;
//                        var_int_v |= 1;
//                    }
//                    C.var_boolean_arr_f[2] = true;
//                }
//                if (n2 <= n4 || n8 <= 0) continue;
//                n2 = n4;
//                n7 = n8;
//                n = n6;
//            }
//            if (n2 >= 0 && n >= 0) {
//                n6 = var_byte_arr_arr_f[var_byte_C][n];
//                for (n5 = 0; n5 < var_short_arr_arr_b[n6].length; ++n5) {
//                    int n9 = n4 = var_short_arr_arr_b[n6][n5];
//                    var_short_arr_b[n9] = (short) (var_short_arr_b[n9] - var_byte_arr_arr_e[n6][n5] * n7);
//                }
//                int n10 = n6;
//                var_short_arr_n[n10] = (short) (var_short_arr_n[n10] + n7);
//            }
//        }
//        if (sArray[3] == 9 && sArray[6] <= 0) {
//            if (sArray[8] == 31) {
//                sArray[3] = 1;
//                sArray[8] = 16;
//                sArray[11] = 9;
//                sArray[12] = 4;
//                C.var_byte_arr_arr_b[s] = C.a((byte) 0, (byte) 0, 0, 6, sArray);
//                sArray[0] = (short) (96 + sArray[11]);
//                sArray[1] = (short) (62 + sArray[12]);
//            } else {
//                sArray[8] = 30;
//                sArray[3] = 22;
//                sArray[0] = 130;
//            }
//        }
//        if (sArray[3] >= 2 && sArray[3] <= 5) {
//            if (sArray[0] == sArray[4] && sArray[1] == sArray[5]) {
//                sArray[3] = 1;
//                sArray[9] = (short) (sArray[9] + 2);
//                if (sArray[8] == 12) {
//                    C.var_byte_arr_arr_b[s] = C.a((byte) sArray[15], (byte) sArray[16], 6, 0, sArray);
//                    sArray[8] = 30;
//                }
//            }
//            sArray[2] = (short) (sArray[2] + 1);
//            if (sArray[2] > 2) {
//                sArray[2] = 1;
//            }
//        }
//        if (sArray[3] == 1) {
//            C.void_a(sArray);
//        }
//        if (sArray[3] == 3) {
//            C.void_d(sArray);
//            C.void_b(sArray);
//        } else if (sArray[3] == 4) {
//            C.void_d(sArray);
//            C.e(sArray);
//        } else if (sArray[3] == 2) {
//            C.void_c(sArray);
//            C.e(sArray);
//        } else if (sArray[3] == 5) {
//            C.void_c(sArray);
//            C.void_b(sArray);
//        }
//        return 1;
//    }
//
//    private static final void b(Graphics graphics, short[] sArray) {
//        C.a(graphics, var_int_arr_n);
//        if (sArray[8] != 11 && sArray[8] != 31) {
//            if (sArray[3] < 22) {
//                C.c(graphics, sArray[21] + sArray[2] * 4 + sArray[10], sArray[0], sArray[1], 33, var_int_arr_n);
//            } else {
//                int n = sArray[10] > 1 ? 2 : sArray[10];
//                C.c(graphics, 1040 + n, sArray[0], sArray[1], 33, var_int_arr_n);
//            }
//        }
//    }
//
//    private static final short[] c(short s) {
//        short[] sArray = new short[22];
//        sArray[21] = s;
//        sArray[11] = 9;
//        sArray[12] = 4;
//        sArray[3] = 0;
//        sArray[0] = -12;
//        sArray[1] = 116;
//        sArray[7] = 12;
//        sArray[17] = 0;
//        sArray[18] = 6;
//        return sArray;
//    }
//
//    private static final void void_d(short[] sArray) {
//        short s = sArray[4];
//        var_boolean_g = false;
//        if (sArray[0] < s) {
//            sArray[0] = (short) (sArray[0] + 2);
//            if (sArray[0] > s) {
//                sArray[0] = s;
//            }
//        } else {
//            var_boolean_g = true;
//        }
//    }
//
//    private static final void void_b(short[] sArray) {
//        short s = sArray[5];
//        if (sArray[1] < s) {
//            int n = sArray[0] - sArray[13];
//            int n2 = Math.abs(n / 2);
//            int n3 = sArray[14] + n2;
//            if (!var_boolean_g && n3 != sArray[1]) {
//                sArray[1] = (short) n3;
//            } else if (var_boolean_g) {
//                sArray[1] = (short) (sArray[1] + 1);
//            }
//            if (sArray[1] > s) {
//                sArray[1] = s;
//            }
//        }
//    }
//
//    private static final void void_c(short[] sArray) {
//        short s = sArray[4];
//        var_boolean_g = false;
//        if (sArray[0] > s) {
//            sArray[0] = (short) (sArray[0] - 2);
//        } else {
//            var_boolean_g = true;
//        }
//        if (sArray[0] < s) {
//            sArray[0] = s;
//        }
//    }
//
//    private static final void e(short[] sArray) {
//        short s = sArray[5];
//        if (sArray[1] > s) {
//            int n = sArray[0] - sArray[13];
//            int n2 = Math.abs(n / 2);
//            int n3 = sArray[14] - n2;
//            sArray[1] = sArray[0] == sArray[4] ? (short) (sArray[1] - 1) : (short) n3;
//        }
//        if (sArray[1] < s) {
//            sArray[1] = s;
//        }
//    }
//
//    private static final int int_d(short[] sArray) {
//        int n;
//        short s = sArray[7];
//        if (sArray[6] > 0) {
//            sArray[6] = (short) (sArray[6] - 1);
//        }
//        if (sArray[3] == 0) {
//            C.var_byte_arr_arr_b[s] = C.a((byte) sArray[17], (byte) sArray[18], 0, 0, sArray);
//            sArray[3] = 1;
//        }
//        if (sArray[9] + 2 == var_byte_arr_arr_b[s].length && sArray[3] != 9) {
//            if (sArray[8] == 17) {
//                C.a((int) sArray[21], 100, 0);
//                return 2;
//            }
//            if (sArray[8] == 0) {
//                sArray[8] = 11;
//                sArray[3] = 9;
//                sArray[6] = 50;
//            } else if (sArray[8] == 32) {
//                sArray[3] = 9;
//                sArray[6] = (short) C.int_b(15, 100);
//            } else if (sArray[8] == 31) {
//                sArray[8] = 33;
//                sArray[3] = 9;
//                sArray[6] = (short) (15 + C.int_b(0, 60 - 3 * (var_byte_arr_l[5] + var_byte_arr_l[4])));
//            }
//        }
//        if (sArray[9] == var_byte_arr_arr_b[s].length && sArray[8] == 34) {
//            sArray[20] = 0;
//            sArray[3] = 9;
//            sArray[6] = 50;
//            sArray[8] = 16;
//        }
//        if (sArray[3] == 9 && sArray[6] <= 0) {
//            if (sArray[8] == 16) {
//                sArray[3] = 1;
//                sArray[8] = 17;
//                sArray[11] = 9;
//                sArray[12] = 4;
//                C.var_byte_arr_arr_b[s] = C.a((byte) 0, (byte) 0, 0, 6, sArray);
//                sArray[0] = (short) (96 + sArray[11]);
//                sArray[1] = (short) (62 + sArray[12]);
//            } else if (sArray[8] == 11) {
//                sArray[3] = 5;
//                sArray[10] = 1;
//                sArray[8] = 12;
//                sArray[9] = 0;
//                sArray[11] = 0;
//                sArray[12] = 13;
//                sArray[4] = (short) (96 + sArray[11]);
//                sArray[5] = (short) (62 + sArray[12]);
//            } else if (sArray[8] == 32) {
//                sArray[8] = 30;
//            } else if (sArray[8] == 33) {
//                sArray[8] = 30;
//                short[] sArray2 = (short[]) var_java_util_Vector_e.elementAt(0);
//                var_java_util_Vector_e.removeElementAt(0);
//                n = sArray2[0];
//                short s2 = sArray2[1];
//                int n2 = 0;
//                int n3 = var_java_util_Vector_e.size();
//                while (n2 < n3) {
//                    sArray2 = (short[]) var_java_util_Vector_e.elementAt(n2);
//                    if (sArray2[0] == n && sArray2[1] == s2) {
//                        var_java_util_Vector_e.removeElementAt(n2);
//                        --n3;
//                        continue;
//                    }
//                    ++n2;
//                }
//            }
//        }
//        if (sArray[3] >= 2 && sArray[3] <= 5) {
//            if (sArray[0] == sArray[4] && sArray[1] == sArray[5]) {
//                sArray[3] = 1;
//                sArray[9] = (short) (sArray[9] + 2);
//                if (sArray[8] == 12) {
//                    sArray[3] = 30;
//                    sArray[8] = 30;
//                }
//            }
//            sArray[2] = (short) (sArray[2] + 1);
//            if (sArray[2] > 2) {
//                sArray[2] = 1;
//            }
//        }
//        if (sArray[8] == 33) {
//            sArray[2] = (short) (sArray[2] + 1);
//            if (sArray[2] > 2) {
//                sArray[2] = 0;
//            }
//        }
//        if (sArray[8] == 30) {
//            int n4 = 0;
//            n = 0;
//            if (var_java_util_Vector_e.size() > 0) {
//                short[] sArray3 = (short[]) var_java_util_Vector_e.elementAt(0);
//                n4 = sArray3[0];
//                n = sArray3[1];
//                sArray[8] = 31;
//            } else if (sArray[20] == 9990) {
//                sArray[20] = 9991;
//                sArray[8] = 34;
//            } else {
//                sArray[8] = 32;
//                while (C.boolean_a(n4 = C.int_b(1, 6), n = C.int_b(0, 6)) || n4 == sArray[15] && n == sArray[16]) {
//                }
//            }
//            if (sArray[15] != n4 || sArray[16] != n) {
//                C.var_byte_arr_arr_b[s] = C.a((byte) sArray[15], (byte) sArray[16], n4, n, sArray);
//            }
//            sArray[3] = 1;
//        }
//        if (sArray[3] == 1) {
//            C.void_a(sArray);
//        }
//        if (sArray[3] == 3) {
//            C.void_d(sArray);
//            C.void_b(sArray);
//        } else if (sArray[3] == 4) {
//            C.void_d(sArray);
//            C.e(sArray);
//        } else if (sArray[3] == 2) {
//            C.void_c(sArray);
//            C.e(sArray);
//        } else if (sArray[3] == 5) {
//            C.void_c(sArray);
//            C.void_b(sArray);
//        }
//        return 1;
//    }
//
//    private static final void d(Graphics graphics, short[] sArray) {
//        C.a(graphics, var_int_arr_n);
//        if (sArray[8] != 11 && sArray[8] != 16) {
//            int n = sArray[8] == 0 || sArray[8] == 17 ? sArray[21] + sArray[2] * 4 + sArray[10] : (sArray[8] == 33 ? 1071 + sArray[2] : 1059 + sArray[2] * 4 + sArray[10]);
//            C.c(graphics, n, sArray[0], sArray[1], 33, var_int_arr_n);
//        }
//    }
//
//    private static final int int_b(short[] sArray) {
//        int n;
//        short s = sArray[7];
//        if (sArray[6] > 0) {
//            sArray[6] = (short) (sArray[6] - 1);
//        }
//        if (sArray[3] == 0) {
//            C.var_byte_arr_arr_b[s] = C.a((byte) sArray[17], (byte) sArray[18], 0, 0, sArray);
//            sArray[3] = 1;
//        }
//        if (sArray[9] + 2 == var_byte_arr_arr_b[s].length && sArray[3] != 9) {
//            if (sArray[8] == 17) {
//                C.a((int) sArray[21], 100, 0);
//                return 2;
//            }
//            if (sArray[8] == 0) {
//                sArray[8] = 11;
//                sArray[3] = 9;
//                sArray[6] = 50;
//            } else if (sArray[8] == 32) {
//                sArray[3] = 9;
//                sArray[6] = (short) C.int_b(15, 100);
//            } else if (sArray[8] == 31) {
//                sArray[8] = 33;
//                sArray[3] = 9;
//                sArray[6] = (short) (15 + C.int_b(0, 60 - 3 * (var_byte_arr_l[5] + var_byte_arr_l[4])));
//            }
//        }
//        if (sArray[9] == var_byte_arr_arr_b[s].length && sArray[8] == 34) {
//            sArray[20] = 0;
//            sArray[3] = 9;
//            sArray[6] = 50;
//            sArray[8] = 16;
//        }
//        if (sArray[3] == 9 && sArray[6] <= 0) {
//            if (sArray[8] == 16) {
//                sArray[3] = 1;
//                sArray[8] = 17;
//                sArray[11] = 9;
//                sArray[12] = 4;
//                C.var_byte_arr_arr_b[s] = C.a((byte) 0, (byte) 0, 0, 6, sArray);
//                sArray[0] = (short) (96 + sArray[11]);
//                sArray[1] = (short) (62 + sArray[12]);
//            } else if (sArray[8] == 11) {
//                sArray[3] = 5;
//                sArray[10] = 1;
//                sArray[8] = 12;
//                sArray[9] = 0;
//                sArray[11] = 0;
//                sArray[12] = 13;
//                sArray[4] = (short) (96 + sArray[11]);
//                sArray[5] = (short) (62 + sArray[12]);
//            } else if (sArray[8] == 32) {
//                sArray[8] = 30;
//            } else if (sArray[8] == 33) {
//                sArray[8] = 30;
//                short[] sArray2 = (short[]) var_java_util_Vector_e.elementAt(0);
//                var_java_util_Vector_e.removeElementAt(0);
//                n = sArray2[0];
//                short s2 = sArray2[1];
//                int n2 = 0;
//                int n3 = var_java_util_Vector_e.size();
//                while (n2 < n3) {
//                    sArray2 = (short[]) var_java_util_Vector_e.elementAt(n2);
//                    if (sArray2[0] == n && sArray2[1] == s2) {
//                        var_java_util_Vector_e.removeElementAt(n2);
//                        --n3;
//                        continue;
//                    }
//                    ++n2;
//                }
//            }
//        }
//        if (sArray[3] >= 2 && sArray[3] <= 5) {
//            if (sArray[0] == sArray[4] && sArray[1] == sArray[5]) {
//                sArray[3] = 1;
//                sArray[9] = (short) (sArray[9] + 2);
//                if (sArray[8] == 12) {
//                    sArray[3] = 30;
//                    sArray[8] = 30;
//                }
//            }
//            sArray[2] = (short) (sArray[2] + 1);
//            if (sArray[2] > 2) {
//                sArray[2] = 1;
//            }
//        }
//        if (sArray[8] == 33) {
//            sArray[2] = (short) (sArray[2] + 1);
//            if (sArray[2] > 2) {
//                sArray[2] = 0;
//            }
//        }
//        if (sArray[8] == 30) {
//            int n4 = 0;
//            n = 0;
//            if (sArray[20] == 9990) {
//                sArray[20] = 9991;
//                sArray[8] = 34;
//            } else {
//                sArray[8] = 32;
//                while (C.boolean_a(n4 = C.int_b(1, 6), n = C.int_b(0, 6)) || n4 == sArray[15] && n == sArray[16]) {
//                }
//            }
//            if (sArray[15] != n4 || sArray[16] != n) {
//                C.var_byte_arr_arr_b[s] = C.a((byte) sArray[15], (byte) sArray[16], n4, n, sArray);
//            }
//            sArray[3] = 1;
//        }
//        if (sArray[3] == 1) {
//            C.void_a(sArray);
//        }
//        if (sArray[3] == 3) {
//            C.void_d(sArray);
//            C.void_b(sArray);
//        } else if (sArray[3] == 4) {
//            C.void_d(sArray);
//            C.e(sArray);
//        } else if (sArray[3] == 2) {
//            C.void_c(sArray);
//            C.e(sArray);
//        } else if (sArray[3] == 5) {
//            C.void_c(sArray);
//            C.void_b(sArray);
//        }
//        return 1;
//    }
//
//    private static final void a(Graphics graphics, short[] sArray) {
//        C.a(graphics, var_int_arr_n);
//        if (sArray[8] != 11 && sArray[8] != 16) {
//            int n = sArray[8] == 0 || sArray[8] == 17 ? sArray[21] + sArray[2] * 4 + sArray[10] : (sArray[8] == 33 ? 1071 + sArray[2] : 1022 + sArray[2] * 4 + sArray[10]);
//            C.c(graphics, n, sArray[0], sArray[1], 33, var_int_arr_n);
//        }
//    }
//
//    private static final short[] short_arr_a(short s) {
//        short[] sArray = new short[22];
//        sArray[7] = 13;
//        sArray[21] = s;
//        sArray[11] = 9;
//        sArray[12] = 4;
//        sArray[3] = 0;
//        sArray[0] = -12;
//        sArray[1] = 116;
//        sArray[7] = 13;
//        sArray[17] = 0;
//        sArray[18] = 6;
//        return sArray;
//    }
//
//    private static final short[] b(short s) {
//        short[] sArray = new short[22];
//        sArray[7] = 14;
//        sArray[21] = s;
//        sArray[11] = 9;
//        sArray[12] = 4;
//        sArray[3] = 0;
//        sArray[0] = -12;
//        sArray[1] = 116;
//        sArray[17] = 0;
//        sArray[18] = 6;
//        return sArray;
//    }
//
//    public static final void ai() {
//        C.z();
//    }
//
//    public static final void F(Graphics graphics) {
//        C.a(graphics, var_int_arr_n);
//        graphics.setColor(5558892);
//        graphics.fillRect(var_int_arr_n[0], var_int_arr_n[1], var_int_arr_n[2] - var_int_arr_n[0], var_int_arr_n[3] - var_int_arr_n[1]);
//        C.b(graphics, 21, 0, 195, 32, var_int_arr_n);
//        C.b(graphics, 12, 0, 30, 0, var_int_arr_n);
//        if (var_boolean_arr_g[0]) {
//            C.b(graphics, 12, 0, -20, 0, var_int_arr_n);
//        }
//        C.t(graphics);
//        if (var_boolean_arr_g[4]) {
//            C.b(graphics, 35, 107, 170, 33, var_int_arr_n);
//            C.b(graphics, 35, 51, 170, 33, var_int_arr_n);
//            C.b(graphics, 35, 139, 155, 33, var_int_arr_n);
//            C.b(graphics, 35, 19, 155, 33, var_int_arr_n);
//        }
//        if (var_boolean_arr_g[3]) {
//            C.a(graphics, 17, 63, 174, 40, var_int_arr_n);
//            C.a(graphics, 17, 97, 174, 32, var_int_arr_n);
//        }
//        if (var_boolean_arr_g[1]) {
//            C.c(graphics, 1096, 140, 115, 0, var_int_arr_n);
//            C.c(graphics, 1097, 18, 115, 8, var_int_arr_n);
//            if (var_boolean_arr_g[0]) {
//                C.c(graphics, 1096, 140, 65, 0, var_int_arr_n);
//                C.c(graphics, 1097, 18, 65, 8, var_int_arr_n);
//            }
//        }
//        if (var_boolean_arr_g[2]) {
//            C.c(graphics, 1109, 112, 125, 0, var_int_arr_n);
//            C.c(graphics, 1108, 45, 125, 8, var_int_arr_n);
//            C.b(graphics, 34, 0, 96, 0, var_int_arr_n);
//        }
//        if (var_boolean_arr_g[5]) {
//            C.c(graphics, 1107, 106, 123, 32, var_int_arr_n);
//            C.c(graphics, 1106, 52, 123, 40, var_int_arr_n);
//            C.b(graphics, 32, 79, 126, 33, var_int_arr_n);
//        }
//    }
//
//    public static final void c(Graphics graphics) {
//        int n = var_java_util_Vector_c.size();
//        if (n > 0) {
//            int n2 = (--n + 1) / 2;
//            do {
//                int n3 = n2;
//                do {
//                    int n4 = n3 - n2;
//                    boolean bl = true;
//                    do {
//                        if (((short[]) var_java_util_Vector_c.elementAt(n4))[1] <= ((short[]) var_java_util_Vector_c.elementAt(n4 + n2))[1]) {
//                            bl = false;
//                            continue;
//                        }
//                        short[] sArray = (short[]) var_java_util_Vector_c.elementAt(n4);
//                        short[] sArray2 = (short[]) var_java_util_Vector_c.elementAt(n4 + n2);
//                        var_java_util_Vector_c.removeElementAt(n4 + n2);
//                        var_java_util_Vector_c.removeElementAt(n4);
//                        var_java_util_Vector_c.insertElementAt(sArray2, n4);
//                        var_java_util_Vector_c.insertElementAt(sArray, n4 + n2);
//                    } while (--n4 >= 0 && bl);
//                } while (++n3 <= n);
//            } while ((n2 /= 2) > 0);
//        }
//        C.f(graphics);
//        if (G < 3600 || G > 13200) {
//            C.b(graphics, 36, 79, 112, 40, var_int_arr_n);
//            C.b(graphics, 36, 79, 112, 32, var_int_arr_n);
//            C.b(graphics, 36, 79, 112, 8, var_int_arr_n);
//            C.b(graphics, 36, 79, 112, 0, var_int_arr_n);
//        }
//    }
//
//    private static final void z() {
//        int n = 0;
//        int n2 = var_java_util_Vector_c.size();
//        while (n < n2) {
//            int n3;
//            int n4 = var_java_util_Vector_g.size();
//            short[] sArray = (short[]) var_java_util_Vector_c.elementAt(n);
//            if (sArray[2] == 5) {
//                sArray[1] = (short) (sArray[1] - 1);
//                if (sArray[1] <= 163) {
//                    if (n4 < var_byte_g || sArray[5] > 0) {
//                        C.a(sArray[4], (int) sArray[5]);
//                        var_java_util_Vector_c.removeElementAt(n);
//                        --n2;
//                        continue;
//                    }
//                    sArray[2] = 6;
//                }
//            }
//            if (sArray[2] == 2) {
//                sArray[0] = (short) (sArray[0] + 2);
//                n3 = Math.abs(sArray[6] - sArray[0]);
//                sArray[1] = (short) (158 + n3 / 2 + sArray[10]);
//                if (sArray[0] >= 79) {
//                    if (sArray[5] > 0 || G >= 4800 && G <= 12000 && n4 < var_byte_g && var_boolean_l && C.int_b(1, 100) <= 80) {
//                        sArray[0] = 79;
//                        sArray[2] = 5;
//                    } else {
//                        sArray[2] = 4;
//                        sArray[6] = sArray[0];
//                        sArray[7] = sArray[1];
//                    }
//                }
//            } else if (sArray[2] == 1) {
//                sArray[0] = (short) (sArray[0] - 2);
//                n3 = sArray[6] - sArray[0];
//                sArray[1] = (short) (158 + n3 / 2 + sArray[10]);
//                if (sArray[0] <= 79) {
//                    if (sArray[5] > 0 || G >= 4800 && G <= 12000 && n4 < var_byte_g && var_boolean_l && C.int_b(1, 100) <= 80) {
//                        sArray[0] = 79;
//                        sArray[2] = 5;
//                    } else {
//                        sArray[2] = 3;
//                        sArray[6] = sArray[0];
//                        sArray[7] = sArray[1];
//                    }
//                }
//            } else if (sArray[2] == 3) {
//                sArray[0] = (short) (sArray[0] - 2);
//                n3 = sArray[6] - sArray[0];
//                sArray[1] = (short) (sArray[7] - n3 / 2 + sArray[10]);
//                if (sArray[0] < -5) {
//                    var_java_util_Vector_c.removeElementAt(n);
//                    --n2;
//                    continue;
//                }
//            } else if (sArray[2] == 4) {
//                sArray[0] = (short) (sArray[0] + 2);
//                n3 = sArray[0] - sArray[6];
//                sArray[1] = (short) (sArray[7] - n3 / 2 + sArray[10]);
//                if (sArray[0] > 163) {
//                    var_java_util_Vector_c.removeElementAt(n);
//                    --n2;
//                    continue;
//                }
//            } else if (sArray[2] == 6) {
//                sArray[1] = (short) (sArray[1] + 1);
//                if (sArray[1] >= 195) {
//                    n3 = C.int_b(0, 1);
//                    sArray[2] = n3 == 0 ? (short) 3 : (short) 4;
//                    sArray[7] = sArray[1];
//                    sArray[6] = sArray[0];
//                }
//            }
//            sArray[8] = (short) (sArray[8] + 1);
//            if (sArray[8] > 2) {
//                sArray[8] = 1;
//            }
//            ++n;
//        }
//    }
//
//    private static final void f(Graphics graphics) {
//        for (int i = 0; i < var_java_util_Vector_c.size(); ++i) {
//            int n;
//            short[] sArray = (short[]) var_java_util_Vector_c.elementAt(i);
//            int n2 = sArray[2];
//            if (n2 >= 5) {
//                n2 = (short) (n2 - 5);
//                n = sArray[4] + 12 + sArray[8] * 2 + n2;
//            } else {
//                if (n2 >= 3) {
//                    if (n2 == 3) {
//                        n2 = 0;
//                    } else if (n2 == 4) {
//                        n2 = 3;
//                    } else if (n2 == 6) {
//                        n2 = 1;
//                    }
//                }
//                n = sArray[4] + sArray[8] * 4 + n2;
//            }
//            C.c(graphics, n, sArray[0] + sArray[9], sArray[1], 33, var_int_arr_n);
//            short s = sArray[11];
//            if (s <= 0) continue;
//            int n3 = 1000 + s - 1;
//            int n4 = sArray[1] - 20;
//            C.c(graphics, n3, sArray[0] + sArray[9], n4, 33, var_int_arr_n);
//        }
//    }
//
//    private static final void a(int n, int n2, int n3) {
//        short[] sArray = new short[12];
//        sArray[5] = (short) n2;
//        sArray[11] = (short) n3;
//        if (n2 == 100) {
//            sArray[1] = 163;
//            sArray[2] = 6;
//            sArray[0] = 79;
//        } else {
//            int n4;
//            if (n2 > 0) {
//                System.out.println("work");
//            }
//            if ((n4 = C.int_b(0, 1)) == 0) {
//                sArray[0] = -5;
//                sArray[2] = 2;
//            } else {
//                sArray[0] = 163;
//                sArray[2] = 1;
//            }
//            sArray[1] = 158;
//            n = n * 18 + 1110;
//        }
//        sArray[4] = (short) n;
//        sArray[6] = sArray[0];
//        sArray[9] = (short) C.int_b(-3, 3);
//        sArray[10] = (short) C.int_b(-3, 6);
//        var_java_util_Vector_c.addElement(sArray);
//    }
//
//    private static final void a(short s, int n) {
//        switch (n) {
//            case 0: {
//                C.void_a(s);
//                break;
//            }
//            case 1: {
//                if (C.boolean_a(12)) break;
//                var_java_util_Vector_g.addElement(C.c(s));
//                break;
//            }
//            case 2: {
//                if (C.boolean_a(11)) break;
//                var_java_util_Vector_g.addElement(C.d(s));
//                break;
//            }
//            case 4: {
//                if (C.boolean_a(13)) break;
//                var_java_util_Vector_g.addElement(C.short_arr_a(s));
//                break;
//            }
//            case 5: {
//                if (C.boolean_a(14)) break;
//                var_java_util_Vector_g.addElement(C.b(s));
//            }
//        }
//    }
//
//    public static final void N() {
//        int n;
//        if (var_byte_A > 0) {
//            for (n = 0; n < var_java_util_Vector_d.size(); ++n) {
//                short s;
//                short[] sArray = (short[]) var_java_util_Vector_d.elementAt(n);
//                if (sArray[2] != 0) continue;
//                boolean bl = false;
//                int n2 = 0;
//                while (true) {
//                    if (G < 4650) {
//                        s = (short) C.int_b(4350, 4650);
//                        for (int i = 0; i < var_java_util_Vector_d.size(); ++i) {
//                            short s2 = ((short[]) var_java_util_Vector_d.elementAt(i))[2];
//                            if (s < s2 - 2 || s > s2 + 2) continue;
//                            bl = true;
//                            break;
//                        }
//                        if (!bl || n2 > 4) {
//                            break;
//                        }
//                    } else {
//                        s = (short) G;
//                        break;
//                    }
//                    n2 = (byte) (n2 + 1);
//                }
//                sArray[2] = s;
//                var_byte_A = (byte) (var_byte_A - 1);
//            }
//        }
//        n = 0;
//        int n3 = var_java_util_Vector_d.size();
//        while (n < n3) {
//            short[] sArray = (short[]) var_java_util_Vector_d.elementAt(n);
//            if (sArray[2] <= G) {
//                C.a((int) sArray[1], (int) sArray[0], 0);
//                sArray[2] = -1;
//                var_java_util_Vector_d.removeElementAt(n);
//                --n3;
//                continue;
//            }
//            ++n;
//        }
//        n3 = var_java_util_Vector_c.size();
//        if (n3 < var_byte_e && var_byte_n <= 0 && C.int_b(1, 100) <= 8) {
//            C.a(C.int_b(0, 5), 0, 0);
//            var_byte_n = (byte) 5;
//        }
//        var_byte_n = (byte) (var_byte_n - 1);
//    }
//
//    private static final void I(Graphics graphics) {
//        for (int i = 0; i < 5; ++i) {
//            if (!var_boolean_arr_e[i]) continue;
//            C.c(graphics, 1074 + i, 96 - (i + 1) * 18 - 4 + 2, 62 + (i + 1) * 9 - 1, 32, var_int_arr_n);
//        }
//    }
//
//    private static final int int_b() {
//        int n;
//        int n2 = C.int_b(0, 4);
//        if (var_boolean_arr_e[n2] && var_boolean_arr_d[n2]) {
//            return n2;
//        }
//        if (n2 < 4) {
//            for (n = n2 + 1; n < 5; ++n) {
//                if (!var_boolean_arr_e[n] || !var_boolean_arr_d[n]) continue;
//                return n;
//            }
//        }
//        if (n2 > 0) {
//            for (n = 0; n < n2; ++n) {
//                if (!var_boolean_arr_e[n] || !var_boolean_arr_d[n]) continue;
//                return n;
//            }
//        }
//        return -1;
//    }
//
//    private static final int int_a() {
//        if (C.int_b(1, 100) <= 3) {
//            return C.int_b(0, 3);
//        }
//        return -1;
//    }
//
//    public static final void a(DataOutputStream dataOutputStream) throws IOException {
//        int n;
//        short[] sArray;
//        int n2;
//        int n3 = var_java_util_Vector_g.size();
//        dataOutputStream.writeByte(n3);
//        for (n2 = 0; n2 < n3; ++n2) {
//            C.a(dataOutputStream, (short[]) var_java_util_Vector_g.elementAt(n2));
//        }
//        n3 = (byte) var_java_util_Vector_e.size();
//        dataOutputStream.writeByte(n3);
//        for (n2 = 0; n2 < n3; ++n2) {
//            sArray = (short[]) var_java_util_Vector_e.elementAt(n2);
//            for (n = 0; n < 3; ++n) {
//                dataOutputStream.writeShort(sArray[n]);
//            }
//        }
//        n3 = (byte) var_java_util_Vector_c.size();
//        dataOutputStream.writeByte(n3);
//        for (n2 = 0; n2 < n3; ++n2) {
//            sArray = (short[]) var_java_util_Vector_c.elementAt(n2);
//            for (n = 0; n < 12; ++n) {
//                dataOutputStream.writeShort(sArray[n]);
//            }
//        }
//        for (n2 = 0; n2 < var_byte_arr_arr_c.length; ++n2) {
//            for (int i = 0; i < 3; ++i) {
//                dataOutputStream.writeBoolean(var_boolean_arr_arr_a[n2][i]);
//                dataOutputStream.writeBoolean(var_boolean_arr_arr_b[n2][i]);
//            }
//        }
//        for (n2 = 0; n2 < 3; ++n2) {
//            dataOutputStream.writeBoolean(var_boolean_arr_a[n2]);
//        }
//        for (n2 = 0; n2 < 11; ++n2) {
//            dataOutputStream.writeBoolean(var_boolean_arr_k[n2]);
//        }
//        for (n2 = 0; n2 < 5; ++n2) {
//            dataOutputStream.writeBoolean(var_boolean_arr_d[n2]);
//        }
//        for (n2 = 0; n2 < 15; ++n2) {
//            n3 = (byte) var_byte_arr_arr_b[n2].length;
//            dataOutputStream.writeByte(n3);
//            if (n3 <= 0) continue;
//            ((OutputStream) dataOutputStream).write(var_byte_arr_arr_b[n2]);
//        }
//        dataOutputStream.writeByte(var_byte_A);
//        dataOutputStream.writeBoolean(var_boolean_p);
//        dataOutputStream.writeShort(var_short_i);
//        dataOutputStream.writeInt(G);
//        dataOutputStream.writeShort(var_short_c);
//        if (var_java_util_Vector_d == null) {
//            dataOutputStream.writeByte(-1);
//        } else {
//            n3 = (byte) var_java_util_Vector_d.size();
//            dataOutputStream.writeByte(n3);
//            for (n2 = 0; n2 < n3; ++n2) {
//                C.a(dataOutputStream, (short[]) var_java_util_Vector_d.elementAt(n2), (short) 3);
//            }
//        }
//    }
//
//    private static final void a(DataOutputStream dataOutputStream, short[] sArray) throws IOException {
//        for (int i = 0; i < 22; ++i) {
//            dataOutputStream.writeShort(sArray[i]);
//        }
//    }
//
//    public static final void void_a(DataInputStream dataInputStream) throws IOException {
//        int n;
//        short[] sArray;
//        int n2;
//        int n3 = dataInputStream.readByte();
//        for (n2 = 0; n2 < n3; ++n2) {
//            var_java_util_Vector_g.addElement(C.short_arr_b(dataInputStream));
//        }
//        n3 = dataInputStream.readByte();
//        for (n2 = 0; n2 < n3; ++n2) {
//            sArray = new short[3];
//            for (n = 0; n < 3; ++n) {
//                sArray[n] = dataInputStream.readShort();
//            }
//            var_java_util_Vector_e.addElement(sArray);
//        }
//        n3 = dataInputStream.readByte();
//        for (n2 = 0; n2 < n3; ++n2) {
//            sArray = new short[12];
//            for (n = 0; n < 12; ++n) {
//                sArray[n] = dataInputStream.readShort();
//            }
//            var_java_util_Vector_c.addElement(sArray);
//        }
//        for (n2 = 0; n2 < var_byte_arr_arr_c.length; ++n2) {
//            for (int i = 0; i < 3; ++i) {
//                C.var_boolean_arr_arr_a[n2][i] = dataInputStream.readBoolean();
//                C.var_boolean_arr_arr_b[n2][i] = dataInputStream.readBoolean();
//            }
//        }
//        for (n2 = 0; n2 < 3; ++n2) {
//            C.var_boolean_arr_a[n2] = dataInputStream.readBoolean();
//        }
//        for (n2 = 0; n2 < 11; ++n2) {
//            C.var_boolean_arr_k[n2] = dataInputStream.readBoolean();
//        }
//        for (n2 = 0; n2 < 5; ++n2) {
//            C.var_boolean_arr_d[n2] = dataInputStream.readBoolean();
//        }
//        for (n2 = 0; n2 < 15; ++n2) {
//            n3 = dataInputStream.readByte();
//            C.var_byte_arr_arr_b[n2] = new byte[n3];
//            if (n3 <= 0) continue;
//            for (int i = 0; i < n3; ++i) {
//                C.var_byte_arr_arr_b[n2][i] = dataInputStream.readByte();
//            }
//        }
//        var_byte_A = dataInputStream.readByte();
//        var_boolean_p = dataInputStream.readBoolean();
//        var_short_i = dataInputStream.readShort();
//        G = dataInputStream.readInt();
//        var_short_c = dataInputStream.readShort();
//        n3 = dataInputStream.readByte();
//        if (n3 >= 0) {
//            for (n2 = 0; n2 < n3; ++n2) {
//                var_java_util_Vector_d.addElement(C.short_arr_a(dataInputStream, (short) 3));
//            }
//        }
//    }
//
//    private static final short[] short_arr_b(DataInputStream dataInputStream) throws IOException {
//        short[] sArray = new short[22];
//        for (int i = 0; i < 22; ++i) {
//            sArray[i] = dataInputStream.readShort();
//        }
//        return sArray;
//    }
//
//    public static final void av() {
//        if (var_byte_arr_l[6] > 0 && var_short_c <= 0 && G > 4800 && G < 12000) {
//            byte by;
//            int n = 0;
//            int n2 = var_byte_arr_arr_f[var_byte_C].length;
//            while ((n = C.int_b(0, n2 + 1)) == 0 || n == n2 + 1) {
//            }
//            if (var_short_arr_n[by = var_byte_arr_arr_f[var_byte_C][--n]] > 0) {
//                int n3 = 1;
//                if (var_byte_arr_l[6] >= 2) {
//                    n3 = var_byte_c * C.int_b(1, var_byte_arr_l[6] / 2);
//                }
//                if (n3 > var_short_arr_n[by]) {
//                    n3 = var_short_arr_n[by];
//                }
//                byte by2 = by;
//                var_short_arr_n[by2] = (short) (var_short_arr_n[by2] - n3);
//                var_int_r += var_byte_b * n3 * var_short_arr_o[var_byte_arr_arr_f[var_byte_C][n]] / 100;
//                var_int_g += var_byte_b * n3 * var_short_arr_o[var_byte_arr_arr_f[var_byte_C][n]] / 100;
//            }
//            var_short_c = (short) (C.int_b(100, 200) - 10 * var_byte_arr_l[7] / 4);
//        } else {
//            var_short_c = (short) (var_short_c - 1);
//        }
//    }
//
//    private static final boolean boolean_a(int n, int n2) {
//        for (int i = 0; i < var_byte_arr_arr_c.length; ++i) {
//            if (var_byte_arr_arr_c[i][0] != n || var_byte_arr_arr_c[i][1] != n2) continue;
//            return true;
//        }
//        return false;
//    }
//
//    private static final void a(byte[] byArray, byte by, byte by2, int n) {
//        byArray[n] = by;
//        byArray[n + 1] = by2;
//    }
//
//    public static final void t(Graphics graphics) {
//        C.i(graphics);
//        int n = var_boolean_l ? 1094 : 1095;
//        C.c(graphics, n, 80, 132, 1, var_int_arr_n);
//    }
//
//    public static final boolean boolean_a(int n) {
//        for (int i = 0; i < var_java_util_Vector_g.size(); ++i) {
//            short s = ((short[]) var_java_util_Vector_g.elementAt(i))[7];
//            if (s != n) continue;
//            return true;
//        }
//        return false;
//    }
//
//    public static final long long_a() {
//        return System.currentTimeMillis();
//    }
//
//    public static int int_b(int n, int n2) {
//        if (n >= n2) {
//            return n;
//        }
//        return n + (var_java_util_Random_a.nextInt() & Integer.MAX_VALUE) % (n2 - n + 1);
//    }
//
//    public static final void D() throws Exception {
//        if (var_byte_arr_arr_d == null) {
//            InputStream inputStream = Main.var_Main_a.getClass().getResourceAsStream("/data.str");
//            DataInputStream dataInputStream = new DataInputStream(inputStream);
//            int n = dataInputStream.readUnsignedShort();
//            var_byte_arr_arr_d = new byte[n][];
//            for (int i = 0; i < n; ++i) {
//                int n2 = dataInputStream.readUnsignedShort();
//                C.var_byte_arr_arr_d[i] = new byte[n2];
//                dataInputStream.read(var_byte_arr_arr_d[i]);
//            }
//            var_byte_arr_o = var_byte_arr_arr_d[18];
//            var_byte_i = (byte) (var_byte_arr_o.length / 7);
//        }
//    }
//
//    public static final void r() throws Exception {
//        if (var_byte_arr_arr_h == null) {
//            InputStream inputStream = Main.var_Main_a.getClass().getResourceAsStream("/aaa.str");
//            DataInputStream dataInputStream = new DataInputStream(inputStream);
//            int n = dataInputStream.readUnsignedShort();
//            var_byte_arr_arr_h = new byte[n][];
//            for (int i = 0; i < n; ++i) {
//                int n2 = dataInputStream.readUnsignedShort();
//                C.var_byte_arr_arr_h[i] = new byte[n2];
//                dataInputStream.read(var_byte_arr_arr_h[i]);
//            }
//        }
//    }
//
//    public static final byte[] byte_arr_a(int n) {
//        return var_byte_arr_arr_h[n];
//    }
//
//    public static final byte[] byte_arr_a(int n, int n2) {
//        int n3;
//        byte[] byArray = C.byte_arr_a(n);
//        byte[] byArray2 = C.byte_arr_a(n2);
//        byte[] byArray3 = new byte[byArray.length + byArray2.length + 1];
//        for (n3 = 0; n3 < byArray.length; ++n3) {
//            byArray3[n3] = byArray[n3];
//        }
//        byArray3[byArray.length] = -2;
//        n3 = byArray.length + 1;
//        for (int i = 0; i < byArray2.length; ++i) {
//            byArray3[n3++] = byArray2[i];
//        }
//        return byArray3;
//    }
//
//    public static final byte[] byte_arr_a(String string) {
//        byte[] byArray = new byte[string.length()];
//        block0:
//        for (int i = 0; i < byArray.length; ++i) {
//            int n;
//            char c = string.charAt(i);
//            if (c == ' ') {
//                byArray[i] = -1;
//                continue;
//            }
//            if (c == '\n') {
//                byArray[i] = -2;
//                continue;
//            }
//            if (c == '\t') {
//                byArray[i] = -3;
//                continue;
//            }
//            boolean bl = false;
//            for (n = 0; n < var_char_arr_b.length; ++n) {
//                if (c < var_char_arr_b[n] || c > var_char_arr_a[n]) continue;
//                byArray[i] = var_byte_arr_arr_d[var_int_arr_h[n]][c - var_char_arr_b[n]];
//                bl = true;
//                break;
//            }
//            if (!bl) {
//                for (n = 0; n < "\u0430\u0431\u0432\u0433\u0434\u0435\u0451\u0436\u0437\u0438\u0439\u043a\u043b\u043c\u043d\u043e\u043f\u0440\u0441\u0442\u0443\u0444\u0445\u0446\u0447\u0448\u0449\u044a\u044b\u044c\u044d\u044e\u044f".length(); ++n) {
//                    if (c != "\u0430\u0431\u0432\u0433\u0434\u0435\u0451\u0436\u0437\u0438\u0439\u043a\u043b\u043c\u043d\u043e\u043f\u0440\u0441\u0442\u0443\u0444\u0445\u0446\u0447\u0448\u0449\u044a\u044b\u044c\u044d\u044e\u044f".charAt(n))
//                        continue;
//                    bl = true;
//                    byArray[i] = var_byte_arr_arr_d[5][n];
//                    break;
//                }
//            }
//            if (!bl) {
//                for (n = 0; n < "\u0410\u0411\u0412\u0413\u0414\u0415\u0401\u0416\u0417\u0418\u0419\u041a\u041b\u041c\u041d\u041e\u041f\u0420\u0421\u0422\u0423\u0424\u0425\u0426\u0427\u0428\u0429\u042a\u042b\u042c\u042d\u042e\u042f".length(); ++n) {
//                    if (c != "\u0410\u0411\u0412\u0413\u0414\u0415\u0401\u0416\u0417\u0418\u0419\u041a\u041b\u041c\u041d\u041e\u041f\u0420\u0421\u0422\u0423\u0424\u0425\u0426\u0427\u0428\u0429\u042a\u042b\u042c\u042d\u042e\u042f".charAt(n))
//                        continue;
//                    bl = true;
//                    byArray[i] = var_byte_arr_arr_d[4][n];
//                    break;
//                }
//            }
//            if (bl) continue;
//            for (n = 0; n < "#*.:?!;,'\"`-_+=/\\([{)]}<>%$@&|~^".length(); ++n) {
//                if (c != "#*.:?!;,'\"`-_+=/\\([{)]}<>%$@&|~^".charAt(n)) continue;
//                byArray[i] = var_byte_arr_arr_d[0][n];
//                continue block0;
//            }
//        }
//        return byArray;
//    }
//
//    protected static final int a(byte by, int n) {
//        return by < 0 ? 3 : var_byte_arr_c[by];
//    }
//
//    protected static final int int_a(byte[] byArray, int n) {
//        int n2 = 0;
//        for (int i = 0; i < byArray.length; ++i) {
//            n2 += C.a(byArray[i], n);
//        }
//        return n2;
//    }
//
//    public static final int[] a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int[] nArray) {
//        return C.a(graphics, var_byte_arr_arr_d[n], n2, n3, n4, n5, nArray);
//    }
//
//    protected static final int[] a(Graphics graphics, byte[] byArray, int n, int n2, int n3, int n4, int[] nArray) {
//        if (byArray == null) {
//            return null;
//        }
//        int n5 = C.int_a(byArray, n);
//        byte by = var_byte_f;
//        int[] nArray2 = new int[]{n2 += C.int_a(n5, n4), n3 += C.c(by, n4), n2 + n5, n3 + by};
//        byte by2 = var_byte_u;
//        byte[] byArray2 = var_byte_arr_i;
//        byte[] byArray3 = var_byte_arr_m;
//        int n6 = n2;
//        int n7 = n3;
//        int n8 = 0;
//        while (n8 < byArray.length) {
//            byte by3 = byArray[n8++];
//            int n9 = C.a(by3, n);
//            if (by3 <= -1 && by3 >= -4) {
//                n6 += n9;
//                continue;
//            }
//            byte by4 = byArray2[by3];
//            int[] nArray3 = new int[]{n6, n7, n6 + n9, n7 + by};
//            if (!C.a(nArray3 = C.a(nArray, nArray3, nArray3))) {
//                C.a(graphics, nArray3);
//                graphics.drawImage(var_javax_microedition_lcdui_Image_a, n6 - by4, n7 - byArray3[by3], 0);
//            }
//            n6 += n9 + by2 + 1;
//        }
//        return nArray2;
//    }
//
//    protected static final void a(Graphics graphics, byte by, int n, int n2, int n3, int n4, int[] nArray) {
//        int n5 = C.a(by, n);
//        byte by2 = var_byte_f;
//        byte[] byArray = var_byte_arr_i;
//        byte[] byArray2 = var_byte_arr_m;
//        int n6 = n2 += C.int_a(n5, n4);
//        int n7 = n3 += C.c(by2, n4);
//        byte by3 = byArray[by];
//        int[] nArray2 = new int[]{n6, n7, n6 + n5, n7 + by2};
//        if (!C.a(nArray2 = C.a(nArray, nArray2, nArray2))) {
//            C.a(graphics, nArray2);
//            graphics.drawImage(var_javax_microedition_lcdui_Image_a, n6 - by3, n7 - byArray2[by], 0);
//        }
//    }
//
//    public static final void O() throws Exception {
//        if (var_javax_microedition_lcdui_Image_a == null) {
//            var_javax_microedition_lcdui_Image_a = Image.createImage((String) "/fnt.png");
//            InputStream inputStream = Main.var_Main_a.getClass().getResourceAsStream("/fnt.def");
//            DataInputStream dataInputStream = new DataInputStream(inputStream);
//            int n = dataInputStream.readByte();
//            dataInputStream.readByte();
//            var_byte_f = dataInputStream.readByte();
//            var_byte_r = dataInputStream.readByte();
//            var_byte_j = dataInputStream.readByte();
//            var_byte_u = dataInputStream.readByte();
//            var_byte_o = dataInputStream.readByte();
//            var_byte_arr_i = new byte[n];
//            var_byte_arr_m = new byte[n];
//            var_byte_arr_c = new byte[n];
//            for (int i = 0; i < n; ++i) {
//                C.var_byte_arr_i[i] = dataInputStream.readByte();
//                C.var_byte_arr_m[i] = dataInputStream.readByte();
//                C.var_byte_arr_c[i] = dataInputStream.readByte();
//            }
//        }
//    }
//
//    public static final boolean a(int[] nArray) {
//        return nArray[0] >= nArray[2] || nArray[1] >= nArray[3];
//    }
//
//    public static final int[] a(int[] nArray, int[] nArray2, int[] nArray3) {
//        if (nArray3 == null) {
//            nArray3 = new int[]{Math.max(nArray[0], nArray2[0]), Math.max(nArray[1], nArray2[1]), Math.min(nArray[2], nArray2[2]), Math.min(nArray[3], nArray2[3])};
//        }
//        return nArray3;
//    }
//
//    public static final void a(Graphics graphics, int[] nArray) {
//        int n = nArray[0];
//        int n2 = nArray[2];
//        int n3 = nArray[1];
//        int n4 = nArray[3];
//        graphics.setClip(n, n3, n2 - n, n4 - n3);
//    }
//
//    public static final int int_a(int n, int n2) {
//        if ((n2 & 1) != 0) {
//            return -(n >>> 1);
//        }
//        if ((n2 & 8) != 0) {
//            return -n;
//        }
//        return 0;
//    }
//
//    public static final int c(int n, int n2) {
//        if ((n2 & 2) != 0) {
//            return -(n >>> 1);
//        }
//        if ((n2 & 0x20) != 0) {
//            return -n;
//        }
//        return 0;
//    }
//
//    protected static final synchronized Image javax_microedition_lcdui_Image_a(int n) {
//        if (var_javax_microedition_lcdui_Image_arr_a[n] == null) {
//            System.gc();
//            C.var_javax_microedition_lcdui_Image_arr_a[n] = C.javax_microedition_lcdui_Image_a(Integer.toString(n));
//        }
//        return var_javax_microedition_lcdui_Image_arr_a[n];
//    }
//
//    protected static final void a(Graphics graphics, int n, int n2, int n3, int n4, int[] nArray) {
//        if (n == -1) {
//            return;
//        }
//        Image image = C.javax_microedition_lcdui_Image_a(n);
//        C.a(graphics, nArray);
//        graphics.clipRect(n2 += C.int_a(image.getWidth(), n4), n3 += C.c(image.getHeight(), n4), image.getWidth(), image.getHeight());
//        if ((graphics.getClipWidth() | graphics.getClipWidth()) > 0) {
//            graphics.drawImage(image, n2, n3, 0);
//        }
//    }
//
//    protected static final void c(Graphics graphics, int n, int n2, int n3, int n4, int[] nArray) {
//        if (n == -1) {
//            return;
//        }
//        short[] sArray = var_short_arr_arr_a[n - 1000];
//        C.a(graphics, n, n2 += C.int_a((int) sArray[3], n4), n3 += C.c(sArray[4], n4), nArray);
//    }
//
//    protected static void a(Graphics graphics, int n, int n2, int n3, int[] nArray) {
//        if (n == -1) {
//            return;
//        }
//        short[] sArray = var_short_arr_arr_a[n - 1000];
//        Image image = C.javax_microedition_lcdui_Image_a((int) sArray[0]);
//        C.a(graphics, nArray);
//        graphics.clipRect(n2, n3, (int) sArray[3], (int) sArray[4]);
//        if ((graphics.getClipWidth() | graphics.getClipWidth()) > 0) {
//            graphics.drawImage(image, n2 - sArray[1], n3 - sArray[2], 0);
//        }
//    }
//
//    public static final void b(Graphics graphics, int n, int n2, int n3, int n4, int[] nArray) {
//        if (n >= 0 && n < 1000) {
//            C.a(graphics, n, n2, n3, n4, nArray);
//        } else {
//            C.c(graphics, n, n2, n3, n4, nArray);
//        }
//    }
//
//    public static final void a(byte[] byArray) {
//        for (int n = 0; n < byArray.length; n = (int) ((byte) (n + 1))) {
//            C.javax_microedition_lcdui_Image_a((int) byArray[n]);
//        }
//    }
//
//    public static final byte[] a(byte[] byArray, int n, int n2) {
//        byte by = (byte) (n2 - n);
//        byte[] byArray2 = new byte[by];
//        for (byte by2 = 0; by2 < by; by2 = (byte) (by2 + 1)) {
//            byArray2[by2] = byArray[n + by2];
//        }
//        return byArray2;
//    }
//
//    public static final short[] a(short[] sArray, int n, int n2) {
//        byte by = (byte) (n2 - n);
//        short[] sArray2 = new short[by];
//        for (byte by2 = 0; by2 < by; by2 = (byte) (by2 + 1)) {
//            sArray2[by2] = sArray[n + by2];
//        }
//        return sArray2;
//    }
//
//    public static final byte[][] byte_arr_arr_a(int n, int n2) {
//        byte[] byArray = var_byte_arr_arr_d[n];
//        return C.byte_arr_arr_a(byArray, n2);
//    }
//
//    public static final byte[][] byte_arr_arr_a(byte[] byArray, int n) {
//        byte by;
//        int n2;
//        byte[][] byArrayArray = new byte[byArray.length / 10 + 1 + 100][];
//        int n3 = 0;
//        int n4 = 0;
//        byte by2 = 0;
//        for (n2 = 0; n2 < byArray.length; n2 = (int) ((short) (n2 + 1))) {
//            byte by3;
//            if (byArray[n2] == -2) {
//                if (C.int_a(C.a(byArray, n3, n2), 3) > n) {
//                    byte by4 = by2;
//                    by2 = (byte) (by2 + 1);
//                    byArrayArray[by4] = C.a(byArray, n3, n4);
//                    byte by5 = by2;
//                    by2 = (byte) (by2 + 1);
//                    byArrayArray[by5] = C.a(byArray, (int) ((short) (n4 + 1)), n2);
//                } else {
//                    byte by6 = by2;
//                    by2 = (byte) (by2 + 1);
//                    byArrayArray[by6] = C.a(byArray, n3, n2);
//                }
//                n3 = (short) (n2 + 1);
//                n4 = (short) (n2 + 1);
//                continue;
//            }
//            if (byArray[n2] == -1) {
//                if (C.int_a(C.a(byArray, n3, n2), 3) > n) {
//                    byte by7 = by2;
//                    by2 = (byte) (by2 + 1);
//                    byArrayArray[by7] = C.a(byArray, n3, n4);
//                    n3 = (short) (n4 + 1);
//                }
//                n4 = n2;
//                continue;
//            }
//            if (byArray[n2] != 56 || byArray[n2 + 5] != 55) continue;
//            if (C.int_a(C.a(byArray, n3, n2), 3) > n) {
//                if (n4 - n3 > 0) {
//                    byte by8 = by2;
//                    by2 = (byte) (by2 + 1);
//                    byArrayArray[by8] = C.a(byArray, n3, n4);
//                }
//                byte by9 = by2;
//                by2 = (byte) (by2 + 1);
//                byArrayArray[by9] = C.a(byArray, (int) ((short) (n4 + 1)), n2);
//            } else {
//                byte by10 = by2;
//                by2 = (byte) (by2 + 1);
//                byArrayArray[by10] = C.a(byArray, n3, n2);
//            }
//            int n5 = 1000 * (byArray[n2 + 1] - 45) + 100 * (byArray[n2 + 2] - 45) + 10 * (byArray[n2 + 3] - 45) + (byArray[n2 + 4] - 45);
//            if (n5 < 1000) {
//                by3 = 0;
//                by = (byte) n5;
//            } else {
//                by3 = (byte) (n5 / 10);
//                by = (byte) (n5 - by3 * 10);
//            }
//            byte[] byArray2 = new byte[]{125, by3, by};
//            n3 = (short) (n2 + 6);
//            n4 = (short) (n2 + 6);
//            byte by11 = by2;
//            by2 = (byte) (by2 + 1);
//            byArrayArray[by11] = byArray2;
//            n2 = (short) (n2 + 5);
//        }
//        if (C.int_a(C.a(byArray, n3, n2), 3) > n) {
//            byte by12 = by2;
//            by2 = (byte) (by2 + 1);
//            byArrayArray[by12] = C.a(byArray, n3, n4);
//            byte by13 = by2;
//            by2 = (byte) (by2 + 1);
//            byArrayArray[by13] = C.a(byArray, (int) ((short) (n4 + 1)), n2);
//        } else {
//            byte by14 = by2;
//            by2 = (byte) (by2 + 1);
//            byArrayArray[by14] = C.a(byArray, n3, n2);
//        }
//        byte[][] byArrayArray2 = new byte[by2][];
//        for (by = 0; by < by2; by = (byte) ((byte) (by + 1))) {
//            byArrayArray2[by] = byArrayArray[by];
//        }
//        var_short_q = (short) (by2 * var_byte_f);
//        var_short_s = (short) (var_short_q - 180);
//        if (var_short_s < 0) {
//            var_short_s = 0;
//        }
//        return byArrayArray2;
//    }
//
//    public static final void i(Graphics graphics) {
//        graphics.setClip(0, 0, 176, 208);
//    }
//
//    public static final Image javax_microedition_lcdui_Image_a(String string) {
//        try {
//            return Image.createImage((String) ("/" + string + ".png"));
//        } catch (IOException iOException) {
//            iOException.printStackTrace();
//            return null;
//        }
//    }
//
//    public static final byte[][] byte_arr_arr_a(int n) {
//        int n2 = var_short_arr_arr_b[n].length;
//        byte[][] byArray = new byte[2 * n2][1];
//        int n3 = 0;
//        for (int i = 0; i < n2; ++i) {
//            byArray[n3++] = var_byte_arr_arr_d[var_short_arr_arr_b[n][i] + 52];
//            byArray[n3++][0] = var_byte_arr_arr_e[n][i];
//        }
//        return byArray;
//    }
//
//    public static final boolean boolean_a(String string) {
//        try {
//            var_javax_microedition_rms_RecordStore_a.closeRecordStore();
//        } catch (Exception exception) {
//            // empty catch block
//        }
//        try {
//            try {
//                var_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore((String) string, (boolean) false);
//                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(var_javax_microedition_rms_RecordStore_a.getRecord(1));
//                var_javax_microedition_rms_RecordStore_a.closeRecordStore();
//            } catch (Exception exception) {
//                return false;
//            }
//        } catch (Exception exception) {
//            return false;
//        }
//        return true;
//    }
//
//    public static void void_a(String string) {
//        try {
//            var_javax_microedition_rms_RecordStore_a.closeRecordStore();
//        } catch (Exception exception) {
//            // empty catch block
//        }
//        try {
//            if (C.boolean_a(string)) {
//                RecordStore.deleteRecordStore((String) string);
//            }
//        } catch (RecordStoreException recordStoreException) {
//            recordStoreException.printStackTrace();
//        }
//        try {
//            var_javax_microedition_rms_RecordStore_a.closeRecordStore();
//        } catch (Exception exception) {
//            // empty catch block
//        }
//    }
//
//    private static final void D(Graphics graphics) {
//        for (int i = 0; i <= 208; i += 11) {
//            C.b(graphics, 22, 0, i, 0, var_int_arr_e);
//        }
//    }
//
//    private static final void b(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
//        C.i(graphics);
//        graphics.setColor(n5);
//        graphics.fillRect(n, n2, n3, n4);
//        graphics.setColor(n6);
//        graphics.drawLine(n + 1, n2 + n4, n + n3, n2 + n4);
//        graphics.drawLine(n + n3, n2 + 1, n + n3, n2 + n4);
//    }
//
//    private static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
//        C.i(graphics);
//        graphics.setColor(n5);
//        graphics.setColor(n6);
//        graphics.drawLine(n, n2, n + n3 - 1, n2);
//        graphics.drawLine(n, n2, n, n2 + n4);
//        graphics.setColor(n5);
//        graphics.drawLine(n, n2 + n4, n + n3 - 1, n2 + n4);
//        graphics.drawLine(n + n3, n2, n + n3, n2 + n4 - 1);
//    }
//
//    private static final void l() {
//        var_byte_a = 0;
//    }
//
//    private static final void k(Graphics graphics) {
//        if (var_boolean_k) {
//            C.a(var_javax_microedition_lcdui_Graphics_a, var_int_arr_e);
//            var_javax_microedition_lcdui_Graphics_a.setColor(3692969);
//            var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 176, 208);
//            C.a(var_javax_microedition_lcdui_Graphics_a, (short) 13);
//            C.a(var_javax_microedition_lcdui_Graphics_a, (short) 160, (short) 33);
//            C.a(var_javax_microedition_lcdui_Graphics_a, 23, 24 + (var_boolean_s ? 0 : 1), 94, false);
//            C.a(var_javax_microedition_lcdui_Graphics_a, 227, 24 + (var_boolean_t ? 0 : 1), 114, false);
//            var_boolean_k = false;
//            var_boolean_w = true;
//        }
//        if (var_boolean_w) {
//            int n;
//            int n2;
//            int n3;
//            graphics.setClip(0, 0, 176, 208);
//            graphics.drawImage(var_javax_microedition_lcdui_Image_d, 0, 0, 0);
//            if (var_byte_a == 0) {
//                n3 = 23;
//                n2 = 24 + (var_boolean_s ? 0 : 1);
//                n = 94;
//            } else {
//                n3 = 227;
//                n2 = 24 + (var_boolean_t ? 0 : 1);
//                n = 114;
//            }
//            C.a(graphics, n3, n2, n, true);
//            var_boolean_w = false;
//        }
//    }
//
//    private static final void H(Graphics graphics) {
//        C.i(graphics);
//        graphics.setColor(0);
//        int n = O + var_int_y * var_int_f;
//        graphics.drawLine(var_int_D + var_int_w + 12 - 2 - 1, O, var_int_D + var_int_w + 12 - 2 - 1, n);
//        graphics.drawLine(var_int_D - 12 + 2 + 1, n, var_int_D + var_int_w + 12 - 2 - 1, n);
//        graphics.setColor(9612256);
//        graphics.drawLine(var_int_D - 12 + 2, O, var_int_D - 12 + 2, n);
//        graphics.drawLine(var_int_D - 12 + 2, O, var_int_D + var_int_w + 12 - 2 - 2, O);
//    }
//
//    public static final boolean boolean_b(int n, int n2) {
//        int n3 = n2 * 3;
//        if (var_int_arr_b[n3] == n) {
//            return true;
//        }
//        return var_int_arr_b[n3 + 1] == n || var_int_arr_b[n3 + 2] == n;
//    }
//
//    static {
//        var_boolean_s = true;
//        var_int_arr_i = new int[20];
//        var_byte_arr_arr_a = new byte[10][0];
//        var_int_arr_o = new int[]{53, 50, 54, 54, 53, 54};
//        var_int_z = 0;
//        var_byte_arr_e = new byte[0];
//        var_byte_arr_n = new byte[8];
//        var_boolean_t = true;
//        var_boolean_i = true;
//        var_boolean_c = false;
//        var_byte_v = 1;
//        var_int_arr_l = new int[]{-3, 52, 0, -4, 54, 0, -1, 50, 0, -2, 56, 0, 55, 0, 0, 57, 0, 0, 48, 0, 0, 42, 0, 0, 35, 0, 0, -5, 53, 0, -6, 0, 0, -7, 0, 0};
//        var_int_arr_j = new int[]{-3, 50, 0, -4, 57, 0, -1, 48, 49, -2, 52, 55, 51, 0, 0, 56, 0, 0, 54, 0, 0, 42, 0, 0, 35, 0, 0, -5, 53, 0, -6, 0, 0, -7, 0, 0};
//        String midpPlatform = System.getProperty("microedition.platform");
//        if ( midpPlatform != null && (midpPlatform.equals("Nokia3600") || midpPlatform.equals("Nokia3650"))) {
//            K = 1;
//            var_int_arr_b = var_int_arr_j;
//            H = 100;
//        } else {
//            K = 0;
//            var_int_arr_b = var_int_arr_l;
//            H = 100;
//        }
//
//        var_byte_arr_arr_c = new byte[][]{{1, 2}, {1, 4}, {3, 2}, {3, 4}, {5, 3}};
//        var_java_util_Random_a = new Random(System.currentTimeMillis());
//        var_char_arr_b = new char[]{'0', 'A', 'a'};
//        var_char_arr_a = new char[]{'9', 'Z', 'z'};
//        var_javax_microedition_lcdui_Image_arr_a = new Image[50];
//        var_boolean_j = false;
//        var_short_arr_l = new short[]{32000, 12000, 8000, 4000, 6000, 8000, 7000};
//        var_int_arr_e = new int[]{0, 0, 176, 208};
//        var_int_arr_q = new int[]{2, 14, 174, 194};
//        var_int_arr_c = new int[]{0, 0, 158, 208};
//        var_int_arr_n = new int[]{0, 30, 158, 195};
//        var_int_arr_k = new int[]{0, 30, 176, 195};
//        var_int_arr_d = new int[]{0, 12, 176, 195};
//        var_short_arr_p = new short[]{17, 33, 49, 65, 81, 97, 113, 146, 162, 178};
//        var_int_arr_arr_b = new int[][]{{2631829, 5066174, 1381728}, {0x404070, 6381986, 0x303060}, {87381, 32896, 476742}, {1989492, 40606, 2117728}, {4679193, 6328368, 3559692}, {89857, 7913009, 77313}, new int[0], {9257996, 13926987, 6108443}, {4603188, 8220513, 4075812}, {4802911, 0x656568, 0x21212E}};
//        var_int_arr_g = new int[]{0xFF3B3B, 9083629, 15900673, 786176, 0x606160, 61951};
//        var_java_lang_String_arr_a = new String[]{"/logo.png", "/intro.png"};
//        var_short_arr_w = new short[]{3000, 3000};
//        var_boolean_arr_c = new boolean[]{true, true};
//        var_short_arr_j = new short[]{10, 8, 13, 14, 15, 16};
//        var_short_arr_q = new short[]{101, 8, 5, 6, 7, -2};
//        var_short_arr_f = new short[]{9, 11, 10, 13, 229, 14, 228, 16};
//        var_short_arr_u = new short[]{61, 62, 63, 64, 65, 66, 67, 68};
//        var_byte_arr_f = new byte[]{0, 3, 16, 22, 23, 24, 24};
//        var_byte_arr_d = new byte[]{1, 2, 4, 37, 38, 39, 13, 40, 41, 19, 27, 28, 29, 30, 35, 36, 15};
//        var_byte_arr_j = new byte[]{12, 20, 21, 18, 31, 32, 33, 34};
//        var_byte_arr_b = new byte[]{6, 7, 8, 9, 10, 11, 14, 17, 5};
//        var_short_arr_arr_a = new short[][]{{0, 0, 0, 13, 16}, {0, 12, 0, 13, 16}, {0, 24, 0, 13, 16}, {0, 36, 0, 13, 16}, {0, 48, 0, 13, 16}, {0, 60, 0, 13, 16}, {0, 72, 0, 13, 16}, {0, 84, 0, 13, 16}, {1, 0, 26, 16, 15}, {1, 0, 52, 16, 15}, {1, 0, 65, 16, 15}, {1, 0, 78, 16, 15}, {1, 0, 104, 16, 15}, {1, 0, 13, 16, 15}, {1, 0, 0, 16, 15}, {1, 0, 39, 16, 15}, {1, 0, 91, 16, 15}, {1, 0, 117, 16, 15}, {28, 0, 0, 10, 12}, {28, 10, 0, 7, 12}, {28, 17, 0, 13, 12}, {28, 30, 0, 14, 12}, {5, 0, 0, 10, 19}, {5, 19, 0, 9, 19}, {5, 38, 0, 9, 19}, {5, 47, 0, 9, 19}, {5, 0, 19, 10, 20}, {5, 19, 19, 9, 20}, {5, 38, 19, 9, 20}, {5, 47, 19, 9, 20}, {5, 0, 39, 10, 19}, {5, 19, 39, 9, 19}, {5, 38, 39, 9, 19}, {5, 47, 39, 9, 19}, {5, 10, 0, 9, 19}, {5, 28, 0, 9, 19}, {5, 10, 19, 9, 20}, {5, 28, 19, 9, 20}, {5, 10, 39, 9, 19}, {5, 28, 39, 9, 19}, {8, 8, 0, 9, 13}, {8, 0, 0, 8, 13}, {8, 17, 0, 10, 13}, {9, 0, 0, 5, 4}, {9, 5, 0, 5, 4}, {9, 10, 0, 5, 4}, {9, 15, 0, 5, 4}, {10, 0, 0, 11, 19}, {10, 11, 0, 12, 19}, {10, 23, 0, 11, 19}, {10, 34, 0, 11, 19}, {10, 0, 19, 11, 20}, {10, 11, 19, 12, 20}, {10, 23, 19, 11, 20}, {10, 34, 19, 11, 20}, {10, 0, 39, 11, 19}, {10, 11, 39, 12, 19}, {10, 23, 39, 11, 19}, {10, 34, 39, 11, 19}, {11, 0, 0, 9, 19}, {11, 9, 0, 9, 19}, {11, 28, 0, 9, 19}, {11, 37, 0, 9, 19}, {11, 0, 19, 9, 20}, {11, 9, 19, 9, 20}, {11, 28, 19, 9, 20}, {11, 37, 19, 9, 20}, {11, 0, 39, 9, 19}, {11, 9, 39, 9, 19}, {11, 28, 39, 9, 19}, {11, 37, 39, 9, 19}, {11, 18, 0, 10, 19}, {11, 18, 19, 10, 20}, {11, 18, 39, 10, 19}, {14, 0, 0, 18, 32}, {14, 18, 0, 18, 32}, {14, 36, 0, 18, 32}, {14, 54, 0, 18, 32}, {14, 72, 0, 18, 32}, {15, 64, 0, 32, 32}, {15, 128, 0, 32, 32}, {15, 0, 0, 32, 32}, {15, 96, 0, 32, 32}, {15, 32, 0, 32, 32}, {16, 0, 0, 7, 6}, {16, 0, 6, 7, 6}, {16, 0, 12, 7, 6}, {16, 0, 18, 7, 6}, {16, 0, 24, 7, 6}, {16, 0, 30, 7, 6}, {19, 0, 51, 17, 17}, {19, 0, 34, 17, 17}, {19, 0, 0, 17, 17}, {19, 0, 17, 17, 17}, {20, 0, 0, 30, 43}, {20, 0, 43, 30, 43}, {18, 0, 0, 13, 14}, {18, 0, 14, 13, 14}, {23, 0, 0, 24, 18}, {23, 0, 18, 24, 19}, {23, 0, 37, 24, 18}, {23, 0, 55, 24, 18}, {23, 0, 73, 24, 18}, {23, 0, 91, 24, 18}, {25, 0, 0, 48, 61}, {25, 48, 0, 59, 61}, {31, 0, 0, 48, 35}, {31, 48, 0, 48, 35}, {33, 0, 0, 9, 41}, {33, 9, 0, 9, 41}, {37, 10, 0, 9, 19}, {37, 19, 0, 9, 19}, {37, 38, 0, 9, 19}, {37, 47, 0, 9, 19}, {37, 10, 19, 9, 20}, {37, 19, 19, 9, 20}, {37, 38, 19, 9, 20}, {37, 47, 19, 9, 20}, {37, 10, 39, 9, 19}, {37, 19, 39, 9, 19}, {37, 38, 39, 9, 19}, {37, 47, 39, 9, 19}, {37, 0, 0, 10, 19}, {37, 28, 0, 10, 19}, {37, 0, 19, 10, 20}, {37, 28, 19, 10, 20}, {37, 0, 39, 10, 19}, {37, 28, 39, 10, 19}, {38, 10, 0, 9, 19}, {38, 19, 0, 9, 19}, {38, 38, 0, 9, 19}, {38, 47, 0, 9, 19}, {38, 10, 19, 9, 20}, {38, 19, 19, 9, 20}, {38, 38, 19, 9, 20}, {38, 47, 19, 9, 20}, {38, 10, 39, 9, 19}, {38, 19, 39, 9, 19}, {38, 38, 39, 9, 19}, {38, 47, 39, 9, 19}, {38, 0, 0, 10, 19}, {38, 28, 0, 10, 19}, {38, 0, 19, 10, 20}, {38, 28, 19, 10, 20}, {38, 0, 39, 10, 19}, {38, 28, 39, 10, 19}, {39, 10, 0, 9, 19}, {39, 19, 0, 9, 19}, {39, 38, 0, 9, 19}, {39, 47, 0, 9, 19}, {39, 10, 19, 9, 20}, {39, 19, 19, 9, 20}, {39, 38, 19, 9, 20}, {39, 47, 19, 9, 20}, {39, 10, 39, 9, 19}, {39, 19, 39, 9, 19}, {39, 38, 39, 9, 19}, {39, 47, 39, 9, 19}, {39, 0, 0, 10, 19}, {39, 28, 0, 10, 19}, {39, 0, 19, 10, 20}, {39, 28, 19, 10, 20}, {39, 0, 39, 10, 19}, {39, 28, 39, 10, 19}, {13, 10, 0, 9, 19}, {13, 19, 0, 9, 19}, {13, 38, 0, 9, 19}, {13, 47, 0, 9, 19}, {13, 10, 19, 9, 20}, {13, 19, 19, 9, 20}, {13, 38, 19, 9, 20}, {13, 47, 19, 9, 20}, {13, 10, 39, 9, 19}, {13, 19, 39, 9, 19}, {13, 38, 39, 9, 19}, {13, 47, 39, 9, 19}, {13, 0, 0, 10, 19}, {13, 28, 0, 10, 19}, {13, 0, 19, 10, 20}, {13, 28, 19, 10, 20}, {13, 0, 39, 10, 19}, {13, 28, 39, 10, 19}, {40, 10, 0, 9, 19}, {40, 19, 0, 9, 19}, {40, 38, 0, 9, 19}, {40, 47, 0, 9, 19}, {40, 10, 19, 9, 20}, {40, 19, 19, 9, 20}, {40, 38, 19, 9, 20}, {40, 47, 19, 9, 20}, {40, 10, 39, 9, 19}, {40, 19, 39, 9, 19}, {40, 38, 39, 9, 19}, {40, 47, 39, 9, 19}, {40, 0, 0, 10, 19}, {40, 28, 0, 10, 19}, {40, 0, 19, 10, 20}, {40, 28, 19, 10, 20}, {40, 0, 39, 10, 19}, {40, 28, 39, 10, 19}, {41, 10, 0, 9, 19}, {41, 19, 0, 9, 19}, {41, 38, 0, 9, 19}, {41, 47, 0, 9, 19}, {41, 10, 19, 9, 20}, {41, 19, 19, 9, 20}, {41, 38, 19, 9, 20}, {41, 47, 19, 9, 20}, {41, 10, 39, 9, 19}, {41, 19, 39, 9, 19}, {41, 38, 39, 9, 19}, {41, 47, 39, 9, 19}, {41, 0, 0, 10, 19}, {41, 28, 0, 10, 19}, {41, 0, 19, 10, 20}, {41, 28, 19, 10, 20}, {41, 0, 39, 10, 19}, {41, 28, 39, 10, 19}, {2, 35, 0, 35, 35}, {2, 0, 0, 35, 35}, {2, 175, 0, 35, 35}, {2, 105, 0, 35, 35}, {2, 70, 0, 35, 35}, {2, 140, 0, 35, 35}};
//        var_byte_arr_a = new byte[]{1, 2, 3, 5, 6, 7, 1, 2, 6, 8, 1, 20, 6, 15, 18, 23, 30, 25, 19, 9, 11, 15};
//        var_short_arr_o = new short[]{37, 71, 127, 104, 76, 111, 152, 148, 143, 188};
//        var_short_arr_arr_b = new short[][]{{0, 3, 6, 10, 9}, {0, 3, 7, 9, 19}, {0, 4, 6, 11, 13}, {0, 4, 11, 12, 21}, {1, 19, 20, 21}, {1, 3, 7, 9, 15}, {1, 5, 7, 16, 20}, {2, 4, 10, 13, 17}, {2, 5, 8, 15, 21}, {2, 5, 8, 15, 16}};
//        var_byte_arr_arr_f = new byte[][]{{0, 1}, {0, 1, 2}, {1, 2, 3}, {0, 3, 4, 5}, {1, 4, 5, 6}, {2, 5, 6, 7, 8}, {1, 2, 3, 5, 7}, {5, 6, 7, 8, 9}, {3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};
//        var_byte_arr_arr_e = new byte[][]{{3, 3, 1, 2, 2}, {3, 3, 1, 3, 3}, {3, 3, 1, 3, 3}, {3, 3, 1, 3, 3}, {3, 2, 2, 2}, {3, 2, 1, 3, 3}, {3, 3, 1, 3, 3}, {3, 3, 1, 3, 3}, {3, 2, 1, 3, 3}, {3, 2, 1, 3, 3}};
//        var_short_arr_g = new short[]{12, 15, 25, 29, 60, 80, 49, 11, 14, 15, 25, 21};
//        var_boolean_arr_i = new boolean[]{false, false, false, false, true, true, true, false, false, false, false, false};
//        var_byte_arr_arr_g = new byte[][]{{0, 4, 2, 7}, {1, 6, 8, 10, 11}, {2, 3, 6, 7, 8, 11}, {0, 3, 4, 5, 9, 10, 11}, {0, 1, 4, 5, 7, 10, 11}, {0, 2, 4, 6, 7, 8, 9, 11}, {0, 1, 2, 3, 5, 7, 8, 9, 10}, {0, 1, 2, 5, 6, 7, 8, 9, 10, 11}, {0, 1, 2, 3, 4, 5, 7, 8, 9, 11}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}};
//        var_short_arr_e = new short[]{8000, 5000, 6000, 7000, 9000, 5000};
//        var_boolean_arr_h = new boolean[]{true, true, true, true, true, true, true, false, true, true, true, true, true, true, false, false, false, false, false, false};
//        var_short_arr_r = new short[]{30000, 20000, 15000, 12000, 10000, 9000, 7000, 5000, 3000, 2000};
//        var_short_arr_t = new short[]{167, 168, 169, 170, 171, 172, 173, 174, 175, 176};
//        var_int_arr_arr_a = new int[][]{{65000, 85000, 6, 15000, 0, 0, 0, 99, 10, 60, 80, 50, 110, 60, 1, 2, 70000, 100000, 20000, 0}, {80000, 50000, 6, 50000, 2, 0, 0, 97, 70, 150, 20, 100, 80, 90, 2, 3, 90000, 80000, 30000, 0}, {100000, 40000, 5, 60000, 3, 0, 0, 95, 110, 100, 25, 90, 60, 30, 1, 3, 150000, 100000, 30000, 0}, {110000, 50000, 4, 30000, 5, 20000, 4, 80, 37, 62, 60, 170, 135, 100, 2, 4, 10000, 50000, 0, 1}, {120000, 45000, 7, 30000, 3, 35000, 3, 93, 90, 140, 60, 100, 140, 90, 1, 2, 300000, 100000, 40000, 0}, {150000, 30000, 7, 35000, 5, 35000, 6, 90, 75, 90, 30, 60, 100, 185, 1, 4, 500000, 100000, 50000, 0}, {160000, 40000, 4, 20000, 11, 40000, 10, 80, 110, 180, 25, 100, 60, 155, 1, 3, 10000, 50000, 0, 1}, {180000, 40000, 8, 30000, 6, 30000, 5, 87, 50, 120, 20, 50, 80, 90, 2, 4, 600000, 100000, 60000, 0}, {200000, 30000, 8, 45000, 7, 25000, 6, 85, 24, 60, 60, 105, 125, 172, 2, 3, 800000, 100000, 70000, 0}, {210000, 40000, 9, 30000, 8, 30000, 7, 80, 60, 155, 30, 50, 110, 110, 3, 4, 1000000, 100000, 80000, 0}};
//        var_short_arr_i = new short[]{188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203};
//        var_int_arr_h = new int[]{1, 2, 3};
//        var_int_arr_a = new int[]{0, 195, 176, 208};
//        var_int_arr_p = new int[]{1, 17, 17, 31};
//    }
//}
