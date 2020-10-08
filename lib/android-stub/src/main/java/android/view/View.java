package android.view;

import android.graphics.Canvas;

public class View {
    public static final int LAYER_TYPE_SOFTWARE = 1;

    public void draw(Canvas canvas) {
        throw new UnsupportedOperationException("stub");
    }

    public void layout(int l, int t, int r, int b) {
        throw new UnsupportedOperationException("stub");
    }

    public final void measure(int widthMeasureSpec, int heightMeasureSpec) {
        throw new UnsupportedOperationException("stub");
    }
}
