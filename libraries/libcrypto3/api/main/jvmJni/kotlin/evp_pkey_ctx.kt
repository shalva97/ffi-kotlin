@file:Suppress(
    "PrivatePropertyName", "FunctionName", "ClassName", "SpellCheckingInspection",
)

package dev.whyoleg.ffi.libcrypto3

import dev.whyoleg.ffi.*

actual object EVP_PKEY_CTX_Type : COpaqueType<EVP_PKEY_CTX>(::EVP_PKEY_CTX)
actual class EVP_PKEY_CTX(memory: NativeMemory) : COpaque(memory) {
    override val type: EVP_PKEY_CTX_Type get() = EVP_PKEY_CTX_Type
}

actual fun EVP_PKEY_CTX_new_from_name(
    libctx: CPointer<OSSL_LIB_CTX>?,
    name: CString?,
    propquery: CString?,
): CPointer<EVP_PKEY_CTX>? {
    TODO()
}

actual fun EVP_PKEY_CTX_set_params(
    ctx: CPointer<EVP_PKEY_CTX>?,
    params: CPointer<OSSL_PARAM>?,
): Int {
    TODO()
}

actual fun EVP_PKEY_CTX_free(ctx: CPointer<EVP_PKEY_CTX>?) {
    TODO()
}
