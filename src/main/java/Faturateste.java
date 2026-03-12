public class Faturateste {
    public static void main(String[] args) {

        Fatura f1 = new Fatura("001", "Teclado Mecânico RGB", 2, 150.0);


        Fatura f2 = new Fatura("002", "Mouse Pad Gamer", -5, -25.50);

        System.out.println("--- FATURA 01 ---");
        System.out.println("Item: " + f1.getDescricao());
        System.out.println("Qtd: " + f1.getQuantidade());
        System.out.println("Preço Unitário: R$ " + f1.getPrecoPorItem());
        System.out.println("Total: R$ " + f1.getTotalFatura());

        System.out.println("\n--- FATURA 02 ---");
        System.out.println("Item: " + f2.getDescricao());
        System.out.println("Qtd (ajustada): " + f2.getQuantidade());
        System.out.println("Preço (ajustado): R$ " + f2.getPrecoPorItem());
        System.out.println("Total: R$ " + f2.getTotalFatura());
    }
}
