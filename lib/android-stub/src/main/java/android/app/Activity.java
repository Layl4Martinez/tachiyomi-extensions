package android.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public class Activity extends ContextThemeWrapper {
    public Intent getIntent() {
        throw new UnsupportedOperationException("stub");
    }
    public void setIntent(Intent newIntent) {
        throw new UnsupportedOperationException("stub");
    }
    public void onCreate(Bundle savedInstanceState) {
        throw new UnsupportedOperationException("stub");
    }
    @Override
    public void startActivity(Intent intent) {
        throw new UnsupportedOperationException("stub");
    }
    public void finish() {
        throw new UnsupportedOperationException("stub");
    }
}
