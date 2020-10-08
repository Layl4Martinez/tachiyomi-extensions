package android.webkit;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class WebView extends View {
    public WebView(Context context) {
        throw new UnsupportedOperationException("stub");
    }

    public WebSettings getSettings() {
        throw new UnsupportedOperationException("stub");
    }

    public void setLayerType(int layerType, Paint paint) {
        throw new UnsupportedOperationException("stub");
    }

    public void addJavascriptInterface(Object object, String name) {
        throw new UnsupportedOperationException("stub");
    }

    public void setWebViewClient(WebViewClient client) {
        throw new UnsupportedOperationException("stub");
    }

    public WebViewClient getWebViewClient() {
        throw new UnsupportedOperationException("stub");
    }

    public void loadUrl(String url) {
        throw new UnsupportedOperationException("stub");
    }

    public void setWebChromeClient(WebChromeClient client) {
        throw new UnsupportedOperationException("stub");
    }

    public WebChromeClient getWebChromeClient() {
        throw new UnsupportedOperationException("stub");
    }

    public void evaluateJavascript(String script, ValueCallback<String> resultCallback) {
        throw new UnsupportedOperationException("stub");
    }

    public void destroy() {
        throw new UnsupportedOperationException("stub");
    }
}
