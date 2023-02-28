@file:Suppress("PrivatePropertyName", "FunctionName", "ClassName", "SpellCheckingInspection")

package dev.whyoleg.ffi.libcrypto3

import dev.whyoleg.ffi.*
import kotlin.wasm.*

actual fun ERR_get_error(): ULong = ffi_ERR_get_error().toULong()

actual fun ERR_error_string(
    e: ULong,
    buf: CString?,
): CString? = CString(NativePointer(ffi_ERR_error_string(e.toInt(), buf.nativePointer)))

@WasmImport("ffi-libcrypto", "ffi_ERR_get_error")
private external fun ffi_ERR_get_error(): Int

@WasmImport("ffi-libcrypto", "ffi_ERR_error_string")
private external fun ffi_ERR_error_string(e: Int, buf: Int): Int