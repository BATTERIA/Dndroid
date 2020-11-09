package com.bilibili.bililive.test_lint

import com.android.tools.lint.detector.api.*
import com.intellij.psi.PsiClassType
import org.jetbrains.uast.UClass
import java.io.Serializable
/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/11/5 6:40 PM
 * @description:
 */
class SerializableClassDetector : Detector(), Detector.UastScanner {

    companion object {
        const val REPORT_MESSAGE = "该对象必须要实现Serializable接口，因为外部类实现了Serializable接口"
        const val CLASS_SERIALIZABLE = "java.io.Serializable"
        val ISSUE: Issue = Issue.create(
            "SerializableClassCheck",
            REPORT_MESSAGE,
            REPORT_MESSAGE,
            Category.CORRECTNESS,
            10,
            Severity.ERROR,
            Implementation(SerializableClassDetector::class.java, Scope.JAVA_FILE_SCOPE)
        )

    }

    override fun applicableSuperClasses(): List<String>? {
        return listOf(CLASS_SERIALIZABLE)
    }

    override fun visitClass(context: JavaContext, declaration: UClass) {
        for (field in declaration.fields) {
            //字段是引用类型，并且可以拿到该class
            val psiClass = (field.type as? PsiClassType)?.resolve() ?: continue
            if (!context.evaluator.implementsInterface(psiClass, CLASS_SERIALIZABLE, true)) {
                context.report(ISSUE, context.getLocation(field.typeReference!!), REPORT_MESSAGE)
            }
        }
    }

}