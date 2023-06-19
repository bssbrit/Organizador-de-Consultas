
/**
 * Write a description of class CadastroPacientes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CadastroPacientes
{
   private Paciente [] pacientesVetor;
   private int index; 
    public void cadastroDePacientes(int tamanho){
       pacientesVetor = new Paciente[tamanho];
       index = 0;
   }
   public boolean adicionaNoVetor(Paciente x) {
       if(index >= pacientesVetor.length){
           System.out.print("\nEstamos em capacidade total de pacientes, por favor retorne outro dia");
           return false;
       } else {
           pacientesVetor[index] = x;
           index++;
           return true;
       } 
    }
   public void removerPaciente(String x){
       int posicao;
       for (int i = 0; i <= pacientesVetor.length; i++){
           if(pacientesVetor[i].getNome() == x) {
                posicao = i;
                for (int y = posicao; y <= pacientesVetor.length; y++){
                    //talvez de erro aqui fica esperto
                    pacientesVetor[y] = pacientesVetor[y +1];
                }
            }
           
           
       }
       pacientesVetor[index-1] = null; 
       index--;
   }
   public void listaInfoPacientes(){
       for (int i = 0; i <=pacientesVetor.length; i++){
           System.out.print(pacientesVetor[i].toString());
       }
   }
   public void listNomesPacientes(){
     /*um for loop que vai percorrer o nome inteiro da pessoa e comparar as letras
     mas ainda n tenho certeza de como fazer
     vou dormir pensando nisso
        */
    for (int i = 0; i <=pacientesVetor.length; i++){
          //pacientesVetor[i].getNome().charAt(0)  
          // if(pacientesVetor[i].getNome().charAt(0) == "a"){
            
            //};
       }
    }
   public double mediaConsultas(){
    double nconsultas = 0, totalConsultas = 0, media = 0 ; 
    
    for(int i = 0; i <= pacientesVetor.length; i++){
         nconsultas = pacientesVetor[i].getnumeroConsultas();
         totalConsultas = totalConsultas + nconsultas;
    }
    media = totalConsultas/index;
    return media;
}    

    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
      
 
    
    

