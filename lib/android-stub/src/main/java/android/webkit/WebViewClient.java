package android.webkit;

public class WebViewClient {
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) throws Exception {
        throw new Exception("stub");
    }
}
