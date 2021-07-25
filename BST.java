public class BST {

    public BSTNode root;

    public void insert(int value) {
        root = insertHelper(value, root);
    }

    private BSTNode insertHelper(int value, BSTNode curr) {
        if (curr == null) {
            return new BSTNode(value);
        }
        if (value < curr.value) {
            curr.left = insertHelper(value, curr.left);
        } else if (value > curr.value) {
            curr.right = insertHelper(value, curr.right);
        }
        return curr;
    }

    public BSTNode find(int value) {
        return findHelper(value, root);
    }

    private BSTNode findHelper(int value, BSTNode curr) {
        if (curr == null) {
            return null;
        }
        if (value == curr.value) {
            return curr;
        } else if (value < curr.value) {
            return findHelper(value, curr.left);
        } else {
            return findHelper(value, curr.right);
        }
    }

    public void delete(int value) {
        root = deleteHelper(value, root);
    }

    private BSTNode deleteHelper(int value, BSTNode curr) {
        if (curr == null) {
            return null;
        }

        if (value < curr.value) {
            curr.left = deleteHelper(value, curr.left);
        } else if (value > curr.value) {
            curr.right = deleteHelper(value, curr.right);
        } else {
            if (curr.left == null && curr.right == null) {
                return null;
            } else if (curr.left != null && curr.right == null) {
                return curr.left;
            } else if (curr.right != null && curr.left == null) {
                return curr.right;
            } else {
                if (curr.right.left != null) {
                    curr.value = curr.right.left.value;
                    curr.right = deleteHelper(curr.right.left.value, curr.right);
                } else if (curr.left.right != null) {
                    curr.value = curr.left.right.value;
                    curr.left = deleteHelper(curr.left.right.value, curr.left);
                } else {
                    curr.value = curr.left.value;
                    if (curr.left.left != null) {
                        curr.left = curr.left.left;
                    } else {
                        curr.left = null;
                    }
                }
            }
        }

        return curr;
    }

    public int height() {
        return root != null ? heightHelper(root) - 1: -1;
    }

    private int heightHelper(BSTNode curr) {
        if (curr == null) {
            return 0;
        }
        int left = heightHelper(curr.left);
        int right = heightHelper(curr.right);
        return Math.max(left+1, right+1);
    }

    static class BSTNode {
        public BSTNode left;
        public BSTNode right;
        public int value;

        public BSTNode(int value) {
            this.value = value;
        }
    }
}
