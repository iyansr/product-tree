public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(new Product("A", 12000));
        tree.insert(new Product("B", 8000));
        tree.insert(new Product("C", 9500));
        tree.insert(new Product("D", 10500));
        tree.insert(new Product("E", 2500));
        tree.insert(new Product("F", 11700));
        tree.insert(new Product("G", 3800));
        tree.insert(new Product("H", 9000));
        tree.insert(new Product("I", 7200));
        tree.insert(new Product("J", 8600));
        tree.insert(new Product("K", 15000));
        tree.insert(new Product("L", 4500));
        tree.insert(new Product("M", 9500));
        tree.insert(new Product("N", 13300));
        tree.insert(new Product("O", 1800));

        tree.preorder();

        System.out.println();


        Product a = tree.search("A");
        Product b = tree.search("B");
        Product d = tree.search("D");
        Product h = tree.search("H");
        Product i = tree.search("I");


        int result = a.getPrice() + b.getPrice() + d.getPrice() + h.getPrice();
        int result2 = a.getPrice() + b.getPrice() + d.getPrice() + i.getPrice();

        System.out.println("Total : " + result);
        System.out.println();
        System.out.println("Total 2 : " + result2);

    }
}