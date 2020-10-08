package android.webkit;

public abstract class WebSettings {
    public abstract void setJavaScriptEnabled(boolean flag);
    public abstract boolean getJavaScriptEnabled();
    public abstract void setDomStorageEnabled(boolean flag);
    public abstract boolean getDomStorageEnabled();
    public abstract void setUseWideViewPort(boolean use);
    public abstract boolean getUseWideViewPort();
    public abstract void setLoadWithOverviewMode(boolean overview);
    public abstract boolean getLoadWithOverviewMode();
    public abstract void setUserAgentString(String ua);
    public abstract String getUserAgentString();

}
