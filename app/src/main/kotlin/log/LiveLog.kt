package log

class LiveLog {
    companion object {
        @JvmOverloads
        @JvmStatic
        inline fun d(tag: String, throwable: Throwable? = null, block: () -> String?) {
            println("$tag: ${block()}")
        }
    }
}