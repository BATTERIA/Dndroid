package com.bilibili.bililive.test_lint

import com.android.annotations.Nullable
import com.android.tools.lint.detector.api.*
import com.intellij.psi.PsiMethod
import org.jetbrains.uast.*
import org.jetbrains.uast.visitor.AbstractUastVisitor
import java.util.*


/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/11/5 7:12 PM
 * @description:
 */
class TestDetector : Detector(), SourceCodeScanner {
    companion object {
        val ISSUE = Issue.create(
            "TestDetector",
            "EABuilder used but not submit",
            "You must call `submit()` on the resulting object to actually make the `EABuilder` submit.",
            Category.CORRECTNESS,
            6,
            Severity.WARNING,
            Implementation(
                TestDetector::class.java, Scope.JAVA_FILE_SCOPE
            )
        )
    }


    @Nullable
    override fun getApplicableMethodNames(): List<String> {
        return Collections.singletonList("addName")
    }

    override fun visitMethod(context: JavaContext, node: UCallExpression, method: PsiMethod) {
        if (!context.evaluator.isMemberInClass(method, "xxx.xxx.EABuilder")) {
            return
        }
//        val surroundingDeclaration: UElement = UastLintUtils.getParentOfType(
//            call,
//            true,
//            UMethod::class.java,
//            UBlockExpression::class.java,
//            ULambdaExpression::class.java
//        )
//            ?: return
        val parent = node.uastParent
        if (parent is UMethod
            || parent is UReferenceExpression
            && parent.uastParent is UMethod
        ) {
            return
        }
        val finder = SubmitFinder(node)
//        surroundingDeclaration.accept(finder)
        if (!finder.isShowCalled) {
            context.report(
                ISSUE!!,
                node,
                context.getCallLocation(node, true, false),
                "EABuilder used but not submit: did you forget to call `submit()` ?"
            )
        }
    }

    private class SubmitFinder(private val target: UCallExpression) : AbstractUastVisitor() {
        var isShowCalled = false
            private set
        private var seenTarget = false
        override fun visitCallExpression(node: UCallExpression): Boolean {
            if (node === target || node.psi != null && node.psi === target.psi) {
                seenTarget = true
            } else {
                if ((seenTarget || target == node.receiver)
                    && "submit" == getMethodName(node)
                ) {
                    isShowCalled = true
                }
            }
            return super.visitCallExpression(node)
        }

        override fun visitReturnExpression(node: UReturnExpression): Boolean {
//            if (UastUtils.isChildOf(target, node.returnExpression, true)) {
//                isShowCalled = true
//            }
            return super.visitReturnExpression(node)
        }

    }
}
