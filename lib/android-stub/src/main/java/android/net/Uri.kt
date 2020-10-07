package android.net

class Uri {
    fun buildUpon(): Builder = throw Exception("stub")

    class Builder {
        fun appendQueryParameter(first: String, second: String): Builder = throw Exception("stub")
    }

    companion object {
        fun parse(string: String): Uri = throw Exception("stub")
    }
}
