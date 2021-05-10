package com.bilibili.bililive.batteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * author: gujingjing
 * created on: 2021/3/19 7:27 PM
 * description:
 */
class Test {
    void test() {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(5,1,3,5,3,6,8,1));

        mergeSort(list);

        TreeNode treeNode = new TreeNode(3, new TreeNode(1), new TreeNode(4, new TreeNode(2), null));
        recoverTree(treeNode);
    }

    ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        return recursion(list, 0, list.size() - 1);
    }

    ArrayList<Integer> recursion(ArrayList<Integer> list, int left, int right) {
        if (left == right) {
            return new ArrayList(Arrays.asList(list.get(left)));
        }
        int mid = left + (right - left >> 1);
        ArrayList<Integer> l = recursion(list, left, mid);
        ArrayList<Integer> r = recursion(list, mid + 1, right);
        ArrayList<Integer> merge = new ArrayList<>();
        int i = 0, j = 0;
        while (i < l.size() || j < r.size()) {
            if (i == l.size()) {
                while (j < r.size()) merge.add(r.get(j++));
                break;
            }
            if (j == r.size()) {
                while (i < l.size()) merge.add(l.get(i++));
                break;
            }
            if (l.get(i) < r.get(j))
                merge.add(l.get(i++));
            else
                merge.add(r.get(j++));
        }
        return merge;
    }

    public void sort(List<Integer> sourceArray) {

    }

    private void order(List<Integer> sourceArray, int l, int r) {
        for (int i = r; i >= l; ) {

        }
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
