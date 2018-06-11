#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_apple_dekay_isms_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
