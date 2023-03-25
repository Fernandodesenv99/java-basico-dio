package Pilhas;

public class No {

    private int dado;
    private No refNo = null; // No de referencia

    public No() {

    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No reNo) {
        this.refNo = reNo;
    }

    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }

}
