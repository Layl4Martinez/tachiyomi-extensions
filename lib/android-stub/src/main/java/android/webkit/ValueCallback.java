package android.webkit;

public interface ValueCallback<T> {
    /**
     * Invoked when the value is available.
     * @param value The value.
     */
    public void onReceiveValue(T value);
}