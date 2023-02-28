package dev.whyoleg.ffi

import java.nio.*

public object JNI {
    init {
        EmbeddedLibraryLoader.Current.loadLibrary("ffi-jni")
        loadLibraries()
    }

    @JvmStatic
    @JvmName("getByteBufferFromPointer")
    internal external fun getByteBufferFromPointer(pointer: Long, size: Int): ByteBuffer?

    @JvmStatic
    @JvmName("getPointerFromByteBuffer")
    internal external fun getPointerFromByteBuffer(buffer: ByteBuffer?): Long

    @JvmStatic
    @JvmName("getStringFromPointer")
    internal external fun getStringFromPointer(pointer: Long): String?

    internal val autoAllocator: NativeAllocator get() = NativeAllocator.Default
}