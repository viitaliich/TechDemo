#include "NativeLibraryGlue.h"

static JNIEXPORT jint JNICALL NativeLibraryAdd(JNIEnv* env, jclass clazz, jint _value1, jint _value2)
{
	int value1 = _value1;
	int value2 = _value2;

	return value1 + value2;
}

static JNIEXPORT jint JNICALL NativeLibrarySub(JNIEnv* env, jclass clazz, jint _value1, jint _value2)
{
	int value1 = _value1;
	int value2 = _value2;

	return value1 - value2;
}

static JNIEXPORT jdouble JNICALL NativeLibraryMul(JNIEnv* env, jclass clazz, jint _value1, jint _value2)
{
	int value1 = _value1;
	int value2 = _value2;

	return value1 * value2;
}

static JNIEXPORT jdouble JNICALL NativeLibraryDiv(JNIEnv* env, jclass clazz, jint _value1, jint _value2)
{
	int value1 = _value1;
	int value2 = _value2;

	return value1 / value2;
}

static JNINativeMethod methods[] = {
	{"NativeLibraryAdd", "(II)I", (void*)NativeLibraryAdd},
	{"NativeLibrarySub", "(II)I", (void*)NativeLibrarySub},
	{"NativeLibraryMul", "(II)D", (void*)NativeLibraryMul},
	{"NativeLibraryDiv", "(II)D", (void*)NativeLibraryDiv},
};

extern "C" jint JNI_OnLoad(JavaVM* vm, void* reserved)
{
	JNIEnv* env;
	if(vm->GetEnv(reinterpret_cast<void**>(&env), JNI_VERSION_1_6) != JNI_OK)
	{
		return -1;
	}
	else
	{
		jclass clazz = env->FindClass("com/example/techdemo/NativeLibrary");
		if (clazz)
		{
			env->RegisterNatives(clazz, methods, sizeof(methods) / sizeof(methods[0]));
			env->DeleteLocalRef(clazz);
			return JNI_VERSION_1_6;
		}
		else return -1;
	}

	return JNI_VERSION_1_6;
}
