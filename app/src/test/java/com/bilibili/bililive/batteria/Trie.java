package com.bilibili.bililive.batteria;

class Trie {
    Trie[] children;

    public Trie() {
        children = new Trie[26];
    }

    public void insert(String word) {
        Trie temp = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (temp.children[c - 'a'] == null) temp.children[c - 'a'] = new Trie();
            temp = temp.children[c - 'a'];
        }
    }

    public boolean search(String word) {
        Trie temp = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (temp.children[c - 'a'] == null) return false;
            temp = temp.children[c - 'a'];
        }
        return true;
    }

    public boolean startsWith(String prefix) {
        Trie temp = this;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (temp.children[c - 'a'] == null) return false;
            temp = temp.children[c - 'a'];
        }
        boolean ans = false;
        for (Trie t : temp.children) {
            if (t != null) {
                ans = true;
                break;
            }
        }
        return ans;
    }
}