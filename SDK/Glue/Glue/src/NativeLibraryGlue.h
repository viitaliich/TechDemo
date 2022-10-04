#include <jni.h>

extern "C" {

	static JNIEXPORT jint JNICALL NativeLibraryAdd(JNIEnv* env, jclass clazz, jint _value1, jint _value2);
	static JNIEXPORT jint JNICALL NativeLibrarySub(JNIEnv* env, jclass clazz, jint _value1, jint _value2);
	static JNIEXPORT jdouble JNICALL NativeLibraryMul(JNIEnv* env, jclass clazz, jint _value1, jint _value2);
	static JNIEXPORT jdouble JNICALL NativeLibraryDiv(JNIEnv* env, jclass clazz, jint _value1, jint _value2);
}
