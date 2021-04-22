package com.bilibili.bililive.batteria;

/**
 * author: gujingjing
 * created on: 2021/3/19 7:27 PM
 * description:
 */
class Test {
    void test() {
        //[3,1,4,null,null,2]
        TreeNode treeNode = new TreeNode(3, new TreeNode(1), new TreeNode(4, new TreeNode(2), null));
        recoverTree(treeNode);
    }

    static TreeNode first, second, pre = new TreeNode(Integer.MIN_VALUE);

    public static void recoverTree(TreeNode root) {
        if (root == null) return;
        //查找两个，都是判断前面比后面的小
        dfs(root);
        //交换
        if (first != null && second != null) swap(first, second);
    }

    //中序遍历
    private static void dfs(TreeNode root) {
        if (root == null) return;
        System.out.println("dfs-first: root=" + root.val + ", pre=" + pre.val + ", first=");
        dfs(root.left);
        if (first == null && pre.val > root.val) first = pre;
        //注意这边second不能判断空，因为上面先判断了first并赋值了
        if (first != null && pre.val > root.val) {
            second = root;
        }
        pre = root;
        dfs(root.right);
    }

    private static void swap(TreeNode first, TreeNode second) {
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
