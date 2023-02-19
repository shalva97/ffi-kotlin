@file:Suppress(
    "ACTUAL_TYPE_ALIAS_NOT_TO_CLASS",
)

package dev.whyoleg.ffi.libcrypto3

import dev.whyoleg.ffi.*

actual typealias OSSL_LIB_CTX = dev.whyoleg.ffi.libcrypto3.cinterop.OSSL_LIB_CTX

actual typealias EVP_MD = dev.whyoleg.ffi.libcrypto3.cinterop.EVP_MD

actual typealias EVP_MD_CTX = dev.whyoleg.ffi.libcrypto3.cinterop.EVP_MD_CTX

actual fun CInteropScope.EVP_MD_fetch(
    ctx: CPointer<OSSL_LIB_CTX>?,
    algorithm: String?,
    properties: String?,
): CPointer<EVP_MD>? {
    return dev.whyoleg.ffi.libcrypto3.cinterop.EVP_MD_fetch(ctx, algorithm, properties)
}

actual fun CInteropScope.EVP_MD_CTX_new(): CPointer<EVP_MD_CTX>? {
    return dev.whyoleg.ffi.libcrypto3.cinterop.EVP_MD_CTX_new()
}

actual fun CInteropScope.EVP_MD_get_size(md: CPointer<EVP_MD>?): Int {
    return dev.whyoleg.ffi.libcrypto3.cinterop.EVP_MD_get_size(md)
}

actual fun CInteropScope.EVP_DigestInit(
    ctx: CPointer<EVP_MD_CTX>?,
    type: CPointer<EVP_MD>?,
): Int {
    return dev.whyoleg.ffi.libcrypto3.cinterop.EVP_DigestInit(ctx, type)
}

actual fun CInteropScope.EVP_DigestUpdate(
    ctx: CPointer<EVP_MD_CTX>?,
    d: CPointer<*>?,
    cnt: CULong,
): Int {
    return dev.whyoleg.ffi.libcrypto3.cinterop.EVP_DigestUpdate(ctx, d, cnt)
}

actual fun CInteropScope.EVP_DigestFinal(
    ctx: CPointer<EVP_MD_CTX>?,
    md: CPointer<CUByteVariable>?,
    s: CPointer<CUIntVariable>?,
): Int {
    return dev.whyoleg.ffi.libcrypto3.cinterop.EVP_DigestFinal(ctx, md, s)
}

actual fun CInteropScope.EVP_MD_CTX_free(ctx: CPointer<EVP_MD_CTX>?) {
    return dev.whyoleg.ffi.libcrypto3.cinterop.EVP_MD_CTX_free(ctx)
}

actual fun CInteropScope.EVP_MD_free(ctx: CPointer<EVP_MD>?) {
    return dev.whyoleg.ffi.libcrypto3.cinterop.EVP_MD_free(ctx)
}
