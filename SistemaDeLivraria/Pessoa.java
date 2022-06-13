package SistemaDeLivraria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


public class Pessoa {
    private String nome;
    private String CPF;
    private String RG;
    private Date dataDeNascimento;
    private String data;

    public Pessoa(String nome, String CPF, String RG,  String data) throws ParseException {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.data = data;
        this.dataDeNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data);
    }

    protected int pegarIdade(){
        int anoNascimento = dataDeNascimento.getYear();
        int anoHoje = LocalDate.now().getYear();
        int idade = anoHoje - anoNascimento;

        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
