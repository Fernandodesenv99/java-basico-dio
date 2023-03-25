package Pilhas;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No newNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = newNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;

        }
        return refNoEntradaPilha;
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {

        // if(refNoEntradaPilha == null) {
        // return true;
        // }
        // return false;
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "----------------\n";
        stringRetorno += " Pilha\n";
        stringRetorno += "----------------\n";

        No noAuxiliar = refNoEntradaPilha;
        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
                noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "==========\n";
        return stringRetorno;
    }

}
