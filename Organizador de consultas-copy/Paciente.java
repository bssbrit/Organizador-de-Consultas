
/**
 * Write a description of class Paciente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Paciente
{ 
    //public static void main(String[] args){
    
    private String nome, convenio, diagnostico, cpf;
    private int telefone, numeroConsultas;
    
    
     
    public Paciente(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\fPor favor insira as informaçoes do paciente");
        System.out.println("Nome do Paciente");
        nome = teclado.nextLine();
        System.out.println("O convenio");
        convenio = teclado.nextLine();
        System.out.println("Doença: Covid, Dengue, Influenza, Meningite, Outro...");
        diagnostico = teclado.nextLine();
        System.out.println("cpf");
        cpf = teclado.nextLine();
        System.out.println("Quantas consultas");
        numeroConsultas = teclado.nextInt();
        System.out.println("Numero de Telefone");
        telefone = teclado.nextInt();;
       
        
    }
    /*
     Também deverá possuir um método que recebe o valor de uma consulta por parâmetro e
retorna o valor total a ser pago pelas consultas do mês para aquele paciente.    
*/
    public int divida (int numeroConsultas){
    int valorDivida = numeroConsultas * 100;
    
    return valorDivida;
    };
    public String mudarNome(String nome){
       Scanner teclado = new Scanner(System.in);
       nome = teclado.nextLine();
       return nome;
    }
    //set & get Nome
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    public void setConvenio (String convenio){
        this.convenio= convenio;
    }
    //set & get Convenio
    public String getConvenio(){
        return convenio;
    }
    //set & get Diagnostico
    public String getDiagnostico(){
        return diagnostico;
    }
    public void setDiagnostico (String diagnostico){
        this.diagnostico= diagnostico;
    }
    //set & get CPF
    public String getCPF(){
        return cpf;
    }
    public void setCPF (String convenio){
        this.cpf= cpf;
    }
    
    public String toString(){
      String msg = "Nome: " + nome + "\n cpf: " + cpf + "\n telefone: " + telefone + 
      "\n Convenio: " + convenio + "\nDiagnostico: " + diagnostico + "\nNumero de consultas no mes:" + numeroConsultas + "\nDivida: " + divida(numeroConsultas); 
      return msg;
    }
}

//}

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /*public int sampleMethod(int y)
    {
        // put your code here
        //return x + y;
    }*/
