public class EmpregadoTeste {
    public static void main(String[] args) {

        Empregado emp1 = new Empregado("Ana", "Souza", 5000.0);
        Empregado emp2 = new Empregado("Carlos", "Oliveira", 3500.0);


        System.out.println("--- Salário Anual Inicial (com 13º) ---");
        System.out.println(emp1.getNome() + ": R$ " + emp1.getSalarioAnual());
        System.out.println(emp2.getNome() + ": R$ " + emp2.getSalarioAnual());



        emp1.setSalarioMensal(emp1.getSalarioMensal() * 1.10);
        emp2.setSalarioMensal(emp2.getSalarioMensal() * 1.10);


        System.out.println("\n--- Salário Anual Após Aumento de 10% ---");
        System.out.println(emp1.getNome() + ": R$ " + emp1.getSalarioAnual());
        System.out.println(emp2.getNome() + ": R$ " + emp2.getSalarioAnual());
    }
}
