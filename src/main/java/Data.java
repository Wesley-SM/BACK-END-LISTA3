import java.time.Year;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public void setMes(int mes) {
        this.mes = (mes >= 1 && mes <= 12) ? mes : 1;
    }

    public void setAno(int ano) {
        this.ano = (ano > 0) ? ano : 1900;
    }

    public void setDia(int dia) {
        int maxDias = getDiasNoMes(this.mes, this.ano);
        this.dia = (dia >= 1 && dia <= maxDias) ? dia : 1;
    }


    private int getDiasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                return Year.isLeap(ano) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }

    public void displayData() {
        System.out.printf("%02d/%02d/%d%n", dia, mes, ano);
    }
}
