package com.rocketzly.checks.config

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import com.rocketzly.checks.config.bean.*
import java.io.File

/**
 * lint配置解析器
 * User: Rocket
 * Date: 2020/6/10
 * Time: 7:33 PM
 */
class ConfigParser {

    private var configJson = JsonObject()

    companion object {
        const val KEY_AVOID_USAGE_API = "avoid_usage_api"
        const val KEY_HANDLE_EXCEPTION_METHOD = "handle_exception_method"
        const val KEY_DEPENDENCY_API = "dependency_api"
        const val KEY_RESOURCE_NAME = "resource_name"
        const val KEY_SERIALIZABLE_CONFIG = "serializable_config"
    }

    init {
        val s = "{\"avoid_usage_api\":{\"method\":[{\"name_regex\":\"android\\\\.content\\\\.(Context|ContextWrapper)\\\\.getSharedPreferences\",\"message\":\"禁止直接调用getSharedPreferences方法获取sp，建议使用SpUtils\",\"exclude\":[\"com.rocketzly.androidlint.Test\"],\"severity\":\"error\"},{\"name\":\"android.widget.Toast.show\",\"message\":\"禁止直接使用Toast，建议使用xxxUtils\",\"severity\":\"error\"},{\"name\":\"kotlin.text.StringsKt__StringNumberConversionsJVMKt.toInt\",\"message\":\"禁止直接使用Kt提供的String.toInt扩展方法，建议使用xxx.toInt\",\"severity\":\"error\"},{\"name_regex\":\"android\\\\.util\\\\.Log\\\\.(v|d|i|w|e)\",\"message\":\"禁止直接使用android.util.Log，必须使用统一工具类xxxLog\",\"severity\":\"error\"}],\"construction\":[{\"name\":\"java.lang.Thread\",\"message\":\"禁止直接使用new Thread()创建线程，建议使用xxxUtils做线程操作\",\"severity\":\"error\"}],\"inherit\":[{\"name_regex\":\"\\\\.(AppCompat|Main)?Activity\$\",\"exclude_regex\":\"com.rocketzly.androidlint.MainActivity\",\"message\":\"避免直接继承Activity，建议继承xxxActivity\",\"severity\":\"warning\"}]},\"dependency_api\":[{\"trigger_method\":\"java.lang.StringBuilder.append\",\"dependency_method\":\"java.lang.StringBuilder.toString\",\"message\":\"StringBuilder调用append后必须调用toString\",\"severity\":\"warning\"},{\"trigger_method\":\"android.animation.Animator.start\",\"dependency_method\":\"android.animation.Animator.cancel\",\"message\":\"Animator调用start后必须调用cancel\",\"severity\":\"error\"}],\"handle_exception_method\":[{\"name\":\"android.graphics.Color.parseColor\",\"exception\":\"java.lang.IllegalArgumentException\",\"message\":\"Color.parseColor需要加try-catch处理IllegalArgumentException异常\",\"severity\":\"error\"}]}"
        configJson = Gson().fromJson(s, JsonObject::class.java)
    }

    fun getAvoidUsageApi(): AvoidUsageApi {
        return Gson().fromJson(
            configJson.getAsJsonObject(KEY_AVOID_USAGE_API),
            AvoidUsageApi::class.java
        ) ?: AvoidUsageApi()
    }

    fun getHandleExceptionMethod(): List<HandleExceptionMethod> {
        return Gson().fromJson(
            configJson.getAsJsonArray(KEY_HANDLE_EXCEPTION_METHOD),
            object : TypeToken<List<HandleExceptionMethod>>() {}.type
        ) ?: listOf()
    }

    fun getDependencyApiList(): List<DependencyApi> {
        return Gson().fromJson(
            configJson.getAsJsonArray(KEY_DEPENDENCY_API),
            object : TypeToken<List<DependencyApi>>() {}.type
        ) ?: listOf()
    }

    fun getResourceName(): ResourceName {
        return Gson().fromJson(
            configJson.getAsJsonObject(KEY_RESOURCE_NAME),
            object : TypeToken<ResourceName>() {}.type
        ) ?: ResourceName()
    }

    fun getSerializableConfig(): BaseConfigProperty {
        return Gson().fromJson(
            configJson.getAsJsonObject(KEY_SERIALIZABLE_CONFIG),
            object : TypeToken<BaseConfigProperty>() {}.type
        ) ?: BaseConfigProperty()
    }
}