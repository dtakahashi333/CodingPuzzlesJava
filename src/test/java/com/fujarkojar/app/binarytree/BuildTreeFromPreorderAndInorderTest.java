package com.fujarkojar.app.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildTreeFromPreorderAndInorderTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = BuildTreeFromPreorderAndInorder.solve(preorder, inorder);
    }

    @Test
    void solve2() {
        int[] preorder = {4, 1, 2, 3};
        int[] inorder = {1, 2, 3, 4};
        TreeNode root = BuildTreeFromPreorderAndInorder.solve(preorder, inorder);
    }

    @Test
    void solve3() {
        int[] preorder = {1, 2, 3, 4};
        int[] inorder = {1, 2, 3, 4};
        TreeNode root = BuildTreeFromPreorderAndInorder.solve(preorder, inorder);
    }
}