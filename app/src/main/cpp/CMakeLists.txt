cmake_minimum_required(VERSION 3.10)

project(native-lib)

add_library(native-lib
        SHARED
        jni_native_render.cpp
        )

target_link_libraries(native-lib
        PRIVATE
        android
        jnigraphics
        )