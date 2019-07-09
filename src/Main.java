public class Main {

    public static void main(String[] args) {
//        MyLinkedList linkedList = new MyLinkedList(null);
//        linkedList.traverse(linkedList.getRoot());
//
//        String stringData = "5 4 7 3 2 0 1 8 9 6";
//
//        String[] data = stringData.split(" ");
//        for (String s : data) {
//            linkedList.addItem(new Node(s));
//        }
//
//        linkedList.traverse(linkedList.getRoot());
//        linkedList.removeItem(new Node("3"));
//        linkedList.traverse(linkedList.getRoot());
//
//        linkedList.removeItem(new Node("5"));
//        linkedList.traverse(linkedList.getRoot());
//
//        linkedList.removeItem(linkedList.getRoot());
//        linkedList.traverse(linkedList.getRoot());

        SearchTree searchTree = new SearchTree(null);

        String stringData = "5 4 7 3 2 0 1 8 9 6";

        String[] data = stringData.split(" ");
        for (String s : data) {
            searchTree.addItem(new Node(s));
        }
        searchTree.traverse(searchTree.getRoot());

        searchTree.traverse(searchTree.getRoot());
        searchTree.removeItem(new Node("3"));
        searchTree.traverse(searchTree.getRoot());

        searchTree.removeItem(new Node("5"));
        searchTree.traverse(searchTree.getRoot());

        searchTree.removeItem(searchTree.getRoot());
        searchTree.traverse(searchTree.getRoot());

    }
}
