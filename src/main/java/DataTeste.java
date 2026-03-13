public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data(31, 12, 2023);
        Data d2 = new Data(29, 2, 2024); // Bissexto válido


        Data d3 = new Data(30, 2, 2023);

        System.out.print("Data 1: "); d1.displayData();
        System.out.print("Data 2 (Bissexto): "); d2.displayData();
        System.out.print("Data 3 (Inválida ajustada): "); d3.displayData();


        d1.setMes(15); // Fora do range 1-12
        System.out.print("Data 1 após mês inválido: "); d1.displayData();
    }
}
