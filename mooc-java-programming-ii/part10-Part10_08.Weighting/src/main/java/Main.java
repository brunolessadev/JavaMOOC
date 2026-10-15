public class Main {
    public static void main(String[] args) {
        Item livro = new Item("Livro de Java", 2);
        Item notebook = new Item("Notebook", 3);
        Item tenis = new Item("Tênis", 1);
        Item casaco = new Item("Casaco de Inverno", 2);

        Suitcase mala1 = new Suitcase(5);
        mala1.addItem(livro);
        mala1.addItem(notebook);

        Suitcase mala2 = new Suitcase(10);
        mala2.addItem(tenis);
        mala2.addItem(casaco);

        Hold porao = new Hold(20);
        porao.addSuitcase(mala1);
        porao.addSuitcase(mala2);

        System.out.println(porao);
        System.out.println();
        porao.printItems();
    }
}