# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def dfs(root):
            if not root:
                return [True, 0]
            
            left, depth_left = dfs(root.left)
            right, depth_right = dfs(root.right)

            if not left or not right:
                return [False, 0]
            return [abs(depth_left - depth_right) <= 1, 1 + max(depth_left, depth_right)]
        return dfs(root)[0]
        