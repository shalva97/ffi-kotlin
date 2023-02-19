package dev.whyoleg.ffi.libcrypto3.test

private const val hexCode = "0123456789ABCDEF"

internal fun parseHexBinary(s: String): ByteArray {
    val len = s.length
    require(len % 2 == 0) { "HexBinary string must be even length" }
    val bytes = ByteArray(len / 2)
    var i = 0

    while (i < len) {
        val h = hexToInt(s[i])
        val l = hexToInt(s[i + 1])
        require(!(h == -1 || l == -1)) { "Invalid hex chars: ${s[i]}${s[i + 1]}" }

        bytes[i / 2] = ((h shl 4) + l).toByte()
        i += 2
    }

    return bytes
}

private fun hexToInt(ch: Char): Int = when (ch) {
    in '0'..'9' -> ch - '0'
    in 'A'..'F' -> ch - 'A' + 10
    in 'a'..'f' -> ch - 'a' + 10
    else        -> -1
}

internal fun printHexBinary(data: ByteArray, lowerCase: Boolean = true): String {
    val r = StringBuilder(data.size * 2)
    for (b in data) {
        r.append(hexCode[b.toInt() shr 4 and 0xF])
        r.append(hexCode[b.toInt() and 0xF])
    }
    return if (lowerCase) r.toString().lowercase() else r.toString()
}
