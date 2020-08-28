package log

interface LiveLogger {
    val logTag: String
}

inline fun LiveLogger.logInfo(throwable: Throwable? = null, block: () -> String?) {
    println("$logTag info | ${block()}")
}

inline fun LiveLogger.logDebug(throwable: Throwable? = null, block: () -> String?) {
    println("$logTag debug | ${block()}")
}

inline fun LiveLogger.logWarn(throwable: Throwable? = null, block: () -> String?) {
    println("$logTag warning | ${block()}")
}

inline fun LiveLogger.logError(throwable: Throwable? = null, block: () -> String?) {
    println("$logTag error | ${block()}")
}
